package com.ovidiu.multiplatformcontacts.contacts.data

import com.ovidiu.multiplatformcontacts.contacts.domain.Contact
import database.ContactEntity

fun ContactEntity.toContact(): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = null,
    )
}
