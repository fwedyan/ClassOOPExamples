package m.shapes;

import java.util.Comparator;

public class RectangleSorters {

}
class SortUsingArea implements Comparator <Rectangle>{

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		if (o1.getArea()>o2.getArea())
			return 1;
		if (o1.getArea() == o2.getArea())
			return 0;
		return -1;
	}
	
}
class sortUsingWidth implements Comparator <Rectangle>{

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		if (o1.getWidth() > o2.getWidth())
			return 1;
		if (o1.getWidth() == o2.getWidth())
			return 0;
		return 1;
		
	}
	
}
class sortUsingHeight implements Comparator <Rectangle>{

	@Override
	public int compare(Rectangle o1, Rectangle o2) {
		if (o1.getHeight()>o2.getHeight())
			return 1;
		if (o1.getHeight()==o2.getHeight())
		   return 0;
		return -1;
	}
}

