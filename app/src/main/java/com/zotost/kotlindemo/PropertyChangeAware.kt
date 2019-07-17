package com.zotost.kotlindemo

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 * @Description:
 * @Author: roy
 * @Date: 2019/7/12 10:11
 * @Since: V1.0.0
 * @Version: V1.0.0
 */
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)
    fun addPropertyChangeListener(listener:PropertyChangeListener){
        changeSupport.addPropertyChangeListener(listener)
    }
    fun removePropertyChangeListener(listener:PropertyChangeListener){
        changeSupport.removePropertyChangeListener(listener)
    }
}