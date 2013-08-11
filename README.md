Android43BugDemo-ClipboardManager
=================================

Sample code to demonstrate an Android 4.3 bug in ClipboardManager.
To be used as described in http://www.androidpolice.com/2013/08/08/bug-watch-android-4-3-running-an-app-that-watches-the-clipboard-will-cause-other-apps-to-crash-when-you-copy-from-them/

NOTE: The bug being demonstrated is only present in Android 4.3, and is expected to be fixed with the release of 4.3.1.

This project was built with Android Studio v0.2.3

Steps to replicate the bug:
1. Build this project and deploy it to a device running Android 4.3
2. *(optional)* Attempt to copy some text to the clipboard on the device
	- this is a control step, just to be sure the device doesn't already have another application which exposes this bug
3. Run the app
4. Tap the button labeled 'Enable'
5. Switch to any app other than the sample app (eg. messengers, browsers, etc.)
6. Attempt to copy some text to the clipboard

Expected result: The application you copy text from should crash with an error dialog.