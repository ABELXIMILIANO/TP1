package Lab1;
import java.util.Scanner;
public class Punto12 {
    public static void main(String[] args)
    { Scanner sc = new Scanner(System.in);
        int day ;
        int contador;
        String dayString;
        System.out.println("Por favor ingrese un número según el dia de la semana ");
        System.out.println("1=lunes");
        System.out.println("2=martes");
        System.out.println("3=miercoles");
        System.out.println("4=jueves");
        System.out.println("5=viernes");
        System.out.println("6=sábado");
        System.out.println("7=domingo");
        
        System.out.println("Ingrese número");
       while(true)
         {
       
        day = sc.nextInt();
        
       
        switch (day) 
           {
             
            case 1:  dayString = "Día laborable";
                     break;
            case 2:  dayString = "Día laborable";
                     break;
            case 3:  dayString = "Día laborable";
                     break;
            case 4:  dayString = "Día laborable";
                     break;
            case 5:  dayString = "Día laborable";
                     break;
            case 6:  dayString = "Día no laborable";
                     break;
            case 7:  dayString = "Día no laborable";
                     break;
            default: dayString = "por favor ingrese un número según el día nuevamente ";
                     break;
        } System.out.println(dayString);   
        
        }
         
    }    
}


    

