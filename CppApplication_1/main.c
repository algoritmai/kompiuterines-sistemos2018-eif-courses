#include <stdio.h>
#include <stdlib.h>
#include <string.h>
//#include "student.h"

//struct Auditorija{
//    int nr;
//    char tipas[25];
//    float plotas;
//}aud202, aud205;

void suma(int a, int b){
    printf("void:suma:%d", a+b);
}
// a=777 + b=111
int suma_int(int a, int b){
    return a+b; // 888
}




int skaicius(){
    int i = 0;
    for(i=0; i< 100; i++){
        i+= 59; // i = i + 59;   
    }
    return i;
}



int main() {

    //suma(90, 100);
                     // 888
    int rezultatas = suma_int(777, 111) * 2 / 30 + suma_int(99, 36) + skaicius();
    
    // (0..100]
    for(int i=0; i <= 100; i++){
        if(i % 20 == 0){
            printf("VALIO:%d\n", i);
            if(i == 60){
                printf("LAIMEJOTE LOTERIJOJE:%d\n", i);
            }
        }
    }
    
    int k = 0;
    while(k < 10){
        printf("While ciklas:");
        k+=1;
        
    }
    
    
    
    printf("rezultatas:%d", rezultatas);
    
//    struct Auditorija aud321;q
//    
//    // 321 aud.
//    aud321.nr = 321;
//    aud321.plotas = 60.2589;
//    strcpy(aud321.tipas, "Kompiuterine");
//    // 202 aud.
//    aud202.nr = 202;
//    aud202.plotas = 30.2589;
//    strcpy(aud202.tipas, "Teorine");
//    // 205 aud. 
//    aud205.nr = 205;
//    aud205.plotas = 20.2589;
//    strcpy(aud205.tipas, "Kompiuterine");
//    
//    
//    struct Auditorija masyvas[3] = {aud321, aud202, aud205};
//    
//    int i;
//    for (i = 0; i < 3; i++) {
//        printf("Auditorijos info: \n nr:%d;\n plotas:%.4f;\n tipas:%s \n", 
//                masyvas[i].nr, masyvas[i].plotas, masyvas[i].tipas);
//    }
//    
//    
//    //printf("Auditorijos info: \n nr:%d;\n plotas:%.4f;\n tipas:%s \n", aud202.nr, aud202.plotas, aud202.tipas);
//    //printf("Auditorijos info: \n nr:%d;\n plotas:%.4f;\n tipas:%s \n", aud321.nr, aud321.plotas, aud321.tipas);
//    //printf("Auditorijos info: \n nr:%d;\n plotas:%.4f;\n tipas:%s \n", aud205.nr, aud205.plotas, aud205.tipas);
//   
//    
//    
//    //int a;
//    float f;
//    char l;
//    //int masyvas[25];
//    int *rodyke;
//    
//    
    
    //spausdinti(560);
    //suma(10, 60);
    return 0;
}

