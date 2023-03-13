package lab2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /* Cititi de la tastatura 2 valori: nuemele si varsta
        Afisati numele
        Daca varsta este impara, afisati toate nr impare <= varsta
        Daca varsta este para, afistati toate nr pare <= varsta
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numele: ");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Introduceti varsta: ");
        int age = scanner.nextInt();
        int j = 0;
        j = (age % 2 == 1) ? 1 : 0;
        for(; j<=age; j+=2)
            System.out.println(j);
        /*
        if(age%2 == 1){
            for(int i = 1; i <= age; i+=2)
            {
                System.out.println(i);
            }
        }
        else{
            for(int i = 0; i <= age; i+=2)
            {
                System.out.println(i);
            }
        }

         */
        scanner.close();
    }
}
