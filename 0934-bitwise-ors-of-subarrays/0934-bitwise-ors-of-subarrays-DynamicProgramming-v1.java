class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> prev = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : arr){
            Set<Integer> current = new HashSet<>();

            current.add(num);

            for(int val : prev){
                current.add(val | num);
            }

            result.addAll(current);
            prev = current;
        }

        return result.size();
    }
}