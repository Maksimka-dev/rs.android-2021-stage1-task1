package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        //throw NotImplementedError("Not implemented")
        var customArray = ArrayList<Int>()
        var result = ""

        for (i in bill.indices)
        {
            customArray.add(bill[i])
        }

        customArray.removeAt(k)

        if (b > (customArray.sum() / 2))
        {
            result = (b - customArray.sum()/2).toString()
        }
        else
        {
            result = "Bon Appetit"
        }

        return result
    }
}
