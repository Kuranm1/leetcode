public class Main {

    public static boolean isPalindrome(int x){
        if(x<0)
            return false;

        int oldNumber=x;
        int newNumber=0;
        int modValue=10;
        while(x != 0){
            newNumber = newNumber + (x % modValue);
            x = x / 10;
            if (x==0)
                break;
            newNumber = newNumber * 10;

        }
        return oldNumber==newNumber;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000000001));
    }

}
