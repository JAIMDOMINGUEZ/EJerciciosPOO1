public class TestExcep{
    public static void main(String args[]){
        int sum =0;
        for(int i =0; i<args.length,i++){
            try{
                sum +=Integer.parseInt(args[i]);
            }catch (NumberFormatException nfe){
                System.out.println("Algo salio mal con"+args[i]+""+nfe);
            }finally{
                System.out.println("esto va al final");
            }
        }
        System.out.println(sum);
        try{
            checarNum(200,10,50);
        }catch(MyException me){
            System.out.println(me+""+me.getMin()+"<="+me.getN()+"<="+me.getMax());
        }finally{
            System.out.println("Termino la comprobacion");
        }
        
    }
}