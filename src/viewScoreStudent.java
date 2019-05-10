import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewScoreStudent extends JFrame {
    private JPanel viewStudentScorePanel;
    private JLabel goodCoursesLabel;
    private JLabel badCoursesLabel;
    private JLabel goodCoursesField1;
    private JLabel goodCoursesField2;
    private JLabel goodCoursesField3;
    private JLabel goodCoursesField4;
    private JLabel goodCoursesField5;
    private JLabel badCoursesField1;
    private JLabel badCoursesField2;
    private JLabel badCoursesField3;
    private JLabel badCoursesField4;
    private JLabel badCoursesField5;
    private JButton LOGOUTButton;
    private JLabel studentInfoLabel;
    private Student student;
    private int goodScoreCount;
    private int badScoreCount;
    private JLabel[] goodFieldsArray = {goodCoursesField1, goodCoursesField2, goodCoursesField3, goodCoursesField4, goodCoursesField5};
    private JLabel[] badFieldsArray = {badCoursesField1, badCoursesField2, badCoursesField3, badCoursesField4, badCoursesField5};

    public viewScoreStudent() {
        add(viewStudentScorePanel);
        this.setTitle("Student Information System Beta 1.0");
        this.setSize(800, 180);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        student = Main.tempStudentSlot;
        goodScoreCount = student.studentTree.goodCourses.size();
        badScoreCount = student.studentTree.badCourses.size();

        studentInfoLabel.setText("Name: "+student.getFirstName()+" "+student.getLastName()+"|"+
                "ID Number: "+student.getID()+" | "+"Major: "+student.getMajor()+ " | "+"Department Head: "+student.getMajor().getDepartmentHead()
                );

        for (int i = 0; i < goodScoreCount; i++) {
            goodFieldsArray[i].setText(student.studentTree.goodCourses.get(i).toString());
        }
        for (int i = 0; i < badScoreCount; i++) {
            badFieldsArray[i].setText(student.studentTree.badCourses.get(i).toString());
        }

        LOGOUTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.viewScoreStudentWindow.dispose();
                Main.studentLoginWindow = new studentLogin();
                Main.studentLoginWindow.setVisible(true);
            }
        });
    }
}
