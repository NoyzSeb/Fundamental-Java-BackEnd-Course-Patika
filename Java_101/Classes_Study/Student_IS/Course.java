package Java_101.Classes_Study.Student_IS;

public class Course {
    Teacher courseTeacher;
    String name,code,prefix;
    int quizWeight;
    int note;
    int quizNote;

    public Course(String name, String code, String prefix, int quizWeight){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.quizWeight=quizWeight;
        this.note=0;
        this.quizNote=0;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
           this.courseTeacher=t;
           System.out.println("Successfully added");
        }else{
            System.out.println("This teacher is incompatible to this course.");
        }
    }
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " teacher of the course : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " teacher of the course is not assigned.");
        }
    }
}
