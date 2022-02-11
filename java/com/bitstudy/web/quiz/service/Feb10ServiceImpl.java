package com.bitstudy.web.quiz.service;

/**
 * packageName: com.bitstudy.web.quiz.service
 * fileName        : Feb09ServiceImpl
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
import java.util.Random;
public class Feb10ServiceImpl implements Feb10Service{

    @Override
    public void bubbleSort() {

    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {
        Random random = new Random();
        int m;


        while (true){
            m = random.nextInt(100);
            if (m%2==1&&m!=1){
                break;
            }
        }
        int x = 0;
        int y = m/2;
            int array[][] = new int[m][m];
            array[x][y] = 1;
            for(int i = 1; i < m*m; i++)
                {
                    if((i+1)%m == 1){
                        x++;
                        if(x == m)
                            x = 0;
                        array[x][y] = i+1;
                    }else{
                        x--;
                        if(x == -1)
                            x = m-1;

                        y--;
                        if(y == -1)
                            y = m-1;

                        array[x][y] = i+1;
                    }

                }

                for(int i = 0 ; i < m; i++) {
                    for(int j = 0 ; j < m; j++)
                        System.out.print(array[i][j] + " " );
                    System.out.println();
                }
            }








    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
