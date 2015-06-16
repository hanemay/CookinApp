package userData;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author hanemay
 */
public class WriteXMLFile {
    private static String username;
    private static String password;
    
    /**
     *
     * @param usernames
     * @param passwords
     * @throws TransformerException
     * @throws SAXException
     * @throws ParserConfigurationException
     * @throws IOException
     */
    public static void WriteUserData(String usernames,String passwords) throws TransformerException, SAXException, ParserConfigurationException, IOException{
       username = usernames;
       password = passwords;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse("userInformation.xml");
        Element root = document.getDocumentElement();

       
            // server elements
            Element newServer = document.createElement("user");
            root.appendChild(newServer);

            Element name = document.createElement("username");
            name.appendChild(document.createTextNode(username));
            newServer.appendChild(name);

            Element port = document.createElement("password");
            port.appendChild(document.createTextNode(password));
            newServer.appendChild(port);

            root.appendChild(newServer);
        

        DOMSource source = new DOMSource(document);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult result = new StreamResult("userInformation.xml");
        transformer.transform(source, result);
    }


}