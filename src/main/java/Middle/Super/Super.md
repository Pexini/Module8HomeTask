1. <h5> Зачем нужно слово super в java? </h5>

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
}

<p> Ключевое слово super используется для обращения к членам суперкласса (родительского класса) из подкласса (дочернего класса). Оно может быть использовано для вызова конструктора суперкласса, доступа к методам или переменным суперкласса, а также для вызова переопределенных методов из суперкласса. </p>


2. <h5> Есть ли в java множественное наследование? Почему? </h5>
 <p> Множественное наследование дает возможность создать класс, наследованный от нескольких суперклассов. В отличии от некоторых других популярных объектно-ориентированных языков программирования, таких как С++ в Java запрещено множественное наследование от классов. Java не поддерживает множественное наследование классов потому, что это может привести к ромбовидной проблеме.  И вместо того, чтобы искать способы решения этой проблемы, есть лучшие варианты, как мы можем добиться того же самого результата как множественное наследование. </p>

3. <h5> Как объяснить такую конструкцию и почему такое возможно? </h5>

public interface Dog extends Mammal, Anumal{ <br>
}<br>
<br>
В Java множественное наследование не поддерживается в классах, но оно поддерживается в интерфейсах. И один интерфейс может расширять множество других интерфейсов.<br>
Это отлично работает,  потому что интерфейсы только объявляют методы, а реализация будет выполнена в классах, наследующих интерфейс. Таким образом нет никакой возможности получить неоднозначность во множественном наследовании интерфейсов.