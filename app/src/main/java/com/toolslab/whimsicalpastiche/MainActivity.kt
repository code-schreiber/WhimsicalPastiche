package com.toolslab.whimsicalpastiche

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.toolslab.whimsicalpastiche.mpp.createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.main_text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_text.text = createApplicationScreenMessage()
    }
}
