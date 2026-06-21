package java_9.Encoder;

import java.util.Base64;

public class Encode_decode_Test {

    public static void main(String[] args) {
        String str = "Hi, i am Vaibhav Bhatnagar.";
//        str = str.replace(" ", "");
        System.out.println("Init String: " +str);
        Base64.Encoder encoder = Base64.getEncoder();
        String encode = encoder.encodeToString(str.getBytes());
        System.out.println("encoded String : "+encode);
        Base64.Decoder decoder = Base64.getDecoder();
        String decode = new String(decoder.decode(encode));
        System.out.println("decoded String : "+decode);
    }
}
