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
//        * 홀수 마방진 구하기
//        * 1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
//         * 2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
//         * 3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
//                * 4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
//                * 5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화가 없다.
        //행은 밑으로 0,1,2,3으로 진행 위로올라가라면 -
        Random random = new Random();
        int m;

        while (true){
            m = random.nextInt(100);
            if (m%2==1&&m!=1){
                break;
            }
        }//랜덤으로 홀수만 뽑아낸다.
        int x = 0;
        int y = m/2;// 마방진은 1행 가운데 열에서부터 시작
            int array[][] = new int[m][m];

            for(int i = 1; i < m*m; i++) {
                array[x][y] = i;
                    if(i%m == 0){
                        x++;
                        if(x == m) {
                            x = 0;
                        }
                    }else{
                        x--;
                        y++;
                        if(x == -1){
                            x = m-1;
                        }
                        if(y == m){
                            y = 0;
                        }

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
