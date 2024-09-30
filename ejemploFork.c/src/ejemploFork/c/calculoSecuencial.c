#include <stdio.h>


int checkPrime(int num)
{
// 0, 1 and negative numbers are not prime
	if(num < 2){
	return 0;
	}
	else{
	// no need to run loop till num-1 as for any number x the numbers in
	// the range(num/2 + 1, num) won't be divisible anyways.
	// Example 36 wont be divisible by anything b/w 19-35
	int x = num/2;
	for(int i = 2; i <=x; i++)
	{
	if(num % i == 0)
	{
	return 0;
	}
  }
}
	// the number would be prime if we reach here
	return 1;
}
	int isOdd(int num){
	return num%2;
}

 int main(int argc, char const *argv[])
{int i=0;
unsigned long long int suma;
unsigned long long int primos;
	for (i<100000; i++;){
		if(checkPrime(i)==1)
			suma=suma+i;
	}
	printf("La suma de los números primos de 1 a 100000 es %d\n", suma);
	for(i<5000000;i++;){
		if(isOdd(i)==1)
			suma=suma+i;
		}
	printf("La suma de los números impares entre 1 y 500000 es %d\n", suma);

	return 0;
}