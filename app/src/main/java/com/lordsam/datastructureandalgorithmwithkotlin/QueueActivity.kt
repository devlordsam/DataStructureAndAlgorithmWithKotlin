package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class QueueActivity : AppCompatActivity() {

    private lateinit var txtCreateNode: TextView
    private lateinit var txtInitializeRef: TextView
    private lateinit var txtEnqueue: TextView
    private lateinit var txtDequeue: TextView
    private lateinit var txtGetQueue: TextView
    private lateinit var txtGetFront: TextView
    private lateinit var txtGetRear: TextView
    private lateinit var txtEncapsulate: TextView
    private lateinit var txtTrigger: TextView
    private lateinit var txtFullCode: TextView
    private var textFullCodeID: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_queue)

        txtEncapsulate = findViewById(R.id.textViewQueueEncapsulateCode)
        txtCreateNode = findViewById(R.id.textViewQueueCreateNodeCode)
        txtInitializeRef = findViewById(R.id.textViewQueueRefCode)
        txtEnqueue = findViewById(R.id.textViewQueueEnqueueCode)
        txtDequeue = findViewById(R.id.textViewQueueDequeueCode)
        txtGetQueue = findViewById(R.id.textViewQueueGetAllCode)
        txtGetFront = findViewById(R.id.textViewQueueGetFrontCode)
        txtGetRear = findViewById(R.id.textViewQueueGetRearCode)
        txtTrigger = findViewById(R.id.textViewQueueTriggerCode)
        txtFullCode = findViewById(R.id.textViewQueueFullCode)
        textFullCodeID = R.raw.queue

        //create node
        writer(textFullCodeID!!, txtCreateNode, 48, 51)

        //initialize top
        writer(textFullCodeID!!, txtInitializeRef, 3, 4)

        //enqueue
        writer(textFullCodeID!!, txtEnqueue, 6, 18)

        //dequeue
        writer(textFullCodeID!!, txtDequeue, 20, 27)

        //get queue
        writer(textFullCodeID!!, txtGetQueue, 29, 36)

        //get front
        writer(textFullCodeID!!, txtGetFront, 38, 40)

        //get rear
        writer(textFullCodeID!!, txtGetRear, 42, 44)

        //encapsulate
        writer(textFullCodeID!!, txtEncapsulate, 1, 46)

        //trigger
        writer(textFullCodeID!!, txtTrigger, 53, 63)

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