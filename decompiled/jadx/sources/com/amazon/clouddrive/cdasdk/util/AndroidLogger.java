package com.amazon.clouddrive.cdasdk.util;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AndroidLogger implements Logger {

    @NonNull
    private final String prefix;

    public AndroidLogger(@NonNull String str) {
        this.prefix = BitVector$$ExternalSyntheticOutline0.m(str, "_");
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void e(@NonNull String str, @NonNull String str2) {
        Log.e(this.prefix + str, str2);
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void i(@NonNull String str, @NonNull String str2) {
        Log.i(this.prefix + str, str2);
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void w(@NonNull String str, @NonNull String str2) {
        Log.w(this.prefix + str, str2);
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void wtf(@NonNull String str, @NonNull String str2) {
        Log.wtf(this.prefix + str, str2);
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void v(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        Log.e(this.prefix + str, str2, th);
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void i(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        Log.i(this.prefix + str, str2, th);
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void w(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        Log.w(this.prefix + str, str2, th);
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        Log.wtf(this.prefix + str, str2, th);
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void d(@NonNull String str, @NonNull String str2) {
    }

    @Override // com.amazon.clouddrive.cdasdk.util.Logger
    public void v(@NonNull String str, @NonNull String str2) {
    }
}
