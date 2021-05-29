package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        //throw NotImplementedError("Not implemented")
        var customListStr : ArrayList<String> = ArrayList<String>()
        var customStr = StringBuilder(inputString)
        var resultStr = StringBuilder()
        var charOpenBracket: Char
        var charCloseBracket: Char
        var firstIdex: Int
        var lastIdex: Int = 0
        var resultCounter = -1
        var FlagDoubleOpenBracket = false

        for (i in customStr.indices)
        {

            if (customStr[i] == '[' || customStr[i] == '(' || customStr[i] == '<')
            {

                resultCounter++

                charCloseBracket = when (customStr[i])
                {
                    '[' -> ']'
                    '(' -> ')'
                    '<' -> '>'
                    else -> ' '
                }
                firstIdex = i + 1

                for (j in firstIdex until customStr.length)
                {
                    if (customStr[j] == customStr[i])
                    {
                        FlagDoubleOpenBracket = true
                    }

                    if (customStr[j] == charCloseBracket)
                    {

                        if(!FlagDoubleOpenBracket)
                        {
                            lastIdex = j - 1
                            break
                        }
                        FlagDoubleOpenBracket = false
                    }

                }

                for (x in firstIdex..lastIdex)
                {
                    resultStr.append(customStr[x])
                }


                customListStr.add(resultStr.toString())

                resultStr.clear()
                firstIdex = 0
                lastIdex = 0
                charCloseBracket = ' '
                FlagDoubleOpenBracket = false

            }

        }

        return customListStr.toTypedArray()
    }
}
