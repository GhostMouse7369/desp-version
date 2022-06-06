package top.laoshuzi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.laoshuzi.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
//        MainActivityBin
    }
}