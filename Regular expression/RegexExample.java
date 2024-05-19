import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * �ϥΥ��W��ܦ�(Regex)����Email�榡 
 */
public class RegexExample {
    public static void main(String[] args) {
        // �ݭn���Ҫ��r��
        String email = "lion@example.com";
        String emailIncorrect = "lionexample.com";

        // �w�q�ˮ֬O�_��email�榡�����W��ܦ�
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // �sĶ�P�إߥ��W��ܦ�����
        Pattern pattern = Pattern.compile(emailRegex);
        
        // �P�_email�O�_�ǰt���\
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println(email + " - �榡���T");
        } else {
            System.out.println(email + " - �榡�����T");
        }
        
        // �P�_emailIncorrect�O�_�ǰt���\
        matcher = pattern.matcher(emailIncorrect);
        if (matcher.matches()) {
            System.out.println(emailIncorrect + " - �榡���T");
        } else {
            System.out.println(emailIncorrect + " - �榡�����T");
        }
		
		
		String str = "caabacabcaabbc";
        String regex ="a{2,}b+";
        
        //find()�Bstart()�Bend()
        System.out.println("\nfind()�Bstart()�Bend():");
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        while(matcher.find()) {
        	System.out.println("{" + matcher.start() + ", " + matcher.end() + "}: " 
        			+ str.substring(matcher.start(), matcher.end()));
        }
        
        //replace
        System.out.println("\nreplace():");
        System.out.println(str.replaceAll(regex, "@"));
        
        //split
        System.out.println("\nsplit():");
        for(String splitStr : str.split(regex)) {
        	System.out.println(splitStr);
		}
    }
}
