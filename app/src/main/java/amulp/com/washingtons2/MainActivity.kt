package amulp.com.washingtons2

import amulp.com.washingtons2.ui.main.DryerFragment
import amulp.com.washingtons2.ui.main.OtherFragment
import amulp.com.washingtons2.ui.main.WasherFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    private val washerFragment = WasherFragment.newInstance()
    private val dryerFragment = DryerFragment.newInstance()
    private val otherFragment = OtherFragment.newInstance()

    private var currentItem = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, washerFragment)
                    .commitNow()
            currentItem = 0
        }

        bottom_navigation.addItem(AHBottomNavigationItem(R.string.washer, R.drawable.ic_wash, 0))
        bottom_navigation.addItem(AHBottomNavigationItem(R.string.dryer, R.drawable.ic_dry, 0))
        bottom_navigation.addItem(AHBottomNavigationItem(R.string.other, R.drawable.ic_other, 0))

        bottom_navigation.titleState = AHBottomNavigation.TitleState.ALWAYS_SHOW
        bottom_navigation.defaultBackgroundColor = ContextCompat.getColor(this, R.color.colorPrimary)
        bottom_navigation.accentColor = ContextCompat.getColor(this,R.color.primary_material_light)
        bottom_navigation.currentItem = 0

        bottom_navigation.setOnTabSelectedListener(AHBottomNavigation.OnTabSelectedListener { position, wasSelected ->
            if (!wasSelected) {
                when (position) {
                    0 -> {
                        if (currentItem != 0) {
                            supportFragmentManager.beginTransaction()
                                    .replace(R.id.container, washerFragment)
                                    .commitNow()
                            currentItem = 0
                        }
                        return@OnTabSelectedListener true
                    }
                    1 -> {
                        if (currentItem != 1){
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.container, dryerFragment)
                                .commitNow()
                            currentItem = 1
                        }
                        return@OnTabSelectedListener true
                    }
                    2 -> {
                        if(currentItem != 2) {
                            supportFragmentManager.beginTransaction()
                                    .replace(R.id.container, otherFragment)
                                    .commitNow()
                            currentItem = 2
                        }
                        return@OnTabSelectedListener true
                    }
                }
            }
            false
        })
    }

}
