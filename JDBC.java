
	import java.io.File;
    import java.io.FileWriter;
    import java.nio.file.FileAlreadyExistsException;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;

    import org.w3c.dom.Document;
    import org.w3c.dom.Element;

    import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
    import com.sun.org.apache.xml.internal.serialize.OutputFormat;
    import com.sun.org.apache.xml.internal.serialize.XMLSerializer;


    public class JDBC{ 

      public static final String JDBCURL = "com.mysql.jdbc.Driver"; 
      public static final String JDBCDRIVER = "jdbc:mysql://localhost:4532/student"; 
      public static final String SQL = "select name, address from stu"; 
      public static String OUTPUTFILE = "outputbooks.xml"; 
      public static void main(String[] args) { 

        try{ 
        Class.forName(JDBCURL) ;
        Connection conn = DriverManager.getConnection(JDBCDRIVER,"root",""); 

        Statement statement = conn.createStatement(); 
        ResultSet employeeRS = statement.executeQuery(SQL); 

        Document xmlDoc = buildEmployeeXML(employeeRS);
        File outputFile = new File(OUTPUTFILE); 
        printDOM(xmlDoc, outputFile); 

        conn.close(); 
        } catch(FileAlreadyExistsException f){
            System.out.println("file alread present at this location");
        }
        catch(Exception e) 
        { 
          System.out.println("Really poor exception handling " +e.toString()); 
        }
      }
      private static Document buildEmployeeXML(ResultSet _employeeRS) throws Exception 
      { 

      Document xmlDoc = new DocumentImpl();

      Element rootElement = xmlDoc.createElement("companies"); 
      xmlDoc.appendChild(rootElement); 

      while(_employeeRS.next()) 
       { 

        Element emp = xmlDoc.createElement("employee");

        Element empName = xmlDoc.createElement("name"); 
        Element address = xmlDoc.createElement("address"); 

      
        empName.appendChild(xmlDoc.createTextNode(_employeeRS.getString("name"))); 
        address.appendChild(xmlDoc.createTextNode(_employeeRS.getString("address"))); 

        emp.appendChild(empName); 
        emp.appendChild(address); 
        rootElement.appendChild(emp); 
        System.out.println("done");
       } 
      return xmlDoc; 
      } 
      private static void printDOM(Document _xmlDoc, File _outputFile) throws Exception 
      { 
        OutputFormat outputFormat = new OutputFormat("XML","UTF-8",true); 
        FileWriter fileWriter = new FileWriter(_outputFile); 

        XMLSerializer xmlSerializer = new XMLSerializer(fileWriter, outputFormat); 

        xmlSerializer.asDOMSerializer(); 

        xmlSerializer.serialize(_xmlDoc.getDocumentElement()); 
      } 

} 