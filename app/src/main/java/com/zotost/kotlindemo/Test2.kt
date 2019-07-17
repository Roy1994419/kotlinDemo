package com.zotost.kotlindemo

/**
 * @Description:
 * @Author: roy
 * @Date: 2019/6/18 14:16
 * @Since: V1.0.0
 * @Version: V1.0.0
 */
class Test2 : Test(1,""),Test3{

    override fun animate(){

    }

    internal fun Tes.getname(){   // 该方法不能低于 Tes的可见性

     }


    internal  open class Tes{
        fun  hhaha(){

        }
    }

    inner class Bg{   //加了 inner 持有外部类引用    不加 不持有
        fun bb(){}
    }
    class Outer {
        fun name(){

        }
        inner class Inner {
            var b = this@Outer;

            fun getOuterReference(): Outer = this@Outer
            fun test( e : Pex):String = when(e){    // 必须添加完所有的子类才不会报错
                is Pex.Tes1 -> ""
                is Pex.Test2 ->"sd"
            }

        }
    }


    /**  密封类
     * Kotlin 为这个问题提供了一个解决方案 sealed 类。为父类添加 sealed
       修饰符，对可能创建的子类做出严格的限制。所有的直接子类必须嵌套在父类中
     */
    sealed  class Pex(){
        class  Tes1(a:String,b:Int): Pex() {}
        class  Test2(a:String):Pex() {}
    }

    open class Vie{
        constructor(name:String ,age:Int){

        }
    }

    class Ts constructor(name:String ,age:Int) : Vie(name,age){
        var name :String = "" ;
        init {
            this.name = name;
        }
    }



    class Bbs(override var name :String ) : Hasss{   //override var name 实现 接口 属性

    }

    class Bbd(text:String) : Hasss{
        override var name:String = text.substringBefore("?")    //重写 接口中的属性
    }

    interface  Hasss{
        var name :String

    }

    class  user (val name: String) {
        var address: String = "unspecified"
            set(value: String) {
                println(
                    """Address was changed for $name:
                    "$field" ->  "$value".""".trimIndent()
                )
                field = value
            }

    }

    class Ds(){
        var st :Int=0
         private set                    //表示这个属性外部类不可以修改   可以获取值
    }


    class Dbss : Any(){  // Any是所有类的父类
        fun ar(){
            Bbse(0).toString()
        }
    }

    data class Bbse(var c:Int){    //加了 data 会自动生产 equals 用来比较实例
        var b :Int  =0;             //  hashCode 用来作为例如 HashMap 这种基于哈希容器的键
        //  toString 用来为类生成按声明顺序排列的所有字段的字符串表达形式
      fun te(){
            this.copy(b)
        }
    }

    /**
     * 委托 把 Collection 的实现委托给 innerlist
     */
    class lise<T> (val innerList : ArrayList<T> = arrayListOf()) : Collection<T> by innerList{
          fun add(element: T){
              //这里可以做额外的操作
              innerList.add(element)

          }
    }

    /**
     *  object 对象都是单列的，包括在object内创建的对象和object对象本身
           创建格式： object 对象名 : 对象类型
     */
    object  Bsef {
        var list  = arrayListOf<String>()
    }


    class Con{
        companion object {  //声明一个空的伴生对象

        }
    }

    //为伴生对象添加扩展函数
    fun Con.Companion.name(){
    }

    fun tes(){
        Con.name();   //调用伴生对象的扩展方法
         dd(object : TsLinsenter{         //  object 关键字不仅仅能用来声明单例式的对象，还能用来声明匿名对象
             override fun hahah() {
                 TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
             }

             override fun bb() {
                 TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
             }

         })

        var bb = object :TsLinsenter{   //类井创建了该类的 个实例，但是并没有给这个类或是实例分配一个名字。
            override fun hahah() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun bb() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
    }

    fun  dd(aa:TsLinsenter){

    }



    interface TsLinsenter{
        fun hahah()
        fun bb()
    }


}