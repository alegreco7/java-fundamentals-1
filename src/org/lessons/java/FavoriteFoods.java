package org.lessons.java;

public class FavoriteFoods {
    public static void main(String[] args) {
        // Classifica cibi preferiti
        String[] cibi = {
                "pizza",
                "pasta all'amatriciana",
                "bistecca",
                "carbonara",
                "tortellini in brodo"
        };

        // Stampare la lunghezza dell'array
        System.out.println("Lunghezza dell'array cibi: " + cibi.length);

        // Cibo top
        System.out.println("Il mio cibo preferito è: " + cibi[0]);

        // Cibo meno preferito
        System.out.println("Il mio cibo meno preferito è: " + cibi[cibi.length - 1]);

        // Cibo di metà classifica
        System.out.println("Il mio cibo di metà classifica è: " + cibi[cibi.length / 2]);

    }
}
