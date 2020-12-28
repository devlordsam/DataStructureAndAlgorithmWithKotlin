package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class SortingAlgorithmsActivity : AppCompatActivity() {

    private var textFullCode :Int ?= null
    private lateinit var txtSelectionSort : TextView
    private lateinit var txtBubbleSort : TextView
    private lateinit var txtInsertionSort : TextView
    private lateinit var txtRBubbleSort : TextView
    private lateinit var txtMergeSort : TextView
    private lateinit var txtQuickSort : TextView
    private lateinit var txtHeapSort : TextView
    private lateinit var txtRadixSort : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorting_algorithms)

        textFullCode = R.raw.sorting_algorithms
        txtSelectionSort = findViewById(R.id.textViewSoASelectionSortCode)
        txtBubbleSort = findViewById(R.id.textViewSoABubbleSortCode)
        txtInsertionSort = findViewById(R.id.textViewSoAInsertionSortCode)
        txtRBubbleSort = findViewById(R.id.textViewSoARBubbleSortCode)
        txtMergeSort = findViewById(R.id.textViewSoAMergeSortCode)
        txtQuickSort = findViewById(R.id.textViewSoAQuickSortCode)
        txtHeapSort = findViewById(R.id.textViewSoAHeapSortCode)
        txtRadixSort = findViewById(R.id.textViewSoARadixSortCode)

        writer(textFullCode!!, txtSelectionSort, 4, 17)

        writer(textFullCode!!, txtBubbleSort, 20, 36)

        writer(textFullCode!!, txtInsertionSort, 58, 73)

        writer(textFullCode!!, txtRBubbleSort, 39, 58)

        writer(textFullCode!!, txtMergeSort, 79, 138)

        writer(textFullCode!!, txtQuickSort, 141, 177)

        writer(textFullCode!!, txtHeapSort, 176, 218)

        writer(textFullCode!!, txtRadixSort, 217, 282)
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