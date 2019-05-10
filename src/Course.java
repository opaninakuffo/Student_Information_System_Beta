//import java.util.HashMap;

public class Course {
    private String nameOfCourse;
    private String nameOfLecturer;
    private Double credit;
    private Double score;

    public Course(String nameOfCourse, String nameOfLecturer, Double credit, Double score) {
        this.nameOfCourse = nameOfCourse;
        this.nameOfLecturer = nameOfLecturer;
        this.credit = credit;
        this.score = score;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public String getNameOfLecturer() {
        return nameOfLecturer;
    }

    public Double getCredit() {
        return credit;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    private void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    private void setNameOfLecturer(String nameOfLecturer) {
        this.nameOfLecturer = nameOfLecturer;
    }

    private void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return this.getNameOfCourse();
    }

    @Override
    public boolean equals(Object obj) {
        return  this.getNameOfCourse().equalsIgnoreCase(((Course) obj).getNameOfCourse()) &&
                this.getNameOfLecturer().equalsIgnoreCase(((Course) obj).getNameOfLecturer()) &&
                this.getCredit()==((Course) obj).getCredit() &&
                this.getScore()==((Course) obj).getScore();
    }
    //Compulsory Course for all Students
    public static Course DEFAULT = new Course(null, null, null, 59.99999999);
    public static Course SOAN211 = new Course("Leadership 2", "Steven Adei", 0.5, null);

    public static Course SOAN227 = new Course("Religion in Africa", "Pashington Obeng", 1.0, null);
    public static Course ENG215 = new Course("African Literature", "Edinam Akpokavie", 1.0, null);
    public static Course POLS231 = new Course("Africa in International Affairs", "Daniel Quansah", 1.0, null);

    public static Course MATH221= new Course("Statistics", "Abdul-Razak Adam", 1.0, null);
    public static Course ECON101 = new Course("Microeconomics", "Edgar Cooke", 1.0, null);
    public static Course BUSA210 = new Course("Financial Accounting", "Edinam Tettey", 1.0, null);
    public static Course BUSA224 = new Course("Finance for Non-Finance Managers", "Esther Laryea", 1.0, null);

    public static Course MATH211 = new Course("Multivariable Calculus and Linear Algebra", "Patrick Dwomfour", 1.0, null);
    public static Course SC113 = new Course("Physics II: Electromagnetism", "Kofi Adu-Larbi", 1.0, null);
    public static Course MATH152 = new Course("Statistics for Engineering and Economics", "Elena Rosca", 1.0, null);
    public static Course ME411 = new Course("Fundamentals of Thermal Fluid Science and Heat Transfer", "Kenobi Morris", 1.0, null);

    public static Course CS222 =  new Course("Data Structures and Algorithm", "David Ebo", 1.0, null);
    public static Course CS221 = new Course("Discrete Structures and Theory", "Ayawoa Dagbovie", 1.0, null);

    public static Course[] BAcourses = {SOAN211, SOAN227, MATH221, ECON101, BUSA210, DEFAULT};
    public static Course[] CScourses = {SOAN211, ENG215, MATH221, CS222, CS221, DEFAULT};
    public static Course[] MIScourses = {SOAN211, POLS231, MATH221, BUSA224, CS221, DEFAULT};
    public static Course[] EE_MEcourses = {SOAN211, MATH211, SC113, MATH152, ME411, DEFAULT};
    public static Course[] CEcourses = {SOAN211, MATH211, SC113, MATH152, CS222, DEFAULT};

}
