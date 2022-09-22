
package cuentasbanco;
import java.util.*;

public class ingresoCuentas 
{
    //variables
    int cuenta1 = 1500;
    int cuenta2 = 1300;
  
    /**
     * <h1> Funcion para abonar cuentas </h1>
     * Description: Abono para dos cuentas bancarias del banco pollo verde
     * @param mensaje funcion para ingreso de cuentas
     * @return devuleve una cadena de texto
     */
    public String ingresoCuenta(String mensaje)
    {
        double num1;
        double num2;
        double suma1 = 0;
        double suma2 = 0;
         System.out.println("------------- ABONO A CUENTA 1 ----------------");
         System.out.println();
       do {//cuenta1
            Scanner in = new Scanner(System.in); 
            System.out.print("  \t Ingrese abono a cuenta1: Q.");
            num1 = in.nextDouble();
            suma1 += num1;
           
        } while (num1 != 0); 
        System.out.println("________________________________________________");
        System.out.println("  \t Saldo Actual cuenta1: Q."+(cuenta1+suma1));
        System.out.println("________________________________________________");
        System.out.println();
        
        System.out.println("------------- ABONO A CUENTA 2 ----------------");
        System.out.println();
        do{ //cuenta2
            Scanner in = new Scanner(System.in);
            System.out.print("  \t Ingrese abono a cuenta2: Q.");
            num2 = in.nextDouble();
            suma2 += num2;   
        } while (num2 != 0); 
        System.out.println("________________________________________________");
        System.out.println("  \t Saldo Actual cuenta2: Q."+(cuenta2+suma2));
        System.out.println("________________________________________________");
        mensaje = " Ha ingresado satisfactoriamente los abonos.";
        return mensaje;
    }    
}
