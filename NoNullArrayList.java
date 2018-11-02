import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){

  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int index, T value) {
    if (value.equals(null)) {
      throw new IllegalArgumentException("Can't set an element as null");
    }
    else {
      return super.set(index,value);
    }
  }

  public boolean add(T value){
    if (value.equals(null)) {
      throw new IllegalArgumentException("Can't add null");
    }
    else{
      return super.add(value);
    }
  }

  public void add(int index, T value){
    if (value.equals(null)) {
      throw new IllegalArgumentException("Error occur, check the input, no null is allowed");
    }
    else{
      super.add(index,value);
    }
  }
}
