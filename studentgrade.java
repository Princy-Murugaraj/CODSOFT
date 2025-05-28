import java.util.Scanner;
public class studentgrade {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no. of subjects");
            int subjects=sc.nextInt();
            if (subjects<=0){
             System.out.println("Please enter a valid number of the subjects.");
                return;
            }
            int totalMarks =0;
            int maxMarksofSubject=100;
            for(int i=1;i<=subjects;i++){
                System.out.println("Enter the marks in subject " + i + " (out of 100):");
                int marks=sc.nextInt();
                if(marks<=0||marks>maxMarksofSubject){
                System.out.println("Marks should be in the range of 0 to 100. Please enter valid marks.");
                i--;
                }
               else{
                totalMarks+=marks;
               }
            }
            double avgpercent=(double)totalMarks/(subjects*maxMarksofSubject)*100;
            System.out.println("Total Marks: "+totalMarks);
            System.out.println("Average Percentage: " + avgpercent + "%");
            String grade;
            if(avgpercent>=90){
                grade="A+";
            }
            else if (avgpercent>=80) {
                grade="A";
            }
            else if (avgpercent>=70) {
                grade="B";
            }
            else if (avgpercent>=60) {
                grade="C";
            }
            else if (avgpercent>=50) {
                grade="D";
            }
            else{
                grade="F";
            }
            System.out.println("Grade: " + grade);
        }
    }
}
