package com.amazon.alexa.photos.api;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface PhotosChooser {
    @MainThread
    void choosePhotos(@NonNull Activity activity, int i);

    @NonNull
    @AnyThread
    List<Uri> handleResponse(@NonNull Intent intent);
}
