package com.linkedlist;

public class LinkList {
    private LinkNode first;
    private LinkNode last;

    public LinkList() {
        this.first = null;
        this.last = null;
    }

    /*
    * check LinkList is empty or not
    * @return true if empty, false is not
    */
    public boolean isEmpty() {
        return first == null && last == null;
    }

    /*
    * append a new element to linked list
    * @param data Integer
    */
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

    /*
    * remove element tail element
    */
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
    * remove element has value greater than input
    * @param value
    */
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
