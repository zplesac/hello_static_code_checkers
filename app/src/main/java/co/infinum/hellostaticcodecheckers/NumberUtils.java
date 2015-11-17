package co.infinum.hellostaticcodecheckers;

/**
 * Created by Željko Plesac on 03/11/15.
 */
public class NumberUtils {

    public static boolean isAccepted(int status){
        if(status == 1 || status == 7){
            return true;
        }
        else{
            return false;
        }
    }
}
