public class ListaLigada {
    private No no;
    private int qtd;

    public ListaLigada() {
        this.no = null;
    }

    public void adicionarFinal(int valor) {

        No no = new No(valor);

        if (this.no == null) {
            this.no = no;
            return;
        }

        No atual = this.no;

        while (atual.getProx() != null) {
            atual = atual.getProx();
        }

        atual.setProx(no);
        qtd++;
    }

    public void remove(int pos) {
        No atual = this.no;
        try {
            verificarPosicaoInvalida(pos);


            No anterior = this.no;

            if (pos == 0){
                int valor = atual.getDado();
                atual = atual.getProx();
                this.no = atual;
                this.qtd--;
                System.out.println(valor);
                return;
            }


            int j = 0;

            while (j != pos) {
                atual = atual.getProx();
                j++;

                if (j > 1) {
                    anterior = anterior.getProx();
                }
            }

            anterior.setProx(atual.getProx());


        } catch (ExceptionPosicao e) {
            System.out.println(e.getMessage());
        }
        this.qtd--;
        System.out.println(atual.getDado());
    }

    public void verificarPosicaoInvalida(int pos){
        if (pos > this.qtd){
            throw new ExceptionPosicao("Posição invalida: ");
        }
    }



    public void adicionarValorNaPosicao(int pos, int novoValor){

        try {
            verificarPosicaoInvalida(pos);


            int j = 0;

            No atual = this.no;
            while (j != pos){
                atual = atual.getProx();
                j++;
            }

            atual.setDado(novoValor);
        }catch (ExceptionPosicao e){
            System.out.println(e.getMessage());
        }
    }

    public void buscaValorPosicao(int valor){
        int j = 0;
        try{
            No atual = this.no;

            while (atual.getDado() != valor){
                if (atual.getProx() != null){
                    atual = atual.getProx();
                }
                verificarPosicaoInvalida(j);
                j++;
            }

            if (atual.getDado() == valor){
                System.out.println("Esta na posição: " + j + ".");
            }
        } catch (ExceptionPosicao e) {
           StringBuilder str = new StringBuilder(e.getMessage()).append(j);
           System.out.println(str);
        }
    }


    public int getQtd() {
        return qtd;
    }



    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("[");

        No atual = this.no;

        stringBuilder.append(atual.getDado());
        stringBuilder.append(", ");

        while (atual.getProx() != null){
            atual = atual.getProx();
            stringBuilder.append(atual.getDado());
            if (atual.getProx() == null){
                stringBuilder.append("]");
            }else {
                stringBuilder.append(", ");
            }
        }

        return  stringBuilder.toString();
    }
}
