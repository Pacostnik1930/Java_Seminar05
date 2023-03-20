import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;;
// Написать метод ,который перведет число из римского формата записи в арабский 
// Например MMXXII = 2022 

public class Task01 {
    public static void main(String[] args) {
        reformatNumber();
        romanianNumber();
    }

    public static Integer reformatNumber() {
        Map<String,Integer> romanianNumber = romanianNumber();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число римского формата: ");
        String rom = in.nextLine();
        int result = 0;
        for (int i = 0; i < rom.length()-1; i++) {
            int current = romanianNumber.get(Character.toString((rom.charAt(i))));
            int next = romanianNumber.get(Character.toString((rom.charAt(i + 1))));
            if(current<next){
                result -=current;
            }
            
            else{
                result +=current;
            }
        }
        result += romanianNumber.get(Character.toString((rom.charAt(romanianNumber().size()))));
        System.out.println(result);
        return result;
        
    }

    public static Map<String, Integer> romanianNumber() {
        Map<String, Integer> romNumber = new HashMap<>();
        romNumber.put("M", 1000);
        romNumber.put("X", 10);
        romNumber.put("I", 1);
        romNumber.put("V", 5);
        romNumber.put("L", 50);
        romNumber.put("C", 100);
        romNumber.put("D", 500);
        return romNumber;
    }

}