package lab2;

import javax.swing.*;
import java.sql.SQLOutput;

public class Ex1 {
    public static void main(String[] args) {
        char c = 't';
        Character cc = c;

//        Integer i1 = new Integer(4);
        Integer i1 = 4;
        Integer i2 = Integer.valueOf(4);
        Integer i3 = Integer.valueOf("4");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i2 == i3);


        Integer i4 = Integer.valueOf(128); // [-128, 127]
        Integer i5 = Integer.valueOf("128");
        System.out.println(i4 == i5);

        System.out.println("instanceof: " + (i5 instanceof Number)); // daca tipul unui obiect este un subtip al altei clase

        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);

        long l1 = Long.parseLong("4444");
        System.out.println(l1);

        boolean b2 = Boolean.parseBoolean("abs");
        System.out.println(b2);

//        Integer badint = Integer.parseInt("ffff");
//        System.out.println(badint);


    }
}
