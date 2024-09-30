#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	pid_t pid;
	printf("Hola, ¿qué tal?\n");
	// Crear un proceso hijo
	pid = fork();
	if (pid == -1) {
	// Error al crear el proceso hijo
	perror("fork failed");
	exit(1);
	}
	if (pid == 0) {
	printf("\tSoy el proceso hijo, mi PID es %d\n", getpid());
	printf("Estoy bien, gracias por preguntar");
	}
	printf("Soy el proceso padre, mi PID es %d\n", getpid());
	return 0;
}