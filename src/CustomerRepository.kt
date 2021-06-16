class CustomerRepository {
    fun addData(customer_id: Int , email:String , accountType:AccountType ,address: String): Any {
        var data = "Data save successfully customer_id = $customer_id , Email = $email, AccountType = $accountType , Address = $address"
        return data
    }
}