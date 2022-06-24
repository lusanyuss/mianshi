package com.yuliu.gupiao;

class gupiao {
    public static void main(String[] args) {
        float price = 0.820f;

        for (int i = 0; i < 5; i++) {
            System.out.println(price + 0.001 * i + "=" + 5 / (0.6 / 10000) / (price + 0.001 * i));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(price - 0.001 * i + "=" + 5 / (0.6 / 10000) / (price - 0.001 * i));
        }

        System.out.println(1f/820f*83500f);

    }
}
