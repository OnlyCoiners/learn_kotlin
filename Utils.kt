// $kotlinc Main.kt Utils.kt -include-runtime -d Main.jar

val ONE_SECOND = 1000L

fun reuse(name: String) {
  println("Hello world from $name")
  Thread.sleep(ONE_SECOND)
  println("End")
}
