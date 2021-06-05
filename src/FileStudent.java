import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class FileStudent {

    public static void writeFile(List<Student> studentList) throws IOException {
        FileWriter fileWriter = new FileWriter("Data");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "id,name,date,gender,address,lop,email,mediumCcore\n";
        for (Student s : studentList) {
            str += s.getId() + "," + s.getName() + "," + s.getDate() + "," + s.getGender() + "," + s.getAddress() + "," + s.getEmail() + "," + s.getMediumCcore() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();

    }

    public static List<Student> readFile() throws IOException {
        List<Student> studentFile = new ArrayList<>();
        FileReader fr = new FileReader("Data");
        BufferedReader br = new BufferedReader(fr);
String line=br.readLine();
while((line=br.readLine()) != null){
//    String array[]=line.split(",");
//    studentFile.add(new Student(array[0],array[1],array[2],array[3],array[4],array[5],Double.parseDouble(array[6])));
    System.out.println(line);
}
return studentFile;
    }


}
