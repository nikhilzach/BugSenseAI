package com.example.imageclassification

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler

class NewActivity_Remedies : AppCompatActivity() {
    private lateinit var webView: WebView
    lateinit var text_view2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newactivity_remedies)
        webView = findViewById(R.id.webView)

        // Load and display the GIF file in the WebView
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()
        webView.loadUrl("file:///android_asset/webview_style.css")
        webView.loadUrl("file:///android_asset/loading.gif")

        fastForwardGif(2.0)
        Handler().postDelayed({
            // Display the actual content after 5 seconds
            showContent()
        }, 4000)

    }
    private fun fastForwardGif(speedFactor: Double) {
        webView.evaluateJavascript("document.getElementsByTagName('video')[0].playbackRate = $speedFactor;", null)
    }

    private fun showContent() {
        // Display the actual content here
        // For example, load another layout, set up views, etc.
        webView.visibility = WebView.GONE
        val inputValue = intent.getStringExtra("inputValue").toString()
        // Now you can use the "inputValue" variable in your NewActivity

        text_view2 = findViewById(R.id.textView2)
        text_view2.setText("Remedies: "+inputValue)

        if(inputValue=="None")
            text_view2.setText("Dei Dei ninak onnum illa..pinne enthinaa potta")
    }
}