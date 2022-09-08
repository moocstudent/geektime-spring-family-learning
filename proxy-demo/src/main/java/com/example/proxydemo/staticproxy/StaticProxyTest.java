package com.example.proxydemo.staticproxy;

import com.example.proxydemo.subject.SafeSubjectImpl;
import com.example.proxydemo.subject.SubjectImpl;

public class StaticProxyTest {

    public static void main(String[] args) {
        //虽然这个对象被放置在堆中，但是这个对象不会被其他线程访问到，也是线程安全的。
        createSafeSubject();
        //创建实际对象 (类实例对象进入堆中，对象引用被私有进程Java栈独享
        SubjectImpl subject = new SubjectImpl();
        //把实际对象封装到代理对象中
        StaticProxy p = new StaticProxy(subject);
        //执行main中方法，创建新的栈帧囊括该方法，压入栈顶。
        p.request();

    }

    /**
     * 如果在方法里创建了一个对象实例，这个对象实例如果没有被方法返回或者放入某些外部的对象容器中的话，
     * 也就是说这个对象的引用没有离开这个方法，虽然这个对象被放置在堆中，
     * 但是这个对象不会被其他线程访问到，也是线程安全的。
     */
    public static void createSafeSubject(){
        SafeSubjectImpl safeSubject = new SafeSubjectImpl();
    }
}
