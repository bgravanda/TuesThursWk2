import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        var studentNames = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponce = "";
        while(!userResponce.equals("done")){
            System.out.print("Enter next mane or 'done' to end:");
            userResponce = reader.nextLine();
            if (!userResponce.equals("done")){
                studentNames.add(userResponce);

            }
        }
        System.out.println("The students in your class are:");
        for (var Name: studentNames){
            System.out.println(Name);
        }
    }
}
