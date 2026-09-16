import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Solution {

    public static int count(ArrayList myList, String type) {
        int count = 0;

        for (Object element : myList) {
            if (element instanceof Student && type.equals("Student")) {
                count++;
            }
            if (element instanceof Rockstar && type.equals("Rockstar")) {
                count++;
            }
            if (element instanceof Hacker && type.equals("Hacker")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList myList = new ArrayList();

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("Student")) {
                myList.add(new Student());
            } else if (type.equals("Rockstar")) {
                myList.add(new Rockstar());
            } else if (type.equals("Hacker")) {
                myList.add(new Hacker());
            }
        }

        System.out.println(
            count(myList, "Student") + " " +
            count(myList, "Rockstar") + " " +
            count(myList, "Hacker")
        );
    }
}
output:
Input (stdin)
5
Student
Student
Rockstar
Student
Hacker
Your Output (stdout)
~ no response on stdout ~
Expected Output
3 1 1
