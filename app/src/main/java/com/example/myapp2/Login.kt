package com.example.myapp2 // Thay bằng package của bạn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Tìm button Register theo ID
        val btnRegister: Button = findViewById(R.id.btnRegister)

        // Xử lý sự kiện nhấn nút Register
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            // finish() // Tùy chọn: Đóng LoginActivity nếu không muốn quay lại
        }
    }
}