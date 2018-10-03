package uppgift1_oop;

/**
 * Klassen beskriver en katt
 * @author isami
 */
public class Katt extends Djur{
    
    public Katt(){}
    
    public Katt(String namn, int vikt, int langd) {
        super(namn, vikt, langd);
    }
    
    public Katt(String namn, int vikt, int langd, Person agare) {
        super(namn, vikt, langd, agare);
    }
    
    public String raknaFoder(){
        double gram = super.getVikt() / 150;
        return "Kattfoder: " + gram +" gram";       
    }
    
    public void late(){
        System.out.println("Mjau!");
    }
}
