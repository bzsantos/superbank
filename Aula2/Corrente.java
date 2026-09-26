public class Corrente extends Conta {
   
    private String nomecli;
    private String cpfcli;    


    public double saldo() {
       return this.getSaldo(); 
    }    
    
    public double depositar(double valordep) {
        return valordep;
    }

    public double sacar(double valorsac) {
        return valorsac;
    } 

    public void abrirConta() {
        this.setNumbank(101);
        this.setNumero(10.114);
        
        //Dados cliente
        System.out.println("Seu banco é: " + this.getNumbank() + 
                           "\n Sua conta corrente é: " + this.getNumero() +
                           "\n Nome do cliente: " + this.getNomecli() +
                           "\n CPF do clinete: " + this.getCpfcli());

    }

    //Getters e Setters

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getCpfcli() {
        return cpfcli;
    }

    public void setCpfcli(String cpfcli) {
        this.cpfcli = cpfcli;
    }

}