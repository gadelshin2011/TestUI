package com.example.myapplication

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myapplication.screen.MyProjectScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)

class MyProjectUITest : TestCase() {
    @Rule

  //  val rule2 = ActivityTestRule(MainActivity::class.java, false, false)
    val rule= ActivityScenarioRule(MainActivity::class.java)
    val screen = MyProjectScreen()


    @Test
    fun testUI() = run {
        rule.scenario
        screen {
            step("1") {
                tvName.replaceText("Marat")
            }

            step("2") {
                tvSurname.replaceText("Vertinsky")
            }

            step("3"){
                buttonSend.click()
            }
         }
    }
    @Test
    fun tearDown() {
        rule.scenario.close()
    }



}



