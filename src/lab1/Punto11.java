package Lab1;
import java.util.Scanner;
public class Punto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String con = "quilmes";
        String con1;
         int i= 1;
          do
        { 
            i++;
            System.out.println("CONTRASEÑA");
            con1 = sc.nextLine();
          }
        while(!con.equals(con1 ) && i<=3 );
         if(con.equals(con1)){
         System.out.println("ACCESO CORRECTO");
         } else{
             System.out.println("ACCESO DENEGADO");
         }
         }
    }  