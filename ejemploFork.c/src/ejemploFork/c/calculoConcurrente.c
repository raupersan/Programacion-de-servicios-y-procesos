#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int checkPrime(int num)
{
	if(num < 2){
	return 0;
	}
	else{
	int x = num/2;
	for(int i = 2; i <=x; i++)
	{
	if(num % i == 0)
	{
	return 0;
	}
  }
}
	return 1;
}
	int isOdd(int num){
	return num%2;
}

int main(int argc, char const *argv[]){
pid_t pid1, pid2;
unsigned long long int suma=0;
unsigned long long int mult=1;
int i=0;
int j=1;
	pid1 = fork();
	if(pid1==0){
		for (i=0; i<1000000; i++){
		if(checkPrime(i)==1)
			suma=suma+i;
	}
	printf("La suma de los números primos de 1 a 1000000 es %d\n", suma);
	exit(0);
	}
	pid2 = fork();
	if (pid2 == 0){
	for(j=1; j<5000000;j++){
		if(isOdd(j)==1)
			mult=mult*j;
		}
	printf("El producto de los impares del 1 al 500000 es %d\n", mult);
	exit(0);
	}
	wait(NULL);
	wait(NULL);
	return 0;
}