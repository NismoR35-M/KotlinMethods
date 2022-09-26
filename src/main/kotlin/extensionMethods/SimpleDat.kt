package extensionMethods

import turningFunctionIntoMethod.SimpleDate1
import turningFunctionIntoMethod.months

class SimpleDat {

    fun SimpleDate1.monthsUntilSummerBreak(): Int{
        val monthIndex = months.indexOf(month)
        return if (monthIndex in 0..months.indexOf("june")){
            months.indexOf("june")- months.indexOf(month)
        }else if (monthIndex in months.indexOf("june")..months.indexOf("august")){
            0
        }else{
            months.indexOf("june") + (12 - months.indexOf(month))
        }
    }
}