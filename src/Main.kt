import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.reduce

suspend fun main() {
    val squareNumbers = numbersFlow.reduce { a, b -> a + b * b }
    println(squareNumbers)
}
val numbersFlow = listOf(1, 2, 3, 4, 5).asFlow()