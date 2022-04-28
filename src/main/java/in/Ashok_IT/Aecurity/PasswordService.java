package in.Ashok_IT.Aecurity;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	public static String Encode(String input) {
		Encoder EC = Base64.getEncoder();
		return EC.encodeToString(input.getBytes());
	}
	
	public static String Decode(String str) {
		Decoder DC = Base64.getDecoder();
		byte[] Decoded_Byte_String = DC.decode(str);
		return new String(Decoded_Byte_String);
	}
	
	public static void main(String[] args) {
		String Original_String = new String("Ashok");
		System.out.println("Original String: " + Original_String);
		String str = Encode("Ashok");
		System.out.println("Encoded String: " + str);
		String decoded_str = Decode(str);
		System.out.println("Decoded String: " + decoded_str);
	}

}
