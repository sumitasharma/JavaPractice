import java.util.ArrayList;

class ReplaceSpaces {
    public static void main(String[] args) {
      int count = 0;
      int sizeOfArray = 0;
      String strings = "hello  how are you doing.";
      char last = ' ';
      ArrayList<Character> arrayOfCharacters = new ArrayList<Character>();
      for(int i = 0; i < strings.length(); i++){
        arrayOfCharacters.add(strings.charAt(i));
        if(strings.charAt(i) == ' ')
          count++;
      }
      count*=2;
          System.out.println(arrayOfCharacters.size());
  
      sizeOfArray = arrayOfCharacters.size();
      System.out.println(sizeOfArray+count);
      int total = sizeOfArray+count;
      int valueOfK = 0;
      // arrayOfCharacters.ensureCapacity(total);
          // System.out.println(arrayOfCharacters);
  
      ArrayList<Character> temp = new ArrayList<Character>();
      
      last = arrayOfCharacters.get(sizeOfArray-1);
      for(int i = sizeOfArray-1; i>=0; i--){
        temp.add('%');
        temp.add('2');
        temp.add('0');
        if(arrayOfCharacters.get(i) == ' '){
          
          for(int j=i+1; j<=arrayOfCharacters.size()-1; j++){
            temp.add(arrayOfCharacters.get(j));
          }
          arrayOfCharacters.remove(i);
  
          for(int k=0,j=i; k<temp.size() && j<=arrayOfCharacters.size()-1; j++,k++){
            valueOfK = k;
            arrayOfCharacters.set(j,temp.get(k));
          }
          arrayOfCharacters.add(temp.get(valueOfK+1));
          arrayOfCharacters.add(temp.get(valueOfK+2));
          arrayOfCharacters.add(temp.get(valueOfK+3));
        }
                temp.clear();
  
      }
      System.out.println(arrayOfCharacters);
      strings = " ";
      for(int i=0; i<arrayOfCharacters.size(); i++)
        strings += arrayOfCharacters.get(i).toString();
      System.out.println(strings);
    }
    
  }
  
  