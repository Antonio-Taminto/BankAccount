// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContoBancario conto1 = new ContoBancario("it 42174",30);
        ContoBancario conto2 = new ContoBancario("it 9032189",40);

        Banca ing = new Banca("Ing",40);

        ing.aggiungiConto(conto1);
        ing.aggiungiConto(conto2);

        ing.visulizzaInformazioniConti();

        System.out.println(ing.saldoTotale());


    }
}