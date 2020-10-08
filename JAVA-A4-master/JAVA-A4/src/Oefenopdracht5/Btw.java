package Oefenopdracht5;

import java.text.DecimalFormat;

public class Btw {
    private double btw = 1.21;
    private double prijs;

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getBtw() {
        return btw;
    }

    public void setBtw(int btw) {
        this.btw = btw;
    }

    public double getPrijsInclusiefBtw() {
        return  prijs * btw;

    }

   public static void main(String[] args) {
       Btw btw = new Btw();
       btw.setPrijs(100);
        System.out.println(new DecimalFormat("0.00").format(btw.getPrijsInclusiefBtw()));
    }

}


