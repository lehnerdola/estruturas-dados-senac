public class ArrayEstatico {

    public static void main(String[] args){
        int [] numeros;
        numeros = new int [8];

        int tamanho = 0;

        tamanho = inserirNoFim(numeros, tamanho, 10);


        System.out.println("capacidade do array: " + numeros.length);
        System.out.println("elemento: " + numeros);
        exibir(numeros, tamanho);
       
    }

    public static int inserirNoFim(int[] array, int tamanho, int valor){
        if(tamanho>=array.length){
            System.out.println("ta cheio " + valor);
            return tamanho;
        }

        array[tamanho] = valor;
        return tamanho + 1;
    }

    public static void exibir(int [] array, int tamanho) {
        for (int i = 0; i < tamanho; i++){
            System.out.println("indice " + i + " " + array[i]);
        }
    }

}