//https://leetcode.com/problems/excel-sheet-column-number/submissions/
//https://leetcode.com/problems/factorial-trailing-zeroes/description/
public class ModuloArithmetic {
}
/*
Why we need to Modulo the answer?
The values can go large when say doing multiplication or factorial, which won't fit in long
and then  instead of asking the exact value of the answer,
the problem setters ask the answer modulo some number M;
so that the answer still remain in the range that can be stored easily in a variable.


There are certain requirements on the choice of M:
1. It should just be large enough to fit in an int data type.
2. It should be a prime number.
10^9 + 7 fits both criteria; which is why you nearly always find 10^9 + 7 in modulo type questions.
Logic - If it is not  a prime number the probability of getting intermediate 0 is possible

Some basic knowledge of modulo arithmetic is required to understand this part.

A few distributive properties of modulo are as follows:
1. ( a + b ) % c = ( ( a % c ) + ( b % c ) ) % c
2. ( a * b ) % c = ( ( a % c ) * ( b % c ) ) % c
3. ( a – b ) % c = ( ( a % c ) - ( b % c ) ) % c
Write above while programming to handle negative values. Mod works different
for negative numbers:

a=(a%c);
b=(b%c);
ans=( a - b )%c;  -- this is correct mathematically

instead use

a=a%c;
b=b%c;
ans = ( a - b + c ) % c;// to ensure u always +ve n0.

4. ( a / b ) % c NOT EQUAL TO ( ( a % c ) / ( b % c ) ) % c
We use The modulo multiplicative inverse ( MMI ) of a number.
MMI of b is z iff (z * b) % c == 1.

Eg. if M= 7 the MMI of 4 is 2 as ( 4 * 2 ) %7 ==1,
if M=11, the MMI of 7 is 8 as ( 7 * 8 )%11 ==1,
if M=13, the MMI of 7 is 2 as ( 7 * 2 ) % 13==1.

So ( a / b ) % c is written as
Find mmi for b as mmi= MMI(b,c) s.t. (b * mmi) %c = 1
then : ( a / b ) % c <==>  (a * mmi )%M


So, modulo is distributive over +, * and - but not / .

One observation that I’d like to make here is that the result of ( a % b )
will always be less than b.








 */