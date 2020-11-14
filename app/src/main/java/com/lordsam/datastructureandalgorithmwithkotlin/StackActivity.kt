package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class StackActivity : AppCompatActivity() {

    private lateinit var txtCreateNode: TextView
    private lateinit var txtInitializeTop: TextView
    private lateinit var txtPush: TextView
    private lateinit var txtPop: TextView
    private lateinit var txtGetStack: TextView
    private lateinit var txtGetTop: TextView
    private lateinit var txtEncapsulate: TextView
    private lateinit var txtTrigger: TextView
    private lateinit var txtFullCode: TextView
    private var textFullCodeID: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stack)

        txtEncapsulate = findViewById(R.id.textViewStackEncapsulateCode)
        txtCreateNode = findViewById(R.id.textViewStackCreateNodeCode)
        txtInitializeTop = findViewById(R.id.textViewStackTopCode)
        txtPush = findViewById(R.id.textViewStackPushCode)
        txtPop = findViewById(R.id.textViewStackPopCode)
        txtGetStack = findViewById(R.id.textViewStackGetAllCode)
        txtGetTop = findViewById(R.id.textViewStackGetTopCode)
        txtTrigger = findViewById(R.id.textViewStackTriggerCode)
        txtFullCode = findViewById(R.id.textViewStackFullCode)
        textFullCodeID = R.raw.stack

        //create node
        writer(textFullCodeID!!, txtCreateNode, 44, 47)

        //initialize top
        writer(textFullCodeID!!, txtInitializeTop, 3, 3)

        //push
        writer(textFullCodeID!!, txtPush, 5, 16)

        //pop
        writer(textFullCodeID!!, txtPop, 18, 28)

        //get stack
        writer(textFullCodeID!!, txtGetStack, 30, 37)

        //get top
        writer(textFullCodeID!!, txtGetTop, 39, 41)

        //encapsulate
        writer(textFullCodeID!!, txtEncapsulate, 1, 43)

        //trigger
        writer(textFullCodeID!!, txtTrigger, 49, 58)

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