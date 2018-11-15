public class Div  extends Operation{
    Div(int operation){
        this.operation = operation;
    }

    @Override
    protected double calculate(int first, int second) {
        return(first/second);
    }
}
