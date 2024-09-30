#include <stdio.h>
#include <unistd.h>

int int main(int argc, char const *argv[]){
pid_t pid1, pid2;
unsigned long long int mult=1;

	pid1 = fork()
	if(pid1==0){
		sumarPrimos(1000000);
	}
	pid2 = fork();
	if (pid2 == 0){
		multImpar(500000); 
	}
	wait(NULL);
	wait(NULL);
	return 0;
}