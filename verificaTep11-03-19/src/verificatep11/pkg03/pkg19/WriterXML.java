/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatep11.pkg03.pkg19;

import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.transform.*;
import javax.xml.transform.dom.*; 
import javax.xml.transform.stream.*;

/**
 *
 * @author mandressi_andrea
 */
public class WriterXML {
   
    Document document;
  
    public void PrintToFIle(String filename)throws TransformerException{
         Olio olio;
    TransformerFactory factory;
    Transformer transform;
   DOMSource source;
    StreamResult stream;
    factory = TransformerFactory.newInstance();
    transform = factory.newTransformer();
    source = new DOMSource(document);
        stream = new StreamResult(new File(filename));
    transform.transform(source,stream);
    }
}

