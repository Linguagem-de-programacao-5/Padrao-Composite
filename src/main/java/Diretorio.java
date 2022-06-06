public class Diretorio {

    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItem() {
        if (this.item == null) {
            throw new NullPointerException("Diretório vazio");
        }
        return this.item.getEstrutura();
    }
}
