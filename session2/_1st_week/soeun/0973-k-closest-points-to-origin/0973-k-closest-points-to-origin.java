
class Solution {
    static class Point {
        double distance;
        int[] point;

        public Point(double distance, int[] point) {
            this.distance = distance;
            this.point = point;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        int[][] answer = new int[k][];
        PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> a.distance));

        for (int[] point : points) {
            int distance = point[0] * point[0] + point[1] * point[1];
            pq.add(new Point(distance, point));
        }

        for (int i = 0; i < k; i++) {
            answer[i] = pq.poll().point;
        }

        return answer;
    }
}
