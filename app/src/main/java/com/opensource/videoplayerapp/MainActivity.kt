package com.opensource.videoplayerapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declare values
        val videoView1: VideoView = findViewById(R.id.videoView1)
        val videoView2: VideoView = findViewById(R.id.videoView2)

        //for video view 1 path (offline)
        videoView1.setVideoPath(
            "android.resource://"
            + packageName+"/"
            +R.raw.nature
        )
        //for video view 1 Control like play,pause
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView1)
        mediaController.setMediaPlayer(videoView1)
        videoView1.setMediaController(mediaController)
        videoView1.start()

        //for video view 2 path (online)
        val uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4")
        videoView2.setVideoURI(uri)

        //for video view 2 Control like play,pause
        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(videoView2)
        mediaController2.setMediaPlayer(videoView2)
        videoView2.setMediaController(mediaController2)
        videoView2.start()
        //now go manifest and turn on the internet



    }
}