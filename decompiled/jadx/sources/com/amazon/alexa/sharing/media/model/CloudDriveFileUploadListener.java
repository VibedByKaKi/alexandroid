package com.amazon.alexa.sharing.media.model;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface CloudDriveFileUploadListener {
    void onError(Exception exc);

    void onSuccess(@NonNull String str, @NonNull String str2);
}
