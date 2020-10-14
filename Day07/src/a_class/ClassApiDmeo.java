package a_class;

import org.junit.Test;

/**
 * @author 陈世雄
 * @Description:class中其他类
 * @date 2020/6/4 16:09
 */

public class ClassApiDmeo {
    @Test
    public void test01() throws ClassNotFoundException {
        //先获取字节码对象
        Class<?> Clazz = Class.forName ( "a_class.Student" );
        System.out.println ( Clazz );
        //通过字节码对象去操作
        //String getname ；获取权限类名，包含包名+类名
        String name = Clazz.getName ();
        System.out.println ( name );

    }

    /**
     *String getsimplename():获取的是简单类名，只是类名，没有包名
     */
   @Test
    public void Test02() throws ClassCastException, ClassNotFoundException {
        //1.先获取字节码对象
        Class<?> clazz = Class.forName ("a_class.Student" );
       String name = clazz.getSimpleName ( );
       System.out.println ( name );

   }
}
