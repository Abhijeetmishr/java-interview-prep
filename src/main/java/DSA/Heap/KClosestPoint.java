package DSA.Heap;

import java.util.*;

/*
 * https://leetcode.com/problems/k-closest-points-to-origin/solutions/220235/java-three-solutions-to-this-classical-k-th-problem/
 */
public class KClosestPoint {
    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int distFromOrigin() {
            // ignoring sqrt
            return (x * x) + (y * y);
        }
    }

    public List<Point> findClosestPoints(Point[] points, int k) {
        PriorityQueue<Point> maxHeap = new PriorityQueue<>((p1, p2) -> p2.distFromOrigin() - p1.distFromOrigin());

        for (int i = 0; i < k; i++)
            maxHeap.add(points[i]);

        for (int i = k; i < points.length; i++) {
            if (maxHeap.peek().distFromOrigin() > points[i].distFromOrigin()) {
                maxHeap.add(points[i]);
                maxHeap.poll();
            }
        }
        return new ArrayList<Point>(maxHeap);
    }
    // public int[][] kClosest(int[][] points, int k) {
    // PriorityQueue<Pair> pq = new PriorityQueue<>();

    // for(int i = 0; i < points.length; i++){
    // int x = points[i][0];
    // int y = points[i][1];

    // int dist = x*x + y*y;

    // if(pq.size() < k){
    // pq.add(new Pair(dist, i));
    // } else {
    // if(pq.peek().dist > dist){
    // pq.poll();
    // pq.add(new Pair(dist, i));
    // }

    // }
    // }
    // int[][] res = new int[k][2];
    // int i = 0;
    // while(!pq.isEmpty()){
    // int index = pq.peek().point;
    // pq.poll();
    // res[i] = points[index];
    // i++;
    // }
    // return res;
    // }

    // class Pair implements Comparable<Pair>{
    // int dist;
    // int point;
    // Pair(int dist, int point){
    // this.dist = dist;
    // this.point = point;
    // }

    // @Override
    // public int compareTo(Pair o){
    // return Integer.compare(o.dist, dist);
    // }
    // }
}
