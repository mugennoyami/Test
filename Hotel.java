import java.util.ArrayList;
import java.util.Iterator;

/**
 * Beschreiben Sie hier die Klasse Hotel.
 * 
 * @author Simon Heinen
 * @version 08.06.2018
 */
public class Hotel{
    private ArrayList<Zimmer> zimmerliste;
    
    public Hotel(){
        zimmerliste = new ArrayList<Zimmer>();
    }
    
    
    //@Getter
    public int gibAnzahlZimmer(){
        return zimmerliste.size();
    }
    
    public int gibAnzahlBetten(){
        int bettenInsg=0;
        for(Zimmer zimmer : zimmerliste){
            int betten = zimmer.gibAnzBetten();
            bettenInsg = bettenInsg + betten;
        }
        return bettenInsg;
    }
    
    public ArrayList<Zimmer> gibFreieZimmer(){
        ArrayList<Zimmer> zimmerTmp = zimmerliste;
        for(Zimmer zimmer : zimmerliste){
            if(zimmer.istFrei()){
                zimmerTmp.add(zimmer);
            }
        }
        return zimmerTmp;
    }
    
    
    //Methoden
    public void zimmerHinzufuegen(Zimmer zimmerX){
        zimmerliste.add(zimmerX);
    }
}
