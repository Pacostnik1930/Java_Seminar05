import java.util.HashMap; 
import java.util.Map; 
 
// Создать структуру для хранения номеров паспортов и фамилий сотрудников организаций 
// 123456 Иванов 
//    321456 Васильев 
//    234561 Петрова 
//    234432 Иванов 
//    654321 Петрова 
//     345678 Иванов 
// Выести данные по сотрудникам с фамилией Иванов 
 
public class Task0 { 
    public static void main(String[] args) { 
        Map<String, String> passports = new HashMap<>(); 
        passports.put("12345", "Иванов"); 
        passports.put("12454657", "Петров"); 
        passports.put("1990", "Иванов"); 
        passports.put("123789", "Васильев"); 
        passports.put("12876", "Петров"); 
        passports.put("123909", "Иванов"); 
 
        // for(String key : passports.keySet()){ 
        // System.out.println(key + " - " + passports.get(key)); 
        // } 
        for (Map.Entry<String, String> entry : passports.entrySet()) { 
            System.out.println(entry + " - " + entry.getValue()); 
        } 
    } 
}