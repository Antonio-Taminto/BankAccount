// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Banca isp = new Banca("Intesa San Paolo",2);
        isp.aggiungiConto("it 42174",30);
        isp.aggiungiConto("it 9032189",40);
        isp.aggiungiConto("it 9032189",40);

    Banca unicredit = new Banca("Unicredit",3);
        unicredit.aggiungiConto("IT 373737",15);

    Banca popolare = new Banca("Banca Popolare",5);

    }
}