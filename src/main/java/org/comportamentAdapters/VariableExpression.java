package org.comportamentAdapters;

import java.util.Map;

// Terminal Expression: Variable
class VariableExpression implements Expression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if (variables.containsKey(name)) {
            return variables.get(name).interpret(variables);
        }
        return 0; // Si la variable no está definida, retornar 0
    }
}