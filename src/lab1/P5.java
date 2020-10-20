

package lab1;

import java.util.Scanner;
public class P5 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("INGRESE UN NÚMERO");
        int num1 = sc.nextInt();
        int resto= num1%2;
        if(resto==0){
        System.out.println("ES DIVISIBLE POR 2 ");
        } else{
            System.out.println("NO ES DIVISIBLE POR 2 ");
        }
    }
    
}
