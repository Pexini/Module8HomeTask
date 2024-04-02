package Middle.MyLibrary;


public class Main {
    public static void main(String[] args) {


        Books [] books = new Books [] { new Books( "Война и Мир", "Лев толстой"),
                new Books("Мастер и Маргарита","Михаил Булгаков"),
                new Books("Жизнь в займы", "Эрих Мария Ремарк"),
                new Books("Бесы","Фёдор Михайлович Достоевский")};


        Magazines magazines = new Magazines("Мода 2024", "Сергей Красивый");
        Stories stories = new Stories("Наука и жизнь", "Антон Рыбаков");
        Tales tales = new Tales("Девочка и веер", "Марина Полякова");




        System.out.println();
    }

}
