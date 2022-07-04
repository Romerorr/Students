import model.Address;
import model.Group;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Address teacherAddress = new Address ("�����-���������", "��. ���������", 2,8);
        Address studentAddress = new Address ("�����-���������", "��. �������������", 33,12);
        Teacher Naumov = new Teacher("�������", "������", 40, teacherAddress);
        Student Sanya = new Student ("���������", "�������", 19, studentAddress);
        Student Volodya = new Student ("��������", "������", 19, studentAddress);
        Student Valerka = new Student ("�������", "�������", 19, studentAddress);
        Student Nastya = new Student ("���������", "�������", 18, studentAddress);


        Student[] students = new Student[] {Sanya, Volodya, Valerka};

        Group DKU = new Group ("DKU", 1, Naumov, students);
        DKU.add(Nastya);

        DKU.groupInfo();
    }
}
