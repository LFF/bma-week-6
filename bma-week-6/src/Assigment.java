import java.sql.Date;


public class Assigment {

	/**
	 *  copy assignment file.
	 *  
	 *  
	 * @param args
	 */
	
		
	         static Task Task;
	         
	         public static String values[] = {"task a", "task b", "task c", "task d", "task e"};
	         
	         
	public static void main(String[]  args) {
		
			
		   String  stringindex =  args[1];
		   
		   Integer indx = Integer.valueOf(stringindex);
			     			
		   
			
    		System.out.println(stringindex + "stringindex");	     		
    		
    		System.out.println(indx + "indx");	     		
    		
        	
			
	        
	     		Task = new Task (getElement(values, indx) +  "Task number one to be done");
	     		
	     		
	     		
	    		System.out.println(stringindex + "stringindex a");	     		
	    		
	    		System.out.println(indx + "indx a");	     		
	    		
	     		
	     		
	     		
	     		System.out.println(Task.toString());	     		
	     		
	     		
	     		Task aTask = new Task("Second Task to be done");
	     		
	     			     		
	     		//  Task = new Task();
	     			
	     		System.out.println(aTask.toString());	     		
	     		
	     			     		
	     		
	     	}

	         
	
	
	 static String getElement(String values[]  , int  index) {
		 
		 
		  if  ( index < 0  ||  index  > values.length ) 
			  
			  
			  
		  {		System.out.println("bad index" + index);
			  
		 
		           return null;  }
		  
		  
		  else
			  
		  {
		       	System.out.println("valid index"  + index);
		
		    return values[index];
		 
				
			}
			
	 }
			
	

}




       class Task { 
        	   
        	     String taskDescription;
        		 Date taskDueDate;
        		 String taskStatus;
        		 
        		 
                                Task (String taskDescription)  {
                                	
                                	this.taskDescription = taskDescription;
                                	
                                	
                                	
                                }
                                
                              

								Task ( )
 
                                {
                                	
                                	this.taskDescription = taskDescription;
                                	
                                }
                                
                                
								
								public String toString() {
									
									return "Task - Description: " + taskDescription ;
								
								}	
								
								
								
								
								
								
        	   
           }


