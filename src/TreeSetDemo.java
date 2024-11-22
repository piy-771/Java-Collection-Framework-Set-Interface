import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class TreeSet1{
    Set set = new TreeSet();
    public void addRecord(Object object){
        set.add(object);
        //System.out.println(set);
    }

    public  void viewRecord(){
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
    }

    public void remove(int data){
        set.remove(data);
    }


    public void searchRecord(int data){
        if(set.contains(data)){
            System.out.println(data + " found");
        }else{
            System.out.println(data + " not found");
        }
    }

    public void removeAll(){
        set.clear();
        System.out.println(set);
        if(set.isEmpty()){
            System.out.println("Set is empty");
        }
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet1 obj = new TreeSet1();
        obj.addRecord(50);
        obj.addRecord(40);
        obj.addRecord(700);
        obj.addRecord(250);
        obj.addRecord(700);
        obj.viewRecord();
        obj.searchRecord(250);
        obj.remove(250);
        obj.searchRecord(250);
        obj.removeAll();

    }
}
