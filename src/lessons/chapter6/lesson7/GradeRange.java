package lessons.chapter6.lesson7;

public class GradeRange {


   public static void main(String[] args){
       // Create grades
       Grade[] grades = {
               new Grade("A", 95),
               new Grade("A-", 90),
               new Grade("B+", 87),
               new Grade("B", 83),
               new Grade("B-", 80),
               new Grade("C+", 77),
               new Grade("C", 73),
               new Grade("C-", 70),
               new Grade("D+", 67),
               new Grade("D", 63),
               new Grade("D-", 60),
               new Grade("F", 0),

       };

       //Print Grades
       for(Grade grade : grades){
           System.out.println(grade.getGradeLetter() + "\t" + grade.getGradeCuttoff());
       }
   }
}

//Output:
/*
A	95.0
A-	90.0
B+	87.0
B	83.0
B-	80.0
C+	77.0
C	73.0
C-	70.0
D+	67.0
D	63.0
D-	60.0
F	0.0---------------------------------
 */
