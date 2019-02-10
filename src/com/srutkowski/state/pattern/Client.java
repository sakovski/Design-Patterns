package com.srutkowski.state.pattern;

public class Client {

    private Context context;

    public Client(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
