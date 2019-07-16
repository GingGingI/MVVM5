package c.gingdev.mvvm_5.vm

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class FragmentViewModel: ViewModel() {
    val title = ObservableField<String>()
    val content = ObservableField<String>()
}