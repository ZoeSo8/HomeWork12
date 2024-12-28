public class Book {
    private String title;
    private Autor autor;
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
    @Override
    public String toString() {
        return "Название " + this.title + ", Автор " + this.autor + ", Год публикации " +this.publicationDate;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,autor,publicationDate);
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return title.equals(c2.title);
    }
}
