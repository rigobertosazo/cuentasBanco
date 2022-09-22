
package cuentasbanco;
import java.util.Scanner;

/**
 *
 * @author Rib
 */


public class retiroCuentas 
{
       //variables
    int cuenta1 = 1500;
    int cuenta2 = 1300;
    int opcion;

    /**
     *<h1> Funcion para Debito de Cuentas </h1>
     * Description: Debito de saldos para dos cuentas bancarias del banco pollo verde
     * @param mensaje funcion para debitar cuentas
     * @return devuleve una cadena de texto
     */
    public String debitoCuentas(String mensaje)
    {
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("============================================================ ");
            System.out.println(" **** \t BIENVENIDO A DEBITOS DE CUENTAS BANCARIAS  *****");
               System.out.println("========================================================= ");
               System.out.println("  \t Debito cuenta 1  (Digite: 1) ");
               System.out.println("  \t Debito cuenta 2  (Digite: 2) ");
               System.out.println("  \t Menu Principal   (Digite: 3) ");
               System.out.println();
               System.out.print("    \t Ingrese la opcion aqui: ");
               opcion = in.nextInt();

               switch (opcion) 
               {
                    case 1 -> 
                    {
                        System.out.println("\tSaldo Disponible: Q."+cuenta1);
                        System.out.print("Ingrese cantidad a debitar a la cuenta 1: Q.");
                        double debito1 = in.nextDouble(); 
                        if(debito1>cuenta1){
                            System.out.println("\tSaldo insuficiente: "+cuenta1);
                        }else{
                        System.out.println("\tSaldo Actual: Q." +(cuenta1-debito1));
                        }
                     break;
                    }
                    case 2 -> 
                    {
                        System.out.println("\tSaldo Disponible: Q."+cuenta2);
                        System.out.print("Ingrese cantidad a debitar a la cuenta 2: Q.");
                        double debito2 = in.nextDouble();
                            if(debito2>cuenta2)
                            {
                                System.out.println("\tSaldo insuficiente: "+cuenta2);
                            }else{
                                System.out.println("\tSaldo Actual: " +(cuenta2-debito2));
                            }
                            break;
                    }          
                    case 3 -> 
                    {
                        System.out.println(" Sin movimientos ");
                        break;
                    }
                    default -> System.out.println("Cuenta no valida");
                }
        }while (opcion != 3);
        
        System.out.println();
        mensaje = " \n "; 
        return mensaje;   
    }
}
