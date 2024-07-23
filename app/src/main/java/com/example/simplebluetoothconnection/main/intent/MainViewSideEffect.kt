package com.example.simplebluetoothconnection.main.intent

import com.example.simplebluetoothconnection.common.mvicomponents.MviSideEffect

sealed class MainViewSideEffect() : MviSideEffect {

    data class ShowSnackBar(val snackBarMessage: String) : MainViewSideEffect()
}
