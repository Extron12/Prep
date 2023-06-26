#include <stdio.h>
#include <string.h>

int main(){
    char name[25];
    int age;
    printf("What is your name?\n");
    fgets(name, 25, stdin);
    name[strlen(name) -1] = '\0';

    printf("\nWhat is your age?\n");
    scanf("%d", &age);

    printf("\nYour name is %s\n", name);
    printf("Your age is %d", age);
    return 0;
}
