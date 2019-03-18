/**
 * Java 8 now has inbuilt encoder and decoder for Base64 encoding. In Java 8, we can use three types of Base64 encoding.
 * Base64 is a group of similar binary-to-text encoding schemes that represent binary data in an ASCII string format by translating
 * it into a radix-64 representation.
 * Base64 encoding schemes are commonly used when there is a need to encode binary data that needs be stored and transferred
 * over media that are designed to deal with textual data. This is to ensure that the data remains intact without modification during transport.
 */

import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

public class Java8Base64 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {

            // Encode using basic encoder
            String base64encodedString = Base64.getEncoder().encodeToString(
                    "Besteseller?java8".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

            // Decode
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

            System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
            base64encodedString = Base64.getUrlEncoder().encodeToString(
                    "Besteseller?java8".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);

        } catch(UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }

    }

}

