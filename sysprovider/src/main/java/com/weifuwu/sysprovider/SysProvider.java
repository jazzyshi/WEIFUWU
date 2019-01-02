package com.weifuwu.sysprovider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jzshi on 2018/12/21.
 */
public class SysProvider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
