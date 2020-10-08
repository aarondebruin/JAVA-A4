package Oefenopdracht6;

public class Product {
    private double btw = 1.21;
    private double prijs;
    private String beschrijving;

    public void setBtw(double btw) {
        if (btw > 0 && btw <= 100) {
            this.btw = btw;
        } else {
            this.btw = 0;
        }
    }

    public double getBtw(){
        return btw;
    }

    public void setPrijs(double prijs) {
        if (prijs > 0){
            this.prijs =  prijs;
        } else {
            this.prijs = 0;
        }
    }

    public double getPrijs(){
        return prijs;
    }

    public double getPrijsMetBtw() {
        if (prijs != 0 && btw != 0) {
            double getPrijsMetBtw = prijs * btw;
            return getPrijsMetBtw;
        } else {
            return 0;
        }
    }

    public void setBeschrijving(String beschrijving) {
        if (beschrijving.length() > 0) {
            this.beschrijving = beschrijving;
        } else {
            this.beschrijving = "0";
        }
    }

    public String getBeschrijving() {
        return beschrijving;
    }
}
