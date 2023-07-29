package com.ovidiu.multiplatformcontacts.di

import com.ovidiu.multiplatformcontacts.contacts.data.SqlDelightContactDataSource
import com.ovidiu.multiplatformcontacts.contacts.domain.ContactDataSource
import com.ovidiu.multiplatformcontacts.core.data.DatabaseDriverFactory
import com.ovidiu.multiplatformcontacts.core.data.ImageStorage
import com.ovidiu.multiplatformcontacts.database.ContactDatabase

actual class AppModule {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory().create()
            ),
            imageStorage = ImageStorage()
        )
    }
}
