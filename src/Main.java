public class Main {
    public static void main(String[] args) {
        // laço enquanto
        int contador = 1; // inicializando
        while(contador <= 10){
            System.out.println("Contador = " + contador);
            // incremento
            contador = contador + 1;
        }

        // faça enquanto
        int cont = 0;
        do{
            System.out.println(cont);
            // incremento
            cont++;
        }while(cont < 10);

        for(int x=40; x<=50; x++){
            System.out.println(x);
        }

    }
}