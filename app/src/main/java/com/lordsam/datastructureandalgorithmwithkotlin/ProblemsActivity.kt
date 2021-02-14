package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class ProblemsActivity : AppCompatActivity() {

    private var textFullCode :Int ?= null
    private lateinit var txtFact :TextView
    private lateinit var txtFib :TextView
    private lateinit var txtMissing :TextView
    private lateinit var txtOccur :TextView
    private lateinit var txtPalindrome :TextView
    private lateinit var txtPattern :TextView
    private lateinit var txtTable :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problems)

        textFullCode = R.raw.problems
        txtFact = findViewById(R.id.textViewPSFactorialCode)
        txtFib = findViewById(R.id.textViewPSFibCode)
        txtMissing = findViewById(R.id.textViewPSMissingOneCode)
        txtOccur = findViewById(R.id.textViewPSOccurCode)
        txtPalindrome = findViewById(R.id.textViewPSPalindromeCode)
        txtPattern = findViewById(R.id.textViewPSPatternCode)
        txtTable = findViewById(R.id.textViewPSTableCode)

        writer(textFullCode!!, txtFact, 3, 8)

        writer(textFullCode!!, txtFib, 11, 29)

        writer(textFullCode!!, txtMissing, 32, 37)

        writer(textFullCode!!, txtOccur, 40, 50)

        writer(textFullCode!!, txtPalindrome, 53, 56)

        writer(textFullCode!!, txtPattern, 59, 86)

        writer(textFullCode!!, txtTable, 89, 93)
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