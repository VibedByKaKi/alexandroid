package com.here.sdk.search;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class Suggestion extends NativeBase {
    public Suggestion(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.search.Suggestion.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                Suggestion.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @NonNull
    public native List<TextSlice> getAddressTextSlices();

    @NonNull
    public native Map<HighlightType, List<IndexRange>> getHighlights();

    @Nullable
    public native String getHref();

    @Nullable
    public native String getId();

    @Nullable
    public native Place getPlace();

    @NonNull
    public native String getTitle();

    @NonNull
    public native List<TextSlice> getTitleTextSlices();

    @NonNull
    public native SuggestionType getType();
}
