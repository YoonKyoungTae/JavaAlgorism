package com.company.algorithm;

import java.util.Scanner;

/**
 * Created by 경태 on 2017-02-03.
 */
public class AlgoStudy170203 {

    public AlgoStudy170203(){}

    // 빗금치기 알고리즘
    public void algorithm() {

        System.out.println("n을 입력해주세요~^^.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // 초기화
        int[][] array = new int[input][input];
        int count = 1;
        int x = 0;
        int y = 0;
        array[0][0] = count;

        { // 위에서 아래로 대각선
            y++;
            for (; y < input; y++) {
                int tempY = y;
                for (; tempY > -1; tempY --){
                    count ++;
                    array[x][tempY] = count;
                    //System.out.println("x:"+x+", y:"+tempY);
                    x++;
                }
                x = 0;
            }

            x++;
            for (; x < input; x++) {
                int tempX = x;
                y = 4;
                for (; tempX < input; tempX ++){
                    count ++;
                    array[tempX][y] = count;
                    System.out.println("x:"+tempX+", y:"+y);
                    y--;
                }
            }
        }

        System.out.println("출력");
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                System.out.print(array[i][j] + ", ");
            }

            System.out.println();
        }
    }
}
