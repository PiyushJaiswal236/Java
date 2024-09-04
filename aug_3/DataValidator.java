package aug_3;

import java.util.Scanner;

public class DataValidator {
    public static void main(String[] args) {
        int m, d, y, ch;
        ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day month year");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();
        if (y >= 1000 && y <= 9999) {
            if (m >= 1 && m <= 12) {

                if (d >= 1 && d <= 31) {

                    switch (m) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:

                            System.out.println(d + "-" + m + "-" + y + "   Valid date");
                            System.out.println(" 1:next date");
                            System.out.println(" 2:previous date");
                            ch = sc.nextInt();
                            switch (ch) {

                                case 1:
                                    if (d == 31 && m == 12) {
                                        d = 1;
                                        m = 1;
                                        y++;
                                    } else if (d == 31) {
                                        d = 1;
                                        m++;
                                    } else {
                                        d++;
                                    }
                                    System.out.println(d + "-" + m + "-" + y + "  Next Date");
                                    break;
                                case 2:
                                    if (d == 1 && m == 1) {
                                        d = 31;
                                        m = 12;
                                        y--;
                                    } else if (d == 1) {
                                        d = 30;
                                        if(m==8){
                                            d=31;
                                        }
                                        m--;

                                    } else {
                                        d--;
                                    }
                                    System.out.println(d + "-" + m + "-" + y + "  previous Date");
                                    break;
                            }
                            break;

                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (d <= 30) {
                                System.out.println(d + "-" + m + "-" + y + "   Valid date");
                                System.out.println(" 1:next date");
                                System.out.println(" 2:previous date");
                                ch = sc.nextInt();
                                switch (ch) {

                                    case 1:
                                        if (d == 30) {
                                            d = 1;
                                            m++;
                                        } else {
                                            d++;
                                        }
                                        System.out.println(d + "-" + m + "-" + y + "  Next Date");
                                        break;
                                    case 2:
                                       if (d == 1) {
                                            d = 31;
                                            m--;

                                        } else {
                                            d--;
                                        }
                                        System.out.println(d + "-" + m + "-" + y + "  previous Date");
                                        break;

                                }
                                break;

                            } else
                                System.out.println(d + "-" + m + "-" + y + "   inValid date");
                            break;
                        case 2:
                            if (y % 4 == 0 && d <= 29) {
                                System.out.println(d + "-" + m + "-" + y + "   Valid date");
                                System.out.println(" 1:next date");
                                System.out.println(" 2:previous date");
                                ch = sc.nextInt();
                                switch (ch) {

                                    case 1:
                                        if (d == 29) {
                                            d = 1;
                                            m++;
                                        } else {
                                            d++;
                                        }
                                        System.out.println(d + "-" + m + "-" + y + "  Next Date");
                                        break;
                                    case 2:
                                        if (d == 1) {
                                            d = 31;
                                            m--;

                                        } else {
                                            d--;
                                        }
                                        System.out.println(d + "-" + m + "-" + y + "  previous Date");
                                        break;

                                }
                                break;

                            } else if (d <= 28) {
                                System.out.println(d + "-" + m + "-" + y + "   Valid date");
                                if (d == 28) {
                                    d = 1;
                                    m++;
                                } else {
                                    d++;
                                }
                                System.out.println(d + "-" + m + "-" + y + "   Next Date");
                                //new
                                System.out.println(d + "-" + m + "-" + y + "   Valid date");
                                System.out.println(" 1:next date");
                                System.out.println(" 2:previous date");
                                ch = sc.nextInt();
                                switch (ch) {

                                    case 1:
                                        if (d == 28) {
                                            d = 1;
                                            m++;
                                        } else {
                                            d++;
                                        }
                                        System.out.println(d + "-" + m + "-" + y + "  Next Date");
                                        break;
                                    case 2:
                                        if (d == 1) {
                                            d = 31;
                                            m--;
                                        } else {
                                            d--;
                                        }
                                        System.out.println(d + "-" + m + "-" + y + "  previous Date");
                                        break;
                                }
                                break;

                            } else
                                System.out.println(d + "-" + m + "-" + y + "   inValid date");
                            break;
                    }

                } else {
                    System.out.println("Invalid day");
                }

            } else {
                System.out.println("Invalid month");
            }

        } else {
            System.out.println("Invalid year");
        }

    }

}