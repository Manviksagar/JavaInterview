package corejava;

interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class MethodReference {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello");  
    }  
}