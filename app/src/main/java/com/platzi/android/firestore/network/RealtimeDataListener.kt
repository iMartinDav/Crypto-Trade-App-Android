package com.platzi.android.firestore.network

import java.lang.Exception

/**
 * @author Martin Davila
 * 3/9/19.
 */

interface RealtimeDataListener<T> {

    fun onDataChange(updatedData: T)

    fun onError(exception: Exception)

}
