package Middle.MyLibrary;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Books> books = new ArrayList<>();
        books.add(new Books("Война и Мир", "Лев Толстой"));
        books.add(new Books("Мастер и Маргарита", "Михаил Булгаков"));
        books.add(new Books("Жизнь в займы", "Эрих Мария Ремарк"));
        books.add(new Books("Бесы", "Фёдор Михайлович Достоевский"));


        ArrayList<Magazines> magazines = new ArrayList<>();
        magazines.add(new Magazines("Мода 2024"));
        magazines.add(new Magazines("Рыбалка и Охота 2022"));
        magazines.add(new Magazines("Лесные грибы"));
        magazines.add(new Magazines("Вяжем в свободное время"));
        magazines.add(new Magazines("Программирование для новичков"));


        ArrayList<Stories> stories = new ArrayList<>();
        stories.add(new Stories("Наука и жизнь", "Антон Рыбаков"));
        stories.add(new Stories("Открытия и исследования", "Никита Поддубнов"));
        stories.add(new Stories("Что будет если?", "Наталья Долгих"));
        stories.add(new Stories("Я познаю компьютер", "Василий Черных"));
        stories.add(new Stories("От клавиатуры до монитора", "Стас Серых"));


        ArrayList<Tales> tales = new ArrayList<>();
        tales.add(new Tales("Девочка и веер", "Марина Полякова"));
        tales.add(new Tales("Сказка о царе Салтане, о сыне его славном и могучем богатыре князе Гвидоне Салтановиче и о прекрасной царевне Лебеди", "Александр Пушкин"));
        tales.add(new Tales("Девочка Снегурочка", "Владимир Даль"));
        tales.add(new Tales("Ветер и Солнце", "Константин Ушинский"));
        tales.add(new Tales("Умнее всех", "Дмитрий Мамин-Сибиряк."));
        tales.add(new Tales("Рачья свадьба", "Алексей Николаевич Толстой"));

        System.out.println("Добро пожаловать в главное меню Библиотеки  " + " Всемирная библиотека им. Пушкина ");
        System.out.println("Пожалуйста выберите действия которые вы хотите совершить");
        System.out.println("1. Узнать о списке книг в библиотеке");
        System.out.println("2. Проверить наличие книги в нашей библиотеке");
        System.out.println("3. Вернуть книгу");


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
                            System.out.println(magazine.getTitle());
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

                int userChoice3 = scanner.nextInt();
                switch (userChoice3) {
                    case 1: {
                        System.out.println("Введите название материала, который хотите взять: ");
                        scanner.nextLine();
                        String titleToBorrow = scanner.nextLine();
                        boolean found = false;
                        for (Books book : books) {
                            if (book.getTitle().equalsIgnoreCase(titleToBorrow)) {
                                found = true;
                                System.out.println("Желаемая книга выдана " + book.getTitle());
                                book.removeMaterials(book.getTitle());
                                break;
                            }
                        }
                        for (Magazines magazine : magazines) {
                            if (magazine.getTitle().equalsIgnoreCase(titleToBorrow)) {
                                found = true;
                                System.out.println("Желаемый журнал выдан " + magazine.getTitle());
                                magazine.removeMaterials(magazine.getTitle());
                                break;
                            }
                        }
                        for (Stories storie : stories) {
                            if (storie.getTitle().equalsIgnoreCase(titleToBorrow)) {
                                found = true;
                                System.out.println("Желаемая история выдана " + storie.getTitle());
                                storie.removeMaterials(storie.getTitle());
                                break;
                            }
                        }
                        for (Tales tale : tales) {
                            if (tale.getTitle().equalsIgnoreCase(titleToBorrow)) {
                                found = true;
                                System.out.println("Желаемая сказка выдана " + tale.getTitle());
                                tale.removeMaterials(tale.getTitle());
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Такой книги в данный момент нет, проверьте правильность выбора книги");
                        }
                        break;

                    }
                    case 2: {
                        System.out.println("Спасибо что заглянули в нашу библиотеку, возвращайтесь скорее.");
                        break;
                    }

                }
                break;
            case 2: {
                System.out.println(" Введите название материала который ищите:");
                scanner.nextLine();
                String titleMaterials = scanner.nextLine();
                boolean found = false;
                for (Books book : books) {
                    if (book.getTitle().equalsIgnoreCase((titleMaterials))) {
                        found = true;
                        System.out.println("Желаемая книга есть в нашей библиотеке ");
                        break;
                    }
                }
                for (Magazines magazine : magazines) {
                    if (magazine.getTitle().equalsIgnoreCase(titleMaterials)) {
                        found = true;
                        System.out.println("Желаемая журнал есть в нашей библиотеке");
                        magazines.remove(magazine);
                        break;
                    }
                }
                for (Stories storie : stories) {
                    if (storie.getTitle().equalsIgnoreCase(titleMaterials)) {
                        found = true;
                        System.out.println("Желаемая история есть в нашей библиотеке");
                        stories.remove(storie);
                        break;
                    }
                }
                for (Tales tale : tales) {
                    if (tale.getTitle().equalsIgnoreCase(titleMaterials)) {
                        found = true;
                        System.out.println("Желаемая сказка есть в нашей библиотеке");
                        tales.remove(tale);
                        break;
                    }

                }
                if (!found) {
                    System.out.println("Извините данная книга отсутствует, зайдите позже");
                    break;
                }


            }
            case 3: {
                System.out.println("Что бы вы хотели вернуть?");
                System.out.println("1. Книгу.");
                System.out.println("1. Журнал.");
                System.out.println("1. Историю.");
                System.out.println("1. Сказку.");
                int userChoise4 = scanner.nextInt();
                switch (userChoise4) {
                    case 1: {
                        System.out.println("Введите название книги, которую хотите вернуть");
                        scanner.nextLine();
                        String returnedTitleBooks = scanner.nextLine();
                        System.out.println("Введите автора книги");
                        String authorBooks = scanner.nextLine();
                        boolean found = false;
                        for (Books book : books) {
                            if (book.getTitle().equalsIgnoreCase(returnedTitleBooks)) {
                                found = true;
                            System.out.println("Извините данная книга уже находится в библиотеке.");
                            break;
                        }
                    }
                        if (!found) {
                            books.add(new Books(returnedTitleBooks, authorBooks));
                            System.out.println("Спасибо, книга  " + returnedTitleBooks + " " + authorBooks + " " + "Успешно возвращена в библиотеку");

                            break;
                        }
                    }
                    case 2:{
                        System.out.println("Введите название журнала, который хотите вернуть");
                        scanner.nextLine();
                    }

                }
            }
        }
    }
}
