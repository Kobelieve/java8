package com.kobe.practice.optional;

public enum Strategy {
    FAST {
        @Override
        void run() {
            //do something
            System.out.println("fast...");
        }
    },
    NORMAL {
        @Override
        void run() {
            //do something
            System.out.println("normal...");
        }
    },

    SMOOTH {
        @Override
        void run() {
            //do something
            System.out.println("smooth...");
        }
    },

    SLOW {
        @Override
        void run() {
            //do something
            System.out.println("slow...");
        }
    };
    abstract void run();
}
