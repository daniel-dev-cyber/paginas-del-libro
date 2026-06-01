
public class InstruccionContinue {

    public static void main(String[] args) {

        for(int numero = 1; numero <= 10; numero++){

            if(numero == 7){
                continue;
            }

            System.out.print(numero + " ");
        }

    }

}
