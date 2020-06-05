import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1
        System.out.println("#1");
        int a = 23;
        int b = 77;
        int c = b;
        b = a;
        a = c;
        System.out.println("a = " + a + ", b = " + b);

        //2
        System.out.println("#2");
        //String[] arr = {"9 45", "10 35", "11 35", "12 25", "13 25", "14 15", "15 15", "16 05", "17 05", "17 55"};
        //System.out.println(arr[(int) (Math.random() * 10) + 1 - 1]);
        //(int) (Math.random() * 10)+1 - эта штука вернет от 1 до 10, но что бы обратится к элементу в массиве, нужно сделать -1
        //хотя можно было сразу написать (int) (Math.random() * 10), но в задании сказано сгенер. число от 1 до 10

        int numOfLes = 3;
        int startFirstLesson = 9;
        int addedMinutesFromLessons = numOfLes * 45;
        int MinOfBreak = (numOfLes - 1) * 10;
        MinOfBreak -= ((numOfLes - 1) % 2) * 5;
        int TimeSpand = MinOfBreak + addedMinutesFromLessons;
        int hours = 9 + (TimeSpand / 60);
        int minutes = TimeSpand % 60;
        System.out.println("Time is "+hours+ " "+minutes);

        //3
        System.out.println("#3");
        int firstHour = 1;
        int firstMinute = 59;
        int firstSecond = 30;
        int secondHour = 2;
        int secondMinute = 1;
        int secondSecond = 30;
        System.out.println(((secondHour - firstHour) * 3600) + ((secondMinute - firstMinute) * 60) + ((secondSecond - firstSecond)));

        //4
        System.out.println("#4");
        int n = 700; //new Scanner(System.in).nextInt();
        int m = 2100; //new Scanner(System.in).nextInt()
        System.out.println((n > 0 && m > 0 && n <= 10000 && m <= 10000) ? m / n + "  day(s)" : "It is not natural value");

        //5
        System.out.println("#5");
        int height = 18;
        int roadDay = 5;
        int roadNight = 3;
        System.out.println(1 + (height - roadDay) / (roadDay - roadNight));

        //6
        System.out.println("#6");
        a = 6;
        b = 332;
        //System.out.println((a>0 && a<100 && b>0 && b<100) ? a>b ? "max is a="+a:"max is b+"+b : "please, enter correct values" );
        System.out.println((a * (a / b) + b * (b / a)) / (b / a + a / b));

        //7
        System.out.println("#7");
        char[][] matrix = new char[8][8];
        int rock1 = 1;
        int rock2 = 1;
        int figure1 = 2;
        int figure2 = 1;
        //вывод на экран , если раскоментировать ниже sout ы, то будет выведена в консоль матрица
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == (rock1 - 1) && j == (rock2 - 1)) {
                    matrix[i][j] = '+';
                    //System.out.print("+ ");
                } else if (i == (figure1 - 1) && j == (figure2 - 1)) {
                    matrix[i][j] = '#';
                    //System.out.print("# ");
                } else {
                    matrix[i][j] = '.';
                    //System.out.print(". ");
                }
            }
            //System.out.println();
        }
        //поиск результата
        M:
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == '+') {
                    for (int k = 0; k < 8; k++) {
                        if (matrix[i][k] == '#') {
                            System.out.println("YES");
                            break M;
                        }
                    }
                    for (int k = 0; k < 8; k++) {
                        if (matrix[k][j] == '#') {
                            System.out.println("YES");
                            break M;
                        } else if (k == 7) {
                            System.out.println("NO");
                            break M;
                        }
                    }
                }
            }
        }

        //8
        System.out.println("#8");
        a = 1;
        b = 2;
        c = 2;
        if (a == b | b == c | a == c) {
            System.out.println("2");
        } else if (a == c && b == c && a == c) {
            System.out.println("3");
        } else {
            System.out.println("0");
        }

        //9
        System.out.println("#9");
        n = 10; //new Scanner(System.in).nextInt();
        int[] arr1 = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = (int) (Math.random() * n) + 1;
            System.out.print(arr1[i] + " ");
            if (i > 0) {
                if (arr1[i - 1] < arr1[i]) {
                    k++;
                }
            }
        }
        System.out.println("\n" + k);

        //10
        System.out.println("#10");
        n = 10;
        arr1 = new int[n];
        k = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = (int) (Math.random() * n) + 1;
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (i > 0 & i < (n - 1)) {
                if(arr1[i-1] < arr1[i] && arr1[i+1] < arr1[i]){
                    k++;
                }
            }
        }
        System.out.println("\n"+k);

        //11
        System.out.println("#11");
        n = 34;
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = (int) (Math.random() * n) + 1;
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 1; i < n; i=i+2) {
            int temp = arr1[i-1];
            arr1[i-1]=arr1[i];
            arr1[i]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
