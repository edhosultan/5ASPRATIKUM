package com.example.a5aspratikum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val btSendStudent :Button! =findViewById<Button>(R.id.btSendStudent)
        val etIdStudent :EditText! =findViewById<EditText>(R.id.etIdStudent)
        val etNameStudent :EditText! =findViewById<EditText>(R.id.etNameStudent)
        val etPhoneNumberStudent :EditText! =findViewById<EditText>(R.id.etPhoneNumberStudent)

        btSendStudent.setOnClickListener{it:View!

        val id :String =etIdStudent.text.toString()
        val name :String = etNameStudent.text.toString()
        val phonenumber :String = etPhoneNumberStudent.text.toString()

        val i = Intent(packageContext:this,ResultActivity::class.java)
        i.putExtra(ResultActivity.EXTRA_ID,id)
            i.putExtra(ResultActivity.EXTRA_NAME,name)
            i.putExtra(ResultActivity.EXTRA_PHONE_NUMBER,Phonenumber)
            startActivity(i)

        }

    }
}