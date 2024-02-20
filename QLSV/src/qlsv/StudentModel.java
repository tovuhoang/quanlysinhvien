package qlsv;
import java.io.*;
import java.util.ArrayList;

public class StudentModel {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    // Thêm các phương thức khác như sửa, xóa, sắp xếp, đếm, lưu vào file, vv.
}

