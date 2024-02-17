
package com.juandiegows.univstackandqueue;

import com.juandiegows.univstackandqueue.model.Person;
import com.juandiegows.univstackandqueue.Stack.StackPersonJD;
import java.util.Scanner;

/**
 * @author JuanDiegoWS
 */
public class ExerciseTwo {

    public static void main(String[] args) {
        System.out.println("Welcome to aplication created by Juan Diego Mejia Maestre (JuanDiegows)");
        System.out.println("For finish to write -1 in code");

        Scanner input = new Scanner(System.in);
        int i = 0, age;
        String code, name, phone;
        StackPersonJD stack = new StackPersonJD();
        do {
            System.out.println("\n\n\nPerson " + ++i + "\n");
            System.out.print("Insert the code of the person  " + i + " : ");
            code = input.nextLine();
            if (!code.equals("-1")) {

                System.out.print("Insert the name of the person  " + i + " : ");
                name = input.nextLine();
                System.out.print("Insert the number phone of the person  " + i + " : ");
                phone = input.nextLine();
                System.out.print("Insert the age of the person  " + i + " : ");
                age = input.nextInt();
                input.nextLine();
                stack.Insert(new Person(code, name, phone, age));
            }
        } while (!code.equals("-1"));

        System.out.println("Show to stack");
        stack.Print();
        System.out.println("\nCount : " + stack.Count());
        stack.DeleteFirst();
        System.out.println("\n\n");
        System.out.println("Show to stack after delete the first element");
        stack.Print();
        System.out.println("\nCount : " + stack.Count());
    }

}
