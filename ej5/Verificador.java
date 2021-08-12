public class Verificador{
    private Verificador(){

    }
    public static void checarNum(int n, int min, int max)trows MyException{
        if(!(n>=min && n<=max)){
            trow new MyException("El numero "+n+" debe estar entre "+min+"y"+max);
        }
    }
}