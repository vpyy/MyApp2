package com.example.myapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Tìm button Login theo ID
        val btnLogin: Button = findViewById(R.id.btnLogin)

        // Xử lý sự kiện nhấn nút Login
        btnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            // finish() // Tùy chọn: Đóng RegisterActivity nếu không muốn quay lại
        }
    }
}