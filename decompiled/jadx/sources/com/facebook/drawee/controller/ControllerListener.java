package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface ControllerListener<INFO> {
    void onFailure(String str, Throwable th);

    void onFinalImageSet(String str, @Nullable INFO info, @Nullable Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th);

    void onIntermediateImageSet(String str, @Nullable INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
