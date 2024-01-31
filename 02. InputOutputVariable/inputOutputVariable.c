#include <stdio.h>

int main(){
	
	int angka;
	float decimal;
	char karakter;
	char string[100];
	
	printf("Input angka = ");
	scanf("%d",&angka);
	getchar();
	printf("Output angka = ");
	printf("%d\n",angka);
	
	printf("Input decimal = ");
	scanf("%f",&decimal);
	getchar();
	printf("Output decimal = ");
	printf("%.2f\n",decimal);
	
	printf("Input karakter = ");
	scanf("%c",&karakter);
	getchar();
	printf("Output karakter = ");
	printf("%c\n",karakter);
	
	printf("Input string = ");
	scanf("%[^\n]",string);
	getchar();
	printf("Output string = ");
	printf("%s",string);
	
	return 0;
}
