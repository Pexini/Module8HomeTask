package Middle.MyLibrary;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Books extends Materials {
    private List <Book> booksList;

    public Books(String title, String author) {
        super(title, author);
        this.booksList = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void addMaterial() {
        System.out.println("Книга успешно добавлена в библиотеку.");
    }

    @Override
    public void borrowMaterial() {
        System.out.println("Книга успешно выдана.");
    }

    @Override
    public int getTotalMaterials() {
        return 0;
    }

    @Override
    public void findMaterials(String materialsTitle) {
        super.findMaterials(materialsTitle);
    }
}


