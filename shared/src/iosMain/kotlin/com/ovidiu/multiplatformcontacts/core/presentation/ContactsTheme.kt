package com.ovidiu.multiplatformcontacts.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.ovidiu.multiplatformcontacts.ui.theme.DarkColorScheme
import com.ovidiu.multiplatformcontacts.ui.theme.LightColorScheme
import com.ovidiu.multiplatformcontacts.ui.theme.Typography

@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content,
    )
}
