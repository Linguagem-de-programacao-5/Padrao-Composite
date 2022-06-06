import java.util.ArrayList;
import java.util.List;

public class Pasta extends Item {
    private List<Item> itens;

    public Pasta(String nome) {
        super(nome);
        this.itens = new ArrayList<Item>();
    }

    public void addConteudo(Item item){
        this.itens.add(item);
    }

    @Override
    public String getEstrutura() {
        String estrutura = "";
        estrutura = "Pasta: " + this.getNome() + "\n";
        for(Item item : itens){
            estrutura += item.getEstrutura();
        }
        return  estrutura;
    }
}
