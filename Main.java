import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Джордж","Оруэлль");
        Book bookOne = new Book("1984", authorOne, 1949);

        Author authorTwo = new Author("Николай","Носов");
        Book bookTwo = new Book("Незнайка на луне", authorTwo, 1965);

        System.out.println(bookOne );
        System.out.println(bookTwo);

        bookOne.setYearOfRelease(2022);
        System.out.println(bookOne);
    }
}
