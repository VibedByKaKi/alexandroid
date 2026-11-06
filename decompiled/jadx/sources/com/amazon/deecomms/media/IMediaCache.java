package com.amazon.deecomms.media;

import com.amazon.deecomms.media.model.MediaFileContent;
import com.amazon.deecomms.media.model.MediaStreamContent;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IMediaCache {
    void clearAll() throws IOException;

    boolean exists(String str) throws IOException;

    MediaFileContent get(String str) throws IOException;

    File getDirectory();

    void put(String str, MediaFileContent mediaFileContent, boolean z) throws IOException;

    void put(String str, MediaStreamContent mediaStreamContent, boolean z) throws IOException;

    boolean remove(String str) throws IOException;
}
