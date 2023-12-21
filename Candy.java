vector<int> candies(N, 1);

        for(int i = 1; i < N; i++)
 {
            if(ratings[i] > ratings[i-1])
 {
                candies[i] = candies[i-1] + 1; 
            }
        }

        for(int i = N-2; i >= 0; i--)
 {
            if(ratings[i] > ratings[i+1] && candies[i] <= candies[i+1]) {
                candies[i] = candies[i+1] + 1;
            }
        }

        int result = 0;
        for(int candy : candies)
 {
            result += candy;
        }
        return result;
