package Oefenopdracht6;

public class Runner {
    public static void main(String[] args) {
        Product iPhone8 = new Product();
        iPhone8.setPrijs(300);
        iPhone8.setBeschrijving("iPhone 8 64 GB Nieuw");
        Factuurregel iPhoneRegel = new Factuurregel();
        iPhoneRegel.setFactuurRegel(1,iPhone8);
        System.out.println(iPhoneRegel.getFactuurRegel());
    }
}

