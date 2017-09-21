package problem2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
		    	header.previous = n;
		    	header = n;
		}
	}

	public Object getFirst(){
		
		if(this.isEmpty())
		{
			return null;
		}
		else
		{
			return header.value;
		}
	}
	public Object getLast(){
		
		if(this.isEmpty())
		{
			return null;
		}
		else
		{
			Node temp=header;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			return temp.value;
		}
	}
	
	public void addLast(String item) {
		if(header==null)
		{
			header=new Node(null,item,null);		
		}
		else
		{
			Node temp=header;
			Node NodeToBeAddedlast=new Node(null,item,null);
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=NodeToBeAddedlast;
			NodeToBeAddedlast.previous=temp;
		}
	}
	// implement the code
	public void postAddNode(Node n, String value){
			if(value==null)
			{
				return;//Or Null Message
			}
			Node h=header;
			Node PostToBeAddNode=new Node(n,value,n.next);
			if(h.next==n)
			{
				h.next=PostToBeAddNode;
			}
			else
			{
				while(h!=n)
				{
					h=h.next;
				}
				h.next=PostToBeAddNode;
			}
	}
       public int Size(){
    	   int count=0;
    	  
    	   Node h=header;
    	   if(h==null)
    	   {
    		  return 0; 
    	   }
    	   while(h.next!=null)
    	   {
    		   h=h.next;
    		   count++;
    	   }
		return count;
       }

// implement code
    public boolean isEmpty()
	{
    	if(header==null)
    	{
    		return true;
    	}
    	return false;
		
	}  	
	public void preAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.previous == null) {
			//n is the first node
			addFront(value);
		}
		else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}	
					
	}
	
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}
	
	public void deleteList(){
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str =""; 
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
		
	}
	public void removeLast(){
		if(isEmpty())
		{
			System.out.println("There is item in the list");
		}
			Node temp=findLast();
			temp.previous.next=null;
			temp=null;
		}
	public void printMin()
	{
		if(isEmpty())
		{
			System.out.println("No record found!");
		}
		Node temp=header;
		String min=temp.value;
		
		while(temp.next!=null)
		{
			if(min.compareTo(temp.value)==1)
			{
				min=temp.value;
			}
			temp=temp.next;
		}
		System.out.println("Minimum value is " + min);
		
		
	}
	
	public void printMax(){
		if(isEmpty())
		{
			System.out.println("No record found!");
		}
		Node temp=header;
		String max=temp.value;		
		while(temp.next!=null)
		{
			if(max.compareTo(temp.value)==-1)
			{
				max=temp.value;
			}
			temp=temp.next;
		}
		System.out.println("Maximum value is " + max);
		
	}
	public void print(Node header) {
		
		if(header==null)
		{
			System.out.println(" NULL");
		}
		else
		{
			if(header!=null)
			{
				System.out.print(header.value + " ,");
				print(header.next);
				
			}
			
			
		}
		
		
	}
	
	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
		public String toString() {
			return value;
		}
		public void removeFirst(){
			if(header==null)
			{
				System.out.println("There is no element");
			}
		//	Node temp=(Node)getFirst();
			header=header.next;
		}

	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		//mySL.printReverse();
		System.out.println("_______________________Add Blueberry Muffin to First________________________\n");
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		//mySL.printReverse();
		System.out.println("_______________________Add Orange Juice to Last____________________________\n");
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.addLast("Peach Sauce");
		System.out.println("Add Peach Sauce Last " + mySL);
		//mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );
		System.out.println("postAddNode " + mySL);
		//mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );
		System.out.println(mySL);
		//mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce" );
		System.out.println(mySL);
		
		System.out.println("_______________________Get First and Last Node______________________________\n");
		System.out.println("getFirst " + mySL.getFirst());
		System.out.println("getLast " + mySL.getLast());
		
		System.out.println("_______________________Remove Last Node______________________________________\n");
		System.out.print( "removeLast ");
		mySL.removeLast();//Remove last node
		System.out.println(mySL + "\n");
		
		System.out.println("_______________________Get Last Node After last Item__________________________\n");		
		System.out.println("getLast " + mySL.getLast());
		
		System.out.println("Size " + mySL.Size());
		
		System.out.println("_______________________printMin________________________________\n");
		mySL.printMin();
		System.out.println("\n");
		
		System.out.println("_______________________printMax________________________________\n");
		mySL.printMax();
		System.out.println("\n");
	
		//Node myNodeToBePrinted=mySL.new Node(null,"Mengistu",null);
		System.out.println("_______________________print all________________________________\n");
		mySL.print(mySL.header);
		
		
		//mySL.printReverse();
		mySL.deleteList();
		System.out.println(mySL);
		//mySL.printReverse();
		System.out.println("Size " + mySL.Size());
		System.out.println("getFirst " + mySL.getFirst());
		System.out.println("getLast " + mySL.getLast());
		
	}

}
