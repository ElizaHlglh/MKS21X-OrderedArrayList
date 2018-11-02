import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){

  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Can't set an element as null");
    }
    try {
      return super.set(index,value);
    }
    catch(IllegalArgumentException e){
      System.out.println("Error occur with setting null.");
      return null;
    }
  }

  public boolean add(T value){
    if (value == null) {
      throw new IllegalArgumentException("Can't add null");
    }
    try{
      return super.add(value);
    }
    catch(IllegalArgumentException e){
      System.out.println("Error occur with adding null.");
      return false;
    }
  }

  public void add(int index, T value){
    if (value == null) {
      throw new IllegalArgumentException("Error occur, check the input, no null is allowed");
    }
    try{
      super.add(index,value);
    }
    catch(IllegalArgumentException e){
      System.out.println("Error occur with adding null.");
    }
  }
}
