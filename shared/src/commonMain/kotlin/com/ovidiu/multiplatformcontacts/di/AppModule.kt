package com.ovidiu.multiplatformcontacts.di

import com.ovidiu.multiplatformcontacts.contacts.domain.ContactDataSource

expect class AppModule {
    val contactDataSource: ContactDataSource
}
