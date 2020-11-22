package com.example.a5aspratikum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    companion object{
        final val EXTRA_NAME = "student_name"
        final val EXTRA_ID = "student_id"
        final val EXTRA_PHONE_NUMBER = "student_phone_number"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvStudentIdResult :TextView! = findViewById<TextView>(R.id.tvStudentIdResult)
        val tvStudentNameResult :TextView! = findViewById<TextView>(R.id.tvStudentNameResult)
        val tvStudentPhoneNumberResult :TextView! = findViewById<TextView>(R.id.tvStudentPhoneNumberResult)

        val id :String =intent.getStringExtra(EXTRA_ID)
        val name :String =intent.getStringExtra(EXTRA_NAME)
        val phonenumber :String =intent.getStringExtra(EXTRA_PHONE_NUMBER)

        tvStudentIdResult.text =id
        tvStudentNameResult.text =name
        tvStudentPhoneNumberResult.text =phonenumber
    }
}