package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class SearchingAlgorithmsActivity : AppCompatActivity() {

    private var textFullCode :Int ?= null
    private lateinit var txtLinearSearch :TextView
    private lateinit var txtBinarySearch :TextView
    private lateinit var txtJumpSearch :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching_algorithms)

        textFullCode = R.raw.searching_algorithm
        txtLinearSearch = findViewById(R.id.textViewSALinearSearchCode)
        txtBinarySearch = findViewById(R.id.textViewSABinarySearchCode)
        txtJumpSearch = findViewById(R.id.textViewSAJumpSearchCode)

        writer(textFullCode!!, txtLinearSearch, 3, 9)

        writer(textFullCode!!, txtBinarySearch, 11, 32)

        writer(textFullCode!!, txtJumpSearch, 34, 61)
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
}