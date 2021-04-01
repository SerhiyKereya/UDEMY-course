package Lesson27;

public class MarathoneException {
    void marathon(int airTemp, int runSpeed) throws LegCrampException{
        if (runSpeed>12){
            throw new LegCrampException("Run speed was to high: "+ runSpeed);
        }
        if (airTemp>32){
            throw new LegCrampException();
        }
        System.out.println("You finished the marathon ");
    }

    public static void main(String[] args) {
        MarathoneException m = new MarathoneException();
        try {
            m.marathon(40, 13);
        }
        catch (LegCrampException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("You will receive a honour revard");
        }
    }
}

class DislocateLegException extends Exception{
    DislocateLegException(String message){
        super(message);
    }
    DislocateLegException(){
    }
}
class LegCrampException extends RuntimeException{
    LegCrampException(String message){
        super(message);
    }
    LegCrampException(){
    }
}