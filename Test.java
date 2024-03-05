public class Test {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Great Days", "Melike Telef", "1234567890"));
        library.addBook(new Book("Great Weeks", "Ege Bagcivan", "0987654321"));

        System.out.println("Books found: " + library.searchBooks("Days").size());

        boolean checkout = library.checkoutBook("1234567890");
        System.out.println("Book checked out:" + checkout);

        boolean returned = library.returnBook("1234567890");
        System.out.println("Book returned:" + returned);
    }

}
