//5.HMAC MD5
//exp5HMAC
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
 public class MD5{
public static String getMd5(String input) {
try {
MessageDigest msgDst = MessageDigest.getInstance("MD5");
 // the digest() method is invoked to compute the message digest
// from an input digest() and it returns an array of byte
byte[] msgArr = msgDst.digest(input.getBytes());
 // getting signum representation from byte array msgArr
BigInteger bi = new BigInteger(1, msgArr);
 // Converting into hex value
String hshtxt = bi.toString(16);
 while (hshtxt.length() < 32) {
hshtxt = "0" + hshtxt; }
return hshtxt; }
catch (NoSuchAlgorithmException abc) { // for handling the exception
throw new RuntimeException(abc); } }
public static void main(String argvs[]) throws NoSuchAlgorithmException {
String str = "Sanket";
String hash = getMd5(str);
str = "'Sanket'";
System.out.println("The HashCode Generated for " + str + " is: " + hash); } }