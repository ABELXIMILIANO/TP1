

package lab1;

import java.util.Scanner;
public class P3 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("INGRESE UN NÚMERO");
        int num1 = sc.nextInt();
        System.out.println("INGRESE OTRO NÚMERO");
       int num2 = sc.nextInt();
        int resultadoSuma = num1+num2;
       int resultadoResta=num1-num2;
       int resultadoMultiplicar= num1*num2;
        int resultadodividir=num1/num2;
       int resultadoResto=num1%num2;
        
        
        System.out.println("SUMA: " + num1 + " + " + num2 +" = "+ resultadoSuma );
        System.out.println("RESTA: " + num1 + " - " + num2 +" = "+ resultadoResta);
        System.out.println("MULTIPLICACÍON: " + num1 + " * " + num2 +" = "+ resultadoMultiplicar);
        System.out.println("DIVISIÓN: " + num1 + " / " + num2 +" = "+ resultadodividir);
        System.out.println("RESTO: " + num1 + " % " + num2 +" = "+ resultadoResto); 
       
    }
    
}