package Middle.MyLibrary;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Books[] books = new Books[]{new Books("Война и Мир", "Лев Толстой"),
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

        System.out.println("Добро пожаловать в главное меню Библиотеки  " + " Всемирная библиотека им. Пушкина ");
        System.out.println("Пожалуйста выберите действия которые вы хотите совершить");
        System.out.println("1. Узнать о списке книг в библиотеке");
        System.out.println("2. Получить книгу");
        System.out.println("3. Вернуть книгу");
        System.out.println("4. Получить читательский билет");

        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Какой раздел библиотеки вас интересует:");
                System.out.println("1. Книги");
                System.out.println("2. Журналы");
                System.out.println("3. Научные истории");
                System.out.println("4. Сказки");
                int userChoice2 = scanner.nextInt();
                switch (userChoice2) {
                    case 1:
                        for (Books book : books) {
                            System.out.println(book.getTitle() + " - " + book.getAuthor());
                        }
                        break;
                    case 2:
                        for (Magazines magazine : magazines) {
                            System.out.println(magazine.getTitle() + " -  " + magazine.getAuthor());
                        }
                        break;

                    case 3:
                        for (Stories storie : stories) {
                            System.out.println(storie.getTitle() + " - " + storie.getAuthor());
                        }
                        break;
                    case 4:
                        for (Tales tale : tales) {
                            System.out.println(tale.getTitle() + " - " + tale.getAuthor());
                        }
                        break;

                }
                System.out.println("Желаете взять что нибудь почитать?");
                System.out.println("1. Да");
                System.out.println("2. Нет");
                System.out.println("3. Вернуться к списку материалов.");
                System.out.println("4. Вернуться в главное меню.");
                ;
                int userChoice3 = scanner.nextInt();
                switch (userChoice3) {
                    case 1: {
                        System.out.println("Введите название: ");
                        scanner.nextLine();
                        String titleToBorrow = scanner.nextLine();
                        boolean found = false;
                        for (Books book : books) {
                            if (book.getTitle().equalsIgnoreCase(titleToBorrow)) {
                                found = true;
                                System.out.println("Желаемая книга выдана " + book.getTitle());


                                break;
                            }
                        }
                    }
                }
        }
    }
}