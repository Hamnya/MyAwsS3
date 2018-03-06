package com.example.hamnya.myawss3;

import android.support.multidex.MultiDexApplication;

import com.amazonaws.mobile.auth.core.IdentityManager;
import com.amazonaws.mobile.config.AWSConfiguration;

/**
 * Created by hamnya on 2018. 3. 2..
 */

public class Application extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplication();
    }

    private void initializeApplication() {

        AWSConfiguration awsConfiguration = new AWSConfiguration(getApplicationContext());

        // If IdentityManager is not created, create it
        if (IdentityManager.getDefaultIdentityManager() == null) {
            IdentityManager identityManager =
                    new IdentityManager(getApplicationContext(), awsConfiguration);
            IdentityManager.setDefaultIdentityManager(identityManager);
        }

    }


}
