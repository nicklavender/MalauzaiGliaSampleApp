package com.example.malauzaigliasampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.glia.androidsdk.SiteApiKey
import com.glia.widgets.GliaWidgets
import com.glia.widgets.GliaWidgetsConfig
import com.glia.widgets.chat.ChatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		GliaWidgets.onAppCreate(application)

		val gliaWidgetsConfig = GliaWidgetsConfig.Builder()
			.setSiteApiKey(SiteApiKey("1a3e38da-5952-42e2-ab62-2374e0d7f0aa", "gls_s9VrisfK1elQ5KfJ9PQdQopE8b7pPHJYFc5b"))
			.setSiteId("9fd9bb64-e7ea-4ea5-8d63-63cbf6fd9bfb")
			.setRegion("us")
			.setContext(applicationContext)
			.build()

		GliaWidgets.init(gliaWidgetsConfig)

		val gliaLaunchButton : TextView = findViewById(R.id.launch_glia_chat_test)
		gliaLaunchButton.setOnClickListener {
			startGliaChat()
		}

	}



	private fun startGliaChat() {
		val intent = Intent(this, ChatActivity::class.java).apply {
			putExtra(GliaWidgets.COMPANY_NAME, "MMBSierra")
			putExtra(GliaWidgets.QUEUE_ID, "05c9e646-c48f-4b75-b842-65b23733690a")
			putExtra(GliaWidgets.CONTEXT_URL, "https://www.google.com")
		}
		startActivity(intent)
	}
}