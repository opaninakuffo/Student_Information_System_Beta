import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private Integer ID;
    protected Major major;
    protected BST studentTree = new BST();

    public Student (String firstName, String lastName, Integer ID, Major major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getID () {
        return this.ID;
    }

    public Major getMajor() {
        return major;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    private void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastName()+"|"+this.getID()+"|"+this.getMajor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }



    @Override
    public boolean equals(Object obj) {
        return this.getFirstName().equalsIgnoreCase(((Student) obj).getFirstName()) &&
                this.getLastName().equalsIgnoreCase(((Student) obj).getLastName()) &&
                this.getID() == ((Student) obj).getID();
    }

}
