package uppgift1_oop;

/**
 * Klassen beskriver en orm
 * @author isami
 */
public class Orm extends Djur{
    
    public Orm(){}
    
    public Orm(String namn, int vikt, int langd) {
        super(namn, vikt, langd);
    }
    
    public Orm(String namn, int vikt, int langd, Person agare) {
        super(namn, vikt, langd, agare);
    }
    
    public String raknaFoder(){
        return "Ormpellets: 20 gram";       
    }
    
    public void late(){
        System.out.println("Sssssss!");
    }
}
