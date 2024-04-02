package Middle.MyLibrary;


public class Main {
    public static void main(String[] args) {


        Books books = new Books("Война и Мир", "Лев толстой");
        Books books1 = new Books("Мастер и Маргарита","Михаил Булгаков");

        Magazines magazines = new Magazines("Мода 2024", "Сергей Красивый");
        Stories stories = new Stories("Наука и жизнь", "Антон Рыбаков");
        Tales tales = new Tales("Девочка и веер", "Марина Полякова");


       books.setTitle("Война и Мир");
       books.getAuthor();
       books.getAuthor();

        System.out.println(books.getAuthor() +  " " + books.getTitle() + books.getAuthor());
    }

}
