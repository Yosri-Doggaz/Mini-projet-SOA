package com.example.demo;

public class CheckResponse {
    private boolean exist;

    public CheckResponse(boolean exist) {
        this.exist = exist;
    }

    public CheckResponse() {
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }
}
