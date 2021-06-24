import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonOutputStream {

    public List<Person> readTeam() throws IOException {

        File f = new File("test.txt");

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;

        int i =0;
        String name = null;
        String firstname = null;
        String age = null;

        List<Person> personList = new ArrayList<>();

        while((line = br.readLine())!=null)
        {
//            System.out.println(line);
            i++;
            if (i == 1)
            {
                name = line;
            }
            if (i == 2)
            {
                firstname = line;
            }
            if (i == 3)
            {
                age = line;
                i=0;
                Person p = new Person(name,firstname,age);
                personList.add(p);
            }
        }
        br.close();

        return personList;
    }
}
