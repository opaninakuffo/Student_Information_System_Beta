import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_Score extends JFrame {
    private JPanel viewScorePanel;
    private JLabel IDlabel;
    private JTextField idNo;
    private JButton FINDButton;
    private JLabel goodCoursesLabel;
    private JLabel badCoursesLabel;
    private JLabel badCoursesField1;
    private JLabel badCoursesField2;
    private JLabel badCoursesField3;
    private JLabel badCoursesField4;
    private JLabel badCoursesField5;
    private JLabel goodCoursesField2;
    private JLabel goodCoursesField1;
    private JLabel goodCoursesField3;
    private JLabel goodCoursesField4;
    private JLabel goodCoursesField5;
    private JButton viewScoreForAnotherButton;
    private JButton exitToRecordsButton;
    private JButton LOGOUTButton;
    private JButton exitToScoreEntryButton;
    private Object student;
    private int goodScoreCount;
    private int badScoreCount;
    private JLabel[] goodFieldsArray = {goodCoursesField1, goodCoursesField2, goodCoursesField3, goodCoursesField4, goodCoursesField5};
    private JLabel[] badFieldsArray = {badCoursesField1, badCoursesField2, badCoursesField3, badCoursesField4, badCoursesField5};


    public View_Score() {
        add(viewScorePanel);
        this.setTitle("Student Information System Beta 1.0");
        this.setSize(1700, 500);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        FINDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.studentList.get(java.lang.Integer.parseInt(idNo.getText())) == null) {
                    JOptionPane.showMessageDialog(viewScorePanel, "Please re-try,\nID Number: "+idNo.getText()+" not found");
                }
                else{
                    viewScorePanel.revalidate();
                    student = Main.studentList.get(java.lang.Integer.parseInt(idNo.getText()));
                    JOptionPane.showMessageDialog(viewScorePanel,"Student Found\n"+"Full Name: "+((Student) student).getFirstName()
                            +" "+((Student) student).getLastName()+"\nID: "+((Student) student).getID()+"\nMajor: "+((Student) student).getMajor());
                    goodScoreCount = ((Student) student).studentTree.goodCourses.size();
                    badScoreCount = ((Student) student).studentTree.badCourses.size();

                    goodCoursesField1.setText(((Student) student).studentTree.goodCourses.get(1).toString());

                    for (int i = 0; i < goodScoreCount; i++) {
                        goodFieldsArray[i].setText(((Student) student).studentTree.goodCourses.get(i).toString());
                    }
                    for (int i = 0; i < badScoreCount; i++) {
                        badFieldsArray[i].setText(((Student) student).studentTree.badCourses.get(i).toString());
                    }

                }


            }
        });

        exitToRecordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.viewScoreWindow.dispose();
                Main.studentWindow = new StudentWindow();
                Main.studentWindow.setVisible(true);
            }
        });

        viewScoreForAnotherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.viewScoreWindow.dispose();
                Main.viewScoreWindow = new View_Score();
                Main.viewScoreWindow.setVisible(true);
            }
        });

        exitToScoreEntryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.viewScoreWindow.dispose();
                Main.courseWindow = new Course_Score();
                Main.courseWindow.setVisible(true);
            }
        });

        LOGOUTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.viewScoreWindow.dispose();
                Main.startUpPage = new startUpPage();
                Main.startUpPage.setVisible(true);
            }
        });
    }

}
