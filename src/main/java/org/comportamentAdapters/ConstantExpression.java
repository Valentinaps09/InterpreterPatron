package org.comportamentAdapters;

import java.util.Map;

class ConstantExpression implements Expression {
    private int value;

    public ConstantExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return value;
    }
}