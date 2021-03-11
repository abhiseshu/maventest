public class Main {

    public int result;

    Main(){
        result = 0;
    }

    public int add(int a,int b){
        result = a+b;
        return result;
    }
    public int sub(int a,int b){
        result = a-b;
        return result;
    }
    public int mult(int a,int b){
        result = a*b;
        return result;
    }
    public int div(int a,int b){
        result = a/b;
        return result;
    }
    public int getResult(){
        return result;
    }
    public int clear(){
        result = 0;
        return result;
    }

}
