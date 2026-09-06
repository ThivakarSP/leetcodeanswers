class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int result = 0;

        for(int i=0;i<=heights.length;i++){
            int curr = (i == heights.length) ? 0 : heights[i];

            while(!st.isEmpty() && heights[st.peek()] > curr){
                int height = heights[st.pop()];

                int width = (st.isEmpty()) ? i : i - st.peek() - 1;

                result = Math.max(result , height * width);
            }

            st.push(i);
        }

        return result;
    }
}