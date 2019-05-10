import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageAdmin extends JFrame {
    private JPanel LoginAdminPanel;
    private JTextField password;
    private JButton enterButton;
    private JLabel message;
    private JButton backButton;
    private JButton HINTButton;

    Integer adminKey = 2021;

    public LoginPageAdmin() {
        add(LoginAdminPanel);
        this.setTitle("Student Information System Beta 1.0");
        this.setSize(300, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (java.lang.Integer.parseInt(password.getText())==adminKey) {
                    Main.loginPageAdmin.dispose();
                    Main.studentWindow = new StudentWindow();
                    Main.studentWindow.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(LoginAdminPanel, "Wrong Password! Kindly Try Again");
                }
            }
        });


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.loginPageAdmin.dispose();
                Main.startUpPage = new startUpPage();
                Main.startUpPage.setVisible(true);
            }
        });
        HINTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(LoginAdminPanel,"Admin Password is 2021");
            }
        });
    }
}
