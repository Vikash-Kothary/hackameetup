package net.skyscanner.hackameetup.ui.flightsearch

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import kotterknife.bindView
import net.skyscanner.hackameetup.R
import net.skyscanner.hackameetup.application.AppViewModelFactory
import net.skyscanner.hackameetup.application.DefinitelyNotDagger

class FlightSearchActivity : AppCompatActivity() {

    private val viewModelFactory: AppViewModelFactory = DefinitelyNotDagger.appViewModelFactory

    private val toolbar: Toolbar by bindView(R.id.toolbar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_search)

        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
