package top.laoshuzi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.laoshuzi.myapplication.databinding.ActivityMainBinding
import top.laoshuzi.viewbindingutils.viewBinding

class MainActivity : AppCompatActivity() {

    val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.textView.text = "hello"
    }
}