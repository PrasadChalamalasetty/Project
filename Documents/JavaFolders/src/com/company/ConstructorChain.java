
// This is program will print the numbers by using the Linked List Array1://
package com.company;


import java.util.LinkedList;

class ConstructorChain {

    public static void main(String[] args) {
LinkedList <Float> random = new LinkedList<Float>();
         random.add(2.0f);
         random.add(4.0f);
         random.add(5.0f);
         random.add(10.0f);
         random.add(99.9f);


        //Create an ArrayList using Generics here

        printArray(random);
    }

    public static void printArray(LinkedList<Float> arr) {
        for (Float s : arr) {
            System.out.println(s);
        }
        //Complete the method declaration here
    }
}
