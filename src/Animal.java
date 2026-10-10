public class Animal {
    private String raca;
    private String origem;

    public Animal(String raca, String origem) {
        this.raca = raca;
        this.origem = origem;
    }

    // Getters and setters
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}