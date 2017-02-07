package com.company;
public class Main {

    public static void main(String[] args)
    {

        int list[] = new int[]{1, 8, 24, 6};

        for(int j=0; j<list.length;j++) {

            for (int i = 0; i < list.length; i++) {
                if (list[j] > list[i + 1]) {
                    list[j] = list[i];
                }
            }

        }

        System.out.print(list[0]);
    }
}
