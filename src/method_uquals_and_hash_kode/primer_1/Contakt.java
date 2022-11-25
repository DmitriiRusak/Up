package method_uquals_and_hash_kode.primer_1;

import java.util.Objects;

public class Contakt {
    int id;
    String name;
    String phone;

    public Contakt(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String toString(){
        return "Kontakt "+id+"name "+name+"phone "+phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contakt)) return false;
        Contakt contakt = (Contakt) o;
        return id == contakt.id && name.equals(contakt.name) && phone.equals(contakt.phone);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
    }
}
