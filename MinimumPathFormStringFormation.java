/*
Time Complexity: O(n*m), n is the length of source, and m is the length of target
Space Complexity: O(1), constant space
Run on leetcode: yes
Any difficulties: no

Approach:
1. Attempted once discussed in the class
 */
public class MinimumPathFormStringFormation {
    public static int shortestStringFormation(String source, String target){
        int sourceIndex = 0;
        int targetIndex = 0;
        int count = 1;
        int prev = -1;
        while(targetIndex<target.length()){
            if(sourceIndex == source.length()){
                sourceIndex = 0;
                count++;
            }

            char sourceChar = source.charAt(sourceIndex);
            char targetChar = target.charAt(targetIndex);

            if(sourceChar == targetChar){
                prev = sourceIndex;
                sourceIndex++;
                targetIndex++;
            }else{
                if(sourceIndex == prev){
                    return -1;
                }
                sourceIndex++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println("Shortest Path to form String: "+ shortestStringFormation("abc", "abcbc"));
    }
}
