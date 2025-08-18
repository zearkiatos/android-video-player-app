package com.android.android_video_player_app

import android.R.*
import android.net.Uri
import android.net.Uri.*
import android.widget.MediaController
import android.widget.VideoView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.android.android_video_player_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = findViewById<VideoView>(binding.videoView.id)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val uri:Uri = parse("android.resource://$packageName/raw/test")
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }

}