package uppgift1_oop;

/**
 * Klassen beskriver en person
 * @author isami
 */
public class Person {
    
    private String namn;
    private String personnummer;
    private String adress;
    private String telefonnummer;

    public Person(){}
    
    public Person(String namn, String personnummer, String adress, String telefonnummer) {
        this.namn = namn;
        this.personnummer = personnummer;
        this.adress = adress;
        this.telefonnummer = telefonnummer;
    }
    
    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || !(object instanceof Person)){
            return false;
        } else {
            Person p = (Person)object;
            return namn.equals(p.getNamn()) && personnummer.equals(p.getPersonnummer());
        }
    }
   
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    
    
    
}
