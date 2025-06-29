/**
 * Created by ST on 2/11/2025.
 * Author: Sina Tabriziyan
 * @sina.tabriziyan@gmail.com
 */
package com.sina.library.dialog.btmsheet.confirm

import android.content.Context
import com.sina.swidget.library.R

object ConfirmationBtmSheetFactory {
    fun create(
        context: Context,
        message: String,
        positiveText: String? = null,
        negativeText: String? = null,
        style: ConfirmButtonStyle = ConfirmButtonStyle.NORMAL,
        buttonColor: Int,
        onConfirm: () -> Unit
    ): ConfirmationBtmSheet {
        return ConfirmationBtmSheet(
            context = context,
            message = message,
            positiveText = positiveText ?: context.getString(R.string.confirm),
            negativeText = negativeText ?: context.getString(R.string.cancel),
            style = style,
            buttonColor = buttonColor,
            onConfirm = onConfirm
        )
    }
}
