public class Main {
    public static void main(String[] args) {

        // Controles de flujo    BREAK, CONTINUE, RETURN

        int i;

        /*
        BREAK
        for (i = 1; i <= 10; i++){
            System.out.println(i);
            if (i == 5){
                System.out.print("Dentro del if si cumple " + i);
                break;
                // al tener el break cumple con que es  i  == 5 por eso ya no imprime el segundo 5
                //solo del primer system.ou.printl(i);
            }
        }
        */
        /*
        CONTINUE
        for (i = 0; i<=10; i++){
            System.out.println("primer" + i);
            if (i == 5){

                //Se utiliza para saltar una iteración de un ciclo
                //(while, do-while, for) y continuar con
                //la siguiente iteración.

                //saltea las lineas que continuan del (scope "{}" del for)
               // continue; //sale del bucle en la posicion que esta indicada la condiccion que es el 5
                //lo saltea por eso no parece el 5 del segundo print
            }
            System.out.println("segundo" + i);
            */


        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                //System.out.print("Dentro del if si cumple " + i);
                //el return se utiliza para devolver cosas en otras estructuras
                return;//Se utiliza para cerrar funciones, se corta el codigo (el scope)
                //corta en el 5 y ya no imprime el 5 del printl de abajo
            }
            System.out.println(i);
        }
    }
}