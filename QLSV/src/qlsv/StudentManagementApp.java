package qlsv;

public class StudentManagementApp {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        // Khởi tạo màn hình đăng nhập
        LoginScreen loginScreen = new LoginScreen();

        // Nếu đăng nhập thành công, mở màn hình quản lý sinh viên
        if (loginScreen.loginSuccessful()) {
            // Khởi tạo đối tượng StudentModel
            StudentModel model = new StudentModel();

            // Khởi tạo đối tượng StudentView
            StudentView view = new StudentView();

            // Khởi tạo đối tượng StudentController và kết nối nó với model và view
            StudentController controller = new StudentController(model, view);

            // Cập nhật giao diện ban đầu với dữ liệu từ model
            view.updateTable(model.getStudents());
        }
    }
}

