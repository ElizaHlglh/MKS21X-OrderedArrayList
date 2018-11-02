import java.ulti.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){

  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public String set(int index, T value) {

  }

  public boolean add(T value){
    if (value.equals(null)) {
      throw new IllegalArgumentException("Can't add null");
    }
    else{
      super.add(value);
      return true;
    }
  }

  public void add(int index, String word){

  }
}
