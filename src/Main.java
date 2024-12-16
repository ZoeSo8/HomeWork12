//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задание
//Напишите небольшой библиотечный справочник, где хранится информация о книгах.
//Рекомендуем создать отдельный класс, например с именем
//Main или App, в нем объявить метод main и в нем протестировать работу вашего кода.

//Создайте класс Book, который будет содержать в себе данные о названии, авторе и годе публикации книги.
//Убедитесь, что типы полей класса Book выбраны правильно: это String, Author и int.
//Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
//Напишите конструкторы для обоих классов, заполняющие все поля.
//Создайте геттеры для всех полей автора и всех полей книги.
//Создайте сеттер для поля «Год публикации» у книги.
//В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор»
//(достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
//Метод main не должен находиться в классах Book и Author.
//
//Создайте отдельный класс для запуска приложения и объявите метод main в нем.
//В том же методе main измените год публикации одной из книг с помощью сеттера.
//Теперь, когда вы изучили геттеры и сеттеры, не оставляйте поля открытыми — то есть без модификатора доступа private.
        Autor nabokov = new Autor("Владимир", "Набоков");
        System.out.println("Имя: "+nabokov.getName());
        System.out.println("Фамилия: "+nabokov.getSurname());

        Book lolita = new Book("Лолита", nabokov, 1955);
        System.out.println("Книга " + lolita.getTitle());
        System.out.println("Автор " + nabokov.getName()+" " + nabokov.getSurname());
        System.out.println("Год издания " + lolita.getPublicationDate());

    Autor gogol = new Autor("Николай", "Гоголь");
        System.out.println("Имя: "+gogol.getName());
        System.out.println("Фамилия: "+gogol.getSurname());

    Book deathSoul = new Book("Мертвые души", gogol, 1835);
        System.out.println("Книга " + deathSoul.getTitle());
        System.out.println("Автор " + gogol.getName() +" " + gogol.getSurname());
        System.out.println("Год издания " + deathSoul.getPublicationDate());
        deathSoul.setPublicationDate(2035);
        System.out.println("Год издания " + deathSoul.getPublicationDate());
}
    }