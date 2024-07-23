package com.example.simplebluetoothconnection.main.mvimodel

import com.example.simplebluetoothconnection.common.mvicomponents.MviState
import com.example.simplebluetoothconnection.main.mvimodel.ResponseType.IDLE

data class MainViewState(
    val chatResponse: String = "",
    val triviaSubject: String = "",
    val isTriviaSubjectTooLong: Boolean = false,
    override val type: ResponseType = IDLE
) : MviState()
