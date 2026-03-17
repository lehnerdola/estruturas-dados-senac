public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int tamanho = 0;

        if (tamanho == 0) {
            System.out.println("Array esta vazio.");
        }

        tamanho = inserirNoFim(numeros, tamanho, 10);
        tamanho = inserirNoFim(numeros, tamanho, 70); 
        tamanho = inserirNoFim(numeros, tamanho, 30);

        int maior = encontrarMaior(numeros, tamanho);
        System.out.println("Maior numero: " + maior);

        for (int i = 0; i < 5; i++) {
            tamanho = inserirNoFim(numeros, tamanho, i * 10);
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println(numeros[i]);
        }

    }

    public static int inserirNoFim(int[] array, int tamanho, int valor) {

        if (valor < 0) {
            System.out.println("Nao e permitido numeros negativos ");
            return tamanho;
        }

        if (tamanho >= array.length) {
            System.out.println("Array cheio. Nao foi possivel inserir " + valor);
            return tamanho;
        }

        array[tamanho] = valor;

        return tamanho + 1;

    }
    public static int encontrarMaior(int[] array, int tamanho) {

        if (tamanho == 0) {
            System.out.println("Array vazio.");
            return -1;
        }
    
        int maior = array[0];
    
        for (int i = 1; i < tamanho; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
    
        return maior;
    }
}