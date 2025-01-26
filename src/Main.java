public class Main {
    public static void main(String[] args) {


        ListaLigada listaLigada = new ListaLigada();

        for (int i = 0; i <= 2000; i++){
            listaLigada.adicionarFinal(i);
        }

        System.out.println(listaLigada);

        listaLigada.remove(999);

        System.out.println(listaLigada);


        System.out.println(listaLigada.getQtd());

        listaLigada.buscaValorPosicao(1999);
        listaLigada.buscaValorPosicao(1555);
        listaLigada.buscaValorPosicao(2001);



    }
}