import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register_page extends JFrame {
    private JPanel registrationPagePanel;
    private JTextField idNoField1;
    private JTextField passwordField1;
    private JTextField passwordField2;
    private JButton backButton1;
    private JButton REGISTERButton;

    public Register_page() {
        add(registrationPagePanel);
        this.setTitle("Student Information System Beta 1.0");
        this.setSize(450, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.studentRegistrationWindow.dispose();
                Main.studentLoginWindow = new studentLogin();
                Main.studentLoginWindow.setVisible(true);
            }
        });
        REGISTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Main.studentList.get(java.lang.Integer.parseInt(idNoField1.getText())) == null) {
                    JOptionPane.showMessageDialog(registrationPagePanel, "Please re-try, ID entered does not exist");
                }
                else if (!passwordField1.getText().equalsIgnoreCase(passwordField2.getText())) {
                    JOptionPane.showMessageDialog(registrationPagePanel, "Please re-try, passwords do not match");
                }
                else {
                    Main.studentLoginInfo.put(java.lang.Integer.parseInt(idNoField1.getText()), passwordField1.getText());
                    System.out.println(Main.studentLoginInfo);
                    JOptionPane.showMessageDialog(registrationPagePanel, "Account sucessfully created!\nPlease login now");
                    Main.studentRegistrationWindow.dispose();
                    Main.studentLoginWindow = new studentLogin();
                    Main.studentLoginWindow.setVisible(true);
                }
            }
        });
    }
}
