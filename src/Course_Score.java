import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Course_Score extends JFrame {
    private JPanel courseScorePanel;
    public JTextField score1;
    private JComboBox courseComboBox1;
    private JLabel Course1;
    private JComboBox courseComboBox2;
    protected JTextField score2;
    private JComboBox courseComboBox3;
    protected JTextField score3;
    private JComboBox courseComboBox4;
    protected JTextField score4;
    private JComboBox courseComboBox5;
    protected JTextField score5;
    private JLabel scoresLabel;
    private JButton SAVE;
    private JButton find;
    private JTextField idNo;
    private JButton enterScoreForAnotherButton;
    private JButton EXITButton;
    private JButton viewScoresButton;
    private JButton LOGOUTButton;
    private Object student;

    public Course_Score(){
        add(courseScorePanel);
        this.setTitle("Student Information System Beta 1.0");
        this.setSize(900, 300);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        SAVE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Student) student).getMajor().getCoursesArray()[0].setScore(java.lang.Double.parseDouble(score1.getText()));
                ((Student) student).getMajor().getCoursesArray()[1].setScore(java.lang.Double.parseDouble(score2.getText()));
                ((Student) student).getMajor().getCoursesArray()[2].setScore(java.lang.Double.parseDouble(score3.getText()));
                ((Student) student).getMajor().getCoursesArray()[3].setScore(java.lang.Double.parseDouble(score4.getText()));
                ((Student) student).getMajor().getCoursesArray()[4].setScore(java.lang.Double.parseDouble(score5.getText()));
                System.out.println();
                System.out.println(((Student) student).getMajor().getCoursesArray()[0]+": "+((Student) student).getMajor().getCoursesArray()[0].getScore());
                System.out.println(((Student) student).getMajor().getCoursesArray()[1]+": "+((Student) student).getMajor().getCoursesArray()[1].getScore());
                System.out.println(((Student) student).getMajor().getCoursesArray()[2]+": "+((Student) student).getMajor().getCoursesArray()[2].getScore());
                System.out.println(((Student) student).getMajor().getCoursesArray()[3]+": "+((Student) student).getMajor().getCoursesArray()[3].getScore());
                System.out.println(((Student) student).getMajor().getCoursesArray()[4]+": "+((Student) student).getMajor().getCoursesArray()[4].getScore());
                ((Student) student).studentTree.insert(((Student) student).getMajor().getCoursesArray()[5]);
                ((Student) student).studentTree.insert(((Student) student).getMajor().getCoursesArray()[0]);
                ((Student) student).studentTree.insert(((Student) student).getMajor().getCoursesArray()[1]);
                ((Student) student).studentTree.insert(((Student) student).getMajor().getCoursesArray()[2]);
                ((Student) student).studentTree.insert(((Student) student).getMajor().getCoursesArray()[3]);
                ((Student) student).studentTree.insert(((Student) student).getMajor().getCoursesArray()[4]);
                ((Student) student).studentTree.inOrderTraverse(((Student) student).studentTree.root);
                JOptionPane.showMessageDialog(courseScorePanel,"Scores saved");
            }
        });

        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (Main.studentList.get(java.lang.Integer.parseInt(idNo.getText())) == null) {
                   JOptionPane.showMessageDialog(courseScorePanel,"Please re-try, ID Number: "+idNo.getText()+" not found");
               }
               else {
                   courseScorePanel.revalidate();
                   student = Main.studentList.get(java.lang.Integer.parseInt(idNo.getText()));
                   JOptionPane.showMessageDialog(courseScorePanel,"Student Found\n"+"Full Name: "+((Student) student).getFirstName()
                           +" "+((Student) student).getLastName()+"\nID: "+((Student) student).getID()+"\nMajor: "+((Student) student).getMajor()+
                           "\nPlease enter scores");
                   System.out.println();
                   System.out.println(((Student) student).getMajor().getCoursesArray()[0]+": "+((Student) student).getMajor().getCoursesArray()[0].getScore());
                   System.out.println(((Student) student).getMajor().getCoursesArray()[1]+": "+((Student) student).getMajor().getCoursesArray()[1].getScore());
                   System.out.println(((Student) student).getMajor().getCoursesArray()[2]+": "+((Student) student).getMajor().getCoursesArray()[2].getScore());
                   System.out.println(((Student) student).getMajor().getCoursesArray()[3]+": "+((Student) student).getMajor().getCoursesArray()[3].getScore());
                   System.out.println(((Student) student).getMajor().getCoursesArray()[4]+": "+((Student) student).getMajor().getCoursesArray()[4].getScore());
                   switch (((Student) student).getMajor().getNameOfMajor()) {
                       case "Business Administration":
                           courseComboBox1.addItem(Course.BAcourses[0]);
                           courseComboBox2.addItem(Course.BAcourses[1]);
                           courseComboBox3.addItem(Course.BAcourses[2]);
                           courseComboBox4.addItem(Course.BAcourses[3]);
                           courseComboBox5.addItem(Course.BAcourses[4]);
                           break;
                       case "Computer Science":
                           courseComboBox1.addItem(Course.CScourses[0]);
                           courseComboBox2.addItem(Course.CScourses[1]);
                           courseComboBox3.addItem(Course.CScourses[2]);
                           courseComboBox4.addItem(Course.CScourses[3]);
                           courseComboBox5.addItem(Course.CScourses[4]);
                           break;
                       case "Management Information Systems":
                           courseComboBox1.addItem(Course.MIScourses[0]);
                           courseComboBox2.addItem(Course.MIScourses[1]);
                           courseComboBox3.addItem(Course.MIScourses[2]);
                           courseComboBox4.addItem(Course.MIScourses[3]);
                           courseComboBox5.addItem(Course.MIScourses[4]);
                           break;
                       case "Computer Engineering":
                           courseComboBox1.addItem(Course.CEcourses[0]);
                           courseComboBox2.addItem(Course.CEcourses[1]);
                           courseComboBox3.addItem(Course.CEcourses[2]);
                           courseComboBox4.addItem(Course.CEcourses[3]);
                           courseComboBox5.addItem(Course.CEcourses[4]);
                           break;
                       case "Electrical Engineering":
                       case "Mechanical Engineering":
                           courseComboBox1.addItem(Course.EE_MEcourses[0]);
                           courseComboBox2.addItem(Course.EE_MEcourses[1]);
                           courseComboBox3.addItem(Course.EE_MEcourses[2]);
                           courseComboBox4.addItem(Course.EE_MEcourses[3]);
                           courseComboBox5.addItem(Course.EE_MEcourses[4]);
                           break;
                   }
               }
            }
        });
        enterScoreForAnotherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.courseWindow.dispose();
                Main.courseWindow = new Course_Score();
                Main.courseWindow.setVisible(true);
            }
        });

        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.courseWindow.dispose();
                Main.studentWindow = new StudentWindow();
                Main.studentWindow.setVisible(true);
            }
        });

        viewScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.courseWindow.dispose();
                Main.viewScoreWindow = new View_Score();
                Main.viewScoreWindow.setVisible(true);
            }
        });
        LOGOUTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.courseWindow.dispose();
                Main.startUpPage = new startUpPage();
                Main.startUpPage.setVisible(true);
            }
        });
    }
    }
