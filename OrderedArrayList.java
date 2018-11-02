import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){

  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int index, T value) {
    if (index == Loc(value)){
      return super.set(Loc(value),value);
    }
    else{
      T removed = super.get(index);
      super.remove(index);
      super.add(Loc(value)+1,value);
      return removed;
    }
  }

  public boolean add(T value){
    super.add(Loc(value),value);
    return true;
  }

  public void add(int index, T value){
    index = Loc(value);
    super.add(index+1,value);
  }

  public int Loc(T value){
    int loc = 0;
    for (int i = 0; i < super.size(); i++){
      if (super.get(loc).compareTo(super.get(i)) >= 0){
        loc = i;
      }
    }
    return loc;
  }

}
