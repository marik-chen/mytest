package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ������
 * @Description:
 ** Junit
 * 1.���������ǹ�����
 * 2.����ֵ������void
 * 3.�����������κβ���
 * @date 2020/6/4 16:06
 */
public class Dmeo01 {
    @Test
    public  void  test1(){
        System.out.println (" ���"+(1+1));
    }
    @Before

    public void test2() {
        System.out.println("����"+(1*1));
    }
    @After
    public void test3(){
        System.out.println ("���"+(1/1) );

    }
}
