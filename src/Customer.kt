 class Customer(
     var email: String,
     var accountType: AccountType = AccountType.CUSTOMER,
     var address: String)
{

    fun generate_id(): Int {
        val rnds = (0..10).random()
        return rnds
    }
    fun create(): Any {
        val repo = CustomerRepository()
        return repo.addData(generate_id(), email, accountType , address)
    }
}