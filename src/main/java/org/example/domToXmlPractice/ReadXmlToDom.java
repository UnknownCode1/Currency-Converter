package org.example.domToXmlPractice;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXmlToDom {
    public void readXmlData(String path, String tagName){
        File xmlfile = new File(path);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try{
            builder= factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

        Document document;
        try{
            document = builder.parse(xmlfile);
        } catch (IOException | SAXException e) {
            throw new RuntimeException(e);
        }

        NodeList nodes = document.getElementsByTagName(tagName);
        for(int i=0; i<nodes.getLength(); i++){
            Node node = nodes.item(i);
            System.out.println(node.getTextContent()+" ");
        }
    }
}
