public class Count_sentence_no {
    public static void main(String[] args) {

        String ans = "Poonam  Bhavsar"; 
        int count = 0;

        for (int i = 1; i < ans.length(); i++) {
            if (ans.charAt(i) == ' ') {
                count++;        
            }
        }

        System.out.println("Total length with space = " + (count + 1));
    }
}
