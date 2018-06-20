import java.util.ArrayList;
import java.util.Iterator;

/**
 * Beschreiben Sie hier die Klasse Zimmer.
 * 
 * @author Simon Heinen
 * @version 08.06.2018
 */
public class Zimmer{
    private int anzBetten;
    private double preis;
    private ArrayList<Person> personen;
    
    
    public Zimmer(){
        //Leerer Konstruktor
    }
    
    public Zimmer(int anzBettenX, int preisX){
        anzBetten = anzBettenX;
        preis = preisX;
        personen = new ArrayList<Person>();
    }
    
    //@Getter
    public int gibAnzBetten(){
        return anzBetten;
    }
    
    public double gibPreis(){
        return preis;
    }
    
    public boolean istFrei(){
        if(personen.size() == 0){
            return true;
        }
        return false;
    }
    
    
    //@Setter
    public void setzePreis(int preisX){
        preis = preisX;
    }
    
    
    //Methoden
    public void personHinzufuegen(Person personX){
        if(gibAnzBetten() > personen.size()){
            personen.add(personX);
        }else{
            System.out.println("[!] Es stehen keine Freien Betten zur verfügung!");
        }
    }
    
    public void personEntfernen(Person personX){
        personen.remove(personX);
    }
    
    public void personenEntfernen(String nameX){
        Iterator<Person> it = personen.iterator();
        while(it.hasNext()){
            Person person = it.next();
            if(person.gibName().contains(nameX)){
                it.remove();
            }
        }
    }
}
