package Recursion;

public class CoinToss {

    public static void coinprint(int coin , String str){
        if(coin==0){
            System.out.println(str);
            return;
        }
        coinprint(coin-1, str+"H");
        coinprint(coin-1, str+"T");

    }
    public static void main(String[] args){
        coinprint(3,"");
    }
}
