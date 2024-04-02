package Middle.MyLibrary;

public class Tales extends Materials {
    public Tales(String title, String author) {
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
    public void addMaterial() {
        System.out.println("Сказки успешно добавлены в библиотеку.");
    }

    @Override
    public void borrowMaterial() {
        System.out.println("Сказки  успешно выданы.");
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
