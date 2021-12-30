// POJOs Class
// "data" keyword is optional. Must use "var" and have default values for all attributes.
data class Book(var title: String = "", var releaseDate: Long = 0, var pageCount: Int = 0, var sales: Long = 0)


fun main() {
  
    // Get the database using the helper class
    val db = MongoDB(LoginInfo("myUsername", "mySecurePassword"), "cluster", "MyDatabaseName")
    
    // Locate the collection "books" with our POJOs class
    val collection = db.collectionOf<Book>("books")
    
    // Find all books in the collection and print their title
    collection.find().forEach {
        println(it.title)
    }
    
}
