package tech.laihz.android_demo_intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_act_1.setOnClickListener {
            val intent=Intent(this,SecActivity::class.java)
            intent.putExtra("text","SecondActivity")
            startActivity(intent)

        }

        button_act_2.setOnClickListener {
            val intent=Intent(this,ThrActivity::class.java)
            startActivityForResult(intent,100)
        }

        button_exp.setOnClickListener {
            startActivity(Intent(this,BrodcastActivity::class.java))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode==100&&resultCode==100){
            textViewResult.text=data!!.getStringExtra("text")
        }
    }
}
