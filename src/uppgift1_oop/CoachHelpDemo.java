package uppgift1_oop;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author isami
 */
public class CoachHelpDemo {
    
    /**
     * Demoklass för att testa projektet
     */
    public CoachHelpDemo(){
        
        // Skapar nya instanser av personer
        Person p1 = new Person("Sven Svensson", "19800101-1234", 
                "Testgatan 1, Stockholm", "081234567");
        Person p2 = new Person("Maria Jonsson", "19851231-9876", 
                "Demogatan 50, Stockholm", "089876543");
        Person p3 = new Person("Ichiro Suzuki", "19780630-3456", 
                "Djurgatan 22, Stockholm", "081112222");
        Person p4 = new Person("Naoko Ken", "19601015-9956", 
                "Hotellgatan 34, Stockholm", "089988776");
        Person p5 = new Person("Linda Claesson", "19900911-4352", 
                "Hundgatan 5, Stockholm", "087401294");
        
        // Skapar nya instanser av olika djur
        Hund h1 = new Hund("Sixten", 5000, 50, p3);
        Hund h2 = new Hund("Dogge", 10000, 80, p5);
        Katt k1 = new Katt("Venus", 5000, 55, p3);
        Katt k2 = new Katt("Ove", 3000, 45, p5);
        Orm o1 = new Orm("Hypno", 1000, 40, p4);
        
        // Skapar en ny instans av pethotell och lägger till information
        PetHotell pHotell = new PetHotell("HealthyPets");
        pHotell.addPersonal(p1);
        pHotell.addPersonal(p2);
        /// ---POLYMORFISM--- ///
        pHotell.addDjur(h1);
        pHotell.addDjur(h2);
        pHotell.addDjur(k1);
        pHotell.addDjur(k2);
        pHotell.addDjur(o1);
        
        // Matar in djurets namn och visar upp vad som ska ges och hur mycket ska ges
        // Avslutar om man trycker avbryt eller kryss
        do{
            String petnamn = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            if(petnamn==null) {
                JOptionPane.showMessageDialog(null, "Avslutar programmet...");
                break;
            }else if(petnamn.equals("")){
                JOptionPane.showMessageDialog(null, "Du måste mata in något! Försök igen.");
                continue;
            } else if(!petnamn.matches("[^0-9]+")){     //Siffror ska ses som fel inmatning
                JOptionPane.showMessageDialog(null, "Ogiltig inmatning! Försök igen.");
                continue;
            }
            
            Djur d = hittaDjur(pHotell.getPetLista(), petnamn);
            if(d==null){
                JOptionPane.showMessageDialog(null, "Kunde inte hitta " + petnamn);
            } else {
                /// ---POLYMORFISM--- ///
                String res = d.raknaFoder();
                d.late();
                JOptionPane.showMessageDialog(null, res + " till " +  d.getNamn());      
            }
        }while(true);
        
        System.exit(0);        
        
    }
       
    /**
     * Metoden letar efter ett djur från en lista
     * @param lista petlista att leta efter
     * @param namn  djurets namn att hitta
     * @return  djuret som hittats eller null när det inte hittats
     */
    public static Djur hittaDjur(List<Djur> lista, String namn){
        Djur d = null;
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getNamn().toLowerCase().equals(namn.toLowerCase())){
                d = lista.get(i);
                break;
            }
        }
        return d;       
    }
    
}
