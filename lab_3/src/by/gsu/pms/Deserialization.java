package by.gsu.pms;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void deserialization(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            boolean cont = true;
            while (cont){
                Object obj = ois.readObject();
                if (obj != null) {
                    Icecream icecream = (Icecream) obj;
                    System.out.println(icecream);
                } else {
                    cont = false;
                }
            }
        } catch (Exception ex){
            System.out.println("Deserialization finished");
        }
    }
}