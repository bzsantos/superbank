public class Cao extends Animal {
    private String tamanho;
    private String cor;

    public Cao(String raca, String origem, String tamanho, String cor) {
        super(raca, origem);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    // Getters and setters
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
