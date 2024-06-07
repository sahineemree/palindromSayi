public class palindromSayi {

    static boolean isPalindrom (int number){

        int temp = number , reverseNumber = 0 , lastNumber ;

     while (temp != 0) {
         System.out.println("----------------");

     System.out.println("Sayı = " + temp);

     lastNumber = temp % 10;
     temp /= 10;
         System.out.println("Son basamak -> " + lastNumber);
         reverseNumber = (reverseNumber * 10) + lastNumber;
         System.out.println("Yeni sayı -> " + reverseNumber);
 }
     if (number == reverseNumber){

         System.out.println("Girilen sayı bir palindrom sayıdır.");
     }
        else {
         System.out.println("Girilen sayı bir palindrom sayı değildir.");

     }
        return true;
    }
    public static void main(String[] args) {
         isPalindrom(19391);
    }
}
