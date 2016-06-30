package cn.mldn.demo;

import java.lang.reflect.Field;

public class TestDemo {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("cn.mldn.po.Book");
		Object obj = cls.newInstance(); // �������ʵ��������
		Field titleField = cls.getDeclaredField("title");
		titleField.setAccessible(true);//��װȡ����
		titleField.set(obj, "Java����");// �ȼ��ڣ�Book�����.title="Java����";
		System.out.println(titleField.get(obj));// �ȼ��ڣ�Book�����.title
	}
}