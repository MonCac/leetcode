package a_daily_topic;

// 判断句子是否为全字母句

public class No_1832 {
    public boolean checkIfPangram(String sentence) {
        int[] pangram = new int[26];
        for (int i = 0; i < 26; i++){
            pangram[i] = 1;
        }
        int a = 26;
        for (int i = 0; i < sentence.length(); i++){
            if (pangram[sentence.charAt(i) - 'a'] == 1){
                a--;
                if (a == 0){
                    return true;
                }
                pangram[sentence.charAt(i) - 'a']--;
            }
        }
        return false;
    }
}
