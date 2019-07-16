package c.gingdev.mvvm_5.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import c.gingdev.mvvm_5.R
import c.gingdev.mvvm_5.databinding.FragmentLayoutBinding
import c.gingdev.mvvm_5.vm.FragmentViewModel

class MainFragment: Fragment() {
    companion object {
        private var Instance: Fragment? = null

        fun getInstance(): Fragment
                = Instance ?: synchronized(this) {
            Instance
                ?: buildFragment().also { Instance = it }}

        private fun buildFragment(): Fragment
                = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
        = DataBindingUtil.inflate<FragmentLayoutBinding>(inflater,
        R.layout.fragment_layout, container, false).root

    val model = FragmentViewModel()
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        DataBindingUtil.getBinding<FragmentLayoutBinding>(view!!)!!.run {
            fragmentModel = model

            model.title.set("testTitle")
            model.content.set("testContent")
        }
    }
}