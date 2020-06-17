import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @ClassName MD5Test
 * @Description TODO
 * @Author Lin
 * @Date 2020/6/15 18:16
 * @Version 1.0
 */
public class MD5Test {
    public static void main(String[] args) {
        String or = "000000";
        String [] salt = {"10001","10002","10003","10004","10007"};
        for (String s : salt) {
            System.out.println(new Md5Hash(or, s).toString());
        }
    }
}
