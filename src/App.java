import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Clase scanner nos permite que el usuario escriba */
        Scanner scanner = new Scanner(System.in);


        /*declaraciones y asignaciones */

        String palabraSecreta = "inteligencia";
        int Intentos = 0;
        int IntentosMax= 10;
        Boolean isCorrect = false;

        /* Arreglos : */

        char[] letrasAdivinadas = new char [palabraSecreta.length()];

        /*Estructura de control iterativa, bucle */

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!isCorrect && Intentos<IntentosMax){
            System.out.println("palabra a adivinar:" + String.valueOf(letrasAdivinadas) + " (letras totales: " + palabraSecreta.length() + ")");
            //String.valueOf es la palabra entera formada por chars , se usa cuando hay una palabra formada por chars
            System.out.println("introduce una letra");

            //clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estructura de control condicional
                if (palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta=true;

                }
                
            }

            if (!letraCorrecta){
                Intentos++;
                System.out.println("letra incorrecta te quedan:" + (IntentosMax - Intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                isCorrect = true;
                System.out.println("adivinaste la palabra secreta: " + palabraSecreta);


            }


        }

        if (!isCorrect){
            System.out.println("GAME OVER");
        }
        scanner.close();
    }
}
