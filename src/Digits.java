import java.util.ArrayList;
public class Digits {
    private ArrayList<Integer> digitList;
    public Digits(int num){
        String number = num + "";
        digitList = new ArrayList<Integer>();
        for (int index = 0; index < number.length(); index++){
            digitList.add(Integer.parseInt(number.substring(index, index + 1)));
        }
    }
    public boolean isStrictlyIncreasing(){
        for (int index = 0; index < digitList.size() - 1; index++){
            if (digitList.get(index) < digitList.get(index + 1)){
            } else {
                return false;
            }
        }
        return true;
    }
}
