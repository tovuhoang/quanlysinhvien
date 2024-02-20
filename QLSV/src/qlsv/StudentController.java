package qlsv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;

        // Đăng ký các sự kiện từ giao diện
        view.addAddButtonListener(new AddButtonListener());
        view.addAddButtonListener(new EditButtonListener());
        view.addAddButtonListener(new DeleteButtonListener());
        view.addAddButtonListener(new SortButtonListener());
        view.addAddButtonListener(new GenderCountButtonListener());
        view.addAddButtonListener(new SaveButtonListener());

        // Cập nhật giao diện ban đầu
        view.updateTable(model.getStudents());
    }

    // Các listener xử lý sự kiện từ giao diện
    public class AddButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
        // Xử lý sự kiện thêm sinh viên
    }

    private class EditButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
        // Xử lý sự kiện sửa sinh viên
    }

    private class DeleteButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
        // Xử lý sự kiện xóa sinh viên
    }

    private class SortButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
        // Xử lý sự kiện sắp xếp
    }

    private class GenderCountButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
        // Xử lý sự kiện đếm số lượng sinh viên nam và nữ
    }

    private class SaveButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
        // Xử lý sự kiện lưu vào file
    }
}
