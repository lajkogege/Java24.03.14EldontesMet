/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eldontesmetodus;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class EldontesMetodus {

    public static void main(String[] args) {
        primSzam();
    }

    private static void primSzam() {
        int[] tomb =tomb();
        boolean van= eldontesTetele(tomb);
        tombKiiratas(tomb);
        kiIratás(van);
    }

    private static int[] tomb() {
      int [] szamokTomb={12,34,11,222,445,66,3,5,1,7};
      return szamokTomb;
    }

    private static boolean eldontesTetele(int[] tomb) {
       boolean van =false;
       int primszam=0;
       int sozto=2;
            for (int j = 0; j < tomb.length; j++) {
               if(tomb[j]%sozto==0){
                   van=false;
                   System.out.print(tomb[j]);
           }
            }
    
        return true;
    }
    
    private static void kiIratás(boolean van) {
         if (van==true ) {
             System.out.println("Van benne prim");
        }
        else{
            System.out.println("Nincs benne prim");
        }
    }

    private static void tombKiiratas(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            if (i==tomb.length-1) {
                System.out.print(tomb[i] + "");
            }
            else{
                System.out.print(tomb[i] + ";");
            }
        }
        System.out.println("");
    }
        
}

    
