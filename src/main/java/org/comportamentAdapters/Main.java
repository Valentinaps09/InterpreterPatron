package org.comportamentAdapters;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            // Expresiones
            Expression a = new VariableExpression("a");
            Expression b = new VariableExpression("b");
            Expression c = new ConstantExpression(10);
            Expression d = new ConstantExpression(5);

            // Contexto
            Context context = new Context();
            context.assign(a, 20);
            context.assign(b, 30);

            // Ejemplo de expresión: a + b - c + d
            Expression expression = new AddExpression(new AddExpression(new SubtractExpression(a, c), b), d);

            // Evaluación de la expresión
            int result = expression.interpret(context.variables);
            System.out.println("Resultado: " + result);
        }
    }