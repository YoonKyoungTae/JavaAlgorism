package com.company.datastructure;

/**
 * Created by admin on 2017-02-11.
 */
public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {

        private Object data;
        private Node next;

        public Node(Object obj) {
            this.data = obj;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void add(int index, Object input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node beforeNode = node(index - 1);       // 입력하려는 index의 바로앞 node를 가져온다.
            Node indexNode = beforeNode.next;               // 그 노드의 next또한 받아둔다.

            Node nowNode = new Node(input);
            nowNode.next = indexNode;                       // 생성한 새로운 node의 next는 beforeNode.next 가 된다.

            beforeNode.next = nowNode;

            size++;

            if (nowNode.next == null) {                     // 이 노드가 마지막 노드라면 tail을 변경해준다.
                tail = nowNode;
            }
        }
    }

    public void addFirst(Object input) {
        Node node = new Node(input);
        node.next = head;               // 이 노드의 다음 노드로 head를 지정한다.
        head = node;                    // 이 다음의 올 노드의 head로 현재 생성한 node를 지정해 주기 위해 head를 변경한다.
        size++;                         // 배열의 사이즈 ++

        if (node.next == null) {        // 다음 노드가 존재하지 않는다면 (즉, 1개짜리 노드) tail과 head는 같아야 한다.
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node node = new Node(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = node;           // 현재 tail의 next로 방금 생성한 node를 넣어준다
            tail = node;                // 새로운 tail의 갱신
            size++;                     // 배열의 사이즈 ++
        }
    }

    public Object remove(int index) {
        if (index == 0) {
            return removeFirst();
        } else {
            Node frontNode = node(index - 1);
            Node indexNode = frontNode.next;
            frontNode.next = indexNode.next;
            Object returnData = indexNode.data;

            if (indexNode == tail) {
                tail = frontNode;
            }

            indexNode = null;
            size--;
            return returnData;
        }
    }

    public Object removeFirst() {
        Node removeNode = head;
        Object returnData = removeNode.data;
        head = removeNode.next;                 // 기존의 head를 버리고 head.next를 가져와 새로운 head로 지정해준다.
        removeNode = null;
        size--;
        return returnData;
    }

    public Object removeLast() {
        return remove(size - 1);        // 마지막 데이터를 삭제할 때 tail을 삭제하는것은 head부터 차례대로 접근하기 때문에 최악의 경우이다.
    }

    public int indexOf(Object value) {
        int returnValue = 0;
        Node node = head;
        while (node.data != null) {
            if (node.data.equals(value)) {
                return returnValue;
            }
            returnValue++;
            node = node.next;

            if (node == null) {
                return -1;
            }
        }

        return -1;
    }


    public Object get(int index) {
        Node data = node(index);
        return data.data;
    }

    public int size() {
        return size;
    }

    private Node node(int index) {      // 받은 인덱스의 해당하는 node를 head 부터 찾아서 반환해준다.
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public String toString() {

        if (head == null) {
            return "[]";
        }

        Node firstNode = head;
        String val = "[";

        while (firstNode.next != null) {
            val += firstNode.data + ", ";
            firstNode = firstNode.next;
        }

        val += firstNode.data;
        return val + "]";
    }
}
