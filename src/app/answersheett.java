package app;

import java.util.Objects;
import java.util.Set;

public class answersheett {


    String rollno;

    @Override
    public String toString() {
        return "answersheett{" +
                "rollno='" + rollno + '\'' +
                ", name='" + name + '\'' +
                ", answer=" + answer +
                '}';
    }

    String name;
    Set<Answer> answer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        answersheett that = (answersheett) o;
        return Objects.equals(rollno, that.rollno) &&
                Objects.equals(name, that.name) &&
                Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rollno, name, answer);
    }



    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }





}
