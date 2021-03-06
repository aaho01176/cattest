package com.example.cattest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.cattest.R
import kotlinx.android.synthetic.main.fragment_login.*
class LoginFragment : Fragment(){
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        //로그인 toast 띄우기
        send_btn.setOnClickListener{
            Toast.makeText(getActivity(),"${ed_id.text} is logged in!!", Toast.LENGTH_SHORT).show()
            navController.navigate(R.id.action_loginFragment_to_mainFragment)

        }
    }
}
