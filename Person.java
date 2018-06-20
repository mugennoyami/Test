
/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @author Simon Heinen
 * @version 08.06.2018
 */
public class Person{
    private String name;
    private int alter;

    public Person(){
        //Leerer Konstruktor
    }
    
    public Person(String nameX, int alterX){
        name = nameX;
        alter = alterX;
    }
    
    //@Getter
    public String gibName(){
        return name;
    }
    
    public int gibAlter(){
        return alter;
    }
}
