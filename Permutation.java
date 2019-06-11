import java.util.*;
class Permutation {
    public static void main(String[] args) {
      String str1 = "permutations";
      String str2 = "tionstapermu";
      if(perm(str1,str2)){
        System.out.println("Strings are permutation of each other");
        return;
      }
      System.out.println("No permutation found between the two strings");
    }
    
    public static boolean perm(String string1, String string2){
      int value = 1;
      Map<String,Integer> checkPerm = new HashMap<String,Integer>();
      int count = 0;
      if(string1.length() != string2.length())
        return false;
      for(int i=0; i<string1.length(); i++){
        if(checkPerm.containsKey(String.valueOf(string1.charAt(i)))){
          count =  checkPerm.get(String.valueOf(string1.charAt(i)))+1;
          checkPerm.put(String.valueOf(string1.charAt(i)),count);
          // System.out.println(string1.charAt(i)+ " "+count);
  
        }
        else
           checkPerm.put(String.valueOf(string1.charAt(i)),value);
        // for(Map.Entry<String,Integer> entry : checkPerm.entrySet())
        // System.out.println(entry.getKey()+" "+entry.getValue());
        // System.out.println("\n");
      }
      
      
       
      for(int i=0; i<string2.length(); i++){
        if(checkPerm.containsKey(String.valueOf(string2.charAt(i)))){
          count = checkPerm.get(String.valueOf(string2.charAt(i)))-1;
          checkPerm.put(String.valueOf(string2.charAt(i)),count);
        }
        else
           checkPerm.put(String.valueOf(string2.charAt(i)),value);
      }
      for(Map.Entry<String,Integer> entry : checkPerm.entrySet())
        System.out.println(entry.getKey()+" "+entry.getValue());
      for(Map.Entry<String,Integer> entry : checkPerm.entrySet()){
        if(entry.getValue() != 0)
          return false;
      }   
      
      
    return true;
    }
  }
  
  
  