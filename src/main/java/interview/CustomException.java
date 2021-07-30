package interview;

public class CustomException extends Exception{

    CustomException(String s){
       super(s);
    }

    public static void main(String[] args) throws CustomException {
        checkMSG();
    }
    public static void checkMSG() throws CustomException {
        throw new CustomException("Sagar Exception");
    }


}
