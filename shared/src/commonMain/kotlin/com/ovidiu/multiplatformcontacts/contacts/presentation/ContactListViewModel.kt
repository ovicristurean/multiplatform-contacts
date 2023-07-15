package com.ovidiu.multiplatformcontacts.contacts.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.ovidiu.multiplatformcontacts.contacts.domain.Contact
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactListViewModel : ViewModel() {

    private val _state = MutableStateFlow(
        ContactListState(
            contacts = contacts,
        )
    )
    val state = _state.asStateFlow()

    var newContact: Contact? by mutableStateOf(null)
        private set

    fun onEvent(event: ContactsListEvent) {

    }
}


private val contacts = (1..50).map {
    Contact(
        id = it.toLong(),
        firstName = "First$it",
        lastName = "Last$it",
        email = "test@test$it.com",
        phoneNumber = "1234$it",
        photoBytes = null
    )
}
