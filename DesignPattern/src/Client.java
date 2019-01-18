
public class Client {
	public static void main(String[] args) {
	    Word proxy=new WordProxy("word.txt");
	    proxy.showText();
	    proxy.showImage();
	    proxy.showText();
	}
}
