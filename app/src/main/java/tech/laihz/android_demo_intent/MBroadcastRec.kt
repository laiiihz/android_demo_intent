package tech.laihz.android_demo_intent

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MBroadcastRec:BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val bundle=intent?.extras
        val result=bundle?.getString("text")
        //result=intent!!.getStringExtra("result")
        Log.e("#####","@@@@@@@@@@@@@$result")
    }
}