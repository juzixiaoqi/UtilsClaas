package com.zyq.comm;
/**
 * 验证类
 * @author 郑亚齐
 *
 */
public final class Validate {
	private Validate() {}
	/**
	 * 为空判定
	 * @param obj 传入对象
	 */
	public static void isNull(Object obj){
		if(obj==null)
			throw new IllegalArgumentException("对象不能为空");
	}
	public static void isNull(Object obj,String msg){
		if(obj==null)
			throw new IllegalArgumentException(msg);
	}
	/**
	 * 为真判定
	 * @param val 判定值
	 */
    public static void isTrue(boolean val) {
        if (!val)
            throw new IllegalArgumentException("输入值必须为真");
    }
    public static void isTrue(boolean val,String msg){
    	if (!val)
            throw new IllegalArgumentException(msg);
    }
    /**
     * 为假判定
     * @param val 判定值
     */
    public static void isFalse(boolean val) {
        if (val)
            throw new IllegalArgumentException("输入值必须为假");
    }
    public static void isFalse(boolean val, String msg) {
        if (val)
            throw new IllegalArgumentException(msg);
    }
    /**
     * 空对象包含判定
     * @param objects 数组
     */
    public static void noNullElements(Object[] objects) {
        noNullElements(objects, "数组内不能出现空对象");
    }
    public static void noNullElements(Object[] objects, String msg) {
        for (Object obj : objects)
            if (obj == null)
                throw new IllegalArgumentException(msg);
    }
    /**
     * 字符串为空判定
     * @param string 输入字符串
     */
    public static void notEmpty(String string) {
        if (string == null || string.length() == 0)
            throw new IllegalArgumentException("字符串不能为空");
    }
    public static void notEmpty(String string, String msg) {
        if (string == null || string.length() == 0)
            throw new IllegalArgumentException(msg);
    }
    /**
     * 强制失败，语法异常
     * @param msg 信息
     */
    public static void fail(String msg) {
        throw new IllegalArgumentException(msg);
    }
}
