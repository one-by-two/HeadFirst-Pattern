
public class WordProxy implements Word {
    String fileName;
    RealWord realWord;
    public WordProxy(String fileName) {
	     this.fileName=fileName;
	}
	@Override
	public void showText() {
		if(realWord!=null) {
			realWord.showText();
		}else 
		System.out.println("Show Text : WordProxy");
	}
   public void showImage() {
	     realize();
	     realWord.showImage();
   }
private void realize() {
	if(realWord==null)   
		realWord=new RealWord(fileName);
}
}
