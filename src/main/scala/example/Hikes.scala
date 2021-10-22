// package hiking.trails

// import org.mongodb.scala._
// import org.mongodb.scala.model._
// import scala.io.Source
// import org.mongodb.scala.model.Filters._
// import org.mongodb.scala.model.Sorts._
// import org.mongodb.scala.model.Projections._
// import org.mongodb.scala.model.Aggregates._
// import org.mongodb.scala.model.Updates._
// import example.Helpers._
// import scala.collection.mutable.SortedSet

// object Hiking {
//     def main(args:Array[String]){
//       println("Welcome to CA/NY Outdoor Adventure Portal!")

//       stateSelection
       
//     }

//     val client: MongoClient = MongoClient()
//     val database: MongoDatabase = client.getDatabase("ProjectZeroDB")
//     val collection: MongoCollection[Document] = database.getCollection("hikingCollection") 

//     var num = 0
      
//       def createDocObserve{
//       val doc: Document = Document(
//       "Trail_id" -> Document("trail_id"), 
//       "nametype" -> Document("Park_Name"),
//       "difficulty" -> Document("trail_level"),
//       "activities" -> Document ("trail_activity"),
//       "trail_length" -> Document ("length"),
//       "State_info" -> Document("a" -> "A", "b" -> "B") //part CA from NY trails
//       )

//       val observable: Observable[Completed] = collection.insertOne(doc)
//       collection.insertOne(doc).results()

//       }
    
//       def stateSelection{
//             println("Select your State")
//             var setOne: Set[String] = Set("1: California", "2: New York")
            
            
//             for(x <- setOne){
//             println(x)
//             }

//             var x = 0
//             var y = 0
//             var name = ""
//             var num = 0  
            
//             num = scala.io.StdIn.readInt //user input--import scala.io.Source
//             //println(s"You selected $num")

//             num match{
//             case 1 => println("You have chosen California. Select an Option:")
//                         println("1: Browse through National Park")         
//                         println("2: Browse through Park trails")
//                         println("3: Choose your level of difficulty")
//                         println("4: Choose preferred activity")
//                         println("5: Choose length of trail")
//                         println("6: Not sure? Customize and Add to Index")   //Create--Update-- concept
//                         num = scala.io.StdIn.readInt 
//                         //Wild Card Adventure option?
            
//                         num match{
//                               case 1 => collection.find(equal("Trail_id","A")).sort(ascending("park_name")).limit(5).printResults() //$lt call on trail_id NOT NY
//                               case 2 => collection.find(equal("Trail_id","A")).sort(ascending("trail_name")).limit(5).printResults()
//                               case 3 => 
//                                           println("Choose your difficulty")
//                                           var listOfDifficulty: SortedSet[String] = SortedSet("1", "2", "3", "4", "5")
                                          
//                                           for(x <- listOfDifficulty){
//                                                 println(x)
//                                           }

//                                           num = scala.io.StdIn.readInt

//                                           /*num match{
//                                                 case 1 => collection.find(equal("Trail_id","A", {"Difficulty": equal{$lte: 1}}).sort(ascending("park_name")).limit(5).printResults()
//                                                 case 2 => collection.find(equal("Trail_id","A", {"Difficulty": equal{$lte: 2}}).sort(ascending("park_name")).limit(5).printResults()
//                                                 case 3 => collection.find(equal("Trail_id","A", {"Difficulty": equal{$lte: 3}}).sort(ascending("park_name")).limit(5).printResults()
//                                                 case 4 => collection.find(equal("Trail_id","A", {"Difficulty": equal{$lte: 4}}).sort(ascending("park_name")).limit(5).printResults()
//                                                 case 5 => collection.find(equal("Trail_id","A", {"Difficulty": equal{$lte: 8}}).sort(ascending("park_name")).limit(5).printResults()
//                                           }*/

//                               case 4 => println("Choose activity: \"birding\", \"hiking\", \"climbing\"") // determine if string function needed
//                                     collection.find(equal($lt,"B001")).sort(ascending("trail_length")).limit(5).printResults()
//                               case 5 => println("Choose length of Trail: \".05 miles\", \"8 miles\"") // less than or greater function needed
//                                     collection.find(equal($lt,"B001")).sort(ascending("trail_length")).limit(5).printResults()
//                               case 6 => collection.find(equal($lt,"B001")).limit(5).printResults()
//                               case _ => println("5: Enter valid entry")
//                         }
//             case 2 => 
//             }
//       }
// }
     
   