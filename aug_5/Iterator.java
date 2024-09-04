package aug_5;

public class Iterator {
    public static void main(String[] args) {
        print10times();
        print1to20();
        printevenupto20();
        printSumtill10();
        print50to1000();
        printOddNoTill50();
    }
    static void print10times(){
//need        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
//        System.out.println("Welcome to programming world");
            System.out.println("10 times : ");
            for (int i = 1; i <= 10; i++){
                System.out.println("Welcome to programming world");
            }
        System.out.println();
    }
    static void print1to20(){
//        int a1=1,a2=2,a3=3,a4=4,a5=5,a6=6,a7=7,a8=8,a9=9,a10=10,a11=11,a12=12,a13=13,a14=14,a15=15,a16=16,a17=17,a18=18,a19=19,a20=20;
//        System.out.println("a1"+a1);
//        System.out.println("a2"+a2);
//        System.out.println("a3"+a3);
//        System.out.println("a4"+a4);
//        System.out.println("a5"+a5);
//        System.out.println("a6"+a6);
//        System.out.println("a7"+a7);
//        System.out.println("a8"+a8);
//        System.out.println("a9"+a9);
//        System.out.println("a10"+a10);
//        System.out.println("a11"+a11);
//        System.out.println("a12"+a12);
//        System.out.println("a13"+a13);
//        System.out.println("a14"+a14);
//        System.out.println("a15"+a15);
//        System.out.println("a16"+a16);
//        System.out.println("a17"+a17);
//        System.out.println("a18"+a18);
//        System.out.println("a19"+a19);
//        System.out.println("a20"+a20);
        System.out.println("1 to 20 are : ");
        for (int i = 1; i <= 20; i++){
            System.out.println("a"+i+"="+i);
        }
        System.out.println();
    }
    static void printevenupto20(){
//        int a1=2,a2=4,a3=6,a4=8,a5=10,a6=12,a7=14,a8=16,a9=18,a10=20;
//        System.out.println("a1"+a1);
//        System.out.println("a2"+a2);
//        System.out.println("a3"+a3);
//        System.out.println("a4"+a4);
//        System.out.println("a5"+a5);
//        System.out.println("a6"+a6);
//        System.out.println("a7"+a7);
//        System.out.println("a8"+a8);
//        System.out.println("a9"+a9);
//        System.out.println("a10"+a10);
        System.out.println("Even no upto 20 are : ");
        for (int i = 2; i <= 20; i+=2){
            System.out.println("a"+i+"="+i);
        }
        System.out.println();
    }
    static void printSumtill10(){
//        int a1=1,a2=2,a3=3,a4=4,a5=5,a6=6,a7=7,a8=8,a9=9,a10=10;
//        System.out.println("Sum till 10 is "+a1+a2+a3+a4+a5+a6+a7+a8+a9+a10);
        System.out.println("Sum till 10 is ");
        int sum=0;
        for (int i = 1; i <= 10; i++){
            sum+=i;
        }
        System.out.println("Sum till 10 is "+sum);
        System.out.println();

    }
    static void print50to1000(){
        System.out.println("Numbers from 50 to 1000 with gap of 5 are : ");
        for (int i = 50; i <= 1000; i+=5){
            System.out.print(" "+i);
        }
        System.out.println();
    }
    static void printOddNoTill50(){
        System.out.println("Odd no till 50 are : ");
        for (int i = 1; i <= 50; i+=2){
            System.out.print(" "+i);
        }
    }
}
