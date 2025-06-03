package br.com.codeschool.crud_automovel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await


class AutenticacaoViewModel: ViewModel() {
    private val _loading = MutableLiveData<Boolean>() //_loading modo privado mutavel
    val loading: LiveData<Boolean> = _loading //LiveData - leitura de dados de _loading

    private val _erro = MutableLiveData<String?>() //<String?> interrogação indica que checa vazia ou não
    val erro: LiveData<String?> = _erro
}