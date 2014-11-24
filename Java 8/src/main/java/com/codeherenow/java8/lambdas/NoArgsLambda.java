package com.codeherenow.java8.lambdas;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class NoArgsLambda {

    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Hello Lambda! (I'm a slow thread BTW)");
            }

        }).start();
    }

}
