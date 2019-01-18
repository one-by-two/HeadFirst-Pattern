import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseIterator implements Iterator{

	ArrayList items;
	int position = 0;
	
	public PancakeHouseIterator(ArrayList items) {
		this.items = items;
	}

	public boolean hasNext() {
		if(position >= items.size() || items.get(position) == null) {
			return false;
		}else {
			return true;
		}
	}

	public Object next() {
		MenuItem menuItem = (MenuItem) items.get(position);
		position++;
		return menuItem;
	}

}
