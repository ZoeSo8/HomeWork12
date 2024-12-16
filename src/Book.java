public class Book {
    private String title;
    Autor autor;
    private int publicationDate;
    public Book (String title, Autor autor, int publicationDate) {
        this.title = title;
        this.autor = autor;
        this.publicationDate = publicationDate;
    }
    public String getTitle() {
        return this.title;
    }
    public int getPublicationDate() {
        return this.publicationDate;
    }
    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}
