import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class JDBC2
{
	
public static void main(String[] args)
{ 
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4532/student", "root", "");
Statement st=con.createStatement();
DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
Document doc = docBuilder.parse (new File("books.xml"));
doc.getDocumentElement().normalize();
System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName());
NodeList listOfPersons = doc.getElementsByTagName("employee");
for(int s=0; s<listOfPersons.getLength(); s++){
Node firstPersonNode = listOfPersons.item(s);
if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){
Element firstPersonElement = (Element)firstPersonNode;
NodeList nameList = firstPersonElement.getElementsByTagName("name");
Element nameElement =(Element)nameList.item(0);

NodeList textFNList = nameElement.getChildNodes();
String name=((Node)textFNList.item(0)).getNodeValue().trim();

NodeList addressList = firstPersonElement.getElementsByTagName("address");
Element addressElement =(Element)addressList.item(0);

NodeList textLNList = addressElement.getChildNodes();
String address= ((Node)textLNList.item(0)).getNodeValue().trim();

String query = "SELECT * FROM stu";

ResultSet rs = st.executeQuery(query);
boolean contains=false;
while (rs.next())
{
	String firstName = rs.getString("name");
    String lastName = rs.getString("address");
    if(firstName.equals(name))
    		{
    	
    	if(lastName.equals(address))
    	{
    		
    		contains=true;
    		break;
    	}
    		}
    
}
if(contains==false)
{
int i=st.executeUpdate("insert into stu(name,address) values('"+name+"','"+address+"')");
System.out.println("Data is successfully inserted!");
}
}
}

}catch (Exception err) {
System.out.println(" " + err.getMessage ());
}
}
}