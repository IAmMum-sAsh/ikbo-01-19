//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

public class ListNode {
    private ListNode next;
    private MenuItem value;

    public ListNode() {}

    public ListNode(ListNode next, MenuItem value) {
        this.next = next;
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public MenuItem getValue() {
        return value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setValue(MenuItem value) {
        this.value = value;
    }
}
