package com.amazon.apl.android.sgcontent.filters;

import com.amazon.apl.android.media.MediaObject;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class MediaObjectFilter extends Filter {
    public static MediaObjectFilter create(long j, MediaObject mediaObject) {
        AutoValue_MediaObjectFilter autoValue_MediaObjectFilter = new AutoValue_MediaObjectFilter(mediaObject);
        autoValue_MediaObjectFilter.mNativeHandle = j;
        return autoValue_MediaObjectFilter;
    }

    public abstract MediaObject mediaObject();
}
