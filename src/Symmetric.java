import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;

/*----Class to create key(Symmetric)----*/
public class Symmetric {

    /*----AES Algorithm for Encryption----*/
    public static final String AES = "AES";

    /*----Function to create Secret Key----*/
    public static SecretKey createAESKey() throws Exception{

        /*----Create new instance for SecureRandom Class----*/
        SecureRandom secureRandom = new SecureRandom();

        /*----Passing String to KeyGenerator----*/
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);

        /*----Initialized Key Generator with 256 bits----*/
        keyGenerator.init(256, secureRandom);

        /*----It will generate SecretKey----*/
        SecretKey key = keyGenerator.generateKey();

        /*----Simply return that key----*/
        return key;
    }
}
