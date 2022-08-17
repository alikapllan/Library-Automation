
public class BuchLeihenColumns {
    
    private int buchID;
    private String buchname;
    private String author;
    private String auflagesdatum;
    private String thema;
    private String verlag;
    private String studentnummer;
    private String datum;

    public BuchLeihenColumns(int buchID, String buchname, String author, String auflagesdatum, String thema, String verlag, String studentnummer, String datum) {
        this.buchID = buchID;
        this.buchname = buchname;
        this.author = author;
        this.auflagesdatum = auflagesdatum;
        this.thema = thema;
        this.verlag = verlag;
        this.studentnummer = studentnummer;
        this.datum = datum;
    }

    public int getBuchID() {
        return buchID;
    }

    public void setBuchID(int buchID) {
        this.buchID = buchID;
    }

    public String getBuchname() {
        return buchname;
    }

    public void setBuchname(String buchname) {
        this.buchname = buchname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuflagesdatum() {
        return auflagesdatum;
    }

    public void setAuflagesdatum(String auflagesdatum) {
        this.auflagesdatum = auflagesdatum;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public String getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String getDatum() {
        return datum;
    }
    
    public void setDatum(String datum) {
        this.datum = datum;
    }

}
