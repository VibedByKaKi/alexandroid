package com.facebook.common.logging;

import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class FLogDefaultLoggingDelegate implements LoggingDelegate {
    public static final FLogDefaultLoggingDelegate sInstance = new FLogDefaultLoggingDelegate();
    private String mApplicationTag = "unknown";
    private int mMinimumLoggingLevel = 5;

    private FLogDefaultLoggingDelegate() {
    }

    public static FLogDefaultLoggingDelegate getInstance() {
        return sInstance;
    }

    private static String getMsg(String str, Throwable th) {
        StringBuilder m = AppLaunchChecker$$ExternalSyntheticOutline0.m(str, '\n');
        m.append(getStackTraceString(th));
        return m.toString();
    }

    private static String getStackTraceString(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    private String prefixTag(String str) {
        return this.mApplicationTag != null ? ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(), this.mApplicationTag, ":", str) : str;
    }

    private void println(int i, String str, String str2, Throwable th) {
        Log.println(i, prefixTag(str), getMsg(str2, th));
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void d(String str, String str2) {
        println(3, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void e(String str, String str2) {
        println(6, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public int getMinimumLoggingLevel() {
        return this.mMinimumLoggingLevel;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void i(String str, String str2) {
        println(4, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public boolean isLoggable(int i) {
        return this.mMinimumLoggingLevel <= i;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void log(int i, String str, String str2) {
        println(i, str, str2);
    }

    public void setApplicationTag(String str) {
        this.mApplicationTag = str;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void setMinimumLoggingLevel(int i) {
        this.mMinimumLoggingLevel = i;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void v(String str, String str2) {
        println(2, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void w(String str, String str2) {
        println(5, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void wtf(String str, String str2) {
        println(6, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void d(String str, String str2, Throwable th) {
        println(3, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void e(String str, String str2, Throwable th) {
        println(6, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void i(String str, String str2, Throwable th) {
        println(4, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void v(String str, String str2, Throwable th) {
        println(2, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void w(String str, String str2, Throwable th) {
        println(5, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void wtf(String str, String str2, Throwable th) {
        println(6, str, str2, th);
    }

    private void println(int i, String str, String str2) {
        Log.println(i, prefixTag(str), str2);
    }
}
