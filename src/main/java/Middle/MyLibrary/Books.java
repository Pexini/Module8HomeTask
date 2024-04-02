package Middle.MyLibrary;



import java.util.ArrayList;
import java.util.List;

public class Books extends Materials {
    private List <String> booksList;

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
        String bookInfo = getTitle() + " " + getAuthor();
        booksList.add(bookInfo);
        System.out.println("Книга " + bookInfo + "Успешно добавлена в библиотеку.");
    }

    @Override
    public void borrowMaterial() {
        if (!booksList.isEmpty()){
            String borrowedBook = booksList.remove(0);
            System.out.println("Книга " + borrowedBook + "  - Успешно выдана");
        }else {
            System.out.println("Извините данного материала в нашей библиотеке на данный момент нет, пожалуйста зайдите позже. Спасибо.");
        }
    }

    @Override
    public int getTotalMaterials() {
        return 0;
    }

    @Override
    public void findMaterials(String materialsTitle) {
        super.findMaterials(materialsTitle);
    }

    @Override
    public void removeMaterial() {

    }
}


