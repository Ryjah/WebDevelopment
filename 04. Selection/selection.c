#include <stdio.h>

int main(){
	
	int input1,input2,input3;
	
	
	printf("Input nilai = ",input1);
	scanf("%d",&input1);
	printf("Batas bawah = ",input2);
	scanf("%d",&input2);
	printf("Batas atas = ",input3);
	scanf("%d",&input3);
	
	
	if(input1>=input2 && input1<=input3){
		printf("%d diantara %d dan %d",input1,input2,input3);
	}
	else{
		printf("%d tidak diantara %d dan %d",input1,input2,input3);
	}
	
	return 0;
}
