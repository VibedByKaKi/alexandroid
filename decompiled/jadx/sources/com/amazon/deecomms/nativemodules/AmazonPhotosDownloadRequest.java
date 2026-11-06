package com.amazon.deecomms.nativemodules;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AmazonPhotosDownloadRequest {
    final String clientId;
    final String conversationId;
    final String dimension;
    final boolean isThumbnail;
    final String nodeId;
    final String ownerId;
    final int viewBox;

    public AmazonPhotosDownloadRequest(String str, String str2, String str3, String str4, String str5, boolean z, int i) {
        this.conversationId = str;
        this.clientId = str2;
        this.dimension = str3;
        this.nodeId = str4;
        this.ownerId = str5;
        this.isThumbnail = z;
        this.viewBox = i;
    }

    public static AmazonPhotosDownloadRequest extractFromReadableMap(ReadableMap readableMap) {
        String string = !readableMap.hasKey("conversationId") ? null : readableMap.getString("conversationId");
        String string2 = !readableMap.hasKey("clientId") ? null : readableMap.getString("clientId");
        String string3 = !readableMap.hasKey(TypedValues.Custom.S_DIMENSION) ? null : readableMap.getString(TypedValues.Custom.S_DIMENSION);
        String string4 = !readableMap.hasKey(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID) ? null : readableMap.getString(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID);
        String string5 = readableMap.hasKey(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY) ? readableMap.getString(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY) : null;
        boolean z = readableMap.hasKey("isThumbnail") && readableMap.getBoolean("isThumbnail");
        return new AmazonPhotosDownloadRequest(string, string2, string3, string4, string5, z, (int) ((z && readableMap.hasKey("viewbox")) ? readableMap.getDouble("viewbox") : -999.0d));
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getDimension() {
        return this.dimension;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public int getViewBox() {
        return this.viewBox;
    }

    public boolean isThumbnail() {
        return this.isThumbnail;
    }
}
