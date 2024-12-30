public class App {
    public static void main (String [] args) {
Autor nabokov = new Autor("Владимир", "Набоков");
        System.out.println("Имя: "+nabokov.getName());
        System.out.println("Фамилия: "+nabokov.getSurname());

        Book lolita = new Book("Лолита", nabokov, 1955);
        System.out.println("Книга " + lolita.getTitle());
        System.out.println("Автор " + nabokov);
        System.out.println("Год издания " + lolita.getPublicationDate());
        System.out.println(lolita);
    }
}
