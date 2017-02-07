package com.company.datastructure;

import com.company.util.Log;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 경태 on 2017-02-03.
 */
public class Study170207 {

    public void Study170207() {
        // 기본 생성자
    }

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

        StudyArrayList list = new StudyArrayList();

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

/**
 * ArrayList 형식 코딩 해보기.
 */
class StudyArrayList {

    private int size = 0;
    private Object[] element;

    public StudyArrayList() {
        this.element = new Object[100];
    }

    /**
     * 값을 추가합니다.
     * @param obj
     */
    public void add(Object obj) {
        this.element[size] = obj;
        size++;
    }

    /**
     * 값을 중간 index에 추가합니다.
     * @param index
     * @param obj
     */
    public void add(int index, Object obj) {

        for (int i = size - 1; i >= index; i--) {
            this.element[i+1] = this.element[i];
        }

        this.element[index] = obj;
        size++;
    }

    /**
     * index의 값을 삭제합니다.
     * @param index
     */
    public void remove(int index) {
        this.element[index] = null;

        for (int i = index; i < size; i++) {
            this.element[i] = this.element[i+1];
        }

        size--;
    }

    /**
     * index의 값을 가져옵니다.
     * @param index
     * @return
     */
    public Object get(int index) {
        return this.element[index];
    }

    /**
     * 특정 값의 index를 반환합니다.
     * 포함되지 않은 값은 -1을 반환합니다.
     * @param obj
     * @return
     */
    public int indexOf(Object obj) {

        for (int i = 0; i < size; i++) {
            if (obj.equals(this.element[i])) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 모든 데이터를 삭제합니다.
     */
    public void clearAll() {
        for (int i = 0; i < size; i++) {
            this.element[i] = null;
        }

        size = 0;
    }

    /**
     * 특정 index의 값을 수정합니다.
     * @param index
     * @param obj
     */
    public void modify(int index, Object obj) {
        this.element[index] = obj;
    }

    /**
     * 배열의 size를 반환합니다.
     * @return
     */
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String val = "[";

        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                val += this.element[i];
            } else {
                val += this.element[i] + ", ";
            }
        }

        val += "]";
        return val;
    }
}












