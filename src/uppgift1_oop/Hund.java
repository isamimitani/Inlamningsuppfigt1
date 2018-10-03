package uppgift1_oop;

/**
 * Klassen beskriver en hund
 * @author isami
 */
public class Hund extends Djur{

    public Hund(){}
    
    public Hund(String namn, int vikt, int langd) {
        super(namn, vikt, langd);
    }
    
    public Hund(String namn, int vikt, int langd, Person agare) {
        super(namn, vikt, langd, agare);
    }
    
    public String raknaFoder(){
        double gram = super.getVikt() / 100;
        return "Hundfoder: " + gram +" gram";      
    }
    
    public void late(){
        System.out.println("Voff Voff!!");
    }

}
