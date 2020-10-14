package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 陈世雄
 * @Description:
 * @date 2020/6/4 16:07
 */
public class Dmeo02 {
    @After
    public void test3(){
        System.out.println ( "我是后置" );
    }
    @Before
    public void test2(){
        System.out.println ( "前置" );
    }
    @Test
    public void test1(){
        System.out.println ( "普通测试" );
    }
}
