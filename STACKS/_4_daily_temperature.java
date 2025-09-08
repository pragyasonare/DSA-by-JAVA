package STACKS;

public class _4_daily_temperature {
    
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length ;
        int [] ans = new int [n] ;
        Stack<Integer> s = new Stack<>();

        for(int i=0 ; i<n ; i++){
            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){
                int idx = s.pop();
                ans[idx] = i - idx ;
            }
            s.push(i) ;
        }
        return ans ; 
        
    }
}
    

