import java.util.Scanner; 
public class Midelement_LinkedList
{
	Nodes head;  // head of entire list 
	  
    
    class Nodes //LinkedList
    { 
        int data; 
        Nodes next; 
        Nodes(int d) 
        {
        	data = d; 
        	next = null; 
        } 
    } 
	 public void appendlist(int new_data) 
	    { 
	        Nodes node_new = new Nodes(new_data); 
	  
	        /*  checking whether is there any element in the list if non make the new node as head  */
	        if (head == null) 
	        { 
	            head = new Nodes(new_data); 
	            return ; 
	        } 
	  
	        /*  making the last node next as
			 null 
	           */
	        node_new.next = null; 
	  
	        
	        Nodes last = head; 
	        while (last.next != null) //repeating till it the end of the list
	            last = last.next; 
	        last.next = node_new; 
	     
	        return ; 
	    } 
	 public void displaylist(int mid) //Function used Display the Middle Element
	 { 
	        Nodes temp_node = head;
	        int count=0;
	        while (temp_node != null)

	        { 
	        	count++;
	        	if(count==mid)
	        	{
	        		System.out.print(temp_node.data); //printing the mid value
	        		break;	        	
	        	}
	            temp_node = temp_node.next;
	        } 
	  } 
	 

	public static void main(String[] args) 
	{	
		
			Midelement_LinkedList middle=new Midelement_LinkedList();
		   	Scanner sc=new Scanner(System.in);
		        int num=sc.nextInt();
			int mid=0;
		        for(long i=0;i<num;i++)
		        {
		        	int a=sc.nextInt();
		        	middle.appendlist(a);// appending the list
		        }
		        mid=num/2+1;
		        System.out.print("mid value is" + mid); 
		        middle.displaylist(mid);
		        
		        sc.close();	        
	}
	

}