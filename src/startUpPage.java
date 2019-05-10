import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startUpPage extends JFrame {
    private JButton studentButton;
    private JButton adminButton;
    private JLabel welcomeLabel;
    private JPanel startUpPanel;

    public startUpPage() {
        add(startUpPanel);
        this.setTitle("Student Information System Beta 1.0");
        this.setSize(450, 200);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.startUpPage.dispose();
                Main.loginPageAdmin= new LoginPageAdmin();
                Main.loginPageAdmin.setVisible(true);
            }
        });
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.startUpPage.dispose();
                Main.studentLoginWindow = new studentLogin();
                Main.studentLoginWindow.setVisible(true);
            }
        });
    }
}
