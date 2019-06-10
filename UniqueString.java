import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
class Solution {
    public static void main(String[] args) {
      String[] unique = new String[]{"a","d","e","t","h","j"};
      Set<String> checkUnique = new HashSet<String>();
      for(int i=0; i<unique.length; i++){
        if(checkUnique.contains(unique[i])){
          System.out.println("Not Unique");
          return;
        }
           checkUnique.add(unique[i]);
      }
      System.out.println("Unique");
    }
  }
  