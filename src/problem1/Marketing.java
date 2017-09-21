package problem1;

import java.util.Arrays;
import java.util.Collections;

public class Marketing{
	private String employeename;
	private String productname;
	private double salesamount;
	Marketing(String employeename,String productname,double salesamount)
	{
		this.employeename=employeename;
		this.productname=productname;
		this.salesamount=salesamount;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getSalesamount() {
		return salesamount;
	}
	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}
	
	@Override
	public String toString() {
		/*StringBuilder st=new StringBuilder();
		for(int i=0;i<mark.length;i++)
		{
			st.append("employeename=" + mark[i].getEmployeename() + ","
					+ " productname=" + mark[i].getProductname() + ","
					+ "salesamount= " + mark[i].getSalesamount() + " \n");
		}
		return st.toString();*/
		return "employeename=" + this.getEmployeename() + ", productname="
				+ this.getProductname() + ", salesamount=" + this.getSalesamount() + "\n";
	}
	
	public boolean equal(Marketing mObj)
	{
	String EName=this.getEmployeename();
	String PName=this.getProductname();
	double SAmount=this.salesamount;
	Marketing m=(Marketing)mObj;
	if(this.getEmployeename().equals(mObj.getEmployeename()))
	{
		if(this.getProductname().equals(mObj.getProductname()))
		{
			if(this.getSalesamount()==mObj.getSalesamount())
			{
				return true;
			}
		}
	}
		return false;
	}
	//@Override
	public int compareTo(Marketing mObj) {
		
		String EName=this.getEmployeename();
		String PName=this.getProductname();
		double SAmount=this.salesamount;
		Marketing m=(Marketing)mObj;
		if(this.getEmployeename().compareTo(mObj.getEmployeename())==0)
		{
			if(this.getProductname().compareTo(mObj.getProductname())==0)
			{
				return Double.valueOf(this.getSalesamount()).compareTo(Double.valueOf(mObj.getSalesamount()));			
			}
		}
			return -1;
	}
	
	
}
