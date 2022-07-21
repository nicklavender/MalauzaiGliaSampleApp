package com.example.malauzaigliasampleapp

import androidx.core.content.FileProvider

/**
 * As our library and Your application both use the same FileProvider so it collides in a manifest merger,
 * to avoid this You need to define an empty class extending File provider and use its provider name in Manifest.
 */
class MyCustomFileProvider : FileProvider() {
}