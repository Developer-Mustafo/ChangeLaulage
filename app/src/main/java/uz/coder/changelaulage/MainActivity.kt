package uz.coder.changelaulage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.coder.changelaulage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        binding.txt.text = getString(R.string.txt)
    }
}