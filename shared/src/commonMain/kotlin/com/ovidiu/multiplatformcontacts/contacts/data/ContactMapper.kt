package com.ovidiu.multiplatformcontacts.contacts.data

import com.ovidiu.multiplatformcontacts.contacts.domain.Contact
import com.ovidiu.multiplatformcontacts.core.data.ImageStorage
import database.ContactEntity

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(it) },
    )
}
