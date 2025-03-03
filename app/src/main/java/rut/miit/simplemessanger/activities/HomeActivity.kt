package rut.miit.simplemessanger.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rut.miit.simplemessanger.R
import rut.miit.simplemessanger.adapters.ChatAdapter
import rut.miit.simplemessanger.models.Chat

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home) // Убедитесь, что у вас есть соответствующий layout файл

        val chats = arrayListOf(
            Chat("Max", "Я спал два часа, я крутой"),
            Chat("Alik", "Я спал 1 час. Я дурачок, и ты тоже."),
            Chat("Alexey", "А меня в кащенко везут.")
        )

        val list: RecyclerView = findViewById(R.id.chatsList)

        list.layoutManager = GridLayoutManager(this, 1)
        list.adapter = ChatAdapter(chats)
    }
}