package com.company.datastructure;

/**
 * ArrayList 형식 코딩 해보기.
 */
public class MyArrayList {

    private int size = 0;
    private Object[] element;

    public MyArrayList() {
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
