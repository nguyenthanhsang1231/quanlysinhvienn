package view;

import quanlysinhvien.Student;
import quanlysinhvien.StudentManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    StudentManager studentManager = new StudentManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    public void showMenu() {
        int btn;
        do {
            System.out.println("=-=-MENU-=-=");
            System.out.println("Nhập số theo bảng");
            System.out.println("*1. --Xem danh sách. \n" +
                    "*2. --Thêm mới. \n" +
                    "*3. --Cập nhật. \n" +
                    "*4. --Xóa. \n" +
                    "*5. --Sắp xếp. \n" +
                    "*0. --Thoát khỏi chương trình.");
            try{
                btn = inputInt.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" hãy nhập số");
                inputInt.nextLine();
                btn = -1;
            }
            switch (btn) {
                case 1:
                    showAllStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    Arreary();
                    break;
            }
        } while (btn != 0);
    }

    public void addStudent() {
        System.out.println("Nhập tên Sinh Viên");
        String NameAdd = inputString.nextLine();
        try {
            System.out.println("Nhập tuổi");
            int AgeAdd = inputInt.nextInt();
            System.out.println("Nhập giới tính");
            String SexAdd = inputString.nextLine();
            System.out.println("Nhập địa chỉ");
            String AddressAdd = inputString.nextLine();
            System.out.println("Nhập điểm trung bình");
            Double AvgAdd = inputInt.nextDouble();
            Student student = new Student(NameAdd, AgeAdd, SexAdd, AddressAdd, AvgAdd);
            studentManager.addStudent(student);
        } catch (InputMismatchException t) {
            System.out.println(" cấm nhập chữ vào !! ");
            inputInt.nextLine();
        }
    }

    public void deleteStudent() {
        try {
            System.out.println("Nhập id sinh viên mà bạn muốn xóa");
            int idDelete = inputInt.nextInt();
            studentManager.deleteStudent(idDelete);
            System.out.println("xóa thành công");
        } catch (InputMismatchException a) {
            System.out.println("Không được nhập chữ !");
        }
    }

    public void showAllStudent() {
        ArrayList<Student> list = studentManager.findAll();
        for (Student student:list) {
            System.out.println(student);
        }
    }

    public void editStudent() {
        try {
            System.out.println("Nhập mã bạn muốn cập nhật ");
            int idEdit = inputInt.nextInt();
            System.out.println("Nhập tên Sinh Viên bạn muốn sửa ");
            String nameEdit = inputString.nextLine();
            System.out.println("Nhập tuổi bạn muốn sửa");
            int AgeEdit = inputInt.nextInt();
            System.out.println("Nhập giới tính bạn muốn sửa");
            String SexEdit = inputString.nextLine();
            System.out.println("Nhập địa chỉ bạn muốn sửa");
            String AddressEdit = inputString.nextLine();
            System.out.println("Nhập điểm trung bình bạn muốn sửa");
            Double AvgEdit = inputInt.nextDouble();
            Student student = new Student(idEdit, nameEdit, AgeEdit, SexEdit, AddressEdit, AvgEdit);
            studentManager.editStudent(idEdit,student);
        } catch (InputMismatchException j) {
            System.out.println(" cấm nhập chữ !!");
        }
    }

    public void Arreary() {
        studentManager.sortIncreaseStudent();
    }
}
