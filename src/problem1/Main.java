package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main implements Comparable<Marketing>{

	@Override
	public int compareTo(Marketing mObj) {
		Marketing m=(Marketing)mObj;
		if(m.getEmployeename().compareTo(mObj.getEmployeename())!=0)
			{
				return m.getEmployeename().compareTo(mObj.getEmployeename());
			} 
		else if (m.getProductname().compareTo(mObj.getProductname())!=0)
		{
			return m.getProductname().compareTo(mObj.getProductname());
		}
	return Double.valueOf(m.getSalesamount()).compareTo(Double.valueOf(mObj.getSalesamount()));
	}
	
	public static void main(String[] args) {
	/*	List<Marketing> M=new ArrayList<>();
		M.add(new Marketing("Messi","Mobile",7000));
		M.add(new Marketing("Mengistu","Laptop",1000));
		M.add(new Marketing("Iniesta","Tablet",150));
		M.add(new Marketing("Abebe","ipod",60));
		M.add(new Marketing("kebebushe","TV",2000));
		M.add(new Marketing("Worku","Blue-ray",650));*/
		
		
		Marketing[] Marray={new Marketing("Messi","Mobile",7000)
		,new Marketing("kebebushe","TV",2000)
			,new Marketing("Mengistu","Laptop",1000)
			,new Marketing("Mengistu","Laptop",1200)
			,new Marketing("Mengistu","Laptop",1300)
			,new Marketing("Mengistu","Laptop",800)
			,new Marketing("Iniesta","Tablet",150)
			,new Marketing("Abebe","ipod",60)
			,new Marketing("Worku","Blue-ray",650)};
		
		List<Marketing> M=Arrays.asList(Marray);
		
		System.out.println("Number of Sales before removing " + M.size() + " " + M.toString());
	//	M.remove(M.get(5));
		System.out.println("Number of Sales after removing Abebe and Kebebushe " + M.size() + " " + M.toString());
		M.set(3, new Marketing("Alemu","stove",40));
		System.out.println("Number of Sales M.set(3, new Marketing(Alemu,stove,40)) \n" + M.size() + " " + M.toString());
		System.out.println("Number of Sales " + M.size());
	
		comparatorClass mComp=new comparatorClass();
		
		Collections.sort(M,mComp.MarketingNameComparator);
		System.out.println(M);
		System.out.println("Greater than 100 \n");
		System.out.println(listMoreThan1000(M));
	}
	public static List<Marketing> listMoreThan1000(List<Marketing> list){
	
		comparatorClass mComp=new comparatorClass();
		List<Marketing> listMoreThan1000=new ArrayList<>();
		for(Marketing m:list)
		{
			if(m.getSalesamount()>1000)
			{
				listMoreThan1000.add(m);
			}
		}
		//listMoreThan1000.sort((m1, m2) -> m1.getEmployeename().compareTo(m2.getEmployeename())); 
		listMoreThan1000.sort((m1, m2) ->(int)(m1.getSalesamount()-m2.getSalesamount()));
		//Collections.sort(listMoreThan1000,mComp.compareTo());
		return listMoreThan1000;
		 
		}

}
