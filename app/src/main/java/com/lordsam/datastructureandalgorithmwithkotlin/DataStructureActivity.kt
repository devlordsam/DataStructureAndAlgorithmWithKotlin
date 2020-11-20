package com.lordsam.datastructureandalgorithmwithkotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_data_strucutre.*
import kotlinx.android.synthetic.main.card_data_structure.view.*

class DataStructureActivity : AppCompatActivity() {

    private lateinit var arrOfDS: ArrayList<String>
    private lateinit var adapterDS: ListAdapterDS
    private lateinit var lsDS: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_strucutre)

        lsDS = findViewById(R.id.listViewDS)
        arrOfDS = ArrayList()

        arrOfDS.add("Singly Linked List")
        arrOfDS.add("Circular Singly Linked List")
        arrOfDS.add("Doubly Linked List")
        arrOfDS.add("Circular Doubly Linked List")
        arrOfDS.add("Stack")
        arrOfDS.add("Queue")
        arrOfDS.add("Binary Tree")
        arrOfDS.add("Binary Search Tree")

        adapterDS = ListAdapterDS(this, arrOfDS)
        lsDS.adapter = adapterDS

    }


    class ListAdapterDS(val ctx: Context, private val arrOfDS: ArrayList<String>) : BaseAdapter() {
        override fun getCount(): Int {
            return arrOfDS.size
        }

        override fun getItem(position: Int): Any {
            return arrOfDS[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val ds = arrOfDS[position]
            val inflater = ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.card_data_structure, null)
            view.textViewCDataStructure.text = ds
            view.setOnClickListener {

                when(position){
                    0 -> ctx.startActivity(Intent(ctx, SinglyLinkedActivity::class.java))
                    1 -> ctx.startActivity(Intent(ctx, CircularSinglyLinkedActivity::class.java))
                    2 -> ctx.startActivity(Intent(ctx, DoublyLinkedActivity::class.java))
                    3 -> ctx.startActivity(Intent(ctx, CircularDoublyLinkedActivity::class.java))
                    4 -> ctx.startActivity(Intent(ctx, StackActivity::class.java))
                    5 -> ctx.startActivity(Intent(ctx, QueueActivity::class.java))
                    //6 -> ctx.startActivity(Intent(ctx, BinaryTreeActivity::class.java))
                   // 7 -> ctx.startActivity(Intent(ctx, BinarySearchTreeActivity::class.java))

                }
            }
            return view
        }

    }
}

