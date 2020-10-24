package com.mytube;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

public class Array {
    private int count;
    private int store[];

    public Array(int length) {
        this.store = new int[length];
    }

    public void insert(int item){
        if (count >= this.store.length) {
            int newArray[] = new int[store.length + 1];
            System.arraycopy(this.store, 0, newArray, 0, this.store.length);
            this.store = newArray.clone();
        }
        store[count++] = item;


    }
    public int getItem(int pos){
        return store[pos];
    }
    public int indexOf(int item){
        int index = -1;
        for(int i = 0; i < store.length; i++){
            if(item == store[i]){
                index = i;
            }
        }
        return index;
    }
    public void print(){
        System.out.print("[");
        for(int number: store)
            System.out.print( number + ", " );
        System.out.println("]");
    }
}
