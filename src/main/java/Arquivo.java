public class Arquivo extends Item {
    private String tipo;

    public Arquivo(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getEstrutura() {
        return "Arquivo: " + this.getNome() + "." + this.tipo + "\n";
    }
}
