package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")
        var customArray = ArrayList<Int>()
        var arrDelIndex = ArrayList<Int>()
        var flagBadElement = false

        for (i in sadArray.indices)
            customArray.add(sadArray[i])

        do
        {
            for (i in 1 until (customArray.size - 1))
            {
                if (customArray[i] > (customArray[i-1] + customArray[i+1]))
                {
                    arrDelIndex.add(i)
                }
            }
            flagBadElement = arrDelIndex.isNotEmpty()

            for (i in 0 until arrDelIndex.size)
            {
                customArray.removeAt(arrDelIndex[i] - i)
            }

            arrDelIndex.clear()
        }while (flagBadElement)

        return customArray.toIntArray()
    }
}
