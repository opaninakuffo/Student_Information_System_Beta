import java.util.ArrayList;

/**
 * @author Opanin Akuffo, Edinam Kluste, Ted Asare, Timo Charles-Debrah
 * Binary Search Tree (BST) implementation with insert, delete and inorder traverse methods
 */
public class BST {
    /**
     * Node class
     */
    class Node {
        //member variables
        Course studentCourse;
        Node leftChild;
        Node rightChild;

        /**
         * Default Node constructor
         * @param studentCourse
         */
        public Node (Course studentCourse) {
            this.studentCourse = studentCourse;
        }

        //Facilitator methods
        public String toString() {
            return "Course Name: "+studentCourse.getNameOfCourse()+"\nCredits: "+studentCourse.getCredit()+"\nScore: "+
                    studentCourse.getScore();
        }
    }

    //Every Student BST has a root node, and a good and bad courses ArrayList
    Node root;
    protected ArrayList goodCourses = new ArrayList();
    protected ArrayList badCourses = new ArrayList();

    /**
     * Insert method used to add node to BST
     * @param studentCourse
     */
    public void insert(Course studentCourse) {
        Node newNode = new Node(studentCourse);
        if (root == null) {
            root = newNode;
        }
        else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if(studentCourse.getScore() < focusNode.studentCourse.getScore()) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * inOrderTraverse used to display nodes in ascending order
     * @param focusNode
     */
    public void inOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverse(focusNode.leftChild);
            if (focusNode.studentCourse.getScore() == root.studentCourse.getScore()) {
            }
            else if (focusNode.studentCourse.getScore() < root.studentCourse.getScore()) {
                badCourses.add(focusNode);
            }
            else {
                goodCourses.add(focusNode);
            }
            inOrderTraverse(focusNode.rightChild);
        }
    }
}

