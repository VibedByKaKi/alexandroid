package com.amazon.deecomms.media.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ContentManagerInterface {
    void clearExpiredMedia();

    void clearMediaCache();

    boolean existsInCache(String str);

    MediaFileContent getFromCache(String str);

    void putInCache(MediaFileContent mediaFileContent, String str, boolean z);

    boolean removeFromCache(String str);
}
