# import <Foundation/Foundation.h>
# import "TempCalibration.h"

int main (int argc, const char *argv[]){
  @autoreleasepool{
    TempCalibration *test = [[TempCalibration alloc]init];
    float inputInintialTemp,inputFinalTemp,inputInitialResistance,inputFinalResistance;
    
    NSLog(@"Initial Temp :");
    scanf("%f", &inputInintialTemp);

    NSLog(@"Final Temp : ");
    scanf("%f",&inputFinalTemp);

    NSLog(@"Initial Resistance :");
    scanf("%f",&inputInitialResistance);

    NSLog(@"Final Resistance :");
    scanf("%f",&inputFinalResistance);

    [test setInitialTemperature:inputInintialTemp];
    [test setFinalTemperature:inputFinalTemp];
    [test setInitialResistance:inputInitialResistance];
    [test setFinalResistance:inputFinalResistance];

    float inTemp, inRes, finTemp, finRes, slope;

    inTemp = [test getInitialTemperature];
    finTemp = [test getFinalTemperature];
    inRes = [test getInitialResistance];
    finRes = [test getFinalResistance];
    slope = [test getSlope];

    NSLog(@"%f\t%f\t%f\t%f\t%f", inTemp, finTemp,inRes, finRes, slope);
    [test displayEquation];
  }
  return 0;
}
