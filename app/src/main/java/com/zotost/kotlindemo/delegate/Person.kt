package com.zotost.kotlindemo.delegate

import com.zotost.kotlindemo.PropertyChangeAware

/**
 * @Description:
 * @Author: roy
 * @Date: 2019/7/12 11:17
 * @Since: V1.0.0
 * @Version: V1.0.0
 */
class Person (val age:Int):PropertyChangeAware(){
    var _age : Int by  DelegateProperty(age,changeSupport)  //委托属性来绑定更改通知
}