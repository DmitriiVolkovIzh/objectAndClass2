public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String toString() {
        return name + " " + surname;
    }
    public boolean equals(Object other){
        if(other == null||this.getClass() != other.getClass()){
            return false;
        }
        if(this == other) {
            return true;
        }
        Author authorOne  = (Author) other;
        return name.equals(authorOne.name) && surname.equals(authorOne.surname);
    }
    public int hashCode(){
        return java.util.Objects.hash(name, surname);
    }
}
