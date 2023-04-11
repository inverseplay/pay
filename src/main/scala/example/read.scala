package example
import scala.io.Source

object Read:

  val filename = "./datas/data_dev.csv"

  // Open the file
  val source = Source.fromFile(filename)

  // Iterate over the lines
  for (line <- source.getLines) {
    // Split the line and trim each field
    val fields = line.split(",").map(_.trim)

    // Process the data
    println(fields(0)) // Print the first field
  }

  // Close the file
  source.close()
