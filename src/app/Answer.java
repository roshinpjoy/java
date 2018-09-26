package app;

import java.util.Objects;

public class Answer {
    @Override
    public String toString() {
        return "Answer{" +
                "qno=" + qno +
                ", answer='" + answer + '\'' +
                ", mark=" + mark +
                '}';
    }

    int qno;
    String answer;
    int mark;
    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return qno == answer1.qno &&
                mark == answer1.mark &&
                Objects.equals(answer, answer1.answer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(qno, answer, mark);
    }



    public  Answer(int qno,String answer,int mark)
    {

    }
}
