package Middle.MyLibrary;

import java.util.Date;

public abstract class Person {
    String fio;
    Date birthday;
    void comeToMylibrary(){
        System.out.println("Пришел в библиотеку");
    }
    abstract void didTheAction();
}
