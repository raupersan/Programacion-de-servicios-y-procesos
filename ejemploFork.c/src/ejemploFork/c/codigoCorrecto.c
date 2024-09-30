#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	pid_t pid;
// El pid es de tipo pid_t
	pid = fork();
	if (pid == 0) {
// El proceso hijo empieza con pid=0
	exit(1);
	}
//Proceso Padre
	printf("Hola, ¿qué tal? Todo bien, gracias.\\n");
	if (pid == 0) {
	printf("\\tSoy el proceso hijo, mi PID es %d\\n", getpid());
	printf("Estoy bien, gracias por preguntar");
	exit(1);
	}
	printf("Soy el proceso padre, mi PID es %d\\n", getpid());
	return 0;
}