package pl.gdg.myapplication

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("pl.gdg.workshop16", appContext.packageName)
    }

    @Test
    fun changesLabelAfterGoClick() {
        launchActivity<MainActivity>().use {
            onView(withId(R.id.label)).check(ViewAssertions.matches(withText("Hello World!")))
            onView(withText("Go!")).perform(click())
            onView(withId(R.id.label)).check(ViewAssertions.matches(withText("Going!")))
        }
    }
}