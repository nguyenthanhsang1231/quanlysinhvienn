package quanlysinhvien;

import readandwritefile.ReadAndWriteFile;

import javax.sound.midi.MidiDevice;
import java.util.ArrayList;

public class StudentManager {
   ArrayList<Student> list = new ArrayList<>();

   private ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
   public  StudentManager () {
         this.list = readAndWriteFile.readFile();
   }

   public void addStudent(Student student) {
       list.add(student);
   }

   public void editStudent(int id, Student student) {
       int index = findIndexById(id);
       list.set(index, student);
   }

   public void deleteStudent(int id) {
       int index = findIndexById(id);
       list.remove(index);
   }


    public int findIndexById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if(id==list.get(i).getId()){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Student> findAll() {
       return list;
    }

    public Student searchId(int id) {
        for (Student student: list) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public void sortIncreaseStudent() {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j).getAvg() > list.get(j + 1).getAge()) {
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
