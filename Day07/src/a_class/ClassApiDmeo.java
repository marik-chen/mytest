package a_class;

import org.junit.Test;

/**
 * @author ������
 * @Description:class��������
 * @date 2020/6/4 16:09
 */

public class ClassApiDmeo {
    @Test
    public void test01() throws ClassNotFoundException {
        //�Ȼ�ȡ�ֽ������
        Class<?> Clazz = Class.forName ( "a_class.Student" );
        System.out.println ( Clazz );
        //ͨ���ֽ������ȥ����
        //String getname ����ȡȨ����������������+����
        String name = Clazz.getName ();
        System.out.println ( name );

    }

    /**
     *String getsimplename():��ȡ���Ǽ�������ֻ��������û�а���
     */
   @Test
    public void Test02() throws ClassCastException, ClassNotFoundException {
        //1.�Ȼ�ȡ�ֽ������
        Class<?> clazz = Class.forName ("a_class.Student" );
       String name = clazz.getSimpleName ( );
       System.out.println ( name );

   }
}
