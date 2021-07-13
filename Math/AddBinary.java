package Math;
// Given two binary strings a and b, return their sum as a binary string.

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"
 

// Constraints:

// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.
public class AddBinary {
    public String addBinary(String a, String b) {
	
        int A = a.length() - 1;
        int B = b.length() - 1;
		StringBuilder s = new StringBuilder(Math.max(A, B) + 2);
        int sum = 0, carry = 0;
        
        while(A>=0 || B>=0){
            sum = carry;
            if(A >= 0)
                if(a.charAt(A--) == '1')
                sum += 1;
            if(B >= 0)
                if(b.charAt(B--) == '1')
                sum += 1;
            s.append(sum % 2);
            carry = sum / 2;
        }
        
        if(carry == 1) s.append(1);
        
        return s.reverse().toString();
    }
}
