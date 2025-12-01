package homework_java_15.task_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    public String name;
    public String group;
    public int course;
    public List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrades(){
        if(grades == null || grades.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return(double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Студент: " + "\n" +
                "\tИмя: " + name + "\n" +
                "\tГруппа: " + group + "\n" +
                "\tКурс: " + course + "\n" +
                "\tОценки: " + grades + "\n" +
                "\tСредний балл: " + getAverageGrades();
    }
}
