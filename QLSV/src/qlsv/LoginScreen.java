package qlsv;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen {
    private JFrame frame;
    private JPanel panel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginScreen() {
        frame = new JFrame("Đăng nhập");
        panel = new JPanel();
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Đăng nhập");

        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JLabel("Tên người dùng:"));
        panel.add(usernameField);
        panel.add(new JLabel("Mật khẩu:"));
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                // Kiểm tra tên đăng nhập và mật khẩu
                if (username.equals("admin") && password.equals("password")) {
                    // Đăng nhập thành công, tạo giao diện quản lý sinh viên
                	// Đóng màn hình đăng nhập                 
                    openStudentManagement();
                } 
                else {
                    JOptionPane.showMessageDialog(frame, "Sai tên đăng nhập hoặc mật khẩu", "Lỗi đăng nhập", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void openStudentManagement() {
        frame.dispose(); // Đóng màn hình đăng nhập

        // Khởi tạo màn hình quản lý sinh viên
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Cập nhật giao diện ban đầu với dữ liệu từ model
        view.updateTable(model.getStudents());
    }


    @SuppressWarnings("unused")
	public void startStudentManagement() {
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
    }

    public static void main(String[] args) {
        new LoginScreen();
    }

	public boolean loginSuccessful() {
		// TODO Auto-generated method stub
		return false;
	}


	}

