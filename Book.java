public class Book {
    private String name;
    private Author author;
    private int yearOfRelease;
    public Book (String name, Author author,int yearOfRelease){
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor(){
        return author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public int setYearOfRelease() {
        this.yearOfRelease = yearOfRelease;
        return yearOfRelease;
    }
    public String toString(){
        return "Название произведения: " + getName() + ", Автор: " + getAuthor() + ", Год издания: " + setYearOfRelease();
    }
    public boolean equals(Object other){
        if(this == other) {
            return true;
        }
        if(other==null || this.getClass() != other.getClass()){
            return false;
        }
        Book bookOne = (Book) other;
        return name.equals(bookOne.name) && author.equals(bookOne.author) && yearOfRelease==bookOne.yearOfRelease;
    }
    public int hashCode(){
        return java.util.Objects.hash(name, yearOfRelease, author);
    }
}
