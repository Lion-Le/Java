import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 使用正規表示式(Regex)驗證Email格式 
 */
public class RegexExample {
    public static void main(String[] args) {
        // 需要驗證的字串
        String email = "lion@example.com";
        String emailIncorrect = "lionexample.com";

        // 定義檢核是否為email格式的正規表示式
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // 編譯與建立正規表示式物件
        Pattern pattern = Pattern.compile(emailRegex);
        
        // 判斷email是否匹配成功
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println(email + " - 格式正確");
        } else {
            System.out.println(email + " - 格式不正確");
        }
        
        // 判斷emailIncorrect是否匹配成功
        matcher = pattern.matcher(emailIncorrect);
        if (matcher.matches()) {
            System.out.println(emailIncorrect + " - 格式正確");
        } else {
            System.out.println(emailIncorrect + " - 格式不正確");
        }
    }
}
