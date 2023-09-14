package Passwords;

import java.util.Random;

public class PasswordGenerator
{
    public static String generatePassword(int length)
    {
        StringBuilder result = new StringBuilder(length);
        Random rand = new Random();
        for (int i = 0; i < length; i++) {

            int type = rand.nextInt(3);
            int code;
            switch (type) {
                case 0:
                    code = rand.nextInt(10);
                    result.append(code);
                    break;
                case 1:
                    code = rand.nextInt(26);
                    result.append((char) (65 + code));
                    break;
                case 2:
                    code = rand.nextInt(26);
                    result.append((char) (97 + code));
                    break;
            }
        }
        return result.toString();

    }


}
