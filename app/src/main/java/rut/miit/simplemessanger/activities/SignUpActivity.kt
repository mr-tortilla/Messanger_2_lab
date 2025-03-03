package rut.miit.simplemessanger.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import rut.miit.simplemessanger.R

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sign_up) // Используем макет фрагмента

        // Инициализация элементов интерфейса
        val usernameEditText: EditText = findViewById(R.id.regUsernameEditText)
        val passwordEditText: EditText = findViewById(R.id.regPasswordEditText)
        val signUpBtn: Button = findViewById(R.id.signUpBtn)

        // Обработка нажатия на кнопку "Sign Up"
        signUpBtn.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Переход на экран входа (SignInActivity) с передачей данных
            val intent = Intent(this, SignInActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("password", password)
            startActivity(intent)
            finish() // Закрыть текущую активность
        }
    }
}