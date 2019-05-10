import java.util.Arrays;

public class Major {
    private String nameOfMajor;
    private String departmentHead;
    private Course[] courses;

    public Major (String nameOfMajor, String departmentHead, Course[] courses) {
        this.nameOfMajor = nameOfMajor;
        this.departmentHead = departmentHead;
        this.courses = courses;
    }

    public String getNameOfMajor() {
        return nameOfMajor;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public Course[] getCoursesArray() {
        return courses;
    }

    public String getCourses() {
        return Arrays.toString(courses);
    }

    private void setNameOfMajor(String nameOfMajor) {
        this.nameOfMajor = nameOfMajor;
    }

    private void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    private void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return this.getNameOfMajor();
                //+"|"+this.getDepartmentHead()+"|"+this.getCourses();
    }

    public static Major BA = new Major("Business Administration", "Dr. Spio", Course.BAcourses);
    public static Major CS = new Major("Computer Science", "Dr. Ayorkor Korsah", Course.CScourses);
    public static Major MIS = new Major("Management Information Systems", "Dr. Ayorkor Korsah", Course.MIScourses);
    public static Major EE = new Major("Electrical Engineering", "Dr. Nathan Amanquah", Course.EE_MEcourses);
    public static Major ME = new Major("Mechanical Engineering", "Dr. Nathan Amanquah", Course.EE_MEcourses);
    public static Major CE = new Major("Computer Engineering", "Dr. Nathan Amanquah", Course.CEcourses);
}
