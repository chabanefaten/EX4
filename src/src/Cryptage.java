package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cryptage {

    public static void cryptage(String cheminSource, String cheminDestination) {
        try (BufferedReader reader = new BufferedReader(new FileReader(cheminSource));
             BufferedWriter writer = new BufferedWriter(new FileWriter(cheminDestination))) {
            int caractere;
            while ((caractere = reader.read()) != -1) {
                // Crypter le caractère en passant au caractère suivant
                char caractereCrypte = (char) (caractere + 1);
                writer.write(caractereCrypte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Spécifiez le chemin complet du fichier source sur le bureau avec le nom d'utilisateur "GIS PLUS"
        String cheminSource = "C:/Users/GIS PLUS/aa/Users.txt";
        // Spécifiez le chemin complet du fichier de destination sur le bureau avec le nom d'utilisateur "GIS PLUS"
        String cheminDestination = "C:/Users/GIS PLUS/aa/UsersCrypte.txt";
        cryptage(cheminSource, cheminDestination);
        System.out.println("Cryptage terminé.");
    }
}
