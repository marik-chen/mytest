package a_class;

import org.junit.Test;

/**
 * @author 陈世雄
 * @Description:通过类名.class获取对象
 * @date 2020/6/4 16:25
 */
public class GetClassDemo1 {
    /**
     * 方式一：通过类名.class获取
     */
    @Test
    public void Test01(){
        Class<Student> clazz = Student.class;
        System.out.println ( "clazz = " + clazz );
    }
    /**
     *通过Object类的成员方法getclass()方法获取
     */
    @Test
    public void Test02(){
        Class<? extends Student> clazz = new Student ( ).getClass ( );
        System.out.println ( "clazz = " + clazz );
    }
    /**
     * 通过class.formame("全限定名")方法获取
     */
    @Test
    public void Test03() throws ClassCastException, ClassNotFoundException {
        Class<?> clazz = Class.forName ( "a_class.Student" );
        System.out.println ( "clazz = " + clazz );

    }
}

