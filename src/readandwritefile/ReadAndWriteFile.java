package readandwritefile;

import quanlysinhvien.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;
public class ReadAndWriteFile {
    File file = new File("data/student.csv");
    public void WriteFile(ArrayList<Student> list) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Student student: list) {
                line += student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getSex() + "," + student.getAddress() + "," + student.getAvg() + "\n";
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
//                String id = data[0];
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String gender = data[2];
                String address = data[3];
                Double mediumScore = Double.parseDouble(data[4]);
                Student product = new Student( name, age,gender, address, mediumScore);
                list.add(product);

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}