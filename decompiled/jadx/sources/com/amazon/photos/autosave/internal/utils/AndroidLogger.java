package com.amazon.photos.autosave.internal.utils;

import android.util.Log;
import com.amazon.clouddrive.android.core.interfaces.Logger;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/amazon/photos/autosave/internal/utils/AndroidLogger;", "Lcom/amazon/clouddrive/android/core/interfaces/Logger;", "()V", "d", "", "tag", "", "message", "t", "", "e", "i", "logCustomerEvent", "v", "w", "wtf", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidLogger implements Logger {
    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void d(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void e(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Log.e(tag, message);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void i(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Log.i(tag, message);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void logCustomerEvent(@NotNull String message) {
        message.getClass();
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void v(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void w(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Log.w(tag, message);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void wtf(@NotNull String tag, @NotNull String message) {
        tag.getClass();
        message.getClass();
        Log.wtf(tag, message);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void d(@NotNull String tag, @NotNull String message, @NotNull Throwable t) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, message, t);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void v(@NotNull String tag, @NotNull String message, @NotNull Throwable t) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, message, t);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void e(@NotNull String tag, @NotNull String message, @NotNull Throwable t) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, message, t);
        Log.e(tag, message, t);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void i(@NotNull String tag, @NotNull String message, @NotNull Throwable t) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, message, t);
        Log.i(tag, message, t);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void w(@NotNull String tag, @NotNull String message, @NotNull Throwable t) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, message, t);
        Log.w(tag, message, t);
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.Logger
    public void wtf(@NotNull String tag, @NotNull String message, @NotNull Throwable t) {
        CredentialConfig$$ExternalSyntheticOutline0.m(tag, message, t);
        Log.wtf(tag, message, t);
    }
}
