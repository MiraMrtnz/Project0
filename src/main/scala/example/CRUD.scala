package example

import org.mongodb.scala._
import scala.io.Source
import org.mongodb.scala.model._
import example.Helpers._

object CRUD {
    
    def main(args:Array[String]){
      println("Welcome to CA/NY Outdoor Adventure Portal!")

    
    
    val client: MongoClient = MongoClient()
    val database: MongoDatabase = client.getDatabase("ProjectZeroDB")
    val collection: MongoCollection[Document] = database.getCollection("hikingCollection") 

    val fileName = scala.io.StdIn.readLine()
    println("Reading JSON file...")

    //Import Scala.io.Source
    // Read JSON file in Scala
    
    val jsonString = Source.fromFile("C:/Users/Mira/Downloads/hiking.json").getLines.toList
    println("File Contains: ")
    jsonString.foreach(println)

    println("Converting JSON file to mongoDB Document...")
    val bsonDocuments = jsonString.map(doc => Document(doc))
    
    println("Inserting Document into Database Collection...")
    collection.insertMany(bsonDocuments).printResults()
    } // end main
}
