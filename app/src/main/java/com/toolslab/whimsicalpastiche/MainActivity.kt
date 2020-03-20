package com.toolslab.whimsicalpastiche

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.toolslab.whimsicalpastiche.mpp.createApplicationScreenMessage
import com.toolslab.whimsicalpastiche.mpp.data.PictureRepository
import kotlinx.android.synthetic.main.activity_main.main_image
import kotlinx.android.synthetic.main.activity_main.main_text
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_text.text = createApplicationScreenMessage()

        val repository = PictureRepository()
        repository.loadPicture {
            val inputStream: InputStream = it.inputStream
            val name: String = it.name
            val dr: Drawable = Drawable.createFromStream(inputStream, name)
            main_image.background = dr
        }
    }
}
