package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.taskTwoRestaurantOrderSystem.Receipt;

public class JsonService {

  private static JsonService instance;
  private static Gson GSON;
  private static Path PATH_TO_RECEIPT;

  private JsonService(){
    this.GSON = new GsonBuilder().setPrettyPrinting().create();
    this.PATH_TO_RECEIPT = Paths.get("data/json/orders.json");

  }

  public static JsonService getInstance(){
    if(instance == null){
      instance = new JsonService();
    }
    return instance;
  }
  private static List<Receipt> writeFileReceipts(List<Receipt> newList) {
    Map<String, List<Receipt>> newReceiptMap = new HashMap<>();
    newReceiptMap.put("orders", newList);
    String json = GSON.toJson(newReceiptMap);
    try{
      Files.write(PATH_TO_RECEIPT, json.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return newList;
  }

  private static List<Receipt> readFileReceipts() {
    String json = "";
    try{
      json = Files.readString(PATH_TO_RECEIPT);
    } catch (IOException e){
      e.printStackTrace();
    }
    //return GSON.fromJson(json, new TypeToken<HashMap<String, List<Employee>>>() {}.getType());
    return GSON.fromJson(json, new TypeToken<List<Receipt>>() {}.getType());
  }

}
