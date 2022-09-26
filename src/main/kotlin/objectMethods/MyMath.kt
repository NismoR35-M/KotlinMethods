package objectMethods

class MyMath {
    /*companion object block to declare method that accepts int and returns int*/
    companion object{
        fun factorial(number: Int): Int{
            /*use higher order function to effectively calculate factorial*/
            return (1..number).fold(1){
                a,b -> a * b
            }
        }
    }
}