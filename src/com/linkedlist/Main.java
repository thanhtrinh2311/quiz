package com.linkedlist;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        /*LinkList linkList = new LinkList();
        linkList.append(5);
        linkList.append(1);
        linkList.append(2);
        linkList.append(3);
        linkList.append(4);
        linkList.append(0);
        linkList.append(9);
        linkList.append(10);
        System.out.print("add");
       // linkList.removeTail();
        System.out.print("remove tail");
        linkList.removeGreaterThan(1);
        System.out.print("remove greater than 1");*/
        //File destFile = new File("C:\\test.csv");
        File file = new File("D:\\CA\\NEB-168\\dataTest\\test.csv");
        if(!file.exists()){
            file.createNewFile();
        }


    }
}
