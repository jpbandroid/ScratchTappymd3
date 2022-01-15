package com.jpb.scratchtappy.md3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.color.DynamicColors

class APKInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DynamicColors.applyIfAvailable(this);
        setContentView(R.layout.activity_apkinfo2)
        val ab: androidx.appcompat.app.ActionBar? = supportActionBar
        ab?.setTitle("APK Info")
        ab?.setSubtitle("ScratchTappy md3 1.5 DP3")
    }
}