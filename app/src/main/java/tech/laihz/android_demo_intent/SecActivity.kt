package tech.laihz.android_demo_intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sec.*

class SecActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title="SecondActivity"
        setContentView(R.layout.activity_sec)
        val intent=intent
        var result=intent.extras?.getString("text")
        textViewTest.text=result
        button_finish.setOnClickListener {
            finish()
        }
    }
}
