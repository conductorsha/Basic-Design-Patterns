class CalculatorDemo{
    public static void main(String[] args) {

        Operation op = createOperations();

        double b = op.calculator(Operation.MINUS, 2, 2);
        System.out.println(b);

    }
    public static Operation createOperations(){
        Operation plus = new Plus(Operation.PLUS);
        Operation minus = new Minus(Operation.MINUS);
        Operation multi = new Multi(Operation.MULTI);
        Operation div = new Div(Operation.DIV);

        plus.setNextOperation(minus);
        minus.setNextOperation(multi);
        multi.setNextOperation(div);

        return plus;
    }

}