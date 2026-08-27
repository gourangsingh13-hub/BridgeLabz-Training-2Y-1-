package Arrays.LogicBuilding;
import java.util.ArrayList;

public class LearningArrayList {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,2);
        list.add(1,3);
        list.add(2,7);
        list.add(3,9);
        list.add(3,12);
        list.add(0,100);
    int [] arr=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
