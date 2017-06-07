package com.linkedlist;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        LinkList linkList = new LinkList();
        linkList.append(5);
        linkList.append(1);
        linkList.append(2);
        linkList.append(3);
        linkList.append(4);
        linkList.append(0);
        linkList.append(9);
        linkList.append(10);
        System.out.print("add");
        linkList.removeTail();
        System.out.print("remove tail");
        linkList.removeGreaterThan(1);
        System.out.print("remove greater than 1");
    }
}
