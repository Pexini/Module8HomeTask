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

    public static int returnToMaterialList(int userChoice) {
        System.out.println("Возвращение в главное меню.");
return userChoice;
    }

    public static int returnToMainMenu(int userChoice) {
        System.out.println("Возвращение в главное меню.");
return userChoice;
    }

    public abstract void addMaterial();

    public abstract void borrowMaterial();

    public abstract int getTotalMaterials();

    public abstract void removeMaterial();

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


}
