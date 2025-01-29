import java.util.*;

public class ArrayListBag implements Bag {

	List bag = new ArrayList();
	
	@Override
	public void add(Object item) {
		bag.add(item);
	}

	@Override
	public void addAll(Object[] items) {
		for (int i = 0; i < items.length; i++) {
			bag.add(items[i]);
		}
	}

	@Override
	public boolean contains(Object item) {
		if (bag.contains(item) ) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int getCount() {
		return bag.size();
	}

	@Override
	public boolean remove(Object item) {
		if (bag.contains(item)) {
			bag.remove(item);
			return true;
		}
		else {
			return false;
		}
	}

}
