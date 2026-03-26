import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class LoginApplet extends JFrame implements ActionListener {

    TextField usernameField;
    TextField passwordField;
    Button loginButton;

    public LoginApplet() {
        setLayout(new GridLayout(4, 2, 5, 5));
        setTitle("Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new Label("Username:"));
        usernameField = new TextField(20);
        add(usernameField);

        add(new Label("Password:"));
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        add(passwordField);

        add(new Label(""));
        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        add(loginButton);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("Brandon") && password.equals("2332")) {
            showMessage("Login Successful");
        } else {
            showMessage("Incorrect username or password");
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            LoginApplet app = new LoginApplet();
            app.setVisible(true);
        });
    }
}
