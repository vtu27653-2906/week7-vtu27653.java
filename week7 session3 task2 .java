import java.util.*;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);

            if (grade >= 38) {
                int next = ((grade / 5) + 1) * 5;

                if (next - grade < 3) {
                    grades.set(i, next);
                }
            }
        }

        return grades;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }

        List<Integer> result = gradingStudents(grades);

        for (int grade : result) {
            System.out.println(grade);
        }

        sc.close();
    }
}

output:

Input (stdin)
4
73
67
38
33
Your Output (stdout)
75
67
40
33
Expected Output
75
67
40
33