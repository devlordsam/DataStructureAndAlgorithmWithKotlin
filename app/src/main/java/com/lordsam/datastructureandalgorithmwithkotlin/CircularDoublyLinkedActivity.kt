package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class CircularDoublyLinkedActivity : AppCompatActivity() {
    private lateinit var txtCreateNode: TextView
    private lateinit var txtInitializeHead: TextView
    private lateinit var txtGetSize: TextView
    private lateinit var txtAddLast: TextView
    private lateinit var txtAddFirst: TextView
    private lateinit var txtAddBefore: TextView
    private lateinit var txtGetAllFromLeft: TextView
    private lateinit var txtGetAllFromRight: TextView
    private lateinit var txtRemoveAt: TextView
    private lateinit var txtEncapsulate: TextView
    private lateinit var txtTrigger: TextView
    private lateinit var txtFullCode: TextView
    private var textFullCodeID: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_doubly_linked)

        txtEncapsulate = findViewById(R.id.textViewCDLEncapsulateCode)
        txtCreateNode = findViewById(R.id.textViewCDLCreateNodeCode)
        txtInitializeHead = findViewById(R.id.textViewCDLInitializeHeadCode)
        txtGetSize = findViewById(R.id.textViewCDLGetSizeCode)
        txtAddLast = findViewById(R.id.textViewCDLAddLastCode)
        txtAddFirst = findViewById(R.id.textViewCDLAddFirstCode)
        txtAddBefore = findViewById(R.id.textViewCDLAddBeforeCode)
        txtGetAllFromLeft = findViewById(R.id.textViewCDLGetAllFromLeftCode)
        txtGetAllFromRight = findViewById(R.id.textViewCDLGetAllFromRightCode)
        txtRemoveAt = findViewById(R.id.textViewCDLRemoveAtCode)
        txtTrigger = findViewById(R.id.textViewCDLTriggerCode)
        txtFullCode = findViewById(R.id.textViewCDLFullCode)
        textFullCodeID = R.raw.circular_doubly_linked_list

        //create node
        writer(textFullCodeID!!, txtCreateNode, 129, 133)

        //initialize references
        writer(textFullCodeID!!, txtInitializeHead, 3, 4)

        //get size
        writer(textFullCodeID!!, txtGetSize, 6, 16)

        //add last
        writer(textFullCodeID!!, txtAddLast, 35, 49)

        //add first
        writer(textFullCodeID!!, txtAddFirst, 19, 33)

        //add before
        writer(textFullCodeID!!, txtAddBefore, 51, 67)

        //get all from left
        writer(textFullCodeID!!, txtGetAllFromLeft, 69, 77)

        //get all from right
        writer(textFullCodeID!!, txtGetAllFromRight, 79, 87)

        //remove at
        writer(textFullCodeID!!, txtRemoveAt, 89, 108)

        //encapsulate
        writer(textFullCodeID!!, txtEncapsulate, 1, 127)

        //trigger
        writer(textFullCodeID!!, txtTrigger, 135, 152)

        //full code
        writer(textFullCodeID!!, txtFullCode)


    }


    private fun writer(fileID: Int, textView: TextView?, from: Int, to: Int) {

        val `is`: InputStream = resources.openRawResource(fileID)
        val br = BufferedReader(InputStreamReader(`is`))
        var line: String?
        var entireFile = ""
        var count = 0
        try {
            while (br.readLine()
                    .also { line = it } != null && count <= to
            ) {
                if (count >= from - 1) {
                    entireFile +=
                        """
                $line
                """.trimEnd()
                }
                count++
            }

        } catch (e: IOException) {
            e.printStackTrace()
        }
        textView!!.text = entireFile

    }

    private fun writer(fileID: Int, textView: TextView?) {

        val `is`: InputStream = resources.openRawResource(fileID)
        val br = BufferedReader(InputStreamReader(`is`))
        var line: String?
        var entireFile = ""
        try {
            while (br.readLine()
                    .also { line = it } != null
            ) {
                entireFile +=
                    """
                $line
                """.trimEnd()
            }

        } catch (e: IOException) {
            e.printStackTrace()
        }
        textView!!.text = entireFile

    }
}