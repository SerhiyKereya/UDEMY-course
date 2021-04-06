package Lesson27;

public class HomeWorkExeption {
    public static void main(String[] args) {
        Tiger2 grr = new Tiger2();
        grr.eat("meat");
        try {
            grr.drink("water");
            try {
                grr.drink("beer");
            } catch (Exception e1){
                System.out.println("Beer not good for tiger )) "+" getMessage="+ e1.getMessage() +" e=" +e1);
            } finally {
                System.out.println("this is INNER finally block");
            }
        } catch (RuntimeException e){
            System.out.println("it should be water" +" getLocalizedMessage="+ e.getLocalizedMessage() +" getMessage="+ e.getMessage() +" e="+ e);
        } catch (Exception e2){
            System.out.println(e2.getMessage());
        }
    }
}

class NotMeatException extends RuntimeException{
    NotMeatException(String notMeatMessage){ //constructor will return 'notMeatMessage' to superclass RuntimeException
        super(notMeatMessage);
    }
}

class NotWaterExcepton extends Exception{
    NotWaterExcepton(String notWaterMessage){
        super(notWaterMessage); //constructor will return 'notMWaterMessage' to superclass Exception
    }
}

class Tiger2 {
    //method eat
    void eat(String food) throws NotMeatException{
        if (food == "meat"){
            System.out.println("Tiger eating meat");
        }
        else {
            throw new NotMeatException("Tiger not eat "+ food);
        }
    }

    //method drink throws NotWaterException
    void drink(String liquid) throws NotWaterExcepton{
        if (liquid =="water"){
            System.out.println("Tiger drinking water");
        }
        else {
            throw new NotWaterExcepton("You idiot, Tiger not drink - "+ liquid);
        }
    }
}

