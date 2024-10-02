// Memory Limit Exceeded
class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        String compare = "JFK";
        List<String> answer = new ArrayList<String>();
        answer.add(compare);

        while (!tickets.isEmpty()) {
            PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
            
            for (List<String> ticket : tickets) {
                if (ticket.get(0) == compare) {
                    pq.offer(ticket.get(1));
                    tickets.remove(ticket);
                }
            }
            while (pq.size() > 1) {
                List<String> checkList = List.of(compare, pq.poll());
                tickets.add(checkList);
            }
            compare = pq.poll();
            answer.add(compare);
        }

        return answer;
    }
}