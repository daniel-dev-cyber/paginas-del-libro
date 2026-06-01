
public class ArreglosEnteros {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        // Llenar primero el arreglo
        numeros[0] = 10;
        numeros[1] = 30;
        numeros[2] = 50;
        numeros[3] = 70;
        numeros[4] = 90;

        // Luego imprimir
        for(int indice = 0; indice < 5; indice++){
            System.out.println("Indice: " + indice +
                               ", Valor: " + numeros[indice]);
        }

    }

}
