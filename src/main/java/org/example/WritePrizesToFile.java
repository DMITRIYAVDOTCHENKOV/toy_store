package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WritePrizesToFile {
    public static void writePrizesToFile(ArrayList<Toy> prizes, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (Toy toy : prizes) {
                writer.write(toy.getName() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
