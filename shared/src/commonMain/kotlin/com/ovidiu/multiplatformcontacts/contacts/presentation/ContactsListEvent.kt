package com.ovidiu.multiplatformcontacts.contacts.presentation

import com.ovidiu.multiplatformcontacts.contacts.domain.Contact

sealed interface ContactsListEvent {

    object OnAddNewContactClick : ContactsListEvent

    object DismissContact : ContactsListEvent

    data class OnFirstNameChanged(
        val value: String,
    ) : ContactsListEvent

    data class OnLastNameChanged(
        val value: String,
    ) : ContactsListEvent

    data class OnEmailChanged(
        val value: String,
    ) : ContactsListEvent

    data class OnPhoneNumberChanged(
        val value: String
    ) : ContactsListEvent

    class OnPhotoPicked(val bytes: ByteArray) : ContactsListEvent

    object OnAddPhotoClicked : ContactsListEvent

    object SaveContact : ContactsListEvent

    data class SelectContact(val contact: Contact) : ContactsListEvent

    data class EditContacct(val contact: Contact) : ContactsListEvent

    object DeleteContact : ContactsListEvent
}