package com.kobe.practice.optional;

public enum Status {

    NEW(0) {
        @Override
        void run() {

        }
    },
    RUNNABLE(1) {
        @Override
        void run() {

        }
    };

    public int statusCode;

    abstract void run();

    Status(int statusCode) {
        this.statusCode = statusCode;
    }

}
