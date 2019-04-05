package programmers;

public class Tile {
	public static long solution(int N) {
        long answer = 0;
        long[] A = new long[N];
        
        for (int i = 0 ; i < N ; i++) {
        		if (i == 0) {
        			A[i] = 1;
        			answer += 4;
        		} else if (i == 1) {
        			A[i] = 1;
        			answer += 2;
        		} else {
        			A[i] = A[i - 2] + A[i - 1];
        			answer += A[i] * 2;
        		}
        }
        
        
        
        return answer;
    }
	public static void main(String[] args) {
		int N = 6;
		System.out.println(solution(N));
	}
}
