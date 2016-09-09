# import "TempCalibration.h"

@implementation TempCalibration

-(float)getInitialResistance{
  return _initialResistance;
}
-(void)setInitialResistance:(float)r1{
  _initialResistance = r1;
}
-(float)getFinalResistance{
  return _finalResistance;
}
-(void)setFinalResistance:(float)r2{
  _finalResistance = r2;
}
-(float)getInitialTemperature{
  return _initialTemperature;
}
-(void)setInitialTemperature:(float)t1{
  _initialTemperature = t1;
}
-(float)getFinalTemperature{
  return _finalTemperature;
}
-(void)setFinalTemperature:(float)t2{
  _finalTemperature = t2;
}
-(float)getSlope{

_slope = ([self getFinalTemperature]-[self getInitialTemperature])/([self getFinalResistance]-[self getInitialResistance]);

  return _slope;
}
-(void)displayEquation{

  NSLog(@"Equation --->\tT(x) = %f(x-%f) + %f",_slope,_finalResistance,_finalTemperature);
}

@end
