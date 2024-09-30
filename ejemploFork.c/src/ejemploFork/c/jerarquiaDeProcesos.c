#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
	pid_t pid1, pid2, pidh1, pidh2;
	
	pid1=fork();
	if(pid1==0) {//Primer hijo, no genera nada, solo imprime
		printf("PID del proceso hijo 1: %d\nPPID del proceso: %d\n", getpid(), getppid());
		exit(1);
	}//Estamos otra vez en el padre porque hemos hecho un exit en el hijo
	pid2=fork();
	if(pid2==0) {
		pidh1=fork();
		if(pidh1==0) {
			printf("PID del proceso hijo del segundo hijo: %d\nPPID del proceso: %d\n\t", getpid(), getppid());
			exit(2);
		}
		pidh2=fork();
		if(pidh2==0) {
			printf("PID del segundo proceso hijo del hijo: %d\nPPID del proceso: %d\n\t", getpid(), getppid());
			exit(2);
		}
		printf("PID del segundo proceso hijo: %d\nPPID del proceso: %d\nPID de los procesos hijos que ha creado: %d y %d\n", getpid(), getppid(), pidh1, pidh2);
		wait(NULL);
		wait(NULL);
	}//Estamos otra vez en el padre
		printf("PID del proceso padre: %d\nPPID del proceso: %d\nPID de los procesos hijos creados: %d y %d\n", getpid(), getppid(), pid1, pid2);
	wait(NULL);
	wait(NULL);
	
	return 0;
}
