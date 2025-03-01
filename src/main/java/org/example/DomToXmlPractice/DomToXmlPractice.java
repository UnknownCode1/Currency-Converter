package org.example.DomToXmlPractice;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class DomToXmlPractice {

    public String writeToXml(String path){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }


        Document document = builder.newDocument();

        Element root = document.createElement("ProgrammingLanguagesList");
        document.appendChild(root);

        Element book1 = document.createElement("Language1");
        book1.appendChild(document.createTextNode("Java Programming Language"));
        Element book2 = document.createElement("Language2");
        book2.appendChild(document.createTextNode("C++ Programming Language"));
        Element book3 = document.createElement("Language3");
        book3.appendChild(document.createTextNode("Rust Programming Language"));

        root.appendChild(book1);
        root.appendChild(book2);
        root.appendChild(book3);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer;
        try{
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        }

        DOMSource source = new DOMSource(document);

        StreamResult result = new StreamResult(path);

        try{
            transformer.transform(source, result);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

        return "Successfully Added content to XML from DOM";
    }


}
