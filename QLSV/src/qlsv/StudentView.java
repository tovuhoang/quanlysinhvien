package qlsv;
import javax.swing.*;

import qlsv.StudentController.AddButtonListener;

import java.util.ArrayList;

public class StudentView {
    private JFrame frame;
    private JTable table;
    // Các thành phần giao diện khác

    public StudentView() {
        frame = new JFrame("Quản lý sinh viên");
        // Khởi tạo các thành phần giao diện
    }

    public void updateTable(ArrayList<Student> students) {
        // Cập nhật bảng hiển thị danh sách sinh viên
    }

	@SuppressWarnings("hiding")
	public <AddButtonListener> void addAddButtonListener(AddButtonListener addButtonListener) {
		// TODO Auto-generated method stub
		
	}

    // Thêm các phương thức khác để xử lý giao diện
}

