package com.amazon.alexa.sharing.sharingsdk;

import android.webkit.MimeTypeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class MimeTypeMapWrapperImpl implements MimeTypeMapWrapper {
    @Override // com.amazon.alexa.sharing.sharingsdk.MimeTypeMapWrapper
    public String getExtensionFromMimeType(String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
    }

    @Override // com.amazon.alexa.sharing.sharingsdk.MimeTypeMapWrapper
    public String getFileExtensionFromUrl(String str) {
        return MimeTypeMap.getFileExtensionFromUrl(str);
    }
}
