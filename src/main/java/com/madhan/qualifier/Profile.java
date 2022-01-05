/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class Profile {

@Autowired
@Qualifier("student2")
private Student studnt;

public Profile() {
}

public void printAge() {
    System.out.println("Age is : " + studnt.getAge());

}

public void printName() {
    System.out.println("Name is : " + studnt.getName());

}
}
