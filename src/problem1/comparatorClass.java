package problem1;
import java.util.Comparator;
public class comparatorClass implements Comparable<Marketing> {

	@Override
	public int compareTo(Marketing mObj) {
		//Marketing ma=new Marketing();
		
		String EName=mObj.getEmployeename();
		String PName=mObj.getProductname();
		double SAmount=mObj.getSalesamount();
		Marketing m=(Marketing)mObj;
		if(mObj.getEmployeename().compareTo(mObj.getEmployeename())==0)
		{
			if(mObj.getProductname().compareTo(mObj.getProductname())==0)
			{
				return Double.valueOf(mObj.getSalesamount()).compareTo(Double.valueOf(mObj.getSalesamount()));			
			}
		}
			return -1;
	}
	public static int compare(Marketing mObj) {
		//Marketing ma=new Marketing();
		
		String EName=mObj.getEmployeename();
		String PName=mObj.getProductname();
		double SAmount=mObj.getSalesamount();
		Marketing m=(Marketing)mObj;
		if(mObj.getEmployeename().compareTo(mObj.getEmployeename())==0)
		{
			if(mObj.getProductname().compareTo(mObj.getProductname())==0)
			{
				return Double.valueOf(mObj.getSalesamount()).compareTo(Double.valueOf(mObj.getSalesamount()));			
			}
		}
			return -1;
	}
	
	public static Comparator<Marketing> MarketingNameComparator = new Comparator<Marketing>() {
	
	public int compare(Marketing m1, Marketing m2) {
	
		return m1.compareTo(m2);
	}
	
	};
}