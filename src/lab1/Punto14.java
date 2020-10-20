package lab1;
import java.util.Scanner;

public class Punto14 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num;
        int x = new Double(Math.random()*100).intValue();
        int i=1;
        
        System.out.println("ADIVINAR NÚMERO");
        
        while(true){
            i++;
         num= sc.nextInt();
         if(x>num){
         System.out.println("El número ingresado es muy bajo");
         }if(x<num){ 
             System.out.println("El número ingresado es muy alto");
         
             
         }if(x==num){
             System.out.println("CORRECTO,El NÚMERO ENCONTRADO ES "+ x);
              System.out.println("CANTIDAD DE INTENTOS: "+ i  );
         
         
         }
        }
        
        
        
    }
    
    
}
