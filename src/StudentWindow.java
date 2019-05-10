import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentWindow extends JFrame {
    private JTextField firstName;
    private JButton saveButton;
    private JPanel studentPanel;
    private JTextField lastName;
    private JTextField ID;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel iDLabel;
    private JLabel majorLabel;
    private JComboBox majorList;
    private JButton enterScoresButton;
    private JButton enterNewStudentRecordButton;
    private JButton viewScoresButton;
    private JButton LOGOUTButton;
    protected static String nameOfMajor;


    public StudentWindow () {
        add(studentPanel);
        this.setTitle("Student Information System Beta 1.0");
        this.setSize(800, 180);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        majorList.addItem(null);
        majorList.addItem(Major.BA);
        majorList.addItem(Major.CS);
        majorList.addItem(Major.MIS);
        majorList.addItem(Major.CE);
        majorList.addItem(Major.ME);
        majorList.addItem(Major.EE);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student student = new Student(firstName.getText(), lastName.getText(), java.lang.Integer.parseInt(ID.getText()), (Major) majorList.getSelectedItem());
                Main.studentList.put(student.getID(), student);
                System.out.println(Main.studentList);
                JOptionPane.showMessageDialog(studentPanel,"Success!\nStudent with data\n"+"First Name: "+firstName.getText()
                        +"\nLast Name: "+lastName.getText()+"\nID: "+ID.getText()+"\nMajor: "+majorList.getSelectedItem()+"\nRecord SAVED");
            }
        });
        majorList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameOfMajor = majorList.getSelectedItem().toString();
            }
        });

        enterScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.studentWindow.dispose();
                Main.courseWindow = new Course_Score();
                Main.courseWindow.setVisible(true);
            }
        });

        enterNewStudentRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.studentWindow.dispose();
                Main.studentWindow = new StudentWindow();
                Main.studentWindow.setVisible(true);
            }
        });

        viewScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.studentWindow.dispose();
                Main.viewScoreWindow = new View_Score();
                Main.viewScoreWindow.setVisible(true);
            }
        });

        LOGOUTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.studentWindow.dispose();
                Main.startUpPage = new startUpPage();
                Main.startUpPage.setVisible(true);
            }
        });
    }
}