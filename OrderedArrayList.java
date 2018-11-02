import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){

  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int index, T value) {
    return super.set(index,value);
  }

  public boolean add(T value){
    return super.add(value);
  }

  public void add(int index, T value){
    return super.add(index,value);
  }

  public T MaxLoc(T value){
    return 0;
  }

}
