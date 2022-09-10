import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 统计一个字符串内的每个字符（不包含空格与符号或数字）出现的次数
 * 并且按字母表顺序返回每个字符出现的次数
 * 字符串会是小写形式
 * dinosaurs existed for about 160 million years.
 * <p>
 * 示例：
 * ther
 */
public class CountEveryCharacterTest {
    public static void main(String[] args) {
        String s = "dinosaurs existed for about 160 million years.";
        int[] counts = countEveryCharacterFromStr(s);
        for (int count : counts) {
//            System.out.println(count);
        }

        String sortedByAlphabet = sortedByAlphabet(s);
        System.out.println(sortedByAlphabet);
    }

    /**
     * 计算字母表出现的a-z小写字母存在的次数
     * FIXME如果判定所有符号，ahash不需要定义，hashArr为s.length并且regex不需要定义
     * @param s
     * @return
     */
    public static int[] countEveryCharacterFromStr(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        s = s.replaceAll(" ", "");
        int[] hashArr = new int[26];
        char[] chars = s.toCharArray();
        int ahash = "a".hashCode();
        for (char aChar : chars) {
            String s1 = String.valueOf(aChar);
            if (s1.matches("[a-z]")) {
                int hashCode = s1.hashCode();
                hashArr[hashCode-ahash] += 1;
            }
        }
        for(int i=0;i<hashArr.length;i++){
                System.out.println(((char)(i+ahash))+"字母存在"+hashArr[i]+"个");
        }
        List<Integer> integerList = Arrays.stream(hashArr).filter(i->i!=0).boxed()
                .collect(Collectors.toList());
        int[] result = new int[integerList.size()];
        int idx = 0;
        for (Integer hs : integerList) {
            if (hs != 0) {
                result[idx] = hs;
                idx++;
            }
        }
        return result;
    }

    /**
     * 将句子中a-z拣选并重新排序展示字符串
     * @param s
     * @return
     */
    public static String sortedByAlphabet(String s){
        if (s == null || s.length() == 0) {
            return null;
        }
        s = s.replaceAll(" ", "");
        int[] hashArr = new int[26];
        char[] chars = s.toCharArray();
        int ahash = "a".hashCode();
        for (char aChar : chars) {
            String s1 = String.valueOf(aChar);
            if (s1.matches("[a-z]")) {
                int hashCode = s1.hashCode();
                hashArr[hashCode-ahash] += 1;
            }
        }
        StringBuffer sbf = new StringBuffer();
        for(int i=0;i<hashArr.length;i++){
            System.out.println(((char)(i+ahash))+"字母存在"+hashArr[i]+"个");
            for(int t=0;t<hashArr[i];t++){
                sbf.append((char)(i+ahash));
            }
        }
        return sbf.toString();
    }
}