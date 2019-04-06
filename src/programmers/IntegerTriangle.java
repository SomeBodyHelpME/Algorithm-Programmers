package programmers;

public class IntegerTriangle {
	public static int solution(int[][] triangle) {
        int length = triangle.length;
        int[][] A = new int[length][length];
        
        A[0][0] = triangle[0][0];
        
        // (i - 1, j - 1) , (i - 1, j) 중 큰 수를 현재 자리 값과 더한다 
        for (int i = 1 ; i < length ; i++) {
        		for (int j = 0 ; j <= i ; j++) {
        			if (j - 1 >= 0) {
        				A[i][j] = Math.max(A[i - 1][j - 1], A[i - 1][j]) + triangle[i][j];
        			} else {
        				A[i][j] = A[i - 1][j] + triangle[i][j];
        			}
        			
        		}
        }
        
        int max = 0;
    		for (int j = 0 ; j < length ; j++) {
    			if (max < A[length - 1][j]) {
    				max = A[length - 1][j];
    			}
    		}
        		
        return max;
    }
	
	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(solution(triangle));
	}
}
