
package autokey;


public class Autokey {

    
    public static void main(String[] args) {
         String plainText = "wearediscoveredsaveyourself";
        String cipherText = "zicvtwqngkzeiigasxstslvvwla";
        System.out.println(encryption(plainText,"deceptive"));
         System.out.println(decryption(cipherText,"deceptive"));
       
    }
    static String encryption(String plain ,String key) {
        String C = "";
        int stop = 0;
        for (int i = 0; i < plain.length(); i++) {
            if (plain.charAt(i) == ' ') {
                C += ' ';
            } else if (plain.length()==key.length()){
                int value =(plain.charAt(i) - 97);
                int k= (key.charAt(stop)-97);
                
                stop++;
                C += (char) ((( value + k) % 26) + 97);
            }
            else{
                key+= plain.charAt(i);
                int value =(plain.charAt(i) - 97);
                
                int k= (key.charAt(stop)-97);
               
                stop++;
                C += (char) ((( value + k) % 26) + 97);
              
            }
             
            }
        System.out.println(key);
        return C;
    
    }
     static String decryption(String cipher ,String key ) {
        String P = "";
         int stop = 0;
        for (int i = 0; i < cipher.length(); i++) {
            if (cipher.charAt(i) == ' ') {
                P += ' ';
            } else if(cipher.length()==key.length()) {
                int value =  (cipher.charAt(i) - 97);
                int k=  (key.charAt(stop)-97);
                int flag =  (( value - k) % 26) ;
                 stop++ ;
                if (flag < 0) {
                    flag += 26;
                }
                P += (char) (flag + 97);
            }
            else{                
                int value =(cipher.charAt(i) - 97);               
                int k= (key.charAt(stop)-97); 
                int flag =  (( value - k) % 26) ;
                stop++;
                if (flag < 0) {
                    flag += 26;
                }
                P += (char) (flag + 97);
                key+= P.charAt(i);
              
            }
        }
        return P;
    }
}
