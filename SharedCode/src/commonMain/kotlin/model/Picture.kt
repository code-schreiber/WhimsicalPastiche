package com.toolslab.whimsicalpastiche.mpp.model

import kotlinx.io.InputStream

data class Picture(
    val name: String,
    val inputStream: InputStream
)
