package Lesson1;

public class Task5 {
    public static void main(String[] args) {
        //İnstagram Filter AI

        int brightness =40;
        int contrast = 35;
        String filterName = "Night";
        boolean isPremium = false;
        if (isPremium==true){
            contrast+=20;
            System.out.println("Applied Filter: "+filterName);
            System.out.println("Brightness Level: "+brightness);
            System.out.println("Contrast Level: "+contrast);
            System.out.println("Is Premium User? "+isPremium);
        }
        else {
            System.out.println("Applied Filter: "+filterName);
            System.out.println("Brightness Level: "+brightness);
            System.out.println("Contrast Level: "+contrast);
            System.out.println("Is Premium User? "+isPremium);

        }
    }

}
