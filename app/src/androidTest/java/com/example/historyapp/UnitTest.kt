package com.example.historyapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class unitTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testClearButton_ClearsEditTextAndSelf() {
        // Type age into EditText
        onView(withId(R.id.Age)).perform(typeText("70"))

        // Click on the Clear button
        onView(withId(R.id.Clear)).perform(click())

        // Check if the EditText is cleared
        onView(withId(R.id.Age)).check(matches(withText("")))

        // Check if the Clear button text is cleared
        onView(withId(R.id.Clear)).check(matches(withText("")))
    }
}
