// Time Limit Exceeded
class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        String toCompare = "JFK";
        List<String> answer = new ArrayList<String>();
        answer.add(toCompare);

        while (!tickets.isEmpty()) {
            String fromCompare = "";
            for (List<String> ticket : tickets) {
                if (ticket.get(0) == toCompare) {
                    if (fromCompare == null) {
                        fromCompare = ticket.get(1);
                    }
                    if (fromCompare.compareTo(ticket.get(1)) > 0) {
                        fromCompare = ticket.get(1);
                    }
                }
            }
            List<String> tmp = List.of(toCompare, fromCompare);
            tickets.remove(tmp);
            answer.add(toCompare);
            toCompare = fromCompare;
        }

        return answer;
    }
}