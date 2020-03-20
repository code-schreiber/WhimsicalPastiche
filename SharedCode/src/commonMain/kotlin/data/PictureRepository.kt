package com.toolslab.whimsicalpastiche.mpp.data

import com.toolslab.whimsicalpastiche.mpp.ApplicationDispatcher
import com.toolslab.whimsicalpastiche.mpp.api.Api
import com.toolslab.whimsicalpastiche.mpp.api.HttpBinClient
import com.toolslab.whimsicalpastiche.mpp.model.Picture
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.UnstableDefault

@UnstableDefault
class PictureRepository(private val api: Api = Api()) {

    suspend fun loadPictureSync(): Picture {
        return api.load("https://url.com/image/3035.png")
    }

    fun loadFakeResult(callback: (String) -> Unit) {
        GlobalScope.apply {
            launch(ApplicationDispatcher) {
                val client = HttpBinClient()
                val result = client.runGet()
                callback(result)
            }
        }
    }

    fun loadPicture(callback: (Picture) -> Unit) {
        GlobalScope.apply {
            launch(ApplicationDispatcher) {
                val picture = api.load("https://url.com/image/3035.png")
                callback(picture)
            }
        }
    }
}
