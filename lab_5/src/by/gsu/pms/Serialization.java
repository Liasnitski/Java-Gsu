package by.gsu.pms;

import java.io.*;

public class Serialization {
    public static void serialize(Icecream[] icecreams) {
        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream("icecreams.dat")))) {
            for(int i = 0; i < icecreams.length; ++i) {
                oos.writeObject(icecreams[i]);
            }
        } catch (EOFException ex){
            System.out.println("End of file reached.");
        } catch (FileNotFoundException ex){
            System.out.println("File not found.");
        } catch (IOException ex){
            System.out.println("Error Input or Output");
        }
    }
}
