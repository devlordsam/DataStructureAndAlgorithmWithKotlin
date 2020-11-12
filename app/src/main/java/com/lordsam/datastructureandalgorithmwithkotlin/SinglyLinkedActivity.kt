package com.lordsam.datastructureandalgorithmwithkotlin


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_singly_linked.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


@Suppress("SameParameterValue")
class SinglyLinkedActivity : AppCompatActivity() {

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
        setContentView(R.layout.activity_singly_linked)

        txtEncapsulate = findViewById(R.id.textViewSLEncapsulateCode)
        txtCreateNode = findViewById(R.id.textViewSLCreateNodeCode)
        txtInitializeHead = findViewById(R.id.textViewSLInitializeHeadCode)
        txtGetLastNode = findViewById(R.id.textViewSLLastNodeCode)
        txtGetSize = findViewById(R.id.textViewSLGetSizeCode)
        txtAddLast = findViewById(R.id.textViewSLAddLastCode)
        txtAddFirst = findViewById(R.id.textViewSLAddFirstCode)
        txtAddBefore = findViewById(R.id.textViewSLAddBeforeCode)
        txtGetAt = findViewById(R.id.textViewSLGetAtCode)
        txtGetList = findViewById(R.id.textViewSLGetListCode)
        txtRemoveAt = findViewById(R.id.textViewSLRemoveAtCode)
        txtTrigger = findViewById(R.id.textViewSLTriggerCode)
        txtFullCode = findViewById(R.id.textViewSLFullCode)
        textFullCodeID = R.raw.singly_linked_list

        //create node
        writer(textFullCodeID!!, txtCreateNode, 94, 97)

        //initialize head
        writer(textFullCodeID!!, txtInitializeHead, 3, 3)

        //get last node
        writer(textFullCodeID!!, txtGetLastNode, 5, 13)

        //get size
        writer(textFullCodeID!!, txtGetSize, 15, 24)

        //add last
        writer(textFullCodeID!!, txtAddLast, 26, 35)

        //add first
        writer(textFullCodeID!!, txtAddFirst, 37, 41)

        //add before
        writer(textFullCodeID!!, txtAddBefore, 43, 59)

        //get at
        writer(textFullCodeID!!, txtGetAt, 61, 68)

        //get list
        writer(textFullCodeID!!, txtGetList, 70, 77)

        //remove at
        writer(textFullCodeID!!, txtRemoveAt, 79, 92)

        //encapsulate
        writer(textFullCodeID!!, txtEncapsulate, 1, 92)

        //trigger
        writer(textFullCodeID!!, txtTrigger, 99, 110)

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