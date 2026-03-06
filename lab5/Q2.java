package Lab5;
class NotHexaDecimalExp extends Exception{
    NotHexaDecimalExp(String msg){
        super(msg);
    }

}
public class Q2 {
    public static void checkHex(String number) throws NotHexaDecimalExp {
        for(char ch:number.toCharArray()){
            if(!(ch>='0' && ch<='9') || !(ch>='A' && ch<='F') || !(ch>='a'&&ch<='f')){
                throw new NotHexaDecimalExp("Not a hexadecimal number");
            }
        }
        System.out.println(number+"is valid hexadecimal number");
    }

    static void main(String[] args) {
        String num = "1A3G";
        try {
            checkHex(num);
        } catch(NotHexaDecimalExp e){
            System.out.println("Exception "+e.getMessage());
        }
    }
}
