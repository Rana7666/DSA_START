public class votingexception {
    public class WronngExecption extends RuntimeException{
        String message;
        WronngExecption(){

        }
        WronngExecption(String message){
            this.message=message;
        }
        public String getmessage(){
            return message;
        }
    }
}
