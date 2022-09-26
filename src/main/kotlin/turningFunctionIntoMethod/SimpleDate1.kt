package turningFunctionIntoMethod

//create array of months
val months = arrayOf(
    "january", "february","march","april","may","june","july","august","september","october","november","december"
)

class SimpleDate1(var month: String) {

    fun monthsUntilWinterBreak(from: SimpleDate1): Int {
        return months.indexOf("december") - months.indexOf(from.month)
    }
}