package com.srutkowski.decorator.pattern;

public abstract class BaseDecorator extends Component {

    private Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    public Component getWrappee() {
        return wrappee;
    }
}
