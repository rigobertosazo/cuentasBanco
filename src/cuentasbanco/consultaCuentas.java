
package cuentasbanco;

import java.util.Scanner;
public class consultaCuentas 
{
    int cuenta1 = 1500;
    int cuenta2 = 1300;
    int opcion;
    
    /**
     *<h1> Funcion para consultar Cuentas </h1>
     * Description: Consulta para dos cuentas bancarias del banco pollo verde
     * @param cadena recibe una cadena
     * @return una cadena de texto al final de ejecutar la función
     */
    public String ConsultarCuentas(String cadena)
    {
        System.out.println();
        do{
            Scanner in = new Scanner(System.in);
                System.out.println("============================================================ ");
                System.out.println(" **** \t BIENVENIDO A CONSULTA DE CUENTAS  *****");
                   System.out.println("========================================================= ");
                   System.out.println("  \t Consultar cuenta 1  (Digite: 1) ");
                   System.out.println("  \t Consultar cuenta 2  (Digite: 2) ");
                   System.out.println("  \t Menu Principal      (Digite: 3) ");
                   System.out.println();
                   System.out.print("    \t Ingrese la opcion aqui: ");
                   opcion = in.nextInt();

                   switch (opcion) 
                   {
                    case 1 -> 
                    {
                        System.out.println();
                        System.out.println("-----------------------------------------");
                        System.out.println("\tNombre de la cuenta: Patito");
                        System.out.println("\tNo. de cuenta: 1234589-01");
                        System.out.println("\tTipo de cuenta: monetario");
                        System.out.println("\tSaldo de la cuenta 1: Q."+cuenta1);
                        System.out.println("-----------------------------------------");
                        System.out.println();
                    }
                    
                    case 2 -> 
                    {
                        System.out.println();
                        System.out.println("-----------------------------------------");
                        System.out.println("\tNombre de la cuenta: Pollito");
                        System.out.println("\tNo. de cuenta: 4564589-02");
                        System.out.println("\tTipo de cuenta: monetario");
                        System.out.println("\tSaldo de la cuenta 2: Q."+cuenta2);
                        System.out.println("-----------------------------------------");
                        System.out.println();
                    }
                    case 3 -> System.out.println();
                    default -> System.out.println("\t Cuenta no valida...");
                    }
        }while(opcion != 3);  
        cadena = "Consultas realizadas satisfactoriamente";
        return cadena;
    }
    
}
