package tech.laihz.android_demo_intent

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_brodcast.*

class BrodcastActivity : AppCompatActivity() {
    private var mBroadcastRec: MBroadcastRec? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brodcast)
        title=resources.getString(R.string.app_broadcast)

        button_send.setOnClickListener {
            val intent= Intent()
            val result = editText.text
            val bundle=Bundle()
            bundle.putString("text",result.toString())
            intent.putExtras(bundle)
            intent.action = "tech.laihz.intent"
            sendBroadcast(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        mBroadcastRec=MBroadcastRec()
        val intentFilter=IntentFilter()
        intentFilter.addAction("tech.laihz.intent")
        registerReceiver(mBroadcastRec,intentFilter)

    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(mBroadcastRec)
    }
}
