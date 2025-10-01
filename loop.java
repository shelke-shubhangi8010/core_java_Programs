
/*while-loop */
public class loop {
    public static void main(String args[]) {
        int no = 1234;
        int digit = 0;

        while (no != 0) {
            digit = no / 10;
            no = no / 10;
            System.out.println(digit);
        }
    }
}

/* do-while loop */

class dowhileDemo {
    public static void main(String args[]) {
        int count = 0;
        do {
            count++;
        } while (count < 5);
        System.out.println(count);
    }

}

/* number reverse order */

class reverse {
    public static void main(String args[]) {
        int no = 123;
        int revnum = 0;

        do {
            int digit = no % 10;
            revnum = revnum * 10 + digit;
            no /= 10;
        } while (no != 0);

        System.out.println(revnum);

    }

}

/* a-z charcter print with the help of loop */

class a_to_z {
    public static void main(String args[]) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " ");
        }
    }

}

/* fibonnaci serious */

class fibonnanci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int T;
        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < 8; i++) {
            T = a;
            System.out.println(a + b);
            a = b;
            b = T + b;
        }
    }
}

/* write a java program to print even and odd number between 1 to 50 */

class evenodd {
    public static void main(String args[]) {
        int i;
        for (i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("no is even");
            } else {
                System.out.println("no is odd");
            }
        }

    }
}