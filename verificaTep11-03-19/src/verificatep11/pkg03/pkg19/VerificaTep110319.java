/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatep11.pkg03.pkg19;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.IOException;
import java.text.Normalizer;
import static java.text.Normalizer.normalize;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author mandressi_andrea
 */
public class VerificaTep110319 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Parser dom = new Parser();
        WriterXML wrt = new WriterXML();
        Scanner scanner = new Scanner(System.in);

        List Olio = dom.valorizeXml();
        int scelta = 0, produzione = 0, controllo = 0;

        String regione, anno, stringa = "", olioMigliore = "";

        while (scelta != 3) {

            System.out.println("GestioneOlio");
            System.out.println("1 - visualizza tutte le informazioni fornendo anno e regione");
            System.out.println("2 - visualizza l'olio di pressione produzione prodotto in un anno");
            System.out.println("3 - consocere la regione con più olive da tavola produzione raccolte");
            System.out.println("4 - conoscere quale regione ha più olive superficie in produzioned ");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("inserire anno e regione");
                    anno = scanner.nextLine();
                    regione = scanner.nextLine();
                    for (int i = 0; i < Olio.size(); i++) {
                        Olio oil = (Olio) Olio.get(i);
                        if (oil.getAnno().equals(anno) && oil.getRegioni().equals(regione)) {
                            stringa = Olio.get(i).toString();
                        }
                        System.out.println(stringa);
                    }
                    break;
                case 2:
                    System.out.println("inserire l'anno di produzione da cercare");
                    anno = scanner.nextLine();
                    for (int i = 0; i < Olio.size(); i++) {
                        Olio oil = (Olio) Olio.get(i);
                        if (oil.getAnno().equals(anno)) {
                            produzione = produzione + oil.getOlivePressioneProduzione();
                        }
                        
                    }System.out.println(produzione);
                    break;
                case 3:
                    for (int i = 0; i < Olio.size(); i++) {
                        Olio oil = (Olio) Olio.get(i);

                        if (controllo > oil.getOliveDatavolaProduzione()) {
                            controllo = oil.getOliveDatavolaProduzione();
                            olioMigliore = oil.getAnno() + oil.getRegioni() + oil.getOliveDatavolaProduzione();
                        }
                    }
                    System.out.println(olioMigliore);
                    break;
                case 4:
                    for (int i = 0; i < Olio.size(); i++) {
                        Olio oil = (Olio) Olio.get(i);

                        if (controllo > oil.getOliveSuperficieProduzione()) {
                            controllo = oil.getOliveDatavolaProduzione();
                            olioMigliore = oil.getAnno() + oil.getRegioni() + oil.getOliveDatavolaProduzione();
                        }
                    }
                    System.out.println(olioMigliore);
                    break;
            }

        }
    
}
}
