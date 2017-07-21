package assignment9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
class HDTV  
{
	String BrandName;
	int size;
	public HDTV(String brandName, int size) 
	{
		super();
		BrandName = brandName;
		this.size = size;
	}
}
class sizeComparator implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		int i=0;
		HDTV h1 = (HDTV) o1;
		HDTV h2 = (HDTV) o2;
		if(h1.size<h2.size)
			i=-1;
		else if(h1.size>h2.size)
			i=1;
		else if(h1.size ==h2.size)
			i=0;
		return i;		
	}		
}
public class Assignment9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDTV h1 = new HDTV("Sony",40);
		HDTV h2 = new HDTV("Samsung",50);
		HDTV h3 = new HDTV("LG",35);
		HDTV h4 = new HDTV("Panasonic",60);
		
		ArrayList<HDTV> tvList = new ArrayList<HDTV>();
		tvList.add(h1);
		tvList.add(h2);
		tvList.add(h3);
		tvList.add(h4);
		
		Collections.sort(tvList,new sizeComparator());
		System.out.println("Sorted based on size");
		System.out.println("Brandname  Size");
		Iterator itr=tvList.iterator();  
		while(itr.hasNext())
		{  
			HDTV hd=(HDTV)itr.next();  
			System.out.println(hd.BrandName+ "  "+ hd.size  );  
		}  
	}

}
