import extensionMethods.SimpleDat
import objectMethods.MyMath
import turningFunctionIntoMethod.SimpleDate1
import turningFunctionIntoMethod.SimpleDate2
import turningFunctionIntoMethod.SimpleDate3

fun main(args: Array<String>) {
    //method
    val date2 = SimpleDate2("may")
    println(date2.monthsUntilWinterBreak(date2))

    //using this keyword
    val date3 = SimpleDate3("september")
    println(date3.monthsUntilWinterBreak())

    //object method, you can use it to access data across all instances.
    val factorial = MyMath.factorial(6)
    println(factorial)

    //extension methods
    val date = SimpleDat()
}