 fun main(){
    val customer= CustomerService()
     val data = customer.create("patilankit.sh@gmail.com","Pune",AccountType.ADMIN)
     val data2 = customer.create("ankit.patil@scalereal.com","Jalgaon",AccountType.CUSTOMER)
     println(data.toString())
     println(data2.toString())
 }
 enum class AccountType{
  ADMIN,
  CUSTOMER
 }
