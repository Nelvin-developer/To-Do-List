package To_Do;

import java.util.Scanner;

public class ToDOList {
         public static void getMenu() {
        	 System.out.println("1. Add Task");
        	 System.out.println("2. View Task");
        	 System.out.println("3. Mark Task as Complete ");
        	 System.out.println("4. Delete Task");
        	 System.out.println("5. Exit");
         }
         public static void main(String[]args) {
        	 System.out.println("=== TO-DO LIST MENU ===");
        	 Scanner sc =new Scanner(System.in);
        	 int i=0;
        	 boolean flag=true;
        	 String task[]= new String[50];
        	 while(flag) {
        	 getMenu();
        	 System.out.print("Enter the option :");
        	 int op=sc.nextInt();
      
        	 switch(op) {
        	 case 1:System.out.print("Enter the task description :");
        	        task[i]="[ ]"+sc.next();
        	        sc.nextLine();
        	        i++;
        	        System.out.println("Task added!");
        	        break;
        	 case 2:System.out.println("Your Task :");
        	 for(int j=0;j<i;j++) {
        		 System.out.println((j+1)+"." +task[j]);
                         	 }
        	     break;
        	 case 3:System.out.print("Enter the number to mark complete :");
        	       int c=sc.nextInt();
        	       task[c-1]="[✓]"+task[c-1].substring(3);
        	       System.out.println(c+"."+task[c-1]);
               System.out.println("Markrd as Compeleted");
        	       break;
        	 case 4:System.out.print("Enter the number to delete the list :");
        	        int d=sc.nextInt();
        	        for (int  j = d-1; j < task.length - 1; j++) {
        	            task[j] = task[j + 1];
        	        } i--;   
        	        break;
        	 case 5: System.out.println("Goodbye! Your tasks will not be saved after exit.");
        	          flag=false;
        	          break;
        	  default :System.out.println("Invalid option !");
        	 }
        	 }
        	 sc.close();
         }
         
}
