class Solution {
    
    int[] makepallin(int[] num)

    {

        int n = num.length;

        int[] a = new int[n];

        for(int i=0;i<=(n-1)/2;i++)

        {

            a[i] = num[i];

            a[n-1-i] = num[i];

        }

    return a;

    }

    boolean compare(int[] a,int[] b)

    {

        for(int i=0;i<a.length;i++)

        {

            if(a[i] == b[i])

                continue;

            if(a[i]>b[i])

            return true;

            else return false;

        }

    return  false;

    }

    boolean isALL9(int[] num)

    {

        for(int i=0;i<num.length;i++)

        {

            if(num[i] != 9) return false;

        }

        return true;

    }
    
    Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
         Vector<Integer> ans = new Vector<>();

        int arr[] = makepallin(num);

        if(isALL9(num))

        {

            ans.add(1);

            for(int i=1;i<n;i++) ans.add(0);

            ans.add(1);

            return ans;

        }

        if(compare(arr,num))

        {

            for(int i=0;i<arr.length;i++)

            {

                ans.add(arr[i]);

            }

        return ans;

        }

        int carry = 1;

        n = arr.length;

        for(int i=(n-1)/2;i>=0;i--)

        {

            int t = carry + arr[i];

            if(t == 10)

            {

                t = 0;

                carry = 1;

            }

            else carry = 0;

            

            

            arr[i] = t;

        }

        int ar[] = makepallin(arr);

        for(int i=0;i<ar.length;i++)

        {

            ans.add(ar[i]);

        }

    return ans;
    }
}
