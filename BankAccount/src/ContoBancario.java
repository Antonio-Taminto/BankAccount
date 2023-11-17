import java.util.Arrays;

public class ContoBancario {
    private String iban;
    private double saldo;

    public ContoBancario(String iban,double saldo){
        this.iban = iban;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "ContoBancario{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }


    public void stampaDettagli() {
        System.out.println("iban:" + iban + "----" +" saldo:" + saldo);

    }
}
