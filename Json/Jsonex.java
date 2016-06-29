package crunchify.com.tutorials;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
 
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
 
public class Jsonex {
 
    public static void main(String a[]){
         
        File jsonInputFile = new File("/home/bridgelabz4/jp/file.json");
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Create JsonReader from Json.
            JsonReader reader = Json.createReader(is);
            // Get the JsonObject structure from JsonReader.
            JsonObject empObj = reader.readObject();
            reader.close();
            // read string data
          
            // read json array
            JsonArray arrObj = empObj.getJsonArray("Rice");
            System.out.println("\nDirect Reports:");
            for(JsonValue value : arrObj){
                System.out.println(value.toString());
                
                JsonArray arrObj1 = empObj.getJsonArray("Pulses");
                System.out.println("\nDirect Reports:");
                for(JsonValue value2 : arrObj){
                    System.out.println(value.toString());
            }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}