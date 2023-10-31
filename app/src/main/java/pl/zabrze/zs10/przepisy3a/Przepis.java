package pl.zabrze.zs10.przepisy3a;
public class Przepis {
    private String nazwa;
    private String kategoria;
    private  int nrKategorii;
    private int idObrazka;
    private String skladniki;
    private String tresc;
    private int id;
    private static int ile =0 ;

    public Przepis(String nazwa,
                   String kategoria,
                   int nrKategorii,
                   int idObrazka, String skladniki, String tresc) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.nrKategorii = nrKategorii;
        this.idObrazka = idObrazka;
        this.skladniki = skladniki;
        this.tresc = tresc;
        id=ile;
        ile++;

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  nazwa ;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getNrKategorii() {
        return nrKategorii;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public String getTresc() {
        return tresc;
    }
}
