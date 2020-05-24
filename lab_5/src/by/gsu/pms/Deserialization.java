package by.gsu.pms;

import java.io.*;

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
        } catch (EOFException ex){
            System.out.println("End of file reached.");
        } catch (FileNotFoundException ex){
            System.out.println("File not found.");
        } catch (IOException ex){
            System.out.println("Error Input or Output");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found");
        }
    }
}