/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificatep11.pkg03.pkg19;

/**
 *
 * @author mandressi_andrea
 */
public class Olio {
    String anno,codice,regioni,OliveSuperficie,oliveInproduzione,oliveDaTavolaRaccolta,
            oliveDaolioProduzione,olivePressioneResa;
int olivePressioneProduzione,oliveDatavolaProduzione,oliveSuperficieProduzione;
    @Override
    public String toString() {
        return "Olio{" + "anno=" + anno + ", codice=" + codice + ", regioni=" + regioni + ", OliveSuperficie=" + OliveSuperficie + ", oliveSuperficieProduzione=" + oliveSuperficieProduzione + ", oliveInproduzione=" + oliveInproduzione + ", oliveDaTavolaRaccolta=" + oliveDaTavolaRaccolta + ", oliveDatavolaProduzione=" + oliveDatavolaProduzione + ", oliveDaolioProduzione=" + oliveDaolioProduzione + ", olivePressioneResa=" + olivePressioneResa + ", olivePressioneProduzione=" + olivePressioneProduzione + '}';
    }

    public Olio() {
    }

    
    public Olio(String anno, String codice, String regioni, String OliveSuperficie, int oliveSuperficieProduzione, String oliveInproduzione, String oliveDaTavolaRaccolta, int oliveDatavolaProduzione, String oliveDaolioProduzione, String olivePressioneResa, int olivePressioneProduzione) {
        this.anno = anno;
        this.codice = codice;
        this.regioni = regioni;
        this.OliveSuperficie = OliveSuperficie;
        this.oliveSuperficieProduzione = oliveSuperficieProduzione;
        this.oliveInproduzione = oliveInproduzione;
        this.oliveDaTavolaRaccolta = oliveDaTavolaRaccolta;
        this.oliveDatavolaProduzione = oliveDatavolaProduzione;
        this.oliveDaolioProduzione = oliveDaolioProduzione;
        this.olivePressioneResa = olivePressioneResa;
        this.olivePressioneProduzione = olivePressioneProduzione;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getRegioni() {
        return regioni;
    }

    public void setRegioni(String regioni) {
        this.regioni = regioni;
    }

    public String getOliveSuperficie() {
        return OliveSuperficie;
    }

    public void setOliveSuperficie(String OliveSuperficie) {
        this.OliveSuperficie = OliveSuperficie;
    }

    public int getOliveSuperficieProduzione() {
        return oliveSuperficieProduzione;
    }

    public void setOliveSuperficieProduzione(int oliveSuperficieProduzione) {
        this.oliveSuperficieProduzione = oliveSuperficieProduzione;
    }

    
    public String getOliveInproduzione() {
        return oliveInproduzione;
    }

    public void setOliveInproduzione(String oliveInproduzione) {
        this.oliveInproduzione = oliveInproduzione;
    }

    public String getOliveDaTavolaRaccolta() {
        return oliveDaTavolaRaccolta;
    }

    public void setOliveDaTavolaRaccolta(String oliveDaTavolaRaccolta) {
        this.oliveDaTavolaRaccolta = oliveDaTavolaRaccolta;
    }

    public int getOliveDatavolaProduzione() {
        return oliveDatavolaProduzione;
    }

    public void setOliveDatavolaProduzione(int oliveDatavolaProduzione) {
        this.oliveDatavolaProduzione = oliveDatavolaProduzione;
    }

    

    public String getOliveDaolioProduzione() {
        return oliveDaolioProduzione;
    }

    public void setOliveDaolioProduzione(String oliveDaolioProduzione) {
        this.oliveDaolioProduzione = oliveDaolioProduzione;
    }

    public String getOlivePressioneResa() {
        return olivePressioneResa;
    }

    public void setOlivePressioneResa(String olivePressioneResa) {
        this.olivePressioneResa = olivePressioneResa;
    }

    public int getOlivePressioneProduzione() {
        return olivePressioneProduzione;
    }

    public void setOlivePressioneProduzione(int olivePressioneProduzione) {
        this.olivePressioneProduzione = olivePressioneProduzione;
    }

    

    
    
    
}
