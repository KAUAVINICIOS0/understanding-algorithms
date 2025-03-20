import java.util.ArrayList;
import java.util.List;

public class binSearch {
    public static void main(String []args){
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(9);

        System.out.println(serchBin(myList, 3));  // 1
        System.out.println(serchBin(myList, -1)); // null
    }

    public static Integer serchBin(List<Integer> _list, Integer _item) {
        int low = 0;
        int high = _list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = _list.get(mid);

            if (guess == _item) {
                return mid;
            }
            if (guess > _item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
