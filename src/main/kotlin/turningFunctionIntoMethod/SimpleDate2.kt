package turningFunctionIntoMethod

class SimpleDate2(var month: String) {
    fun monthsUntilWinterBreak(from: SimpleDate2) : Int {
        return  months.indexOf("december") - months.indexOf(from.month)
    }
}