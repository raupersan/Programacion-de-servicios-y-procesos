#include <stdio.h>
#include <unistd.h>

int main() {
	pid_t pid1, pid2, pidh1, pidh2;
	
	pid1=fork();
	if(pid1==0) {//Primer hijo, no genera nada, solo imprime
		printf("PID del proceso: %d\nPPID del proceso: %d\n", getpid(), getppid());
		exit(1);
	}//Estamos otra vez en el padre porque hemos hecho un exit en el hijo
	pid2=fork();
	if(pid2==0) {
		pidh1=fork();
		if(pidh1==0) {
			printf("PID del proceso: %d\nPPID del proceso: %d\n", getpid(), getppid());
			exit(2);
		}
		pidh2=fork();
		if(pidh2==0) {
			printf("PID del proceso: %d\nPPID del proceso: %d\n", getpid(), getppid());
			exit(2);
		}
		printf("PID del proceso: %d\nPPID del proceso: %d\nPID de los procesos hijos que ha creado: %d y %d\n", getpid(), getppid());
		wait(NULL);
		wait(NULL);
	}
	wait(NULL);
	wait(NULL);
	
	return 0;
}
