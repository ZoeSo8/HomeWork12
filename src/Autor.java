public class Autor {
   private String name;
   private String surname;
    public Autor (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    @Override
    public String toString() {
        return "Имя " + this.name + ", Фамилия " + this.surname;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,surname);
    }
    @Override
    public boolean equals(Object other) {
        if (this==other){
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Autor c2 = (Autor) other;
        return name.equals(c2.name)&& surname.equals(c2.surname);
    }
}
