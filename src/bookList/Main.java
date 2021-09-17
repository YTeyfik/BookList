package bookList;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		ArrayList<Book> bookList=new ArrayList<Book>();
		
		Book b1=new Book("Kitap1","Charles Dickens",160,1955);
		Book b2=new Book("Kitap2","Tolstoy",70,1940);
		Book b3=new Book("Kitap3","Dostoyevski",90,1960);
		Book b4=new Book("Kitap4","Edgar Allan Poe",130,1975);
		Book b5=new Book("Kitap5","Louisa May Alcott",180,1935);
		Book b6=new Book("Kitap6","Lewis Carroll",170,1985);
		Book b7=new Book("Kitap7","Mark Twain",250,1995);
		Book b8=new Book("Kitap8","Arthur Conan Doyle",300,1915);
		Book b9=new Book("Kitap9","Jack London",80,1905);
		Book b10=new Book("Kitap10","Virginia Woolf",120,1925);		
	
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		bookList.add(b6);
		bookList.add(b7);
		bookList.add(b8);
		bookList.add(b9);
		bookList.add(b10);
		
		
		HashMap<String,String> bookMap=new HashMap<>();
		bookList.stream()
		.forEach(book -> bookMap.put(book.getBookName(),book.getAuthorName()));
		
		bookMap.entrySet().forEach(element->{
			System.out.println(element.getKey()+" "+ element.getValue());
		});
		System.out.println("-----------------------");
		
		ArrayList<Book> greater100=new ArrayList<Book>();
		bookList.stream()
		.filter(book->book.getPageNum()> 100).forEach(b->greater100.add(b));
		
		System.out.println("Books with more than 100 pages!");
		for (Book element : greater100) {
			System.out.println(element.getBookName()+ " "+ element.getPageNum());
		}
		
		
	}
}
