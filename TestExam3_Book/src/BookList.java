import java.util.ArrayList;

public class BookList {
	private ArrayList<Book> books;

	public BookList(){
		this.books = new ArrayList<Book>(1);
	}

	public int getNumberOfBooks(){
		return books.size();
	}

	public void addBook(Book book){
		books.add(book);
	}

	public Book getBook (int index){
		return books.get(index);
	}

	public Book removeBook(int index){
		return books.remove(index);
	}

	public int getIndexOfFirstPrintedBook(){
		for(int i = 0; i < getNumberOfBooks(); i++){
			if (books.get(i) instanceof PrintedBook){
				return i;
			}
		}
		return -1;
	}

	public int getNumberOfBookByType(String bookType){
		int numberOfBooksByType = 0;
		for (int i = 0; i < getNumberOfBooks(); i++){
			if (books.get(i).getBookType().equals(bookType)){
				numberOfBooksByType++;
			}
		}
		return numberOfBooksByType;
	}

	public Book[] getBooksByType(String bookType){
		Book[] booksByType = new Book[getNumberOfBookByType(bookType)];
		int index = 0;

		for (int i = 0; i < getNumberOfBooks(); i++){
			if (books.get(i).equals(bookType)){
				booksByType[index] = books.get(i);
				index++;
			}
		}
		return booksByType;
	}

	public Ebook[] getAllEBooks(){
		Ebook[] ebooks = new Ebook[getNumberOfBookByType("E-book")];
		int index = 0;

		for (int i = 0; i < getNumberOfBooks(); i++){
			if (books.get(i) instanceof Ebook){
				ebooks[index] = (Ebook) books.get(i);
				i++;
			}
		}
		return ebooks;
	}

	public String toString(){
		return books.toString() + "Number of books: " + getNumberOfBooks() + "Index of the first printed book: " + getIndexOfFirstPrintedBook() + "ALl E-books: " + getAllEBooks();
	}





}
