
package cuentasbanco;
import java.util.Scanner;

/**
 *
 * @author Rigoberto Sazo
 */
public class mainCuentas 
{
    //metodo principal main
    public static void main(String[] args) 
    {  
        Scanner in = new Scanner(System.in);
        int opcion;
        int intentos = 3;
        String user = "patito";
        String pass = "12345";
        
        while(intentos > 0)
        {
            System.out.println("------------ LOGIN -----------------");
            System.out.print(" Ingrese su usuario: ");
            String usuario = in.next();
            System.out.print(" Ingrese su password: ");
            String password = in.next();
            System.out.println("------------------------------------");
            
            usuario = usuario.toLowerCase(); //convirtiendo a minus la cadena de usuario
            if(usuario.equals(user) && password.equals(pass))
            {
                System.out.println();
                System.out.println();   
                System.out.println("\t\t Bienvenido \t\tpatito");    

                EXTERNAL:
                while(true)
                {        
                   System.out.println("=============================================== ");
                   System.out.println(" **** \t SISTEMA BANCO POLLO VERDE V1.0  *****");
                   System.out.println("=============================================== ");
                   System.out.println("  \t Abono a cuentas     (Digite: 1) ");
                   System.out.println("  \t Debito a cuentas    (Digite: 2) ");
                   System.out.println("  \t Consultas a cuentas (Digite: 3) ");
                   System.out.println("  \t Salir del sistema   (Digite: 4) ");
                   System.out.println();
                   System.out.print("    \t Ingrese aqui: ");
                   opcion = in.nextInt(); 
                       switch (opcion) 
                       {
                           case 1 -> {
                               //ingresoCuentas
                               ingresoCuentas instancia = new ingresoCuentas();
                               System.out.println(instancia.ingresoCuenta(""));
                               System.out.println();
                               System.out.println();
                               break;
                           }
                           case 2 -> {
                               //retiroCuentas
                               retiroCuentas debito = new retiroCuentas();
                               System.out.println(debito.debitoCuentas(""));
                               System.out.println();
                               System.out.println();
                               break;
                           }
                           case 3 -> {                
                               //consultaCuentas
                               consultaCuentas consulta = new consultaCuentas();
                               System.out.println(consulta.ConsultarCuentas(""));
                               System.out.println();
                               System.out.println();
                               break;
                           }
                           case 4 -> { 
                               System.out.println("OK, ud salio del sistema...");
                               System.out.println();
                               System.out.println();
                               break EXTERNAL;
                           }
                           default -> {
                               System.out.println("Numero no valido...");
                               System.out.println();
                               System.out.println();
                           }
                       } //fin switch 
                } break; //fin del while EXTERNAL        
            }else{ // si el usuario y password no son iguales: 
                intentos--;
                System.out.println("Usuario o Password incorrecto...");
                System.out.printf(" Le quedan %d intentos\n", intentos);
                System.out.println();
                if(intentos == 0){
                    System.out.println();
                    System.out.println("Por seguridad se ha bloqueado el acceso, comunicarse "
                                        + " a: sistemas@polloverde.com");
                } //fin intentos
            } //fin else user y pass no iguales
       }  //fin while intentos > 0  
    }//fin main principal
}//fin clase mainCuentas
