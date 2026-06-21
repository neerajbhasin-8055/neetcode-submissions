class Solution {

    public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();

    for (String str : strs) {
        sb.append(str.length()).append('#');

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + 3) % 26 + 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + 3) % 26 + 'A');
            }
            sb.append(ch);
        }
    }

    return sb.toString();
}
    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();

    int i = 0;

    while (i < str.length()) {
        int j = i;

        // find '#'
        while (str.charAt(j) != '#') {
            j++;
        }

        int len = Integer.parseInt(str.substring(i, j));

        j++; // move past '#'

        String encodedWord = str.substring(j, j + len);

        StringBuilder decoded = new StringBuilder();

        for (char c : encodedWord.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' - 3 + 26) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' - 3 + 26) % 26 + 'A');
            }
            decoded.append(c);
        }

        result.add(decoded.toString());

        i = j + len;
    }

    return result;
}
}
