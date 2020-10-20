package lab1;
import java.util.Scanner;
public class Punto13 {
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        int numero1;
       
        System.out.println("PROGRAMA PARA SABER SI UN NÚMERO ES PRIMO");
        System.out.println("");
        System.out.println("");
      
        
        while(true){
            System.out.println("");
           System.out.println("Por favor ingrese un número");
           numero1 = sc.nextInt(); 
           if(numero1%2==0 || numero1%3==0|| numero1%4==0|| numero1%5==0|| numero1%6==0|| numero1%7==0|| numero1%8==0|| numero1%9==0|| numero1==1){
               System.out.println("El número "+ numero1+ " NO ES UN NÚMERO PRIMO");
           
           
           
           
           
           
           }else{
           System.out.println("El número "+numero1+" ES UN NÚMERO PRIMO ");
           
           
           
           }
           
          
           }
        }
        
        
        
        
        
        
        
    }
    
    

