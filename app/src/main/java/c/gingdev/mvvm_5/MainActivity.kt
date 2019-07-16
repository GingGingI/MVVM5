package c.gingdev.mvvm_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import c.gingdev.mvvm_5.databinding.ActivityMainBinding
import c.gingdev.mvvm_5.fragment.MainFragment
import c.gingdev.mvvm_5.vm.FragmentViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
            .apply { replace(R.id.fragmentLayout, MainFragment()) }
            .commit()
    }
}
