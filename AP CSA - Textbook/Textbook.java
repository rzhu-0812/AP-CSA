public class Textbook extends Book {
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int bookEdition) {
        super(bookTitle, bookPrice);
        edition = bookEdition;
    }

    public boolean canSubstituteFor(Textbook t) {
        if (this.getTitle().equals(t.getTitle()) && edition >= t.getEdition()) {
            return true;
        }

        return false;
    }

    public int getEdition() {
        return edition;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

}
