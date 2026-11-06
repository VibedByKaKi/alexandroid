package com.amazon.alexa.sharing.media.model;

import com.amazon.alexa.sharing.media.MediaFileContent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ContentManagerInterface {
    void clearMediaCache();

    boolean existsInCache(String str);

    MediaFileContent getFromCache(String str);

    void putInCache(MediaFileContent mediaFileContent, String str, boolean z);

    boolean removeFromCache(String str);
}
