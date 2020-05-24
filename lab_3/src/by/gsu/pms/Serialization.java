package by.gsu.pms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void serialize(Icecream[] icecreams) {
        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream("icecreams.dat")))) {
            for(int i = 0; i < icecreams.length; ++i) {
                oos.writeObject(icecreams[i]);
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
