package net.skyscanner.hackameetup.ui.flightsearch

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import kotterknife.bindView
import net.skyscanner.hackameetup.R
import net.skyscanner.hackameetup.ui.flightresults.FlightResultsActivity
import android.support.v4.app.ActivityOptionsCompat



class FlightSearchActivity : AppCompatActivity() {

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

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId){
            android.R.id.home -> {
                finish()
                return true
            }
            R.id.action_search -> {
                val intent = Intent(this, FlightResultsActivity::class.java)
                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, toolbar as Toolbar, "toolbar")
                startActivity(intent, options.toBundle())
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
