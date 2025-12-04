package nethical.digipaws

import android.app.Application

class Digipaws: Application() {
  override fun onCreate() {
    super.onCreate()
    Thread.setDefaultUncaughtExceptionHandler(CrashLogger(this))
  }
}
