package com.zyq.comm;

import java.util.Collection;
import java.util.Iterator;
/**
 * ����String������
 * @author ֣����
 *
 */
public class StringUtil {
	//�ո��� 0-10
    private static final String[] padding = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          "};
    /**
     * ����ʹ��
     * @param width ��� ����0
     * @return �ո���
     */
    public static String padding(int width) {
        if (width < 0)
            throw new IllegalArgumentException("��ȱ������0");

        if (width < padding.length)
            return padding[width];

        char[] out = new char[width];
        for (int i = 0; i < width; i++)
            out[i] = ' ';
        return String.valueOf(out);
    }
    /**
     * ��һ�������������ָ���ָ���
     * @param collect ����
     * @param sep �ָ���
     * @return �����ַ���
     */
    public static String join(Collection collect, String sep) {
        return join(collect.iterator(), sep);
    }
    public static String join(Iterator it, String sep) {
        if (!it.hasNext())
            return "";

        String start = it.next().toString();
        if (!it.hasNext()) // ֻ��һ��Ԫ�أ�ֱ����������⽨��StringBuilder
            return start;

        StringBuilder sb = new StringBuilder(64).append(start);
        while (it.hasNext()) {
            sb.append(sep);
            sb.append(it.next());
        }
        return sb.toString();
    }
    /**
     * Unicode�Ĵ���㣬�ж��Ƿ�Ϊ�հ�
     * @param c �ַ����
     * @return �հ�Ϊ��
     */
    public static boolean isWhitespace(int c){
        return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';
    }
    /**
     * �ж�һ���ַ����Ƿ�Ϊ�ջ���Ϊ�հ�
     * @param string �����ַ���
     * @return Ϊ�հ׷���true�����򷵻�����
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
     * �ж��ַ����Ƿ�Ϊ����
     * @param string �����ַ���
     * @return ���Ϊ�������ַ���Ϊ��
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
