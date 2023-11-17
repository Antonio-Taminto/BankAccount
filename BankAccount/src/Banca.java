import java.util.Arrays;

public class Banca {
    private String nomeBanca;
    private ContoBancario[] contoBancario;

    private int maxConti;
    private int numConti = 0;

    public Banca(String nomeBanca, int maxConti){
        this.nomeBanca = nomeBanca;
        this.maxConti = maxConti;
        this.contoBancario = new ContoBancario[maxConti];
    }

    public void aggiungiConto(String iban,double saldo){
        if(numConti < maxConti){
        contoBancario[numConti] = new ContoBancario(iban, saldo);
        }else if (numConti == maxConti) {
            System.out.println("Non è possibile aprire altri conti");
        }

        numConti++;
    }
    public void visulizzaInformazioniConti(){
        for(int i = 0 ; i < contoBancario.length && i < numConti;i++){
            System.out.println(contoBancario[i].toString());
        }
    }

    public int saldoTotale(){
        int sum = 0;
        for(int i = 0 ; i < contoBancario.length && i < numConti;i++){
            sum += (int) contoBancario[i].getSaldo();
        }
        return sum;
    }

    public ContoBancario[] getContoBancario() {
        return contoBancario;
    }

    public int getNumConti() {
        return numConti;
    }

    public String getNomeBanca() {
        return nomeBanca;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "nomeBanca='" + nomeBanca + '\'' +
                ", contoBancario=" + Arrays.toString(contoBancario) +
                ", maxConti=" + maxConti +
                ", numConti=" + numConti +
                '}';
    }
}

