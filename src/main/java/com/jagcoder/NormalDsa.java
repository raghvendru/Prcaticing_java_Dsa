package com.jagcoder;
import java.util.*;
public class NormalDsa {
    public static void main(String[] args) {
        //arrayList
//        List<Integer> al = new ArrayList<>();
//        al.add(2);
//        al.add(3);
//        al.add(5);
//        System.out.println(al);
//        al.add(1,25);
//        System.out.println(al.contains(250));
//        System.out.println(al);

        //LinkedList
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(1);
//        ll.add(5);
//        ll.add(6);
//        ll.addFirst(100);
//        System.out.println(ll);
//        System.out.println(ll.contains(101));

        //stck
//        Stack<Integer> st = new Stack<>();
//        st.push(2);
//        st.push(3);
//        st.push(6);
//        System.out.println(st);
//
//        System.out.println(st.peek());
//        st.pop();
//        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st.isEmpty());

//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(256);
//        hs.add(3444);
//        hs.add(644);
//        hs.add(144);
//        hs.add(144);
//        hs.add(64);
//        System.out.println(hs);
//
//        for(Integer n:hs){
//            System.out.println(n);
//        }


        //TreeSet
//        TreeSet<Integer> ts = new TreeSet<>();
//        ts.add(256);
//        ts.add(2566);
//        ts.add(2561);
//        System.out.println(ts);

        //ArrayDequeue
//        ArrayDeque<Integer> a = new ArrayDeque<>();
//        a.offer(1);
//        a.offer(25);
//        a.offer(36);
//        System.out.println(a);
//        a.poll();
//        System.out.println(a);
//
//        System.out.println(a.peek());

        //PriorityQueue
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.offer(9);
        p.offer(6);
        p.add(5);
        p.offer(8);
        System.out.println(p);

        System.out.println(p.peek());
        p.poll();
        System.out.println(p);
        System.out.println(p.peek());

     while(p.isEmpty() == false){
         System.out.println(p.peek());
         p.poll();
     }

    }
}
