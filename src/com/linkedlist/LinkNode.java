package com.linkedlist;

public class LinkNode {

    private Integer data;
    public LinkNode next;

    public LinkNode(){

    }

    public LinkNode(Integer data) {
        this.data = data;
        this.next = null;
    }

    public Integer getData() {
        return data;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
