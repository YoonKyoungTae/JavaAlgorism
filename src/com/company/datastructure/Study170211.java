package com.company.datastructure;

import com.company.util.Log;

/**
 * Created by admin on 2017-02-11.
 */
public class Study170211 implements BaseStudy{

    public Study170211() {
        // 기본 생성자
    }

    @Override
    public void start() {
        process();
    }

    private void process() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(100);
        myLinkedList.addLast(200);
        myLinkedList.addLast(300);
        myLinkedList.addFirst(000);
        myLinkedList.addLast(400);
        myLinkedList.addLast(500);
        myLinkedList.addLast(600);
        myLinkedList.addLast(700);
        myLinkedList.addLast(800);
        myLinkedList.addLast(900);

        myLinkedList.add(2, 180);
        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        myLinkedList.remove(3);

        Log.dln(myLinkedList);
        Log.dln(myLinkedList.get(0));
        Log.dln(myLinkedList.size());
        Log.dln(myLinkedList.indexOf(650));

    }

}



