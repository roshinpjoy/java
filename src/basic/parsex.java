package basic;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class parsex {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File f1=new File("xmlex");

        DocumentBuilderFactory dbFactory =DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
        Document doc=dBuilder.parse(f1);

        System.out.println("Root element:"+doc.getDocumentElement().getNodeName());

        NodeList nlist=doc.getElementsByTagName("food");//here 3 nodes
        System.out.println("...............................");

        for (int i=0;i<nlist.getLength();i++)
        {
            Node nNode =nlist.item(i);
            System.out.println(nNode.getNodeName());

            if (nNode.getNodeType()==Node.ELEMENT_NODE) {//name,price,description
                Element eElement = (Element) nNode;

                System.out.println("label : "+eElement.getAttribute("label"));


                System.out.println("name : " +eElement.getElementsByTagName("name").item(0).getTextContent());

                System.out.println("price : " +eElement.getElementsByTagName("price").item(0).getTextContent());
                System.out.println("description : " +eElement.getElementsByTagName("description").item(0).getTextContent());


            }
        }//sax node to node .event based
//dom document


    }
}
