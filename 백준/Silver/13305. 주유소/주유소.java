import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] distance = new long[N - 1];	// 거리
        long[] oilPrice = new long[N];	// 비용 

        // 거리 입력 
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N - 1; i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        // 리터당 기름값 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            oilPrice[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minCost = oilPrice[0];	// 이전 까지의 과정 중 주유 최소 비용 

        for(int i = 0; i < N - 1; i++) {

            /*
             *  현재 주유소가 이전 주유소의 기름값보다 쌀 경우
             *  minCost를 갱신해준다.
             */
            if(oilPrice[i] < minCost) {
                minCost = oilPrice[i];
            }

            sum += (minCost * distance[i]);
        }

        System.out.println(sum);

    }
}
