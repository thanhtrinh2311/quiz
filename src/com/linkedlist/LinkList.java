package com.linkedlist;

/**
 * Created by thanhtt17 on 6/6/2017.
 */
public class LinkList {
    private LinkNode first;
    private LinkNode last;

    public LinkList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null && last == null;
    }

    public void append(Integer data) {
        if (null == data) {
            throw new NullPointerException("The input is null");
        }
        LinkNode node = new LinkNode(data);
        if (isEmpty()) {
            last = node;
            first = node;
        } else {
            LinkNode prev = last;
            last = node;
            prev.next = last;
        }
    }

    public void removeTail() {
        if (null == last) {
            return;
        }
        LinkNode prvToTail = first;
        while (prvToTail.next != last) {
            prvToTail = prvToTail.next;
        }

        last = prvToTail;
        last.next = null;
    }

    /*
    * @
    * */
    public void removeGreaterThan(Integer value) {
        if(isEmpty()){
            return;
        }
        LinkNode node = first;
        while (node.next != null) {
            if (node.getData() > value && node == first) {
                first = node.next;
                node = node.next;
            }else {
                LinkNode nextNode = node.next;
                if (nextNode.getData() > value) {
                    node.next = nextNode.next;
                    if(nextNode == last){
                        last = node;
                    }
                }else {
                    node = node.next;
                }
            }
        }
    }
}
