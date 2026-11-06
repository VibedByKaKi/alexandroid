package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
@Keep
/* loaded from: classes9.dex */
public abstract class FrameProcessorPlugin {
    @DoNotStrip
    @Keep
    @Nullable
    public abstract Object callback(@NonNull Frame frame, @Nullable Map<String, Object> map) throws Throwable;
}
