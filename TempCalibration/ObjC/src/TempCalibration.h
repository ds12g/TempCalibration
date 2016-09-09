# import <Foundation/Foundation.h>

@interface TempCalibration: NSObject{
  float _initialResistance;
  float _finalResistance;
  float _initialTemperature;
  float _finalTemperature;
  float _slope;

}

-(float)getInitialResistance;
-(void)setInitialResistance:(float)r1;
-(float)getFinalResistance;
-(void)setFinalResistance:(float)r2;
-(float)getInitialTemperature;
-(void)setInitialTemperature:(float)t1;
-(float)getFinalTemperature;
-(void)setFinalTemperature:(float)t2;

-(float)getSlope;
-(void)displayEquation;
@end
