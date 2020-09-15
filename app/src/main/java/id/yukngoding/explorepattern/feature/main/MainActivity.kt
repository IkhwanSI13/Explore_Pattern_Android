package id.yukngoding.explorepattern.feature.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import id.yukngoding.explorepattern.R
import id.yukngoding.explorepattern.feature.load.LoadActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_load.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_load -> {
                startActivity(Intent(this, LoadActivity::class.java))
            }
        }
    }

}