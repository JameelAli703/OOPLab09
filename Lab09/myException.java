package Lab09;
public class myException extends Exception{
    String message;
    myException(String message){
        this.message = message;
    }
    public void printmessage(){
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        myException exception = new myException("MESSGAE");

        try{
            exception.printmessage();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
