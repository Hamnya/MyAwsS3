package com.example.hamnya.myawss3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.amazonaws.mobile.config.AWSConfiguration
import com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility
import java.io.File



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

   /* fun uploadData() {

        val awsConfig = AWSConfiguration(applicationContext)

        val transferUtility = TransferUtility.builder()
                .context(applicationContext)
                .awsConfiguration(awsConfig)
                .build()

        val uploadObserver = transferUtility.upload(
                "s3Folder/s3Key.txt",
                File("/path/to/file/localFile.txt"))

        uploadObserver.setTransferListener(object : TransferListener() {

            override fun onStateChanged(id: Int, state: TransferState) {
                if (TransferState.COMPLETED === state) {
                    // Handle a completed upload.
                }

            }

            override fun onProgressChanged(
                    id: Int, bytesCurrent: Long, bytesTotal: Long) {

                // TODO Auto-generated method stub

            }

            override fun onError(id: Int, ex: Exception) {
                // TODO Auto-generated method stub

            }

        })

        // If your upload does not trigger the onStateChanged method inside your
        // TransferListener, you can directly check the transfer state as shown here.
        if (TransferState.COMPLETED === uploadObserver.getState()) {
            // Handle a completed upload.
        }

    }
*/
}
