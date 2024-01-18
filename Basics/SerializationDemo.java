import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
    int i = 10;
    int j= 20;
}
public class SerializationDemo {
    public static void main(String[] args)throws Exception{
    Dog d1 = new Dog();
// Serialization
    FileOutputStream fs = new FileOutputStream("demo.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fs);
    oos.writeObject(d1);

    // DeSerializationDemo
    FileInputStream fi = new FileInputStream("demo.txt");
    ObjectInputStream ois = new ObjectInputStream(fi);
    Dog d2 = (Dog)ois.readObject();
    System.out.println(d2.i+d2.j);
    }
}
