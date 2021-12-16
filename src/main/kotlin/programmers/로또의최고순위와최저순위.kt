package programmers

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        lottos.sort() // 정렬
        win_nums.sort() // 정렬

        val zeroCount = lottos.count { it == 0 } // 알아볼 수 없는 수의 개수
        val match = win_nums.count { it in lottos } // 알아본 수 중에서 맞는 번호의 수

        val minimum = if (match < 2) 6 else 7 - match
        val maximum = if (zeroCount == 0) minimum else 7 - match - zeroCount

        return intArrayOf(maximum, minimum)
    }
}