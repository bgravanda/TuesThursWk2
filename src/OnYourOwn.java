import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class OnYourOwn {
    public static void main(String[] args) throws IOException{
        var names = new ArrayList<String>();
        var numbers = new ArrayList<Integer>();
        var  filename = "TestData.txt";
        var filePath = Paths.get(filename);
        var allLines = Files.readAllLines(filePath);
        for (var line: allLines){
            var splitLine= line.split(",");
            names.add(splitLine[0]);
            numbers.add(Integer.parseInt(splitLine[1]));

        }
        for (int i = 0; i< names.size(); i++){
            System.out.println("Student " + names.get(i) + " has Jersey number " + numbers.get(i));

        }
    }
}
