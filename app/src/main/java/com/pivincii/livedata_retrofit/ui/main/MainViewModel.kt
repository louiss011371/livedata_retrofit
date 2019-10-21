package com.pivincii.livedata_retrofit.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pivincii.livedata_retrofit.model.PokeApi
import com.pivincii.livedata_retrofit.model.PokeCharacteristic
import com.pivincii.livedata_retrofit.network.ApiResponse
import com.pivincii.livedata_retrofit.network.RetrofitClient
import javax.security.auth.callback.Callback

class MainViewModel : ViewModel() {
    val pokeService = RetrofitClient().getRetrofit().create(PokeApi::class.java)



}
