package com.reactnativedocumentpicker;

import android.webkit.MimeTypeMap;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J$\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lcom/reactnativedocumentpicker/IsKnownTypeImpl;", "", "<init>", "()V", "isKnownType", "Lcom/facebook/react/bridge/WritableMap;", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "", "value", "createMap", "isKnown", "", "preferredFilenameExtension", "mimeType", "react-native-documents_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IsKnownTypeImpl {

    @NotNull
    public static final IsKnownTypeImpl INSTANCE = new IsKnownTypeImpl();

    private IsKnownTypeImpl() {
    }

    private final WritableMap createMap(boolean isKnown, String preferredFilenameExtension, String mimeType) {
        WritableMap createMap = Arguments.createMap();
        createMap.getClass();
        createMap.putNull("UTType");
        createMap.putBoolean("isKnown", isKnown);
        createMap.putString("preferredFilenameExtension", preferredFilenameExtension);
        createMap.putString("mimeType", mimeType);
        return createMap;
    }

    @NotNull
    public final WritableMap isKnownType(@NotNull String kind, @NotNull String value) {
        boolean z;
        kind.getClass();
        value.getClass();
        if (Intrinsics.areEqual(kind, "mimeType")) {
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(value);
            z = extensionFromMimeType != null;
            if (extensionFromMimeType == null) {
                value = null;
            }
            return createMap(z, extensionFromMimeType, value);
        }
        if (!Intrinsics.areEqual(kind, "extension")) {
            return createMap(false, null, null);
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(value);
        z = mimeTypeFromExtension != null;
        if (mimeTypeFromExtension == null) {
            value = null;
        }
        return createMap(z, value, mimeTypeFromExtension);
    }
}
