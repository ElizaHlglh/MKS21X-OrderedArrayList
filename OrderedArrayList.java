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
    index = Loc(value);
    super.add(index+1,value);
  }

  public int Loc(T value){
    int loc = 0;
    for (int i = 0; i < super.size(); i++){
      if (value.compareTo(super.get(i)) >= 0){
        loc = i;
      }
    }
    return loc;
  }

}
