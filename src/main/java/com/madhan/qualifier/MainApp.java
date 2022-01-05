/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class MainApp {

public static void main(String[] args) {

    ApplicationContext apCnxt = new ClassPathXmlApplicationContext("Beans.xml");
    Profile prf = (Profile) apCnxt.getBean("profile");
    prf.printAge();
    prf.printName();

}
}
