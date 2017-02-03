package com.company;

import sun.rmi.runtime.Log;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception   {
      /* 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다.
         만약 본인의 PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면,
         표준입력 대신 input.txt 파일로 부터 입력값을 읽어 올 수 있습니다.
         또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을 사용하여 테스트하셔도 무방합니다.
         단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나 주석(//) 처리 하셔야 합니다. */
        //Scanner sc = new Scanner(new FileInputStream("input.txt"));

        System.out.println("테스트케이스 T를 입력하세요.");
        Scanner sc = new Scanner(System.in);

        int TC;
        int test_case;

        TC = sc.nextInt();
        for(test_case = 1; test_case <= TC; test_case++) {
            // 이 부분에서 알고리즘 프로그램을 작성하십시오.

            System.out.println("자연수 N을 입력하세요.");
            Scanner sc2 = new Scanner(System.in);
            int n = sc2.nextInt();

            System.out.println(n + "개의 0 또는 1을 입력하세요.");
            String log = "";

            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                Scanner sc3 = new Scanner(System.in);
                String tempString = sc3.nextLine();
                log += tempString;

                for (int strInt = 0; strInt < n; strInt++) {
                    int number = Integer.parseInt(String.valueOf(tempString.charAt(strInt)));
                    array[i][strInt] = number;
                }
            }

            System.out.println(array.length);

            int count = array.length;
            for (int x = 0; x < count; x++) {

                for (int y = 0; y < count; y++) {
                    System.out.print(array[x][y]);

                    int centerInt = array[x][y];

                }

                System.out.println();
            }




            // 이 부분에서 정답을 출력하십시오.
            System.out.println("Case #" + test_case);

        }
    }
}