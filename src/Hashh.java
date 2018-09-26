import java.util.Objects;

public class Hashh {

    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashh hashh = (Hashh) o;
        return id == hashh.id &&
                Objects.equals(name, hashh.name);//if want only id dele until&&
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    String name;

    public Hashh(int id ,String name)
    {
        this.id=id;
        this.name=name;

    }
}
