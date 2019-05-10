import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentLogin extends JFrame {
    private JPanel studentLoginPanel;
    private JLabel Idnumber;
    private JTextField Idfield;
    private JTextField passwordfield;
    private JButton logInButton;
    private JLabel Password;
    private JButton registerButton;
    private JButton backButton1;

    public studentLogin(){
        add(studentLoginPanel);
        this.setTitle("Student Information System Beta 1.0");
        this.setSize(800, 180);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Main.studentList.get(java.lang.Integer.parseInt(Idfield.getText())) == null) {
                    JOptionPane.showMessageDialog(studentLoginPanel, "Please re-try, ID entered does not exist");
                }
                else{
                    if (Main.studentLoginInfo.get(java.lang.Integer.parseInt(Idfield.getText())) == null) {
                        JOptionPane.showMessageDialog(studentLoginPanel, "Dear student, please register to SIS to gain access");
                    }
                    else {
                        if (Main.studentLoginInfo.get(java.lang.Integer.parseInt(Idfield.getText())).equals(passwordfield.getText())){
                            Main.studentLoginWindow.dispose();
                            Main.tempStudentSlot = (Student) Main.studentList.get(java.lang.Integer.parseInt(Idfield.getText()));
                            Main.viewScoreStudentWindow = new viewScoreStudent();
                            Main.viewScoreStudentWindow.setVisible(true);
                        }
                        else {
                            JOptionPane.showMessageDialog(studentLoginPanel, "Login failed, passwords do not match.\nPlease re-try.");
                        }

                    }

                }

            }


        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.studentLoginWindow.dispose();
                Main.studentRegistrationWindow = new Register_page();
                Main.studentRegistrationWindow.setVisible(true);
            }
        });
        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.studentLoginWindow.dispose();
                Main.startUpPage = new startUpPage();
                Main.startUpPage.setVisible(true);
            }
        });
    }
}
