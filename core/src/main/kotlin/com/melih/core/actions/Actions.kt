package com.melih.core.actions

import android.content.Intent
import android.net.Uri

/**
 * Navigation actions for navigation between feature activities
 */
object Actions {

    fun openDetailFor(id: Long) =
        Intent().apply {
            data = Uri.parse("feature://detail/$id")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
        }

}
