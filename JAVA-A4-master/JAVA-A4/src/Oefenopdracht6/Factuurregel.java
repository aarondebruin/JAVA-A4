package Oefenopdracht6;

import java.text.DecimalFormat;

public class Factuurregel {
    private String factuurregel;

    private DecimalFormat df1 = new DecimalFormat("0.00");

    public void setFactuurRegel(int quantity, Product product) {
        factuurregel = "Aantal: " + quantity + " | " + product.getBeschrijving() +
                "\nPer product: €" + product.getPrijs() + " Excl. Btw (21%)" +
                "\nTotaal: €" + df1.format(product.getPrijs() * quantity * (product.getBtw())) +
                " Incl. Btw (21%)";
    }

    public String getFactuurRegel() {
        return factuurregel;
    }
}