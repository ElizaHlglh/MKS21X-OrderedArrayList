import java.ulti.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){

  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public String set(int index, String value) {

  }

  public boolean add(String value){
    if (value.equals(null)) {
      throw new IllegalArgumentException(false);
    }
    else{
      super.add(value);
      return true;
    }
  }

  public void add(int index, String word){

  }
}
