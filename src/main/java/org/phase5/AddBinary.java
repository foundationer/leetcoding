package org.phase5;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder output = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0 || carry == 1) {
            if(i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if(j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            output.append(carry % 2);
            carry /= 2;
        }
        return output.reverse().toString();

        /**
         * This doesn't work for long strings (the parse function throws NumberFormatException)
            long longa = Long.parseLong(a, 2);
            long longb = Long.parseLong(b, 2);
            return Long.toBinaryString(longa + longb);
         */
    }
}
