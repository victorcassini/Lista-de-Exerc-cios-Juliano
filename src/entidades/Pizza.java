package entidades;

public class Pizza {
    private String massa = "";
    private String tamanho = "";
    private String sabor = "";
    private String ingrediente ="";

    public void setMassa(String integral) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Massa: " + this.massa + " " +
                "Tamanho: " + this.tamanho + " " +
                "Sabor: " + this.sabor + " " +
                "Ingredientes: " + (this.ingrediente);
    }
}