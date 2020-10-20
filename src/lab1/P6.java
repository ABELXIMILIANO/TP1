

package lab1;

import java.util.Scanner;
public class P6 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    
         double iva = 0.21;
        System.out.println("POR FAVOR INGRESE EL PRECIO DEL PRODUCTO ");
        float num1 = sc.nextFloat();
          double total= (iva*num1)+num1;
        System.out.println("EL PRECIO FINAL MAS IVA ES DE "+ total);

    }
    
}