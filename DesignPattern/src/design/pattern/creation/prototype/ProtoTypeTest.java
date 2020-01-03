package design.pattern.creation.prototype;

public class ProtoTypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Maharashtra books ");
		bs.loadData();
		BookShop bookShop = bs.clone();
		bookShop.setShopName("India Books ");
		bs.listOfBooks.remove(0);
		System.out.println(bs);
		System.out.println(bookShop);
	}

}
