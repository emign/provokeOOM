fun main(){
    generateOOM()
}

@Throws(Exception::class)
fun generateOOM() {
    var iteratorValue = 20
    println("\n=================> OOM gestarett..\n")
    for (outerIterator in 1..19) {
        println("Iteration " + outerIterator + " Freier Heap-Speicher: " + Runtime.getRuntime().freeMemory())
        var loop1 = 2
        val memoryFillIntVar = IntArray(iteratorValue)
        // feel memoryFillIntVar array in loop..
        do {
            memoryFillIntVar[loop1] = 0
            loop1--
        } while (loop1 > 0)
        iteratorValue = iteratorValue * 10
        Thread.sleep(1000)
    }
}