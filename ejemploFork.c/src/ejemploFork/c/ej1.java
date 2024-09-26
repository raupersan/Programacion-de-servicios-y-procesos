#include <stdio.h>
#include <unistd.h>

	int main() {
		pid_t pid;
		pid=fork();
		if(pid==0) {
			printf("Hola, soy el proceso hijo con PID: %d y PPID: %d", getpid(), getppid());
			exit(0);
			}
		printf("Hola, soy el proceso padre con PID:%d y\r\n", getpid());
		wait(NULL);
		return 0;
	}
