package com.example.quickventory.Details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.quickventory.R
import com.google.android.material.textfield.TextInputEditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "userid"
private const val ARG_PARAM2 = "itemid"
private const val ARG_PARAM3 = "itemname"
private const val ARG_PARAM4 = "iquantity"
private const val ARG_PARAM5 = "price"
private const val ARG_PARAM6 = "dept"

/**
 * A simple [Fragment] subclass.
 * Use the [ItemDetails.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var userid: String? = null
    private var itemid: String? = null
    private var itemname: String? = null
    private var iquantity: String? = null
    private var price: String? = null
    private var dept: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            userid = it.getString(ARG_PARAM1)
            itemid = it.getString(ARG_PARAM2)
            itemname = it.getString(ARG_PARAM3)
            iquantity = it.getString(ARG_PARAM4)
            price = it.getString(ARG_PARAM5)
            dept = it.getString(ARG_PARAM6)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        /*val button = view.findViewById<Button>(R.id.logoutButton)
        button.setOnClickListener {
            val sharedPref =
                activity!!.getSharedPreferences("token", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.remove("TOKEN")
            editor.commit()

            var bottom = activity!!.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            var search = activity!!.findViewById<ImageView>(R.id.searchImage)
            bottom.menu.performIdentifierAction(R.id.menuScan,0)
            bottom.setVisibility(View.GONE)
            search.setVisibility(View.GONE)

        }*/

        val itemName = view.findViewById<TextView>(R.id.info)
        val itemQuantity = view.findViewById<TextInputEditText>(R.id.qty)
        val itemPrice = view.findViewById<TextInputEditText>(R.id.prc)
        val itemDepartment = view.findViewById<TextInputEditText>(R.id.dpt)
        val userID = view.findViewById<TextView>(R.id.uid)
        val itemID = view.findViewById<TextView>(R.id.iid)


        userID.text = userid
        itemID.text = itemid
        itemName.text = itemname
        itemQuantity.setText(iquantity)
        itemPrice.setText(price)
        itemDepartment.setText(dept)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param userid Parameter 1.
         * @param itemid Parameter 2.
         * @return A new instance of fragment ItemDetails.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(userid: String, itemid: String, itemname: String, iquantity: String, price: String, dept: String) =
            DetailsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, userid)
                    putString(ARG_PARAM2, itemid)
                    putString(ARG_PARAM3, itemname)
                    putString(ARG_PARAM4, iquantity)
                    putString(ARG_PARAM5, price)
                    putString(ARG_PARAM6, dept)
                }
            }
    }
}