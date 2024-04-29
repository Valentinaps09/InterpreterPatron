package org.comportamentAdapters;

import java.util.HashMap;
import java.util.Map;

class Context {
    Map<String, Expression> variables = new HashMap<>();

    public void assign(Expression variable, int value) {
        variables.put(((VariableExpression) variable).toString(), new ConstantExpression(value));
    }

    public int lookup(Expression variable) {
        return variables.get(((VariableExpression) variable).toString()).interpret(variables);
    }
}