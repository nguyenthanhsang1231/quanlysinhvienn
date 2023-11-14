package quanlysinhvien;

public class Student {
    private int id;
    private static int idCreased = 1;
    private String name;
    private int age;
    private String sex;
    private String address;
    private double avg;




    public Student( String name, int age, String sex, String address, double avg) {
        this.id = idCreased;
        idCreased++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.avg = avg;
    }

    public Student(int id, String name, int age, String sex, String address, double avg) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", avg=" + avg +
                '}';
    }
}
