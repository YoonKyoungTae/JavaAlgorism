package com.company.datastructure;

import com.company.util.Log;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 경태 on 2017-02-03.
 */
public class Study170207 implements BaseStudy{

    public void Study170207() {
        // 기본 생성자
    }

    @Override
    public void start() {
        //process01(); //ArrayList의 사용법 01
        //process02();   //ArrayList의 사용법 02
        process03();   //ArrayList 만들어보기

    }

    /**
     * ArrayList는 인덱스를 이용해 add를 하면
     * 그 인덱스의 자리를 만들기 위해서 뒤의 인덱스들을 1칸씩 이동시킨다.
     */
    public void process01() {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        System.out.println(array);

        array.add(2, 1000);

        System.out.println(array);

    }

    /**
     * iterator 의 사용.
     */
    private void process02() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        System.out.println("while 문 시작");
        Iterator it = array.iterator();
        while (it.hasNext()) {
            int value = (int)it.next();
            System.out.println(value);
        }
        System.out.println("while 문 끝");
        System.out.println("for each 문 시작");
        for (int value : array) {
            System.out.println(value);
        }
        System.out.println("for each 문 끝");

    }

    private void process03() {
        Log.dln("My ArrayTest Start");

        MyArrayList list = new MyArrayList();

        Log.dln("List size = " + list.size());
        Log.hr();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.add(2, 1000);

        Log.dln("결과 : " + list);
        Log.dln("size : " + list.size());
        Log.hr();

        list.remove(2);
        Log.dln("결과 : " + list);
        Log.dln("size : " + list.size());
        Log.hr();

        Log.dln("index 2 : " + list.get(2));
        Log.hr();

        Log.dln("value 50의 index : " + list.indexOf(50));
        Log.hr();

        Log.dln("index 0의 값을 1000으로 수정");
        list.modify(0, 1000);
        Log.dln("결과 : " + list);
        Log.hr();

        list.clearAll();
        Log.dln("clear 결과 : " + list);
    }
}












