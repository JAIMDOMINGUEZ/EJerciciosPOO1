public class MyException extends Exception{
    int n;
    int min;
    int max;
    public MyException(String message, int n , int min, int max){
        super(message);
        this.n = n;
        this.min = min;
        this.max = max;
    }
    public int getN(){
        return n;
    }
    public int getMin(){
        return min;
    }
    public int getMax(){
        return max;
    }

}