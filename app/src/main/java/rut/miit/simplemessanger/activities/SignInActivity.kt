package rut.miit.simplemessanger.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import rut.miit.simplemessanger.R

class SignInActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signInBtn: Button

    private var enteredUsername: String = ""
    private var enteredPassword: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sign_in) // Используем макет фрагмента

        // Инициализация элементов интерфейса
        usernameEditText = findViewById(R.id.signInUsernameEditText)
        passwordEditText = findViewById(R.id.signInPasswordEditText)
        signInBtn = findViewById(R.id.signInBtn)

        // Получение данных из Intent (если они передаются)
        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        // Установка значений в поля ввода, если они переданы
        username?.let { usernameEditText.setText(it) }
        password?.let { passwordEditText.setText(it) }

        // Обновление значений при изменении текста
        usernameEditText.addTextChangedListener {
            enteredUsername = it.toString()
        }

        passwordEditText.addTextChangedListener {
            enteredPassword = it.toString()
        }

        // Обработка нажатия на кнопку "Sign In"
        signInBtn.setOnClickListener {
            if (enteredUsername == "kaki" && enteredPassword == "1111") {
                // Переход на главный экран (HomeActivity)
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Закрыть текущую активность
            } else {
                Toast.makeText(
                    this,
                    "Неправильный логин или пароль",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}