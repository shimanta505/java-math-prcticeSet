public class PrimeNumberSearch {

    public static String numberToN(int x){
        if (x>0&&x<4){
            return " prime number";
        }
        for(int i =2;i <x;i++){
            if (x%i==0){
                return "not a prime number";
            }
        }
        return "prime number";
    }
    public static String numberToHalfN(int x){
        if (x>0&&x<4){
            return " prime number";
        }
        for(int i =2;i <=x/2;i++){
            if (x%i==0){
                return "not a prime number";
            }
        }
        return "prime number";
    }
    public static String NumberToRootN(int x){
        if (x>0&&x<4){
            return " prime number";
        }
        for (int i =2;i <=Math.sqrt(x);i++){
            if (x%i==0){
                return "not a prime number";
            }
        }
        return "prime number";
    }
    public static String LSDNumber(int x){
        String number ="";
        int[] arr =new int[10];

        for (int i =2;i<=x;i++){
            if (x%i==0){
                x/=i;i-=1;
                int fnumber =arr[i]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                number+=Integer.toString(i+1)+"#"+Integer.toString(arr[i])+",";
            }
        }
        return number;
    }
    public static int LSDNumberCount(int x){
        int count =0;
        for (int i =2;i<=x;i++){
            if (x%i==0){
                x/=i;i-=1;
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int target =36;
        System.out.println(numberToN(target));
        System.out.println(numberToHalfN(target));
        System.out.println(NumberToRootN(target));
        System.out.println(LSDNumber(target));
        System.out.println(LSDNumberCount(target));
    }
}

