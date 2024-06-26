1. <h5> Почему в java нет множественного наследования? </h5>

В Java отсутствует множественное наследование из-за нескольких проблем, которые оно может вызвать в процессе разработки и поддержки программного обеспечения:

a. <i> Ромбовидное наследование (Diamond Problem): Множественное наследование может привести к конфликтам имен и реализации методов при наличии классов, которые наследуются от общего родительского класса. Например, если класс A имеет метод doSomething(), классы B и C наследуются от A и реализуют свои собственные версии метода doSomething(), а затем класс D наследуется от B и C, возникает конфликт, когда D пытается вызвать doSomething(): от какого класса он должен унаследовать реализацию? </i>

b. <i> Сложность понимания кода и его поддержки: Множественное наследование может усложнить понимание кода, особенно для новых разработчиков. Когда класс наследует функциональность от нескольких родительских классов, его поведение может зависеть от деталей реализации этих родительских классов, что делает код менее прозрачным. </i>

c. <i> Проблемы при изменении и поддержке кода: Изменение одного из родительских классов может непредсказуемо повлиять на классы-потомки, что может привести к ошибкам и сбоям в работе программы. Это усложняет поддержку кода и может сделать его хрупким. </i>

d. <i> Принцип единственного наследования и интерфейсы: В Java было принято решение предпочесть принцип единственного наследования, поощряя композицию и интерфейсы вместо множественного наследования. Это позволяет классам реализовывать несколько интерфейсов, что обеспечивает гибкость при проектировании и поддержке кода. </i>


2. Вопрос: почему над методами в скомпилированном классе нет аннотации @Override? <br>
В Java 8 и выше, аннотация @Override не обязательна при переопределении методов, которые уже определены в классе Object, такие как toString(), equals() и hashCode().

3. Есть два интерфейса B и C. У каждого есть дефолтный метод default void print(), как показано ниже. Также есть интерфейс А, который реализует оба этих интерфейса. И класс AImpl, который реализует интерфейс А. <br>
Вопрос: что выведет aImpl.print(); ?

Ответ: В данном случае код не скомпилируется из-за конфликта при множественном наследовании интерфейсов B и C, которые содержат метод с одинаковой сигнатурой (одинаковыми именем и параметрами).<br>
<br>
error: types B and C are incompatible;<br>
public interface A extends B, C{
<br> 

interface A inherits unrelated defaults for print() from types B and C <br>
Когда класс AImpl наследует интерфейс A, который в свою очередь наследует интерфейсы B и C, происходит наследование конфликтующих методов print() из интерфейсов B и C. Это приводит к ошибке компиляции, так как компилятор не может определить, какую реализацию метода использовать.<br>

