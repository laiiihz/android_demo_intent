package tech.laihz.android_demo_intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_thr.*

class ThrActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title="ThirdActivity"
        setContentView(R.layout.activity_thr)
        val intent=intent
        button_confirm.setOnClickListener {
            intent.putExtra("text",editText_input.text.toString())
            setResult(100,intent)
            finish()
        }


    }
    fun finishMe(v:View){
        finish()
    }
}
