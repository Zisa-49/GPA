#include<stdio.h>
int main()
{
    int mark;
    printf("enter the mark:");
    scanf("%d",&mark);

    if(mark>=0 && mark<=40)
        printf("GPA F");
    else if(mark>=40 && mark<=44)
        printf("GPA E");

    else if(mark>=45 && mark<=49)
        printf("GPA D");

        else if(mark>=50 && mark<=54)
        printf("GPA C");

        else if(mark>=55 && mark<=59)
        printf("GPA C+");

        else if(mark>=60 && mark<=64)
        printf("GPA B");

        else if(mark>=65 && mark<=69)
        printf("GPA B+");

        else if(mark>=70 && mark<=74)
        printf("GPA A-");

        else if(mark>=75 && mark<=79)
        printf("GPA A");

        else if(mark>=80 && mark<=100)
        printf("GPA A+");

        else
            printf("Error!");

        return 0;
}
