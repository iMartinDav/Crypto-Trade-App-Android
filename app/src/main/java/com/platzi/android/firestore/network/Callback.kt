package com.platzi.android.firestore.network

import java.lang.Exception

/**
 * @author Martin Davila
 * 3/7/19.
 */
interface Callback<T> {

    fun onSuccess(result: T?)

    fun onFailed(exception: Exception)

}