package pl.zabrze.zs10.przepisy3a;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    private  ArrayList<Przepis> przepisy = new ArrayList<>();

    public RepozytoriumPrzepisow() {
        wstawPrzepisy();
    }

    public  ArrayList<Przepis> wstawPrzepisy(){
        przepisy.add(new Przepis(
                "kakao",
                "napoje",
                0,
                R.drawable.kako,
                "kakao, mleko",
                "podgrzej mleko,wszystko wymieszaj"     ));
        przepisy.add(new Przepis(
                "gofry",
                "desery",
                1,
                R.drawable.gofry,
                "mąka, cukier, jajka, mleko, proszek do pieczenia",
                "wszystko wymieszaj, piecz 6 minut"     ));
        przepisy.add(new Przepis(
                "mufinki",
                "ciasteczka",
                3,
                R.drawable.mufinki,
                "kakao, mleko, jajka, cukier,proszek do pieczenia",
                "wszystko wymieszaj, piecz w temperaturze 180"     ));
        przepisy.add(new Przepis(
                "pierniczki",
                "ciasteczka",
                3,
                R.drawable.pierniczki,
                "kakao, mleko, miód, jajka, cukier,proszek do pieczenia, przyprawa korzenna",
                "wszystko wymieszaj, piecz w temperaturze 180"     ));
        przepisy.add(new Przepis(
                "ptyś",
                "ciasteczka",
                3,
                R.drawable.ptys,
                "kakao, mleko, jajka, cukier,proszek do pieczenia",
                "wszystko wymieszaj, piecz w temperaturze 180"     ));
        przepisy.add(new Przepis(
                "szarlotka",
                "ciasta",
                2,
                R.drawable.szarlotka,
                "jabłka, masło, jajka, cukier,proszek do pieczenia",
                "wszystko wymieszaj, piecz w temperaturze 180"     ));
        return przepisy;

    }
    public ArrayList<Przepis> przepisyZKategorii(int nrKategorii){
        ArrayList<Przepis> wybranePrzepisy = new ArrayList<>();
        for (Przepis p:przepisy) {
            if(p.getNrKategorii() == nrKategorii)
                wybranePrzepisy.add(p);
        }
        return wybranePrzepisy;
    }
}
