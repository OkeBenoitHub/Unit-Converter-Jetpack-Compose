package www.okebenoithub.com.unit_converter_mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory
import www.okebenoithub.com.unit_converter_mvvm.data.ConverterRepository
import javax.inject.Inject

class ConverterViewModelFactory @Inject constructor(private val repository: ConverterRepository): NewInstanceFactory(){

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ConverterViewModel(repository) as T
    }
}

