package design.pattern.structure.proxy;

public class ProxyTests {

	public static void main(String[] args) {

		WebPageProxy webPageProxy = new WebPageProxy();
		try {
			webPageProxy.renderPage("www.stackoverflow.com");
		} catch (Exception e) {
			System.out.println("Exception : " + e);
			e.printStackTrace();
		}
	}

}
