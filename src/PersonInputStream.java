import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PersonInputStream {

//    File f = new File("test.txt");


    public void addPerson(Person person) throws IOException {

//        Files.write(Paths.get("test2.txt"), person.getFirstname().getBytes(), StandardOpenOption.APPEND);

        File f = new File("test.txt");
        FileWriter fw = new FileWriter(f,true);

        fw.write(person.getFirstname());
        fw.write(System.getProperty( "line.separator" ));
        fw.write(person.getLastname());
        fw.write(System.getProperty( "line.separator" ));
        fw.write(person.getAge());
        fw.write(System.getProperty( "line.separator" ));
        fw.close();


    }
}
