public class Decrypt {

    //finding inverse of a mod 26
    static int modInverse(int a)
    {
        a = a % 26;
        for (int x = 1; x < 26; x++)
            if ((a * x) % 26 == 1)
                return x;
        return 1;
    }

    static String decryptCipher(String cipher, int a, int b)
    {
        String msg = "";

        for (int i = 0; i < cipher.length(); i++)
        {
            /*Applying decryption formula a^-1 ( x - b ) mod m
            {here x is cipher[i] and m is 26} and added 'A'
            to bring it in range of ASCII alphabet[ 65-90 | A-Z ] */
            if (cipher.charAt(i) != ' ')
            {
                msg = msg + (char) ((( modInverse(a)*
                        ((cipher.charAt(i) + 'A' - b)) % 26)) + 'A');
            }
            else //else simply append space character
            {
                msg += cipher.charAt(i);
            }
        }
        return msg;
    }

}
