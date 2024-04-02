package Middle.MyLibrary;

import java.util.ArrayList;
import java.util.List;

public class Magazines extends Materials {
    private List<Magazines> magazinesList;

    public Magazines(String title) {
        super(title, "");
        this.magazinesList = new ArrayList<>();
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
    public String toString() {
        return super.toString();
    }

    @Override
    public void addMaterial() {
        System.out.println("Журнал успешно добавлена в библиотеку.");
    }

    @Override
    public void borrowMaterial() {
        System.out.println("Журнал успешно выдан.");
    }

    public void addMagazines(Magazines magazines) {
        magazinesList.add(magazines);
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

    public Magazines(String title, String author) {
        super(title, author);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }
}
