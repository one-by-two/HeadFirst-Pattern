
public class RealWord implements Word{
    String fileName;
    public RealWord(String fileName) {
		 this.fileName=fileName;
		 loadImage();
	}
	private void loadImage() {
		System.out.println("Load Image Cost 2min");
	}
	@Override
	public void showText() {
		System.out.println("Show Text : RealWord");
	}
	public void showImage() {
		System.out.println("Show Image");
	}
}
