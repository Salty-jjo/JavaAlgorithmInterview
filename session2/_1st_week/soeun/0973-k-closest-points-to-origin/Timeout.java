class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] answer = new int[k][2];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int distance = point[0] * point[0] + point[1] * point[1];
            for (int j = 0; j < k; j++) {
                if (j < list.size()) {
                    int[] diff = points[list.get(j)];
                    if (distance < diff[0] * diff[0] + diff[1] * diff[1]) {
                        list.add(j, i);
                        break;
                    }
                } else {
                    list.add(j, i);
                    break;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            answer[i][0] = points[list.get(i)][0];
            answer[i][1] = points[list.get(i)][1];
        }

        return answer;
    }
}
