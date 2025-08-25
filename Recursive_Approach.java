public class Main {
    static int SumofN(int x){
        if(x==1) return 1;
        return x+SumofN(x-1);
    }
    public static void main(String[] args) {
        System.out.println(SumofN(5));
    }
}

/*

Think like this:

The sum of first n numbers = n + sum of first (n-1) numbers.

Base case: when n == 1, sum is 1.

That’s all — only one recursive call, not two.


Approach :


When I see a recursive problem, I ask:

Can I express the problem in terms of a smaller version of itself?

Here: Sum(n) = n + Sum(n-1)

What’s the simplest version (base case)?

For n=1, answer is 1.

Do I need one recursive branch or multiple?

If it’s a sequence like Fibonacci → 2 branches (f(n)=f(n-1)+f(n-2)).

If it’s a linear sum → 1 branch (Sum(n)=n+Sum(n-1)).

This way I avoid mixing up Fibonacci-style recursion with simple recursion.

Visual Trace :
Step 1 : Call starts : 
SumofN(5) - Not base case → return 5 + SumofN(4)

Step 2: Inside SumofN(4)
SumofN(5) = 5 + SumofN(4)
SumofN(4) = 4 + SumofN(3)

Step 3: Inside SumofN(3)
SumofN(5) = 5 + (4 + SumofN(3))
SumofN(3) = 3 + SumofN(2)

Step 4: Inside SumofN(2)
SumofN(5) = 5 + (4 + (3 + SumofN(2)))
SumofN(2) = 2 + SumofN(1)

Step 5: Base case reached
SumofN(1) = 1


Now the stack unwinds (values bubble back up)

SumofN(2) = 2 + 1 = 3
SumofN(3) = 3 + 3 = 6
SumofN(4) = 4 + 6 = 10
SumofN(5) = 5 + 10 = 15


Call Stack (Top → Bottom)

SumofN(5) → needs SumofN(4)
    SumofN(4) → needs SumofN(3)
        SumofN(3) → needs SumofN(2)
            SumofN(2) → needs SumofN(1)
                SumofN(1) → returns 1



When recursion starts returning :
SumofN(1) = 1
SumofN(2) = 2 + 1 = 3
SumofN(3) = 3 + 3 = 6
SumofN(4) = 4 + 6 = 10
SumofN(5) = 5 + 10 = 15


*/


/*

Fibonacci Style : (Works but avoid)

static int SumofN(int x){
    int sum = 1;
    if(x==1){
        return 1;
    }
    else if(x==2){
        return 3;
    }
    else{
        sum = sum + SumofN(x-1) + SumofN(x-2);
    }
    return sum;
}

*/


/*
Busting the Top-Down vs Bottom-Up in Recursion Confusion

Top-Down (the way we think about recursion)
You define the problem in terms of smaller subproblems.

Example: Sum(n) = n + Sum(n-1)


Bottom-Up (the way recursion actually executes)
Even though you write recursion in top-down form, the actual computation only happens once the base case is reached.

Example with Sum(5):

Sum(5) → needs Sum(4)
Sum(4) → needs Sum(3)
Sum(3) → needs Sum(2)
Sum(2) → needs Sum(1)
Sum(1) = 1   (base case)

Then the values “bubble up”:

Sum(2) = 2 + 1
Sum(3) = 3 + 3
Sum(4) = 4 + 6
Sum(5) = 5 + 10


So recursion is written in a top-down way, but evaluated bottom-up when the call stack unwinds.



Bottom-Up without recursion (DP style)

If you solve the same using iteration (or DP), you’d do:

int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}

This is explicitly bottom-up: you start from 1 and build up to n.

So recursive SumofN(n) is:

Top-down in definition (since Sum(n) depends on Sum(n-1))
Bottom-up in execution (since it waits until the base case, then unwinds upward).

*/
