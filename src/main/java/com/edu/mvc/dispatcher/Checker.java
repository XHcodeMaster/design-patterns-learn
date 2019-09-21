package com.edu.mvc.dispatcher;

/**
 * 策略的场景类
 *
 */
public class Checker {
//使用哪一个策略
private IXmlValidate validate;
//xml配置文件的路径
String xmlPath;
//构造函数传递
public Checker(IXmlValidate _validate){
this.validate = _validate;
}
public void setXmlPath(String _xmlPath){
this.xmlPath = _xmlPath;
}
//检查
public boolean check(){
return validate.validate(xmlPath);
}
}