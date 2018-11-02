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
    super.add(index,value);
  }

  public int MaxLoc(T value){
    int loc = 0;
    for (int i = 0; i < super.size(); i++){
      if (super.get(i).compareTo(super.get(loc)) >= 0){
        loc = i;
      }
    }
    return loc;
  }

}
