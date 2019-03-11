/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatep11.pkg03.pkg19;


            
            


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author mandressi_andrea
 */
    
public class Parser {
    
    
    public List valorizeXml(){
        try {
            Element root = null, element;
            NodeList nodelist;
            
            List listaOlio = new ArrayList();
            File file = new File("Olio.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            root = document.getDocumentElement();
            nodelist = root.getElementsByTagName("row"); 
            
            for (int i = 0; i <nodelist.getLength() ;i++) {
                element = (Element) nodelist.item(i);
                
                Olio olio = new Olio();
                olio.setAnno(document.getElementsByTagName("anno").item(i).getTextContent());
                olio.setCodice(document.getElementsByTagName("codice").item(i).getTextContent());
                olio.setRegioni(document.getElementsByTagName("regioni").item(i).getTextContent());
                olio.setOliveSuperficie(document.getElementsByTagName("olive_superficie__ha_").item(i).getTextContent());
                olio.setOliveSuperficieProduzione(Integer.parseInt(document.getElementsByTagName("olive_superficie_in_produzione__ha_ ").item(i).getTextContent()));
                olio.setOliveInproduzione(document.getElementsByTagName("olive_produzione__quintali_").item(i).getTextContent());
                olio.setOliveDaTavolaRaccolta(document.getElementsByTagName("olive_da_tavola_produzione_raccolta__quintali_").item(i).getTextContent());
                olio.setOliveDatavolaProduzione(Integer.parseInt(document.getElementsByTagName("olive_da_tavola_produzione__quintali_").item(i).getTextContent()));
                 olio.setOliveDaolioProduzione(document.getElementsByTagName("olive_da_olio_produzione__quintali_").item(i).getTextContent());
                 olio.setOlivePressioneResa(document.getElementsByTagName("olio_di_pressione_resa_di_produzione__quintali_").item(i).getTextContent());
                olio.setOlivePressioneProduzione(Integer.parseInt(document.getElementsByTagName("olio_di_pressione_produzione__quintali_").item(i).getTextContent()));
                 listaOlio.add(olio);
                
            }
            
            return listaOlio;
        } catch (SAXException | IOException  | ParserConfigurationException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

            

