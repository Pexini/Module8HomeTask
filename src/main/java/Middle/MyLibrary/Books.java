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
    public void findMaterials(String materialsTitle) {
        super.findMaterials(materialsTitle);
    }

    @Override
    public void removeMaterials(String materialsTitle) {
        super.removeMaterials(materialsTitle);
    }

    @Override
    public void addMaterials(String materialsTitle) {
        super.addMaterials(materialsTitle);
    }
}


