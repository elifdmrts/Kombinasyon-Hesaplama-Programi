import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,k,f,n,r,fark;

        Scanner scanner=new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonunu hesaplayabilmek için;");
        System.out.print("n Değerini Giriniz: ");
        n=scanner.nextInt();
        System.out.print("r Değerini Giriniz: ");
        r=scanner.nextInt();
        int totaln=1;
        int totalr=1;
        int totalfark=1;
        fark=(n-r);
        for(i=1; i<=n; i++ ){
            totaln=totaln*i; // n!
        }
        for(k=1; k<=r; k++ ){
            totalr=totalr*k;  //r!
        }
        for(f=1; f<=fark; f++ ){
            totalfark=totalfark*f;  //(n-r)!
        }

int formul=totaln/(totalr*totalfark);
        System.out.println("C("+n+","+r+")= "+formul);

    }
}