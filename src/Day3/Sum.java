package Day3;

public class Sum {
    public static void main(String[] args){
        int sum=0, i=1;
        do{
            sum=sum+i;
            i++;

        }
        while(i<=50);
        System.out.println("The sum of 50 natural numbers is "+sum);
    }

}
