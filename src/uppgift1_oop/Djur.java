package uppgift1_oop;

/**
 * Abstraktklass som beskriver ett djur
 * @author isami
 */
public abstract class Djur implements IPetHotellGast {
    
    /// ---INKAPSLING--- ///
    private String namn;
    private int vikt;
    private int langd;
    private Person agare;
    
    public Djur(){}
    
    public Djur(String namn, int vikt, int langd) {
        this.namn = namn;
        this.vikt = vikt;
        this.langd = langd;
    }

    public Djur(String namn, int vikt, int langd, Person agare) {
        this.namn = namn;
        this.vikt = vikt;
        this.langd = langd;
        this.agare = agare;
    }

    public abstract void late();
    
    
    /// ---POLYMORFISM--- ///
    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || (getClass() != object.getClass())){
            return false;
        } else {
            Djur d = (Djur)object;
            return namn.equals(d.getNamn()) && agare.equals(d.getAgare());
        }
    }
    
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public int getLangd() {
        return langd;
    }

    public void setLangd(int langd) {
        this.langd = langd;
    }

    public Person getAgare() {
        return agare;
    }

    public void setAgare(Person agare) {
        this.agare = agare;
    }    
    
}
