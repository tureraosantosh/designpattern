package design.pattern.creation.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	private String shopName;
	List<Book> listOfBooks = new ArrayList<>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	public BookShop() {
		// TODO Auto-generated constructor stub
	}

	public BookShop(String shopName, List<Book> listOfBooks) {
		super();
		this.shopName = shopName;
		this.listOfBooks = listOfBooks;
	}

	public void loadData() {
		for (int i = 0; i <= 10; i++) {

			Book book = new Book(i, "Book" + i);
			listOfBooks.add(book);
		}
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", listOfBooks=" + listOfBooks + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop bs = new BookShop();

		for (Book book : this.listOfBooks) {
			bs.listOfBooks.add(book);

		}
		return bs;
	}

}
