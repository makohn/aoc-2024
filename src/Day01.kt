
fun main() {

    val day = "01"

    fun part1(input: List<String>): Int {
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        for (line in input) {
            val split = line.split("   ")
            val a = split[0]
            val b = split[1]
            list1.add(a.toInt())
            list2.add(b.toInt())
        }
        list1.sort()
        list2.sort()
        var acc = 0
        for (i in 0..<list1.size) {
            acc += Math.abs(list1[i] - list2[i])
        }
        return acc
    }

    fun part2(input: List<String>): Int {
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        for (line in input) {
            val split = line.split("   ")
            val a = split[0]
            val b = split[1]
            list1.add(a.toInt())
            list2.add(b.toInt())
        }

        var acc = 0
        for (i in 0..< list1.size) {
            val count = list2.count { it == list1[i] }
            acc += list1[i] * count
        }
        return acc
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day${day}_test")
    check(part1(testInput) == 11)
    check(part2(testInput) == 31)

    val input = readInput("Day${day}")
    println(part1(input))
    println(part2(input))
}