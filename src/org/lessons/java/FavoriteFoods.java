package org.lessons.java;

public class FavoriteFoods {
    public static void main(String[] args) {
        //classifica cibi preferiti
        String[] cibi = new String[5];
        cibi[0] = "pizza";
        cibi[1] = "pasta all'amatriciana";
        cibi[2] = "bistecca";
        cibi[3] = "carbonara";
        cibi[4] = "tortellini in brodo";
        // Stampare la lunghezza dell'array
        System.out.println("Lunghezza dell'array cibi: " + cibi.length);
        // Cibo top
        System.out.println("Il mio cibo preferito è: " + cibi[2]);
        // Cibo meno preferito
        System.out.println("Il mio cibo meno preferito è: " + cibi[3]);
        // Cibo di metà classifica
        System.out.println("Il mio cibo di metà  classifica è: " + cibi[4]);
    }
}

