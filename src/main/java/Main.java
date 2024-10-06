import ru.testBookProject.dto.Library;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр библиотеки
        Library library = new Library();

        // Добавляем книгу в библиотеку
        library.addBookToLibraryFromScanner();

        // Можем получить список книг, чтобы убедиться, что книга добавлена
        System.out.println("Количество книг в библиотеке: " + library.getBooks().size());
    }
}
