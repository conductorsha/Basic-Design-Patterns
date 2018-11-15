public class Minus extends Operation {
    Minus(int operation){
        this.operation = operation;
    }

    @Override
    protected double calculate(int first, int second) {
        return(first-second);
    }
}
