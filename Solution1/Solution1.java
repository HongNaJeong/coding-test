import java.util.Arrays;

class Solution1 {
    public char[] solution(int n, int[][] ladder) {
        char[] answer = new char[n];
        for(int i = 0; i < n; i++) {
            answer[i] = (char)(i + 65);
        }

        for(int[] line : ladder) {
            for(int x : line) {
                char tmp = answer[x];
                answer[x] = answer[x-1];
                answer[x-1] = tmp;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution1 T = new Solution1();
        System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }

}

/*. 일단 answer 리스트에 각 학생의 알파벳을 순서대로 담습니다. 그리고 사다리의 가로줄을 위에서부터 차례대로 탐색합니다.
첫 번째 가로줄에서 가로막대가 발견되면 해당 가로 막대가 연결하고 있는 두 세로줄의 알파벳을 교환합니다.
이런 과정을 첫 번째 가로 줄의 모든 가로 막대에서 하게 되면 모든 학생이 첫 번째 가로줄을 사다리 탄 결과가 answer에 표현됩니다.
 위에 과정을 마지막 가로 줄까지 처리하면 answer에 최종 결과가 담겨져 있습니다. */


