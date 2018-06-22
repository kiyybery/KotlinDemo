package xyn.kotlin.demo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    //数字装箱后不保留同一性
    fun boxedA() {
        val a: Int = 10000
        println(a === a) // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA === anotherBoxedA)
    }

    //数字装箱保持相等
    fun boxedB() {
        val a: Int = 10000
        println(a == a) // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA == anotherBoxedA)
    }

    //显式转化类型
    fun toTravel() {
        //val b: Byte = 1 // OK, 字面值是静态检测的
        //val i: Int = b // 错误
        val b: Byte = 1
        val i: Int = b.toInt()
        println(i)
    }

    //隐式适当转化
    fun toTravel1() {
        val l = 1L + 3 // Long + Int => Long
        println(l)
    }

    fun toMax(a: Int, b: Int) {
        val a: Int = a
        val b: Int = b
        val max = if (a > b) a else b
        println(max)
    }

    fun toMax1(c: Int, d: Int) {
        val max = if (c > d) {
            print("choose c")
            c
        } else {
            print("choose d")
            d
        }
        println(max)
    }

    fun whenFun(x: Int) {
        when (x) {
            1 -> toMax(x, 6)
            2 -> toMax1(1, x)
            else -> {
                print("x is neither 1 nor 2")
            }
        }
    }

    fun whenFun1(x: Int) {
        when (x) {
            in 1..10 -> print("在1-10区间内")
            !in 10..20 -> print("不在10-20的区间内")
            else -> print("哪里都不在")
        }
    }

    fun hasPrefix(x: Any) = when (x) {
        is String -> print(x.startsWith("prefix"))
        else -> false
    }

    @Test
    fun addition_isCorrect() {
//        boxedA()
//        boxedB()
//        toTravel()
//        toTravel1()
//        toMax(20, 50)
//        toMax1(2, 90)
//        whenFun(1)
//        whenFun1(11)
        hasPrefix("prefix")
    }

}
