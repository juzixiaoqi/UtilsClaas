package com.zyq.comm;
/**
 * ��֤��
 * @author ֣����
 *
 */
public final class Validate {
	private Validate() {}
	/**
	 * Ϊ���ж�
	 * @param obj �������
	 */
	public static void isNull(Object obj){
		if(obj==null)
			throw new IllegalArgumentException("������Ϊ��");
	}
	public static void isNull(Object obj,String msg){
		if(obj==null)
			throw new IllegalArgumentException(msg);
	}
	/**
	 * Ϊ���ж�
	 * @param val �ж�ֵ
	 */
    public static void isTrue(boolean val) {
        if (!val)
            throw new IllegalArgumentException("����ֵ����Ϊ��");
    }
    public static void isTrue(boolean val,String msg){
    	if (!val)
            throw new IllegalArgumentException(msg);
    }
    /**
     * Ϊ���ж�
     * @param val �ж�ֵ
     */
    public static void isFalse(boolean val) {
        if (val)
            throw new IllegalArgumentException("����ֵ����Ϊ��");
    }
    public static void isFalse(boolean val, String msg) {
        if (val)
            throw new IllegalArgumentException(msg);
    }
    /**
     * �ն�������ж�
     * @param objects ����
     */
    public static void noNullElements(Object[] objects) {
        noNullElements(objects, "�����ڲ��ܳ��ֿն���");
    }
    public static void noNullElements(Object[] objects, String msg) {
        for (Object obj : objects)
            if (obj == null)
                throw new IllegalArgumentException(msg);
    }
    /**
     * �ַ���Ϊ���ж�
     * @param string �����ַ���
     */
    public static void notEmpty(String string) {
        if (string == null || string.length() == 0)
            throw new IllegalArgumentException("�ַ�������Ϊ��");
    }
    public static void notEmpty(String string, String msg) {
        if (string == null || string.length() == 0)
            throw new IllegalArgumentException(msg);
    }
    /**
     * ǿ��ʧ�ܣ��﷨�쳣
     * @param msg ��Ϣ
     */
    public static void fail(String msg) {
        throw new IllegalArgumentException(msg);
    }
}
