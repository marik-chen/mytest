package a_filed;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author ³ÂÊÀÐÛ
 * @Description:
 * @date 2020/6/7 23:02
 */
public class FildDmeo1 {
    @Test

    public void test01() throws ClassCastException, NoSuchFieldException, ClassNotFoundException {
        Class<?> clazz = Class.forName ( "a_class.Student" );
        //»ñÈ¡×Ö¶Î
        Field name = clazz.getField ( "name" );
        System.out.println ( "name = " + name );
    }
}

