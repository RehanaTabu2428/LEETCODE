class Solution {

    public List<String> restoreIpAddresses(String s) {

        List<String> answer = new ArrayList<>();

        backtrack(s, 0, new ArrayList<>(), answer);

        return answer;
    }

    public void backtrack(String s, int start,
                          List<String> current,
                          List<String> answer) {

        // We have 4 parts
        if (current.size() == 4) {

            // Make sure we used the whole string
            if (start == s.length()) {
                answer.add(String.join(".", current));
            }

            return;
        }

        // Try taking 1, 2 or 3 digits
        for (int i = start; i < s.length() && i < start + 3; i++) {

            String part = s.substring(start, i + 1);

            // Leading zero
            if (part.length() > 1 && part.charAt(0) == '0') {
                break;
            }

            // Value must be <= 255
            if (Integer.parseInt(part) > 255) {
                break;
            }

            // Choose
            current.add(part);

            // Explore
            backtrack(s, i + 1, current, answer);

            // Undo
            current.remove(current.size() - 1);
        }
    }
}