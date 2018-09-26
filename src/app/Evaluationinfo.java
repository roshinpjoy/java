package app;

public class Evaluationinfo {
    String rollno;
    String name;
    int totalmarks;

    @Override
    public String toString() {
        return "Evaluationinfo{" +
                "rollno='" + rollno + '\'' +
                ", name='" + name + '\'' +
                ", totalmarks=" + totalmarks +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
