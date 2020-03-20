package com.toolslab.whimsicalpastiche.mpp.api

import com.toolslab.whimsicalpastiche.mpp.model.Picture
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import io.ktor.client.request.url
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json

interface NetworkClient {
    suspend fun load(url: String): Picture
}

@UnstableDefault
open class RealNetworkClient : NetworkClient {

    override suspend fun load(url: String): Picture {
        return client.get { url(url) }
    }

    private val client: HttpClient = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer(Json.nonstrict)
        }
    }
}
