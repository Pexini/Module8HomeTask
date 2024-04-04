package Middle.MyLibrary;

public class Stories extends Materials {
    public Stories(String title, String author) {
        super(title, author);
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
