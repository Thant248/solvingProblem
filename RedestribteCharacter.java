import java.util.HashMap;
import java.util.Map;

class RedestribteCharacter{

    public static void main(String[] args) {
        String[] words = {"abc", "aabc", "bc"};
        System.out.println(solution(words));
    }


    public static boolean solution(String[] words){

        
        Map<Character, Integer> map = new HashMap<>();

        int count = words.length;
       

        for (String word : words ){

            for (char c : word.toCharArray()){
                 
                 map.put(c, map.getOrDefault(c, 0) + 1);
            
            }
        }

        System.out.println(map.values());

        for (int number : map.values()){
            if( number % count != 0){
                return false;
            }
        }
        return true;
    }

}