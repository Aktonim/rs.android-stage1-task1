package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
       val HappyList = sadArray.toMutableList()
       var n = 0

        while (n < HappyList.size - 1) {
            if (n != 0 && HappyList[n] > HappyList[n + 1] + HappyList[n - 1]) {
               HappyList.removeAt(n)
                n --
            }
            else {
                n ++
            }
        }
        return HappyList.toIntArray()
    }
}
