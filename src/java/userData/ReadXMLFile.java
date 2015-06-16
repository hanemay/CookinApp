/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userData;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import static userData.WriteXMLFile.WriteUserData;
/**
 *
 * @author hanemay
 */

public class ReadXMLFile {
    private String ePassword;
    private String eUsername;
    private boolean success;

    /**
     *  
     */
    public ReadXMLFile(){
    
    }

    /**
     *
     * @param username username user wants to login with
     * @param password password the user will use
     * @return returns a status true if login is successfull
     */
    public boolean ValidateLogin(String username, String password){
       try {
           WriteUserData("test1234","test4321");
       } catch (TransformerException | SAXException | ParserConfigurationException | IOException ex) {
           Logger.getLogger(ReadXMLFile.class.getName()).log(Level.SEVERE, null, ex);
       }
    try {
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();
	DefaultHandler handler = new DefaultHandler() {
	boolean bfname = false;
	boolean blname = false;
	boolean bemail = false;
	boolean busername = false;
        boolean bpassword = false;
        @Override
	public void startElement(String uri, String localName,String qName, 
            Attributes attributes) throws SAXException {
            if (qName.equalsIgnoreCase("EMAIL")) {
                    bemail = true;
            }
            if (qName.equalsIgnoreCase("USERNAME")) {
                    busername = true;
            }
            if (qName.equalsIgnoreCase("PASSWORD")) {
                    bpassword = true;
            }
	}
        
        @Override
	public void endElement(String uri, String localName,
		String qName) throws SAXException {
 
		//System.out.println("End Element :" + qName);
 
	}
 
	public void characters(char ch[], int start, int length) throws SAXException {
 

 
		if (bemail) {
			System.out.println("email : " + new String(ch, start, length));
			bemail = false;
		}
 
		if (busername) {
			eUsername = new String(ch, start, length);
			busername = false;
		}
		if (bpassword) {
			ePassword = new String(ch, start, length);
			bpassword = false;
		}
                if(username.equalsIgnoreCase(eUsername)){
                    if(password.equalsIgnoreCase(ePassword)){
                        success = true;
                        
                    }else{
                        success = false;
                    }
                }
 
	}
 
     };
 
       saxParser.parse("userInformation.xml", handler);
 
     } catch (Exception e) {
       e.printStackTrace();
     }
        System.out.println("LOGIN IS   " + success);
 return success;
   }
 
}