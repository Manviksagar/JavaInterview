package geeks;

public class PercentageCal {
    public static void main(String[] args) {
        int marks[]={20,40,60,80};
        int totalsub=marks.length;
        int totalMarks=0;

        for(int i=0;i<totalsub;i++){
            totalMarks +=marks[i];

        }
        System.out.println(totalMarks);
        //Percentage calculation
        System.out.println(totalMarks/totalsub +"%");
    }
}
