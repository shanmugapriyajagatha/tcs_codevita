#include <stdio.h>

int main()
{
    float x1, y1, x2, y2;
    scanf("%f,%f\n%f,%f", &x1, &y1, &x2, &y2);
    
    float x3,y3,x4,y4;
    scanf("%f,%f\n%f,%f", &x3, &y3, &x4, &y4);
    
    float m1 = (y2-y1)/(x2-x1);
    float m2 = (y4-y3)/(x4-x3);
  
    float x_intersection = (y1 - m1 * x1 - y3 + m2 * x3)/(m2-m1);
    float y_intersection = y1 + m1 * (x_intersection - x1);
    
    
    printf("%0.2f,%0.2f", x_intersection, y_intersection);
    
    return 0;
}
