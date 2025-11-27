public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int steps = 2;
        boolean [] prime = new boolean[n+1]; 
        for(int i=0;i<=n;i++){
            prime[i]=true;
        }
        while (steps*steps<=n) {
            if (prime[steps]) {
                int multiple = steps * steps;
                while (multiple <= n) {
                    prime[multiple] = false;
                    multiple = multiple + steps;
                }
            }
            steps++;
            
        }
    }
}