/* TODO: Determine if each loop would cause an infinite loop or not, 
and what the output would look like. Questions adapted from 
Robby Stigler. */

/* Problem 1 */
for (int total = 19; total >= 0; total = total / 2) {
	System.out.println("total now equals " + total);
}

/* Problem 2 */
int sum = 0;
for (int cur = 0; cur < 5; cur++)
	sum = sum + cur;
	System.out.println("The new sum for " + cur + " is " + sum);

/* Problem 3 */
for (int i = 0; i < 20; i++) {
	System.out.println("i = " + i);
	i = i - 1;
}

/* Problem 4 */
for (int curr = 20; curr >= 0; curr--){
	System.out.println("curr = " + curr);
}

/* Problem 5 */
for (int curr = 0; curr < 0; curr++){
	System.out.println("curr = " + curr);
}

/* ... more problems relating to while loops and do-while loops */