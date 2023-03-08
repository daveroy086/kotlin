// twoFortyTwo.kt

fun twoFortyTwo(scores: List<String>): Int {

        var result: Int = 0
        for(score in scores) {
            when{
                score[0] > score[2] -> result += 3
                score[0] == score[2] ->     result++
            }
        }

    return result
}
// end 242 

// twoFortyTwo(listOf("1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"))    // 10
