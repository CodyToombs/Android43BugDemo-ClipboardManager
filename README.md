Android43BugDemo-ClipboardManager
=================================

Sample code to demonstrate an Android 4.3 bug in ClipboardManager. The bug being demonstrated is only present in Android 4.3, and is expected to be fixed with the release of 4.3.1.

To be used as described in [Bug-Watch: Android 4.3 - Running An App That Watches The Clipboard Will Cause Other Apps To Crash When You Copy From Them](http://www.androidpolice.com/2013/08/08/bug-watch-android-4-3-running-an-app-that-watches-the-clipboard-will-cause-other-apps-to-crash-when-you-copy-from-them/)

NOTE: This project was built with Android Studio v0.2.3

Steps to replicate the bug:

1.  Build this project and deploy it to a device running Android 4.3
2.  Run the app
3.  Tap the button labeled 'Enable'
4.  Switch to any app other than the sample app (eg. messengers, browsers, etc.)
5.  Attempt to copy some text to the clipboard

Expected result: The application you copy text from should crash with an error dialog.
