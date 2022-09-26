package turningFunctionIntoMethod

class SimpleDate3(var month: String) {
    fun monthsUntilWinterBreak(): Int {
        return months.indexOf("december") - months.indexOf(this.month)
    }
}