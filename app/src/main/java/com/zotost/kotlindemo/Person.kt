package com.zotost.kotlindemo

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * @Description:
 * @Author: roy
 * @Date: 2019/7/12 10:09
 * @Since: V1.0.0
 * @Version: V1.0.0
 */
class Person( val names:String, sex:Int,  age:Int,salary:Int) :PropertyChangeAware(){
     private val observer = {            // 变动通知
         prop:KProperty<*> , oldValue:Int ,newValue :Int ->changeSupport.firePropertyChange(prop.name,oldValue,newValue)
     }
    var age :Int by Delegates.observable(age,observer)
    var salary :Int by Delegates.observable(salary,observer)
    var sex :Int by Delegates.observable(sex,observer)
}