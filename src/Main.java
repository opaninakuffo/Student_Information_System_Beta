/**
 * Student Information System Beta 1.0
 * Data Structures & Algorithms Final Project
 * Admin Key - 2021
 * @author Opanin Akuffo, Edinam Klutse, Timothy Charles-Debrah, Ted Asare
 */

import javax.swing.*;
import java.util.Hashtable;

public class Main {

    static Hashtable studentList;
    static Hashtable studentLoginInfo;
    static Course_Score courseWindow;
    static StudentWindow studentWindow;
    static View_Score viewScoreWindow;
    static LoginPageAdmin loginPageAdmin;
    static startUpPage startUpPage;
    static studentLogin studentLoginWindow;
    static Register_page studentRegistrationWindow;
    static Student tempStudentSlot;
    static viewScoreStudent viewScoreStudentWindow;


    public static void main (String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        studentList = new Hashtable();
        studentLoginInfo = new Hashtable();

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                startUpPage = new startUpPage();
                startUpPage.setVisible(true);
            }
        });
    }
}
