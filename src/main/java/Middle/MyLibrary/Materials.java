package Middle.MyLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Materials {

    private String title;
    private String author;
    private static List<Materials> materialsList = new ArrayList<>();

    public Materials(String title, String author) {

        this.title = title;
        this.author = author;
        materialsList.add(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    public void findMaterials(String materialsTitle) {
        boolean found = false;
        for (Materials material : materialsList) {
            if (material.getTitle().equalsIgnoreCase(materialsTitle)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Книга " + materialsTitle + " Есть в наличии");
        } else {
            System.out.println("Книга " + materialsTitle + " На данный момент отсутствует в библиотеке");
        }
    }

    public void removeMaterials(String materialsTitle) {
        Materials materialToRemove = null;
        for (Materials material : materialsList) {
            if (material.getTitle().equalsIgnoreCase(materialsTitle)) {
                materialToRemove = material;
                break;
            }
        }
        if (materialToRemove != null) {
            materialsList.remove(materialsTitle);
            System.out.println("Книга " + materialsTitle + " Успешно удалена из библиотеки");
        } else {
            System.out.println("Книга " + materialsTitle + " не найдена в библиотеке");
        }
    }
public void addMaterials(String materialsTitle){
        Materials materialsToAdd = null;
        for (Materials material : materialsList){
            if (material.getTitle().equalsIgnoreCase(materialsTitle)){
                materialsToAdd = material;
                break;
            }
        }if (materialsToAdd == null){
            materialsList.add(materialsToAdd);
        System.out.println("Книга успешно добавлена в библиотеку " + materialsTitle);
    }else {
        System.out.println("Данная книга уже есть в библиотеке " + materialsTitle );
    }
}
}
