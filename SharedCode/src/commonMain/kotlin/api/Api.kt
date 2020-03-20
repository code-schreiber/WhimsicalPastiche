package com.toolslab.whimsicalpastiche.mpp.api

import com.toolslab.whimsicalpastiche.mpp.model.Picture
import kotlinx.serialization.UnstableDefault

@UnstableDefault
class Api {

    private var client = RealNetworkClient()

    suspend fun load(url: String): Picture {
        return client.load(url)
    }
}
