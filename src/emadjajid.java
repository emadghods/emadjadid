
import java.util.*;
public class emadjajid {

    public static void main (String args[]){

        Scanner vorodi = new Scanner (System.in);
        System.out.println (" please insert your number ");
          int number;
          number = vorodi.nextInt();
          Adad_jadid (number);
    }
         public static void Adad_jadid (int number){

        int reminder = 0 ;
        int sum = 0;
        while (number >=1){

            sum =  sum  +  number %10 ;
                    number = number / 10;
        }
        System.out.println("jame adad mishe:" + sum);
    }
}
