

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.xml.bind.DatatypeConverter;
import java.security.SecureRandom;
import java.util.logging.Logger;

import static java.awt.SystemColor.info;

/*----Class to create key(Symmetric)----*/
public class Symmetric {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Symmetric.class));

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

    /*---- Driver Code----*/
    public static void main(String[] args) throws Exception {
        /*----This will create AES key----*/
        SecretKey symmetricKey = createAESKey();

        /*----Now encoded the symmetricKey with HexBinary format----*/
        String encodedSymmetricKey = DatatypeConverter.printHexBinary(symmetricKey.getEncoded());
        LOGGER.info("encodedSymmetricKey: " + encodedSymmetricKey);


    }
}
