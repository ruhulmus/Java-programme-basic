// Number Pattern
public class NumberPattern {
    public static void main(String[] args) {
        int i,j,k, row = 5;
        for (i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("====================");

        for (i=row;i>=1;i--){
            for (j = 1 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("====================");


    }
}
// output

