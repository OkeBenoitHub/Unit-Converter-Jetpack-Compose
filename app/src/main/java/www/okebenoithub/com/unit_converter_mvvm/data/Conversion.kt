package www.okebenoithub.com.unit_converter_mvvm.data

data class Conversion(
   val id : Int,
   val description : String,
   val convertFrom : String,
   val convertTo : String,
   val multiplyBy : Double
)
