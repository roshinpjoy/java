package Collections;

import Thiss.Book;

import java.util.Objects;

public class Bbook {
    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bbook bbook = (Bbook) o;
        return id == bbook.id &&
                Objects.equals(name, bbook.name) &&
                Objects.equals(author, bbook.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, author);
    }

    String author;//equal and hashcode

    Bbook(int id,String name,String author)
    {
        this.id=id;
        this.author=author;
        this.name=name;

    }


}//when we add hash code and equals  then remove duplicate elements
