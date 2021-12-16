package programmers

class Solution {
    fun solution(new_id: String): String {

        return new_id.toLowerCase()
            .filter { it.isLowerCase() || it.isDigit() || it == '-' || it == '_' || it == '.' }
            .let {
                var tempId = it
                while (tempId.contains("..")) {
                    tempId = tempId.replace("..", ".")
                }

                tempId
            }
            .removePrefix(".")
            .removeSuffix(".")
            .let { it.ifEmpty { "a" } }
            .let {
                if (it.length >= 16) {
                    it.substring(0..14)
                } else it
            }
            .removeSuffix(".")
            .let {
                var tempId = it
                if (tempId.length <= 2) {
                    while (tempId.length != 3) {
                        tempId += tempId.last()
                    }
                }
                tempId
            }
    }
}