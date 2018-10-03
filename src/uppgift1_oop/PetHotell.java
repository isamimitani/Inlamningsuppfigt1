package uppgift1_oop;

import java.util.*;

/**
 * Klassen beskriver ett pethotell
 * @author isami
 */
public class PetHotell {
    
    private String namn;
    private List<Djur> petLista = new ArrayList<>();
    private List<Person> personalLista = new ArrayList<>();

    public PetHotell(){}
    
    public PetHotell(String namn) {
        this.namn = namn;
    }
    
    public void addDjur(Djur d){
        petLista.add(d);
    }
    
    public void removeDjur(Djur d){
        petLista.remove(d);
    }
    
    public void addPersonal(Person p){
        personalLista.add(p);
    }
    
    public void removePersonal(Person p){
        personalLista.remove(p);
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public List<Djur> getPetLista() {
        return petLista;
    }

    public void setPetLista(List<Djur> petLista) {
        this.petLista = petLista;
    }

    public List<Person> getPeronalLista() {
        return personalLista;
    }

    public void setPeronalLista(List<Person> personalLista) {
        this.personalLista = personalLista;
    }
     
}
