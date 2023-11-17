import java.util.Arrays;

public class Banca {
    private String nomeBanca;
    private ContoBancario[] contoBancarioArray;
    private int numConti;

    public Banca(String nomeBanca, int maxConti){
        this.nomeBanca = nomeBanca;
        this.contoBancarioArray = new ContoBancario[maxConti];
        this.numConti = 0;
    }
    public ContoBancario[] getContoBancarioArray() {
        return contoBancarioArray;
    }

    public int getNumConti() {
        return numConti;
    }

    public String getNomeBanca() {
        return nomeBanca;
    }

    public void setContoBancarioArray(ContoBancario[] contoBancarioArray) {
        this.contoBancarioArray = contoBancarioArray;
    }

    public void setNomeBanca(String nomeBanca) {
        this.nomeBanca = nomeBanca;
    }

    public void setNumConti(int numConti) {
        this.numConti = numConti;
    }

    public void aggiungiConto(ContoBancario contoBancario){
        if(numConti < contoBancarioArray.length){
            contoBancarioArray[numConti] = contoBancario;
            numConti++;
        }else{
            System.out.println("ERRORE! La banca : " + getNomeBanca() + " può avere massimo "+ contoBancarioArray.length + " Conti");
        }
    }
    public void visulizzaInformazioniConti(){
        System.out.println("Nome banca: " + nomeBanca);
        //if( contoBancarioArray.length != 0) {
            for (int i = 0; i <  numConti ; i++) {
                contoBancarioArray[i].stampaDettagli();
            }

    }

    public double saldoTotale(){
         double saldo = 0.0;
            for(int i = 0; i < numConti; i++){
                saldo = saldo + contoBancarioArray[i].getSaldo();
            }
        return saldo;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "nomeBanca='" + nomeBanca + '\'' +
                ", contoBancario=" + Arrays.toString(contoBancarioArray) +
                ", numConti=" + numConti +
                '}';
    }


}

