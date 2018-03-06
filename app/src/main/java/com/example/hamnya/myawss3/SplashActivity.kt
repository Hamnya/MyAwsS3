package com.example.hamnya.myawss3

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_splash.*
import android.content.Intent
import com.amazonaws.mobile.auth.core.StartupAuthResult
import com.amazonaws.mobile.auth.core.StartupAuthResultHandler
import com.amazonaws.mobile.auth.core.IdentityManager
import com.amazonaws.mobile.config.AWSConfiguration



class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val appContext = applicationContext
        val awsConfig = AWSConfiguration(appContext)
        val identityManager = IdentityManager(appContext, awsConfig)
        IdentityManager.setDefaultIdentityManager(identityManager)
        identityManager.doStartupAuth(this, StartupAuthResultHandler {
            // User identity is ready as unauthenticated user or previously signed-in user.
        })

        // Go to the main activity
        val intent = Intent(this, MainActivity::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        this.startActivity(intent)
        this.finish()
    }

}
