package Recursion;

public class RightDown {
    public static void RightDown(int crow, int ccol, int frow, int fcol, String str){
        if(ccol==fcol && crow==frow){
            System.out.println(str);
            return;
        }
        if(ccol>fcol || crow>frow){
            return;
        }
        RightDown( crow,ccol+1,frow,fcol,str+"R");
        RightDown( crow+1,ccol,frow,fcol,str+"D");

    }
    public static void main(String[] args){
        RightDown(0,0,2,2,"");
    }
}
