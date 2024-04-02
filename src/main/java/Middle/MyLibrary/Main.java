package Middle.MyLibrary;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Books[] books = new Books[]{new Books("Война и Мир", "Лев толстой"),
                new Books("Мастер и Маргарита", "Михаил Булгаков"),
                new Books("Жизнь в займы", "Эрих Мария Ремарк"),
                new Books("Бесы", "Фёдор Михайлович Достоевский")};


        Magazines[] magazines = new Magazines[]{new Magazines("Мода 2024"),
                new Magazines("Рыбалка и Охота 2022"),
                new Magazines("Лесные грибы"),
                new Magazines("Вяжем в свободное время"),
                new Magazines("Программирование для новичков")};

        Stories[] stories = new Stories[]{new Stories("Наука и жизнь", "Антон Рыбаков"),
                new Stories("Открытия и исследования", "Никита Поддубнов"),
                new Stories("Что будет если?", "Наталья Долгих"),
                new Stories("Я познаю компьютер", "Василий Черных"),
                new Stories("От клавиатуры до монитора", "Стас Серых")};


        Tales[] tales = new Tales[]{new Tales("Девочка и веер", "Марина Полякова"),
                new Tales("Сказка о царе Салтане, о сыне его славном и могучем богатыре князе Гвидоне Салтановиче и о прекрасной царевне Лебеди", "Александр Пушкин"),
                new Tales("Девочка Снегурочка", "Владимир Даль"),
                new Tales("Ветер и Солнце", "Константин Ушинский"),
                new Tales("Умнее всех", "Дмитрий Мамин-Сибиряк."),
                new Tales("Рачья свадьба", "Алексей Николаевич Толстой")};

        System.out.println("Добро пожаловать в Библиотеку им. Давыдова");
        System.out.println( "Пожалуйста выберите действия которые вы хотите совершить: 1. Получить читательский билет; 2. Получить книгу; 3. Вернуть книгу; 4. Узнать о списке книг в библиотеке");
        String userChoice = scanner.nextLine();
if (userChoice == 1){

}

        for (Books book : books) {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }
    }
}
