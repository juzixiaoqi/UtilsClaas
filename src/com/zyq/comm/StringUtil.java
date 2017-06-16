package com.zyq.comm;

import java.util.Collection;
import java.util.Iterator;
/**
 * 这是String工具类
 * @author 郑亚齐
 *
 */
public class StringUtil {
	//空格数 0-10
    private static final String[] padding = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          "};
    /**
     * 布局使用
     * @param width 宽度 大于0
     * @return 空格数
     */
    public static String padding(int width) {
        if (width < 0)
            throw new IllegalArgumentException("宽度必须大于0");

        if (width < padding.length)
            return padding[width];

        char[] out = new char[width];
        for (int i = 0; i < width; i++)
            out[i] = ' ';
        return String.valueOf(out);
    }
    /**
     * 向一个集合里面插入指定分隔符
     * @param collect 集合
     * @param sep 分隔符
     * @return 返回字符串
     */
    public static String join(Collection collect, String sep) {
        return join(collect.iterator(), sep);
    }
    public static String join(Iterator it, String sep) {
        if (!it.hasNext())
            return "";

        String start = it.next().toString();
        if (!it.hasNext()) // 只有一个元素，直接输出，避免建立StringBuilder
            return start;

        StringBuilder sb = new StringBuilder(64).append(start);
        while (it.hasNext()) {
            sb.append(sep);
            sb.append(it.next());
        }
        return sb.toString();
    }
    /**
     * Unicode的代码点，判断是否为空白
     * @param c 字符编号
     * @return 空白为真
     */
    public static boolean isWhitespace(int c){
        return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';
    }
    /**
     * 判断一个字符串是否为空或者为空白
     * @param string 输入字符串
     * @return 为空白返回true，否则返回其他
     */
    public static boolean isBlank(String string) {
        if (string == null || string.length() == 0)
            return true;

        int l = string.length();
        for (int i = 0; i < l; i++) {
            if (!StringUtil.isWhitespace(string.codePointAt(i)))
                return false;
        }
        return true;
    }
    /**
     * 判断字符串是否为数字
     * @param string 传入字符串
     * @return 如果为纯数字字符串为真
     */
    public static boolean isNumeric(String string) {
        if (string == null || string.length() == 0)
            return false;

        int l = string.length();
        for (int i = 0; i < l; i++) {
            if (!Character.isDigit(string.codePointAt(i)))
                return false;
        }
        return true;
    }
}
