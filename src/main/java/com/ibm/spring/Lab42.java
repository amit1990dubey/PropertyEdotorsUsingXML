package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab42 {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("ibmindia.xml");
        Student stu = (Student) ctx.getBean("student");
        System.out.println("Student BId: "  +stu.getSid().getBid());
        System.out.println("Student Id:" +stu.getSid().getSid());
        System.out.println("Student Name:" +stu.getSname());
        System.out.println("FEE:" +stu.getFee().getFeeBal());
        System.out.println("FEE Bal:" +stu.getFee().getFeeBal());
        System.out.println("Fee Paid:" +stu.getFee().getFeePaid());
        System.out.println("FEE Paid:" +stu.getFee().getTotalFee());
        System.out.println("FEE Email:" +stu.getEmails());
        System.out.println("Phones Number:" +stu.getPhones());
    }
}
