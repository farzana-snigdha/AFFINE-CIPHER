import java.util.Scanner;

class AffineCipher
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to encrypt or decrypt(e/d)? ");
        String ans = input.next();

        Encrypt e = new Encrypt();
        Decrypt d = new Decrypt();

        if (ans.equals("e")) {
            //encrypt msg
            System.out.print("enter original message : ");
            String msg = input.next();
            System.out.println("enter shifting values a,b : ");
            int a = input.nextInt();
            int b = input.nextInt();
            // Calling encryption function
            String cipherText = e.encryptMessage(msg.toCharArray(),a,b);
            System.out.println("Encrypted Message is : " + cipherText);

        }
        if (ans.equals("d")) {
            //decrypt msg
            System.out.print("enter encrypted message : ");
            String msg = input.next();
            System.out.println("enter values of a,b : ");
            int a = input.nextInt();
            int b = input.nextInt();
            // Calling decryption function
            // Calling Decryption function
            System.out.println("Decrypted Message is: " + d.decryptCipher(msg,a,b));

        }

    }
}