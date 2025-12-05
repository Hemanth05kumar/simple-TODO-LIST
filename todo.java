import java.util.ArrayList;
import java.util.Scanner;

public class todo{
    private static ArrayList<String> tasks= new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) { 
            displaymenu();

            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    addtask();
                    break;
                case 2:
                    viewtasks();
                    break;
                case 3:
                    marktaskcomplete();
                    break;
                case 4:
                    deletetask();
                    break;
                case 5:
                    System.err.println("exiting...Goodbye!");
                    return;
                    default:
                        System.err.println("invalid choice please try again.");
            }


        }
    }
    public static void displaymenu(){
        System.out.println("\n....TODO List Menu...");
        System.out.println("1. Add task");
        System.out.println("2. View task");
        System.out.println("3. Mark asa complete");
        System.out.println("4. Delete task");
        System.out.println("5. Exit");
        System.out.println("Enter your choice");

    }
    public static void addtask(){
        System.out.println("Enter the task");
        String task = scan.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully");

    }
    public static void viewtasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks available");
            return;
        }
        System.out.println("\n...Your tasks are...");
        for(int i=0;i<tasks.size();i++){
            System.out.println((i+1)+"."+tasks.get(i));

        }

    }
    public static void marktaskcomplete(){
        if(tasks.isEmpty()){
            System.out.println("No tasks  available");
            return;
      }
        viewtasks();
        System.out.println("Enter the task number to mark as complete:");
        int tasknumber =scan.nextInt();
        scan.nextLine();

        if(tasknumber<=0 || tasknumber>tasks.size()){
            System.out.println("invalid task number.");
        }
        else{
            String completedtask =tasks.get(tasknumber-1)+"[completed]";
            tasks.set(tasknumber-1, completedtask);
            System.out.println("task marked as complited!");
        } 
             
       

    }
    public static void deletetask(){
           if(tasks.isEmpty()){
            System.out.println("No tasks  available");
            return;
      }
        viewtasks();
        System.out.println("Enter the task number to delete:");
        int tasknumber =scan.nextInt();
        scan.nextLine();

        if(tasknumber<=0 || tasknumber>tasks.size()){
            System.out.println("invalid task number.");
        }
         else{
          tasks.remove(tasknumber-1);
          System.out.println("task deleted successfully.");
        } 
              
       
    }

}