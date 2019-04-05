package programmers;

public class SchoolWay {
	public static int solution(int m, int n, int[][] puddles) {
        int[][] A = new int[n + 1][m + 1];
        
        
        A[1][1] = 1;
        for (int i = 0 ; i < puddles.length ; i++) {
            A[puddles[i][0]][puddles[i][1]] = -1;
        }
        

        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= m ; j++) {
	            	if (i == 1 && j == 1) {
	        			continue;
	        		}
            		if (A[i][j] == -1) {
            			continue;
            		}
                if (A[i - 1][j] == -1) {
                    A[i][j] = A[i][j - 1];
                } else if (A[i][j - 1] == -1) {
                    A[i][j] = A[i - 1][j];
                } else {
                    A[i][j] = (A[i - 1][j] + A[i][j - 1]) % 1000000007;    
                }
            }
        }

        return A[n][m];
    }
    public static void main(String[] args) {
		int M = 4;
		int N = 3;
		int[][] puddles = {{2, 2}};
		System.out.println(solution(M, N, puddles));
	}
}
