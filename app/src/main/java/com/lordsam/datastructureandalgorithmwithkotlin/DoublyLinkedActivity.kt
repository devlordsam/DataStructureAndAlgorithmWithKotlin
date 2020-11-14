package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class DoublyLinkedActivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_doubly_linked)

        txtEncapsulate = findViewById(R.id.textViewDLEncapsulateCode)
        txtCreateNode = findViewById(R.id.textViewDLCreateNodeCode)
        txtInitializeHead = findViewById(R.id.textViewDLInitializeHeadCode)
        txtGetSize = findViewById(R.id.textViewDLGetSizeCode)
        txtAddLast = findViewById(R.id.textViewDLAddLastCode)
        txtAddFirst = findViewById(R.id.textViewDLAddFirstCode)
        txtAddBefore = findViewById(R.id.textViewDLAddBeforeCode)
        txtGetAllFromLeft = findViewById(R.id.textViewDLGetAllFromLeftCode)
        txtGetAllFromRight = findViewById(R.id.textViewDLGetAllFromRightCode)
        txtRemoveAt = findViewById(R.id.textViewDLRemoveAtCode)
        txtTrigger = findViewById(R.id.textViewDLTriggerCode)
        txtFullCode = findViewById(R.id.textViewDLFullCode)
        textFullCodeID = R.raw.doubly_linked_list

        //create node
        writer(textFullCodeID!!, txtCreateNode, 115, 119)

        //initialize references
        writer(textFullCodeID!!, txtInitializeHead, 3, 4)

        //get size
        writer(textFullCodeID!!, txtGetSize, 6, 16)

        //add last
        writer(textFullCodeID!!, txtAddLast, 50, 62)

        //add first
        writer(textFullCodeID!!, txtAddFirst, 36, 48)

        //add before
        writer(textFullCodeID!!, txtAddBefore, 18, 34)

        //get all from left
        writer(textFullCodeID!!, txtGetAllFromLeft, 64, 71)

        //get all from right
        writer(textFullCodeID!!, txtGetAllFromRight, 73, 80)

        //remove at
        writer(textFullCodeID!!, txtRemoveAt, 82, 101)

        //encapsulate
        writer(textFullCodeID!!, txtEncapsulate, 1, 113)

        //trigger
        writer(textFullCodeID!!, txtTrigger, 121, 138)

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