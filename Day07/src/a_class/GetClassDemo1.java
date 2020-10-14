package a_class;

import org.junit.Test;

/**
 * @author ������
 * @Description:ͨ������.class��ȡ����
 * @date 2020/6/4 16:25
 */
public class GetClassDemo1 {
    /**
     * ��ʽһ��ͨ������.class��ȡ
     */
    @Test
    public void Test01(){
        Class<Student> clazz = Student.class;
        System.out.println ( "clazz = " + clazz );
    }
    /**
     *ͨ��Object��ĳ�Ա����getclass()������ȡ
     */
    @Test
    public void Test02(){
        Class<? extends Student> clazz = new Student ( ).getClass ( );
        System.out.println ( "clazz = " + clazz );
    }
    /**
     * ͨ��class.formame("ȫ�޶���")������ȡ
     */
    @Test
    public void Test03() throws ClassCastException, ClassNotFoundException {
        Class<?> clazz = Class.forName ( "a_class.Student" );
        System.out.println ( "clazz = " + clazz );

    }
}

