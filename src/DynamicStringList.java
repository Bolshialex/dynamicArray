public class DynamicStringList implements StringList {
    private String[] arr; 
    private int index = -1;

    public DynamicStringList(){
        arr = new String[10];
    }

    public DynamicStringList(int capacity){
          arr = new String[capacity];
     }

    public String get(int var1){
          if(var1 < 0 || var1 >= size())
          {
               throw new IndexOutOfBoundsException("Out of range");
          }
        return arr[var1];
    };

   public void set(int var1, String var2){
     if(var1 < 0 || var1 >= size()){
          throw new IndexOutOfBoundsException();
     }else{
          arr[var1] = var2;
     }
     
   };

   public void add(String var1){

   };

   public String remove(int var1){
     if(var1 < 0 || var1 >= size()){
          throw new IndexOutOfBoundsException();
     }else{
          String removedString = arr[var1];
          for(int i = var1; i < size(); i++){
               arr[i] = arr[i + 1];
          }
          arr[index] = null;
          index--;
          
          return removedString;
     }
   };
   //Amount in current actual array
   public int size(){
        return -1;
   };
   //Amount able to hold
   public int capacity(){
        return -1;
   };
}