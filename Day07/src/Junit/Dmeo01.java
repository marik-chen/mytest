package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 陈世雄
 * @Description:
 ** Junit
 * 1.方法必须是公共的
 * 2.返回值必须是void
 * 3.方法不能有任何参数
 * @date 2020/6/4 16:06
 */
public class Dmeo01 {
    @Test
    public  void  test1(){
        System.out.println (" 求和"+(1+1));
    }
    @Before

    public void test2() {
        System.out.println("求商"+(1*1));
    }
    @After
    public void test3(){
        System.out.println ("求积"+(1/1) );

    }
}
