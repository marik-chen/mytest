import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author 陈世雄
 * @Description:
 * @date 2020/6/4 17:30
 */

public class ConstructorDemo {
    @Test
    public void Test01() throws ClassCastException, ClassNotFoundException, NoSuchMethodException {
        Class<?> clazz = Class.forName ( "a_class.Student" );
        //获取公开的无参构造cc
        Constructor<?> constructor1 = clazz.getConstructor ( );
        System.out.println ( "constructor1 = " + constructor1 );

        //获取有参构造
        Constructor<?> constructor2 = clazz.getConstructor (String.class );
        System.out.println ( "constructor2 = " + constructor2 );

    }

}
