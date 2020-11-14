package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class CircularSinglyLinkedActivity : AppCompatActivity() {

    private lateinit var txtCreateNode: TextView
    private lateinit var txtInitializeHead: TextView
    private lateinit var txtGetLastNode: TextView
    private lateinit var txtGetSize: TextView
    private lateinit var txtAddLast: TextView
    private lateinit var txtAddFirst: TextView
    private lateinit var txtAddBefore: TextView
    private lateinit var txtGetAt: TextView
    private lateinit var txtGetList: TextView
    private lateinit var txtRemoveAt: TextView
    private lateinit var txtEncapsulate: TextView
    private lateinit var txtTrigger: TextView
    private lateinit var txtFullCode: TextView
    private var textFullCodeID: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_singly_linked)

        txtEncapsulate = findViewById(R.id.textViewCSLEncapsulateCode)
        txtCreateNode = findViewById(R.id.textViewCSLCreateNodeCode)
        txtInitializeHead = findViewById(R.id.textViewCSLInitializeHeadCode)
        txtGetLastNode = findViewById(R.id.textViewCSLLastNodeCode)
        txtGetSize = findViewById(R.id.textViewCSLGetSizeCode)
        txtAddLast = findViewById(R.id.textViewCSLAddLastCode)
        txtAddFirst = findViewById(R.id.textViewCSLAddFirstCode)
        txtAddBefore = findViewById(R.id.textViewCSLAddBeforeCode)
        txtGetAt = findViewById(R.id.textViewCSLGetAtCode)
        txtGetList = findViewById(R.id.textViewCSLGetListCode)
        txtRemoveAt = findViewById(R.id.textViewCSLRemoveAtCode)
        txtTrigger = findViewById(R.id.textViewCSLTriggerCode)
        txtFullCode = findViewById(R.id.textViewCSLFullCode)
        textFullCodeID = R.raw.circular_singly_linked_list

        //create node
        writer(textFullCodeID!!, txtCreateNode, 105, 108)

        //initialize head
        writer(textFullCodeID!!, txtInitializeHead, 3, 3)

        //get last node
        writer(textFullCodeID!!, txtGetLastNode, 5, 13)

        //get size
        writer(textFullCodeID!!, txtGetSize, 15, 25)

        //add last
        writer(textFullCodeID!!, txtAddLast, 27, 38)

        //add first
        writer(textFullCodeID!!, txtAddFirst, 40, 46)

        //add before
        writer(textFullCodeID!!, txtAddBefore, 48, 69)

        //get at
        writer(textFullCodeID!!, txtGetAt, 71, 77)

        //get list
        writer(textFullCodeID!!, txtGetList, 79, 87)

        //remove at
        writer(textFullCodeID!!, txtRemoveAt, 89, 102)

        //encapsulate
        writer(textFullCodeID!!, txtEncapsulate, 1, 103)

        //trigger
        writer(textFullCodeID!!, txtTrigger, 110, 123)

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