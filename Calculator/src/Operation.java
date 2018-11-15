public abstract class Operation {
    public static int PLUS = 1;
    public static int MINUS = 2;
    public static int MULTI = 3;
    public static int DIV = 4;

    protected int operation;

    protected Operation nextOperation;

    public void  setNextOperation(Operation nextOperation){
        this.nextOperation = nextOperation;
    }

    public double calculator(int operation, int first, int second){
        if(this.operation == operation){
           return calculate(first, second);
        }
        if(nextOperation!=null){
           return nextOperation.calculator(operation, first, second);
        }
        return -1;
    }

    protected abstract double calculate(int first, int second);

}
//public abstract class AbstractLogger {
//    public static int INFO = 1;
//    public static int DEBUG = 2;
//    public static int ERROR = 3;
//
//    protected int level;
//
//    //next element in chain or responsibility
//    protected AbstractLogger nextLogger;
//
//    public void setNextLogger(AbstractLogger nextLogger){
//        this.nextLogger = nextLogger;
//    }
//
//    public void logMessage(int level, String message){
//        if(this.level == level){
//            write(message);
//        }
//        if(nextLogger !=null){
//            nextLogger.logMessage(level, message);
//        }
//    }
//
//    abstract protected void write(String message);
//
//}







