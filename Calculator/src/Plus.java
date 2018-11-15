public class Plus extends Operation {

    Plus(int operation){
        this.operation = operation;
    }

    @Override
    protected double calculate(int first, int second) {
        return (first+second);
    }
}
