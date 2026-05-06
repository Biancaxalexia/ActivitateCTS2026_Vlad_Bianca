package Strategy.main;

import Strategy.clase.Grila;
import Strategy.clase.ProbaOrala;
import Strategy.clase.ProbaScrisa;
import Strategy.clase.Student;

public class Program {
    public static void main(String[] args){
        Student student = new Student("Vasile");

        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();

        student.setModSustinere(new Grila());
        student.examinare();
    }
}
