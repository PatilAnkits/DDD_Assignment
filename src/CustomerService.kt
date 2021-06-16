class CustomerService {

    fun create(email:String, address:String , accountType: AccountType): Any {
       var customer = create_customer(email,address,accountType)
        return customer
    }

    private fun create_customer(email: String, address: String, accountType: AccountType): Any {
        val customer = Customer(email,accountType,address)
     return customer.create()
    }
}