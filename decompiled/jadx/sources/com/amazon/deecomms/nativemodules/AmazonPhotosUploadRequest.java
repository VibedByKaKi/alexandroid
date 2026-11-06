package com.amazon.deecomms.nativemodules;

import android.net.Uri;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AmazonPhotosUploadRequest {
    private final String clientId;
    private final Uri contentUri;
    private final String conversationId;
    private final String mediaPath;
    private final String nodeId;
    private final String photoMessageMediaDataId;

    public AmazonPhotosUploadRequest(String str, String str2, String str3, String str4, String str5) {
        this.mediaPath = str;
        this.contentUri = Uri.parse(str);
        this.conversationId = str2;
        this.clientId = str3;
        this.nodeId = str4;
        this.photoMessageMediaDataId = str5;
    }

    public static AmazonPhotosUploadRequest extractFromReadableMap(ReadableMap readableMap) {
        return new AmazonPhotosUploadRequest(!readableMap.hasKey("mediaPath") ? null : readableMap.getString("mediaPath"), !readableMap.hasKey("conversationId") ? null : readableMap.getString("conversationId"), !readableMap.hasKey("clientId") ? null : readableMap.getString("clientId"), !readableMap.hasKey(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID) ? null : readableMap.getString(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID), readableMap.hasKey("photoMessageMediaDataId") ? readableMap.getString("photoMessageMediaDataId") : null);
    }

    public String getClientId() {
        return this.clientId;
    }

    public Uri getContentUri() {
        return this.contentUri;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getMediaPath() {
        return this.mediaPath;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public String getPhotoMessageMediaDataId() {
        return this.photoMessageMediaDataId;
    }
}
