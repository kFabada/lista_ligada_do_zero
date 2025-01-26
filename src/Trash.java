/*

public class ListaLigada {
    private No no;

    public ListaLigada() {
        this.no = null;
    }

    public void adicionar(No no){

        if (this.no == null){
            this.no = no;
            return;
        }

        No atual = this.no.getProx();

        while (atual != null){
            atual = atual.getProx();
        }
         this.no.setProx(no);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("[ ");

        No atual = this.no;
        stringBuilder.append(atual.getDado());
        stringBuilder.append(", ");

        while (atual.getProx() != null){
            stringBuilder.append(atual.getDado());
            stringBuilder.append(", ");
        }

        return  stringBuilder.toString();
    }



 */
