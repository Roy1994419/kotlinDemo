package com.zotost.kotlindemo

import android.graphics.Point
import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.beans.PropertyChangeListener
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock


class MainActivity : AppCompatActivity() {

     lateinit  var labe :String        //声明一个不需要初始化器的非空类型的属性

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_symbol.setText("哈哈哈哈")


        var lis =  arrayListOf<Testf>()
        for (i in 0 ..10){
             lis.add(Testf())
        }
       var s = lis.get(2)
       var po =  lis.indexOf(s);

        val oneMillion = 1_000_000;
        Log.e("---", "-------------" + oneMillion)

        val a: Int = 500
        print(a === a) // Prints 'true'
        var boxedrA: Int? = a
        var anotherBoxedA: Int? = a
        print(boxedrA === anotherBoxedA) // !!!Prints 'false`!!!
        var b = 12;
        var f: Byte? = 8;
        var d: Int? = f?.toInt();

        for (x in b..a) {
            Log.e("--------" + x.toString(), x.toString());
        };
        if (b !in b..a) {

        }

        arrayOf(1, 2, 3, 4, 5, 6)
        val arrayListOf = arrayListOf<String>("sss", "asss", "ssd")
        for (a in arrayListOf) {
            Log.e("aa $a", a);
        }

        when (b) {
            12 -> Log.e("", "")
        }

        loop@ for (i in 1..100) {
            s@ for (j in 1..100) {
                if (j == 3) {
                    continue@s
                }
                if (j in 5..100)
                    break@loop
            }
        }

        test()
        val price = """${'$'}9.99 """
        Log.e("bb", price)

        /*  "aa".run {
            print("cc")
        }*/

        Person("").test()
      var ab :Person?= null;
      ab?.let { ab.max(0) }  //如果ab等于null 什么都不发生
        //  ab !!.test()   // !!wei为空也会执行 就会抛出异常了
        for (i in 100 downTo 2 step 2) {
            println(i)
        }

        for (i in 1 until 2) {  //1到2-1区间
            println(i)
        }

        var list = arrayListOf("1", "2", "3")

        for ((index, element) in list.withIndex()) {
            println("$index:$element")
        }

        var fs = 3;
        if (fs !in 3..5) {
            print(fs)
        }


        /*   Kotlin 中的 try 关键字就像 if when 样，引入了 个表达式，可以把它的值赋给个变量。*/
        var number = try {
            2
        } catch (e: Exception) {
            3
        }
        print(number)

        hashMapOf(1 to "")


        joinToString(arrayListOf(1,3,4,5),"*","-","-")

        "sdfefe".lastChar();  //调用扩展函数    扩展函数不是类的一部分
          "sef".ls;
        // joinToString(arrayListOf(1,2,3))
        Pair("sd","dd").toString()

       var p  = listOf(){t: Test -> t.b}
                 listOf{t:Test -> t.b}

     var c = listOf(Test(0,"hah"),Test(1,"sdes"))
     c.maxBy { r -> r.b }    //推断 比较

     val sum ={x:Int,y:Int -> println("hahahhahhashesife $x and $y = ") }

        var sd = { x:Int ,y:Int -> test(2,3)}
        test(3,2);

        Person("dsf").test()
        test7(null)
        val tse :String? = null;
          tse.isNullOrEmpty()
        //  test8(Test8())
        lis.filterNotNull(); //是否为nul

     val ss =  mutableListOf<Int>(122,22)
       val noVariable =    arrayListOf<Testf>(Testf(12),Testf(1252),Testf(152))

         test11(noVariable)

     val arrays = arrayOfNulls<String>(10)   //创建容量为10的数组 可以存储null值
          arrays[0] = null;

     var intArray = IntArray(5,{i -> i*2})  //循环计算

        val p2 = Te(12,23);
        val p3 = Te(13,34);

        println( p2 + p3)   // 25  57
        println(p2-p3) ;// -1  -11

        var arlist = arrayListOf(1,2,3);
        var asr = arlist +5;  // 输出 1,2,3,4

         Tes(Point(10,20),Point(20,30)).test()

        var fr =9;
        (0..fr).forEach { print(it) }

     val (nae,dd) = TestStudio().replaceString("sdfsdf.com.sdfe.csdf")
        println(nae)
        println(dd)

       var pe= com.zotost.kotlindemo.delegate.Person(10);
        pe.addPropertyChangeListener(PropertyChangeListener { event -> println("${event.oldValue} to ${event.newValue}") })
        pe._age = 20


        var maps  = hashMapOf<String,String>("sdf" to "df","sdfsdf" to "sdf")

        var tes :String by maps
       // println(tes)


        //----------------------------------------------------高阶函数----------------------------------------------------
     var funType : (Int ,Int) -> Int? = {i,y -> null }  //返回值可空

     var funType2 :((Int,Int) -> Int) ? = null  // 变量可空


       println("ads2122fsf".test12 { it in 'a'..'z' })



      var calculator = getShippingCostCalculator(Delivery.EXPEDITED);   //返回一个函数
      calculator(Order(8))    ; //执行返回的函数

      var const =  Contest();
         const.pex = "sdfsdf"
        const.isT = false
       var funs =  const.getFun()
     var ts=   funs(Person2("sdfsdf","dsfsd",null))

       // lis.filter {  }  内部维持着一个for循环

        val lock:Lock  = ReentrantLock();
        lock.withLock { println("sdfsdfsfdfs") }  //加锁


        readFirstLineFromFile(Environment.getExternalStorageDirectory().absolutePath+File.separator+"MyLog2018-09-04.txt")

        testKotlin();


       var az = ('a'..'z').toList() ;


        val authors= listOf ("Dmitry", "Svetlana")
        val readers = mutableListOf<String> ()
        readers.add("Svetlana")


        readers.filter {it !in authors  }     //高级函数

        countItem(Test7())
        max("nihao","hahah")

        tsetsee(Test9(1))

        val filterList = listOf("sfsd",755,"sdfers")

        println(filterList.filterisinstance<String>())  //输出  sfsd sdfers

    }





        /*
        注意，1. 带 reified 类型参数的 inline 函数不能在 Java 代码中调用   2.普通的内联函数可以像常规函数那样在 Java 中调用一一它们可以被调用而不能被内联

           为什么在 inline 函数中允许这样写 element is T，而普通的类或函数却不行？
           编译器把实现内联函数的字节码插入每一次调用发生的地方。每次你调用带实化类型参数的函数时，编译器都知道这次特定调用
           中用作类型实参的确切类型 因此，编译器可以生成引用作为类型 实参的具体类的字节码 实现
         */
    inline fun <reified T> Iterable<*>.filterisinstance() : List<T>{
        val destination= mutableListOf<T>()
        for (element in this)
        {
            if (element is T) {
                destination.add(element)
            }
        }
            return destination
       }



    /**
     *  类型约束
     * 指定了可以作为类型参数实参的类型必须实现了CharSequence和Appendable两个接口。
     */
    fun <T> tsetsee(sef:T) where T : CharSequence , T : Appendable{

    }

    /**
     *   声明带实化类型参数的函数
     */
    inline fun<reified T> testsdf(vs :Any) = vs is T



     class Demo1<Y :Any>{
         /**
          * 上面指定了 父类  所以  Y 不可能为null
          */
         fun testssdfe(t : Y){
              //这里可以放心的调用
             t.toString()
         }
     }

    class Demo2<Y>{

        fun testssdfe(t : Y){
            //这里不安全
            t?.toString() ?: "我null了就把我退出去吧"
        }
    }

    fun <T : Test7>  countItem(t : T):Double{
         return   t.tess()
    }

    fun<T :Comparable<T>> max(t:T ,y:T): T{
        return if (t >y)  t else y
    }

      inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
        return filterTo(ArrayList<T>(), predicate)
    }


        /**
         *   <T> 声明类型
         */
     fun <T> gets(t :T) : T{
         return  t
     }

    /**
     * 流
     */
    fun readFirstLineFromFile(path: String): String {
    var s  =    BufferedReader(FileReader(path)).use lab@{              //  use保证流会被关闭
            br -> return@lab br.readLine()                             //返回标签   可以标返回的记录  s 就是返回的记录
        }
        println("sdfsdfs")   //这样行 都会执行
      return "sdf"
    }





    fun read(path: String){
        var s  =    StringBuilder().apply ab@ {
                  this@ab.append("aaaa")
        }
       println(s.toString())
    }


    /**
     * 匿名方法  fun (str)
     */
    fun testKotlin(){
      var sss  =  arrayListOf<String>("nihao","bu","hao")
        sss.forEach(fun (str){
            if(str.equals("nihao")) return         //这个return 只是结束当前的匿名方法  但是foreach还是会继续下一个 执行
            println("wwwwwwwwwwwwww")
        })
    }


    data class Person2(
        val firstName: String,
        val lastName: String,
        val phoneNurnber: String?)

    //返回一个函数  通过isT 返回一个具体的函数       有lambda的函数需要加入一个inline 关键字标识内联函数   因为 lambda 调用一次会生成一个类
     class Contest(){
         var isT : Boolean = false
        var pex : String = ""
        inline fun getFun():(Person2) -> Boolean{
              var test = { p : Person2 -> p.firstName.startsWith(pex) || p.lastName .startsWith(pex) }
             if(isT){
                 return test    //因为知道  test的表达式是一个 boolean类型   返回一个函数类型变量
             }else{
                return  {test(it) && it.phoneNurnber!=null}
             }
         }
     }





    fun getShippingCostCalculator(very: Delivery): (Order) -> Double{
        if(very == Delivery.EXPEDITED){
            return {order -> 4.01 * order.itemCount}
        }
        return  {order -> 45.4*order.itemCount }
    }






    enum class Delivery { STANDARD, EXPEDITED }
    class Order(val itemCount: Int)


    /**
     * 里面的参数是一个表达式     println("adsfsf".test12 { it in 'a'..'z' })
     */
    fun String.test12(test:(Char)-> Boolean):String{
          val stringBuffer = StringBuffer();
        for ( i in 0 until  length){
            val  char  = get(i);
             if(test(char)){
                   stringBuffer.append(char)
             }
        }
        return stringBuffer.toString();
    }

    data class TestStudio(val a :String = "dsf",val b :String = "sdf"){
         fun replaceString(c:String):TestStudio{
             val split = c.split(".",limit = 2)
          return  TestStudio(split.get(0),split.get(1))
         }
    }

    class Tes(val left:Point ,val right:Point){
        operator fun  Tes.contains(po : Point) : Boolean{    // 检查一个对象 是否在一个区间内  开区间 不包含最后一个
             return  po.x in left.x until  right.x && po.y in left.y until right.y;
        }


        fun test(){
            var t = Tes(Point(0,3),Point(1,4))
            println(Point(10,20) in t)     //自动调用 contains    左边入参
        }



    }


 data class Te(val z:Int,val y:Int){
      /**
       * 重载二元运算符   +
       */
      operator fun plus(i :Te):Te{
          return Te(z+i.z,y+i.y)
      }

     /**
      * 重载二元运算符 -
      */
     operator  fun minus(i :Te):Te{
         return Te(z - i.z,y - i.y)
     }


     /**
      * 重载一元运算符   -1  取反
      */
     operator fun unaryMinus():Te{
           return Te(-z,-y)
     }
  }


    fun test11(list : ArrayList<Testf>){

        var sdf = list.get(2)
        sdf.age = 13
    }

    fun test7(s2:String?){
        val any = s2 ?.length ?: "s" //等于null就返回 s
    }

    fun test8(s : Test5){
         s.testNu(null)
    }


    fun test(s:Int,y:Int){

    }


    //infix fun Any.to(other: Any) = Pair(this, other)

    fun String.lastChar() : Char = this . get(this .length - 1 )  //扩展函数

     val String.ls : Char   get() = get(length -1);  //扩展属性

      var StringBuilder.yy : Char get() = get(length -1)
      set(value : Char) = this.setCharAt(length-1,value)


    @JvmOverloads    //在有默认参数值的方法中使用@JvmOverloads注解，则Kotlin就会暴露多个重载方法。
    fun <T> joinToString(
        collection: Collection<T>,
        separator: String ="",
        prefix: String = "",
        postfix: String =""
    ): String {
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(element)
        }
           result.append(postfix)
            return result.toString()
        }



    fun test() {
        var arr = arrayOf(1, 2, 34, 5);
        val bbr = emptyArray<Int>();
        val ccr = emptyList<String>()
        arr.forEach {
            if (it > 2) {
                Log.e("test", it.toString());
                return@forEach
            }

        }
        Customer("haha", "bb");


    }

    open class Customer(val name: String) {
        var parent = ""

        constructor(name: String, c: String) : this(name) {
            this.parent = c;
        }

    }

    data class Person(val ame: String, val age: Int? = null) {

        fun max(s: Int) {
            var dw = age ?: 0;
            println(dw)
        }

        fun test(){
            var desr = {p:Person ,r:String -> max(10)}

            var  a =  ::max;  // ::成员引用
            a(2) //代参数调用


            var list = arrayListOf("sd","dsf","dsfsd");

             println(list.filter { it.equals("sd") })
              //输出  [dsf,dsfsd]

            println(list.map { it+"a" })
             //输出 ["sda","dsfa",+"dsfsd"]

      val  maps =   mapOf(0 to "nihao",1 to "buhao");
          println(maps.filterKeys { it.equals("0")})
             //输出 [0=nihao]

            maps.filterValues { it.equals("buhao") }
            //输出 [1 = buhao]

           maps.mapKeys { it.key+1 }
          //输出 [1 = nihao ,2 = buhao]


           maps.all { it.key > 0 }   //找出所有 key大于 0的数
           maps.any { it.key >0 } //找出至少存在一个 key大于0 的数
           maps.count { it.key>0 } // 找出 有几个 key大于0 的 个数

           list.find { it.equals("a") }  //找出一个满足条件的

           list.flatMap { it.toList() }  //输出 "s,d,d,s,f,d,s,f,s,d"
           list.flatMap { it.toList() }.toSet()  //输出 "s,d,f"

           val sdf=  listOf("sdfsf","dfsdfsf");

           kotlin.run {  }

            list.asSequence().filter { it.equals("a") }.map { it+1 }.toList()


            println(generateSequence(0){it+3}.takeWhile { it < 10 }.sum())

         var sss=     this.test3("dfs",object :Runnable{
                    override fun run() {

                    }
                },body());
        }

        fun body() : () -> String {
         return {"sdf"}
        }


        inline  fun <T : Any>  T.test3(name: String, ob :Runnable, noinline body:()->T) : String{
                 ob.run()
                test4(name, { body() })
           return ""
        }


        fun<T> test4(name :String ,body:()->T):T{
            return  body()
        }


        fun test6(){
            val stringBuffer = java.lang.StringBuilder()
            with(stringBuffer){            //with  极简写法 省略 参数名
                for (i in 1..100){
                    append("asdfsd")
                }
                append("sdfsdfsdfdsfsdfdsf")
            }
        }

         val stringBuffer = java.lang.StringBuilder().apply {   //和 with一样的功能
             for (i in 1..100){
                 append("asdfsd")
             }
             append("sdfsdfsdfdsfsdfdsf")
         }.toString()

    }


    class Rectangle(val height: Int, val width: Int) {
        val isSquare: Boolean
            get() {
                return height == width
            }

        val test: Boolean get() = height == width;

        fun fizzBuzz(i: Int) = when {
            i == 5 -> 6
            i == 6 -> 7
            else -> 8
        }



    }

    class Test8 : Test5{
        override fun testNu(name: String?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}