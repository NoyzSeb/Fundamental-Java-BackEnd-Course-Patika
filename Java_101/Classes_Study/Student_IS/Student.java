package Java_101.Classes_Study.Student_IS;

public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physic;
    Course chem;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course physic, Course chem){
        this.name=name;
        this.classes=classes;
        this.stuNo=stuNo;
        this.math=math;
        this.physic=physic;
        this.chem=chem;
        calcAverage();
        this.isPass=false;
    }
    
    public void addBulkExamNote(int math, int physic, int chem) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physic >= 0 && physic <= 100) {
            this.physic.note = physic;
        }

        if (chem >= 0 && chem <= 100) {
            this.chem.note = chem;
        }

    }

    public void addQuizNote(int math, int physic, int chem) {

        if (math >= 0 && math <= 100) {
            this.math.quizNote = math;
        }

        if (physic >= 0 && physic <= 100) {
            this.physic.quizNote = physic;
        }

        if (chem >= 0 && chem <= 100) {
            this.chem.quizNote = chem;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physic.note == 0 || this.chem.note == 0) {
            System.out.println("Some Scores Missing");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Class Passed. ");
            } else {
                System.out.println("Class Not Passed.");
            }
        }
    }
    
    public void calcAverage() {
        this.average = (
        this.physic.note*(1-((double)this.physic.quizWeight/100)+(this.physic.quizNote*this.physic.quizWeight))
         + this.math.note*(1-((double)this.math.quizWeight/100)+(this.math.quizNote*this.math.quizWeight) ) 
         + this.chem.note*(1-((double)this.chem.quizWeight/100)+(this.chem.quizNote*this.chem.quizWeight) )) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Mathematic Score : " + this.math.note);
        System.out.println("Physic Score : " + this.physic.note);
        System.out.println("Chemistry Score : " + this.chem.note);
    }


}
