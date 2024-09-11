import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Construccion del Menu Principal

        Scanner scanner = new Scanner(System.in);
        int menu_unoPrincipal = 0;

        do {
            System.out.println("------------------------------------------");
            System.out.println("-     MENU CAPITULO DE PROGRAMACION      -");
            System.out.println("-             PSANDO1 - JMONDR1          -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Datos Primitivos                    -");
            System.out.println("- 2. String                              -");
            System.out.println("- 3. Constantes                          -");
            System.out.println("- 4. Tipo de Operadores                  -");
            System.out.println("- 5. Condicional IF, ELSE IF , ELSE      -");
            System.out.println("- 6. Condicional Switch                   -");
            System.out.println("- 7. Condicional Ternaria                -");
            System.out.println("- 8. Bucle DO WHILE                      -");
            System.out.println("- 9. Bucle While                         -");
            System.out.println("- 10. Bucle FOR Y FOR-EACH               -");
            System.out.println("- 11. Salir                              -");
            System.out.println("------------------------------------------");

            System.out.println("Ingrese una opcion: ");
            menu_unoPrincipal = scanner.nextInt();


            switch (menu_unoPrincipal) {
                case 1:
                    DatosPrimitivos();
                    break;

                case 2:
                    DatosString();
                    break;

                case 3:
                    constantesJava();
                    break;

                case 4:
                    tiposOperadoresJava();
                    break;

                case 5:
                    condicionalesIFELSE();
                    break;

                case 6:
                    condicionalSwitch();
                    break;

                case 7:
                    condicionalTernaria();
                    break;

                case 8:
                    bucleDoWhile();
                    break;

                case 9:
                    bucleWhile();
                    break;

                case 10:
                    bucleForandForEach();
                    break;

                case 11:
                    System.out.println("ha oprimido la opcion 11 Salir...");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (menu_unoPrincipal != 11);
    }

    private static void DatosPrimitivos() {

        int menudatosPrimitivos = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-             MENU DATOS PRIMITIVOS      -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicacion Byte                    -");
            System.out.println("- 2. Explicacion Short                   -");
            System.out.println("- 3. Explicacion Int                     -");
            System.out.println("- 4. Explicacion Long                    -");
            System.out.println("- 5. Explicacion Float                   -");
            System.out.println("- 6. Explicacion Double                  -");
            System.out.println("- 7. Explicacion Char                    -");
            System.out.println("- 8. Explicacion Boolean                 -");
            System.out.println("- 9. Volver al menu anterior             -");
            System.out.println("------------------------------------------");


            System.out.print("Ingrese la opcion: ");
            menudatosPrimitivos = scanner.nextInt();
            scanner.nextLine();

            switch (menudatosPrimitivos) {

                case 1:
                    System.out.println("*******************************************************************");
                    System.out.println("******************        Explicaciòn Byte  ***********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* Un byte en Java son 8 bits  es un tipo de datos primitivo lo    *");
                    System.out.println("* que significa que viene empaquetado con Java.                   *");
                    System.out.println("* Tipo \t Tamaño \t Valor mínimo                                 *");
                    System.out.println("* byte \t 8 bits \t -128                                         *");
                    System.out.println("*******************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("********************************************************************");
                    System.out.println("****************        Explicaciòn Short    ***********************");
                    System.out.println("********************************************************************");
                    System.out.println("* El tipo de dato short es un entero de 16 bits complemento a dos. *");
                    System.out.println("* Su valor mínimo es -32,768 y el máximo 32,767 (inclusive)        *");
                    System.out.println("* Ejemplo: int: El tipo de dato int es un entero de 32 bits        *");
                    System.out.println("* complemento a dos. Su valor mínimo es -2,147,483,648 y el        *");
                    System.out.println("* máximo 2,147,483,647 (inclusive).                                *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("*********************************************************************");
                    System.out.println("****************        Explicaciòn Int       ***********************");
                    System.out.println("*********************************************************************");
                    System.out.println("* Es un tipo de dato de 32 bits con signo utilizado para almacenar  *");
                    System.out.println("* valores numéricos.Su rango va desde -2,147,483,648 (-2^31)        *");
                    System.out.println("* hasta 2,147,483,647 (2^31 - 1). Es el tipo de dato más comúnmente *");
                    System.out.println("* utilizado para representar números enteros                        *");
                    System.out.println("* Ejemplo el valor de Int (1234.67) es 1234                         *");
                    System.out.println("*********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 4:
                    System.out.println("*******************************************************************");
                    System.out.println("****************        Explicaciòn Long     **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* El valor long es un tipo de dato primitivo en Java que se       *");
                    System.out.println("* utiliza para almacenar nùmeros enteros largos. El tipo de dato  *");
                    System.out.println("* es un entero de 64 bits complemento a dos.                      *");
                    System.out.println("* Su valor mínimo es -9,223,372,036,854,775,808                   *");
                    System.out.println("* Su valor máximo es 9,223,372,036,854,775,807                    *");
                    System.out.println("* Ejemplo long numLong = 1234L                                    *");
                    System.out.println("*******************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 5:
                    System.out.println("*******************************************************************");
                    System.out.println("****************        Explicaciòn Float    **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* Se utiliza cuando se necesitan números enteros muy grandes.     *");
                    System.out.println("* Es un tipo de dato diseñado para almacenar números con coma     *");
                    System.out.println("* flotante con precisión simple de 32 bits                        *");
                    System.out.println("* Se utiliza cuando se requieren numeros decimales con grado de   *");
                    System.out.println("* precisiòn adecuado para muchas aplicaciones.                    *");
                    System.out.println("* Ejemplo el numero 3.14159 es un numero de punto flotante, donde *");
                    System.out.println("* el punto decimal esta <<flotando>> entre el 3 y el 1            *");
                    System.out.println("*******************************************************************");
                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 6:
                    System.out.println("*******************************************************************");
                    System.out.println("****************        Explicaciòn Double   **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* Las variables del tipo float o double (coma flotante) se usan   *");
                    System.out.println("* para guardar números en memoria que tienen parte entera         *");
                    System.out.println("* y parte decimal.                                                *");
                    System.out.println("* Por ejemplo: resultado = 3.0 / 2 =  1.5                         *");
                    System.out.println("*******************************************************************");
                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 7:
                    System.out.println("*******************************************************************");
                    System.out.println("****************        Explicaciòn Char     **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* La palabra clave char es un tipo de datos que se utiliza para   *");
                    System.out.println("* almacenar un solo carácter.                                     *");
                    System.out.println("* Un valor char debe estar entre comillas simples, como 'A' o 'c' *");
                    System.out.println("*******************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 8:
                    System.out.println("*******************************************************************");
                    System.out.println("****************        Explicaciòn Boolean  **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* Un valor booleano es aquel que solo admite true (verdadero) o   *");
                    System.out.println("* false (falso), se utilizan para conectar conceptos entre sí,    *");
                    System.out.println("* con el fin de comprobar su veracidad dentro de un enunciado     *");
                    System.out.println("* Ejemplo: la máquina analiza si la información es correcta. Si   *");
                    System.out.println("* es correcta, la marcara como verdadera de lo contrario como     *");
                    System.out.println("* falso                                                           *");
                    System.out.println("*******************************************************************");
                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 9:
                    System.out.println("ha oprimido la opcion 9 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (menudatosPrimitivos != 9);

    }

    private static void DatosString() {

        int menudatosString = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-             MENU DATOS STRING          -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicacion String                  -");
            System.out.println("- 2. Ejemplo String                      -");
            System.out.println("- 3. Devolver al menu Principal          -");
            System.out.println("------------------------------------------");


            System.out.print("Ingrese la opcion: ");


            menudatosString = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (menudatosString) {

                case 1:
                    System.out.println("*******************************************************************");
                    System.out.println("****************             String          **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* String: se utiliza para poder manipular cadenas de caracteres,  *");
                    System.out.println("* es decir, palabras o frases. Debemos usarla cuando queremos     *");
                    System.out.println("* manipular frases o palabras . El tipo de datos String, se       *");
                    System.out.println("* considera Primitivo.                                            *");
                    System.out.println("*******************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    System.out.println("*******************************************************************");
                    System.out.println("****************       Ejemplo String        **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* public class Principal {					                      *");
                    System.out.println("* public static void main(String[] args) {		                  *");
                    System.out.println("*    							                                  *");
                    System.out.println("* /* Declaramos una variable String				                  *");
                    System.out.println("*  para almacenar un nombre*/				                      *");
                    System.out.println("*        String nombre= 'Clases de informática';		          *");
                    System.out.println("*    }       						                              *");
                    System.out.println("*	Nota: Siempre se utiliza comillas dobles en el nombre         *");
                    System.out.println("*******************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (menudatosString != 3);

    }

    private static void constantesJava() {

        int constantesJava = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-          MENU CONSTANTES JAVA          -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicacion Constantes              -");
            System.out.println("- 2. Ejemplos Constantes                 -");
            System.out.println("- 3. Volver al menu anterior             -");
            System.out.println("------------------------------------------");

            System.out.print("Ingrese la opcion: ");


            constantesJava = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (constantesJava) {

                case 1:
                    System.out.println("*******************************************************************");
                    System.out.println("****************       Constantes Java       **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* En java, una constante es un valor que no cambia durante la     *");
                    System.out.println("* ejecuciòn del programa. Las constantes se utilizan para         *");
                    System.out.println("* representar valores fijos y de lectura unica, lo que ayuda      *");
                    System.out.println("* a que el codigo sea mas legible y menos propenso a errores.     *");
                    System.out.println("* NOTA: Las constantes en java se declaran usando la palabra      *");
                    System.out.println("* clave final.                                                    *");
                    System.out.println("*******************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("*******************************************************************");
                    System.out.println("****************  Ejemplos Constantes Java   **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* public static final int TIEMPO_ESPERA_CONEXION = 30;            *");
                    System.out.println("*                                                                 *");
                    System.out.println("* public static final boolean MODO_DEPURACION = true              *");
                    System.out.println("*                                                                 *");
                    ;
                    System.out.println("*******************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 Salir...");

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (constantesJava != 3);

    }

    private static void tiposOperadoresJava() {

        int tiposOperadoresJava = 0;

        do {

            System.out.println("-----------------------------------------------------");
            System.out.println("-              MENU TIPO OPERADORES JAVA            -");
            System.out.println("-----------------------------------------------------");
            System.out.println("- 1. Explicacion Operadores Aritmeticos             -");
            System.out.println("- 2. Explicacion Operadores Relacionales            -");
            System.out.println("- 3. Explicacion Operadores Logicos                 -");
            System.out.println("- 4. Explicacion Operadores Asignacion              -");
            System.out.println("- 5. Explicacion Operadores Incremento / Decremento -");
            System.out.println("- 6. Volver al menú anterior                        -");
            System.out.println("-----------------------------------------------------");

            System.out.print("Ingrese la opcion: ");


            tiposOperadoresJava = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (tiposOperadoresJava) {

                case 1:
                    System.out.println("************************************************************************************************************");
                    System.out.println("***************************  Explicacion Operadores Aritmeticos ********************************************");
                    System.out.println("************************************************************************************************************");
                    System.out.println("* | Operador    |  Ejemplo                      |                 Detalle                                 |*");
                    System.out.println("* |    +        |  int suma = 1+2;              | Suma dos operandos. Resultado: 3                        |*");
                    System.out.println("* |    -        |  int resta = 4-2;             | Resta el segundo operando del primero Resultado: 2      |*");
                    System.out.println("* |    *        |  int multiplicacion = 4*2;    | Multiplica dos operandos. Resultado: 8                  |*");
                    System.out.println("* |    /        |  int division = 4/2;          | Divide el primer operando por el segundo. Resultado:2   |*");
                    System.out.println("* |    %        |  modulo = 5%3;                | Devuelve el resto de la divisiòn del primer operando    |*");
                    System.out.println("*                                               | por el segundo. Resultado:2                             |*");
                    System.out.println("************************************************************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("**************************************************************************************************************************************************");
                    System.out.println("***************************+++++++++++++++++++  Explicacion Operadores Relacionales **************************************************************");
                    System.out.println("**************************************************************************************************************************************************");
                    System.out.println("* | Operador    |  Ejemplo                        |                                   Detalle                                                   |*");
                    System.out.println("* |	   ==	    |  boolean esigual = (5==3); 	  | Comprueba si los valores de dos operadores son iguales. Resultado:false                    	|*");
                    System.out.println("* |	   !=	    |  boolean noEsIgual = (5!=3);    | Comprueba si los valores de dos operandos no son iguales. Resultado:true                   	|*");
                    System.out.println("* |	   !=	    |  boolean noEsIgual = (5!=3);    | Comprueba si los valores de dos operandos no son iguales. Resultado:true                   	|*");
                    System.out.println("* |	   >	    |  boolean mayor = (5>3);         | Comprueba si el valor del primer operando es mayor que el segundo. Resultado:true          	|*");
                    System.out.println("* |	   <	    |  boolean menor = (5<3);         | Comprueba si el valor del primer operando es menor que el segundo. Resultado:false         	|*");
                    System.out.println("* |	   >=	    |  boolean mayorOIgual = (5>=3);  | Comprueba si el valor del primer operando es mayor o igual que el segundo. Resultado:true  	|*");
                    System.out.println("* |	   <=	    |  boolean menorOIgual = (5<=3);  | Comprueba si el valor del primer operando es menor o igual que el segundo. Resultado:false  |*");
                    System.out.println("**************************************************************************************************************************************************");
                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("**************************************************************************************************************************************************");
                    System.out.println("***************************+++++++++++++++++++  Explicacion Operadores Logicos *******************************************************************");
                    System.out.println("**************************************************************************************************************************************************");
                    System.out.println("* | Operador    |  Ejemplo                            |                                   Detalle                                               |*");
                    System.out.println("* |    &&       |  boolean resultado = (5>3 && 3<4);  | Devuelve true si ambos operandos son true. Resultado: true                              |*");
                    System.out.println("* |    ||       |  boolean resultado = (5>3 || 3<4);  | Devuelve true si al menos una de ellas es true                                          |*");
                    System.out.println("* |     !       |  boolean resultado = !(5>3);        | Invierte el valor de un operando booleano. Resultado: false         	                |*");
                    System.out.println("**************************************************************************************************************************************************");
                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 4:
                    System.out.println("************************************************************************************************************************");
                    System.out.println("*************************+++  Explicacion Operadores Asignacion ********************************************************");
                    System.out.println("************************************************************************************************************************");
                    System.out.println("* | Operador    |  Ejemplo           |                                   Detalle                                      |*");
                    System.out.println("* |     =       |  int a = 5;        | Asigna el valor del operando derecho al operando izquierdo                     |*");
                    System.out.println("* |    +=       |  int a = 5; a +=3; | Suma el operando derecho al operando izquierdo y asigna el resultado al        |*");
                    System.out.println("*                                    |  operando izquierdo. Resultado:8                                               |*");
                    System.out.println("* |    -=       |  int a = 5; a -=3; | Resta el operando derecho del operando izquierdo y asigna el resultado al      |*");
                    System.out.println("*                                    | operando izquierdo.Resultado:2                                                 |*");
                    System.out.println("* |    *=       |  int a = 5; a *=3; | Multiplica el operando derecho por el operando izquierdo y asigna el resultado |*");
                    System.out.println("*                                    | al operando izquierdo.Resultado:15                                             |*");
                    System.out.println("* |    /=       |  int a = 6; a /=3; | Divide el operando izquiero por el operando derecho y asigna el resultado al   |*");
                    System.out.println("*                                    | operando izquierdo. Resultado:2                                                |*");
                    System.out.println("* |    %=       |  int a = 5; a %=3; | Calcula el modulo del operando izquiero por el operando derecho y asigna el    |*");
                    System.out.println("*                                    | resultado al operando izquierdo. Resultado: 2                                  |*");
                    System.out.println("************************************************************************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 5:
                    System.out.println("************************************************************************************************************************");
                    System.out.println("***********+++++++++++++++++++  Explicacion Operadores Incremento / Decremento   ***************************************");
                    System.out.println("************************************************************************************************************************");
                    System.out.println("* | Operador    |  Ejemplo                            |                                   Detalle                     |*");
                    System.out.println("* |    ++       |  int a = 5; a++;                    | Incrementa el valor del operando en 1. Resultado: 6           |*");
                    System.out.println("* |    --       |  int a = 5; a--;                    | Decrementa el valor del operando en 1. Resultado: 4           |*");
                    System.out.println("************************************************************************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 6:
                    System.out.println("ha oprimido la opcion 6 volver al menú...");

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (tiposOperadoresJava != 6);

    }

    private static void condicionalesIFELSE() {

        int menucondicionales = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-     Condicional IF, ELSE IF , ELSE     -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicacion de Conceptos            -");
            System.out.println("- 2. Ejemplo Condicional IF              -");
            System.out.println("- 3. Ejemplo Condicional ELSE IF         -");
            System.out.println("- 4. Ejemplo Condicional ELSE            -");
            System.out.println("- 5. Volver al menú anterior             -");
            System.out.println("------------------------------------------");


            System.out.print("Ingrese la opcion: ");
            menucondicionales = scanner.nextInt();
            scanner.nextLine();

            switch (menucondicionales) {

                case 1:
                    System.out.println("********************************************************************");
                    System.out.println("******************        Explicación   ****************************");
                    System.out.println("********************************************************************");
                    System.out.println("* Los condicionales son estructuras que permiten elegir entre la   *");
                    System.out.println("* ejecución de una acción u otra. Son una condición, como bien     *");
                    System.out.println("* indica su nombre, así que podemos pensar en ellos como si fueran *");
                    System.out.println("* el “si” condicional que usamos dentro de una frase.              *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("********************************************************************");
                    System.out.println("******************* Ejemplo de Condicional IF **********************");
                    System.out.println("* int edad = 20;                                                   *");
                    System.out.println("* if (edad >= 18) {                                                *");
                    System.out.println("Eres mayor de edad );                                              *");
                    System.out.println(" }                                                                 *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("********************************************************************");
                    System.out.println("******************* Ejemplo de Condicional ELSE IF *****************");
                    System.out.println("* int edad = 20;                                                   *");
                    System.out.println("* if (edad < 18) {                                                 *");
                    System.out.println("* Eres menor de edad);                                             *");
                    System.out.println("* } else if (edad >= 18 && edad < 65) {                            *");
                    System.out.println("* Eres adulto );                                                   *");
                    System.out.println("* }                                                                *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 4:
                    System.out.println("********************************************************************");
                    System.out.println("******************* Ejemplo de Condicional ELSE  *******************");
                    System.out.println("* int edad = 70;                                                   *");
                    System.out.println("* if (edad >= 65) {                                                *");
                    System.out.println("* Eres un adulto mayor); '                                         *");
                    System.out.println("* } else {                                                         *");
                    System.out.println("* 'Eres un adulto');                                               *");
                    System.out.println(" }                                                                 *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;


                case 5:
                    System.out.println("ha oprimido la opcion 5 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (menucondicionales != 5);

    }

    private static void condicionalSwitch() {

        int menucondicionalswicth = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-         MENÚ CONDICIONAL SWITCH        -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicación Switch                  -");
            System.out.println("- 2. Ejemplo Condicional Switch          -");
            System.out.println("- 3. Volver al menú anterior             -");
            System.out.println("------------------------------------------");


            System.out.print("Ingrese la opcion: ");
            menucondicionalswicth = scanner.nextInt();
            scanner.nextLine();

            switch (menucondicionalswicth) {

                case 1:
                    System.out.println("*******************************************************************");
                    System.out.println("****************        Explicación Switch   **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* Permite evaluar una expresión y ejecutar diferentes bloques de  *");
                    System.out.println("* código en función del valor de dicha expresión.                 *");
                    System.out.println("* En función de lo que valga 'esto', haz una de estas cosas....   *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("********************************************************************");
                    System.out.println("******************* Ejemplo de Condicional Switch  *****************");
                    System.out.println("********************************************************************");
                    System.out.println("int i = 2;                                                         *");
                    System.out.println("                                                                   *");
                    System.out.println("switch(i) {                                                        *");
                    System.out.println("  case 0:                                                          *");
                    System.out.println("    (i es cero.);                                                  *");
                    System.out.println("    break;                                                         *");
                    System.out.println("  case 1:                                                          *");
                    System.out.println("    (i es uno.);                                                   *");
                    System.out.println("    break;                                                         *");
                    System.out.println("  case 2:                                                          *");
                    System.out.println("    (i es dos.);                                                   *");
                    System.out.println("    break;                                                         *");
                    System.out.println("  case 3:                                                          *");
                    System.out.println("    (i es tres.);                                                  *");
                    System.out.println("    break;                                                         *");
                    System.out.println("  default:                                                         *");
                    System.out.println("    (i es mayor a tres.);                                          *");
                    System.out.println(" }                                                                 *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (menucondicionalswicth != 3);

    }

    private static void condicionalTernaria() {

        int menucondicionalternaria = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-          CONDICIONALES TERNARIAS       -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicacion Condicionales           -");
            System.out.println("- 2. Ejemplos	                         -");
            System.out.println("- 3. Volver al menu anterior             -");
            System.out.println("------------------------------------------");


            System.out.print("Ingrese la opcion: ");
            menucondicionalternaria = scanner.nextInt();
            scanner.nextLine();

            switch (menucondicionalternaria) {

                case 1:
                    System.out.println("*******************************************************************");
                    System.out.println("************     Condicionales Ternarias     **********************");
                    System.out.println("*******************************************************************");
                    System.out.println("* El operador ternario es una forma concisa de escribir una       *");
                    System.out.println("* declaración if-else en una sola línea.                          *");
                    System.out.println("*                                                                 *");
                    System.out.println("* Se compone de tres partes:                                      *");
                    System.out.println("* La condición a evaluar (condición booleana)                     *");
                    System.out.println("* El valor si la condición es verdadera (valor verdadero)         *");
                    System.out.println("* El valor si la condición es falsa (valor falso)                 *");
                    System.out.println("*                                                                 *");
                    System.out.println("* El valor si la condición es falsa (valor falso)                 *");
                    System.out.println("* El operador ternario es útil para simplificar la escritura de   *");
                    System.out.println("* expresiones condicionales simples                               *");
                    System.out.println("*                                                                 *");
                    System.out.println("*******************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("********************************************************************");
                    System.out.println("*************** Ejemplo Condicionales Ternarias ********************");
                    System.out.println("********************************************************************");
                    System.out.println("* variable = (condición) ? valor_si_verdadero : valor_si_falso;    *");
                    System.out.println("*                                                                  *");
                    System.out.println("* int edad = 20;                                                   *");
                    System.out.println("* String status = (edad >= 18) ? 'Adulto' : 'Menor de edad';       *");
                    System.out.println("* System.out.println('La persona es: ' + status);                  *");
                    System.out.println("*                                                                  *");
                    System.out.println("* int numero = 15;                                                 *");
                    System.out.println("* String resultado = (numero % 2 == 0) ? 'Par' : 'Impar'           *");
                    System.out.println("* System.out.println('El nùmero es: ' + resultado)                 *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (menucondicionalternaria != 3);

    }

    private static void bucleDoWhile() {

        int menubucleDoWhile = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-            BUCLE DO WHILE              -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicacion Bucle Do While          -");
            System.out.println("- 2. Ejemplo Bucle Do While              -");
            System.out.println("- 3. Volver al menu anterior             -");
            System.out.println("------------------------------------------");


            System.out.print("Ingrese la opcion: ");
            menubucleDoWhile = scanner.nextInt();
            scanner.nextLine();

            switch (menubucleDoWhile) {

                case 1:
                    System.out.println("********************************************************************");
                    System.out.println("**************    Explicación Bucle Do While   *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* Los bucles do-while en Java te permiten, como su nombre indica   *");
                    System.out.println("* (while significa mientras),repetir una acción en un bucle        *");
                    System.out.println("* siempre y cuando se cumpla una condición booleana de control.    *");
                    System.out.println("*                                                                  *");
                    System.out.println("*No obstante, el código contenido en un bucle do-while se ejecuta, *");
                    System.out.println("*por lo menos, una vez.                                            *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("********************************************************************");
                    System.out.println("***************    Ejemplo Bucle Do While       ********************");
                    System.out.println("********************************************************************");
                    System.out.println("* do {                                                             *");
                    System.out.println("* // Bloque de còdigo que se ejecuta al menos una vez              *");
                    System.out.println("* } while (condiciòn);                                             *");
                    System.out.println("*                                                                  *");
                    System.out.println("* import java.util.Scanner;                                        *");
                    System.out.println("*                                                                  *");
                    System.out.println("* puclic class Main{                                               *");
                    System.out.println("*      Public static void main(String[] args){                     *");
                    System.out.println("*        Scanner scanner = new Scanner(System.in);                 *");
                    System.out.println("*        int numero;                                               *");
                    System.out.println("*                                                                  *");
                    System.out.println("*        do{                                                       *");
                    System.out.println("*           System.out.print('Introduce un nùmero mayor que 10: '  *");
                    System.out.println("*           numero = scanner.nextInt();			                   *");
                    System.out.println("*         } while (numero <= 10);			                       *");
                    System.out.println("*                                                                  *");
                    System.out.println("*         System.out.println('!Nùmero vàlido ingresado!            *");
                    System.out.println("*         scanner.close();                                         *");
                    System.out.println("*         }                                                        *");
                    System.out.println("*       }                                                          *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (menubucleDoWhile != 3);

    }


    private static void bucleWhile() {

        int menubucleWhile = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-            BUCLE WHILE                 -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicacion Bucle While             -");
            System.out.println("- 2. Ejemplo Bucle While                 -");
            System.out.println("- 3. Volver al menu anterior             -");
            System.out.println("------------------------------------------");


            System.out.print("Ingrese la opcion: ");
            menubucleWhile = scanner.nextInt();
            scanner.nextLine();

            switch (menubucleWhile) {

                case 1:
                    System.out.println("********************************************************************");
                    System.out.println("**************    Explicación Bucle While      *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* Los bucles while en Java te permiten, como su nombre indica      *");
                    System.out.println("* (while significa mientras),repetir una acción en un bucle        *");
                    System.out.println("* siempre y cuando se cumpla una condición booleana de control.    *");
                    System.out.println("*                                                                  *");
                    System.out.println("* Es posible que el código contenido en un bucle while no se       *");
                    System.out.println("* ejecute, porque no se cumpla la condición.                       *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("********************************************************************");
                    System.out.println("***************    Ejemplo Bucle While          ********************");
                    System.out.println("********************************************************************");
                    System.out.println("* while (condiciòn){                                               *");
                    System.out.println("* // Bloque de còdigo que se repetirá mientras la condición        *");
                    System.out.println("* sea verdadera.                                                   *");
                    System.out.println("*                                                                  *");
                    System.out.println("* int contador = 1;                                                *");
                    System.out.println("* while (contador <= 5){                                           *");
                    System.out.println("*    System.out.println('contador: ' + contador);                  *");
                    System.out.println("*      contador++;                                                 *");
                    System.out.println("*                                                                  *");
                    System.out.println("* import java.util.Scanner;                                        *");
                    System.out.println("*                                                                  *");
                    System.out.println("* Scanner scanner = new Scanner(System.in);                        *");
                    System.out.println("* String respuesta = ' ';                                          *");
                    System.out.println("* while (!respuesta.equalsIgnoreCase('salir')){		               *");
                    System.out.println("*    System.out.print('Introduce un mensaje (escribe 'salir'       *");
                    System.out.println("*                     para terminar):                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*         respuesta = scanner.nextLine();                          *");
                    System.out.println("*         System.out.println('Has escrito: ' + respuesta);         *");
                    System.out.println("*         }                                                        *");
                    System.out.println("* System.out.println('!Fin del programa!')                         *");
                    System.out.println("* scanner.close();                                                 *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (menubucleWhile != 3);

    }

    private static void bucleForandForEach() {

        int menubucleForyForEach = 0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("-          BUCLE FOR Y FOR-EACH          -");
            System.out.println("------------------------------------------");
            System.out.println("- 1. Explicacion Bucle For y For-Each    -");
            System.out.println("- 2. Estructura del bucle for en Java    -");
            System.out.println("- 3. Examinar un bucle en Java           -");
            System.out.println("- 4. Ejemplo bucle FOR                   -");
            System.out.println("- 5. Ejemplos de bucles for válidos      -");
            System.out.println("- 6. Ejemplo bucle FOR-EACH              -");
            System.out.println("- 7. Volver al menu anterior             -");
            System.out.println("------------------------------------------");


            System.out.print("Ingrese la opcion: ");
            menubucleForyForEach = scanner.nextInt();
            scanner.nextLine();

            switch (menubucleForyForEach) {

                case 1:
                    System.out.println("********************************************************************");
                    System.out.println("*************  Explicación Bucle For y For-each ********************");
                    System.out.println("********************************************************************");
                    System.out.println("* El bucle for en Java, junto con su primo el for-each,            *");
                    System.out.println("* son estructuras lógicas que te permiten realizar una y otra vez  *");
                    System.out.println("* una acción, siempre y cuando se cumpla una condición booleana.   *");
                    System.out.println("*                                                                  *");
                    System.out.println("* Los bucles for y for-each en Java son dos maneras de realizar    *");
                    System.out.println("* bucles. Aunque su nombre es similar, su estructura es diferente. *");
                    System.out.println("* Con el bucle for tienes más control en la ejecución del bucle.   *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    System.out.println("********************************************************************");
                    System.out.println("************** Estructura del bucle for en Java  *******************");
                    System.out.println("********************************************************************");
                    System.out.println("* El bucle for en Java toma como punto de partida un índice de     *");
                    System.out.println("* control. Al final de cada bucle, este índice se actualiza según  *");
                    System.out.println("* una regla que estableces en la estructura del bucle.             *");
                    System.out.println("*                                                                  *");
                    System.out.println("* Acto seguido, el bucle comprueba si el índice satisface la       *");
                    System.out.println("* condición booleana.int contador = 1;                             *");
                    System.out.println("* El bucle for comienza con la palabra clave for y un paréntesis,  *");
                    System.out.println("*  que contiene tres partes.                                       *");
                    System.out.println("*                                                                  *");
                    System.out.println("* public class BucleFor {                                          *");
                    System.out.println("*    public static void main(String args[]) {                      *");
                    System.out.println("*  // Estructura del bucle for                                     *");
                    System.out.println("*  for(int i = 0; // índice de control                             *");
                    System.out.println("*  i < 100;   // condición booleana           		       *");
                    System.out.println("*     i++)      // modificación del índice tras cada bucle         *");
                    System.out.println("*            {                                                     *");
                    System.out.println("*                                                                  *");
                    System.out.println("*         // Lo que quieras que se ejecute varias veces            *");
                    System.out.println("*             }                                                    *");
                    System.out.println("*         }                                                        *");
                    System.out.println("*    }                                                             *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("********************************************************************");
                    System.out.println("****************** Examinar un bucle en Java   *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* La flexibilidad a la hora de construir un bucle for en Java es   *");
                    System.out.println("* tan grande, que puedes prescindir de algunas de las partes de    *");
                    System.out.println("* las que te acabo de hablar. Por ejemplo, también puedes          *");
                    System.out.println("* establecer una evaluación  booleana que siempre sea true. Como   *");
                    System.out.println("* consecuencia, el bucle no deja nunca de ejecutarse hasta que el  *");
                    System.out.println("* programa se detiene con un error por falta de memoria.           *");
                    System.out.println("*                                                                  *");
                    System.out.println("*  Todo está permitido, con tres condiciones                       *");
                    System.out.println("*                                                                  *");
                    System.out.println("* * Los tres elementos van separados por ; (punto y coma) en        ");
                    System.out.println("*   cualquier caso.                                                *");
                    System.out.println("* * Si alguno de los elementos no está presente, los dos puntos    *");
                    System.out.println("*    y comas han de aparecer de todas formas.                      *");
                    System.out.println("* * El índice de control ha de existir (se ha de haber declarado,  *");
                    System.out.println("*   ya sea antes del bucle for o en la primera parte del           *");
                    System.out.println("*   paréntesis del bucle)                                          *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 4:
                    System.out.println("********************************************************************");
                    System.out.println("******************      Ejemplo bucle FOR      *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* public class BucleFor {                                          *");
                    System.out.println("*    public static void main(String args[]) {                      *");
                    System.out.println("*                                                                  *");
                    System.out.println("*      for(int i = 0, f = 6; i < 10 && f > 0; i++, f--) {          *");
                    System.out.println("*       System.out.print(i + ' - ' + f + '  ');                    *");
                    System.out.println("*      }                                                           *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*   Resultado: 0 - 6  1 - 5  2 - 4  3 - 3  4 - 2  5 - 1            *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 5:
                    System.out.println("********************************************************************");
                    System.out.println("*********    Ejemplos de bucles for válidos    *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* public class BucleFor {                                          *");
                    System.out.println("*      public static void main(String args[]) {                    *");
                    System.out.println("*      /*1*/                                                       *");
                    System.out.println("*       for(;;) {} // Bucle infinito.                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*      /*2*/                                                       *");
                    System.out.println("*      int i = 0                                                   *");
                    System.out.println("*      for(; i < 10; i++) {                                        *");
                    System.out.println("*  System.out.println(i);  // Bucle for válido, imprime de 0 a 9   *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*     /*3*/                                                        *");
                    System.out.println("*     int j = 0;                                                   *");
                    System.out.println("*     for(; ; j++) {                                               *");
                    System.out.println("*       System.out.println(j);  // Bucle infinito,                 *");
                    System.out.println("*      no existe ninguna evaluación                                *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*     /*4*/                                                        *");
                    System.out.println("*     int k = 0;                                                   *");
                    System.out.println("*      for(; k < 10;) {                                            *");
                    System.out.println("*       System.out.println(k);  // Bucle infinito, el índice       *");
                    System.out.println("*       no varía                                                   *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*     /*5*/                                                        *");
                    System.out.println("*     int l = 0;                                                   *");
                    System.out.println("*       for(; l > 10; l++) {                                       *");
                    System.out.println("*        System.out.println(l);  // No se ejecuta, la condición    *");
                    System.out.println("*        no se cumple inicialmente                                 *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*    /*6*/                                                         *");
                    System.out.println("*    int m = 0;                                                    *");
                    System.out.println("*    for(; m < 10; m--) {                                          *");
                    System.out.println("*     System.out.println(m);  // Bucle infinito, la condición      *");
                    System.out.println("*        nunca se cumple                                           *");
                    System.out.println("*     }                                                            *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 6:
                    System.out.println("********************************************************************");
                    System.out.println("*************    Ejemplo de bucles For-Each    *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* public class BucleFor {                                          *");
                    System.out.println("*      public static void main(String args[]) {                    *");
                    System.out.println("*      int[] numbers = { 1, 2, 3 };                                *");
                    System.out.println("*       for(int   // Tipo de variable primitiva de la lista        *");
                    System.out.println("*        que vamos a iterar                                        *");
                    System.out.println("*           number  // Nombre de la variable local                 *");
                    System.out.println("*      : numbers) {  // Nombre de la lista que vamos a iterar      *");
                    System.out.println("*           System.out.print(number + ' ');                        *");
                    System.out.println("*       }                                                          *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 7:
                    System.out.println("ha oprimido la opcion 7 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (menubucleForyForEach != 7);

    }


}









