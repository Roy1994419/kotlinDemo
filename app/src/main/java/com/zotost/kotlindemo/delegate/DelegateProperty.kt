package com.zotost.kotlindemo.delegate


import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

/**
 * @Description:
 * @Author: roy
 * @Date: 2019/7/12 11:08
 * @Since: V1.0.0
 * @Version: V1.0.0
 */
class DelegateProperty(var value :Int, val changeSupport: PropertyChangeSupport) {

      operator fun getValue(p: Person, prop:KProperty<*>):Int{
          return value
      }

      //重载约定
    operator fun setValue(p:Person ,pro:KProperty<*>,newVlaue:Int){
        val oldValue = value;
        value = newVlaue;
        changeSupport.firePropertyChange(pro.name,oldValue,newVlaue)
    }
}