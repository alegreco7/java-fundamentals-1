package org.lessons.java;

public class FizzBuzz {
    public static void main(String[] args) {
        // Ciclo for che itera da 1 a 100
        for (int i = 1; i <= 100; i++) {
            // Verifica se i è un multiplo sia di 3 che di 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                // Verifica se i è un multiplo solo di 3
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                // Verifica se i è un multiplo solo di 5
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                // Se i non è un multiplo né di 3 né di 5
            } else {
                System.out.println(i);
            }
        }
    }
}
