public class Multi  extends  Operation{
    Multi(int operation){
        this.operation = operation;
    }

    @Override
    protected double calculate(int first, int second) {
        return(first*second);
    }
}
