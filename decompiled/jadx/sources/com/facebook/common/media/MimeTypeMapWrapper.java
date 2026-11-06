package com.facebook.common.media;

import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class MimeTypeMapWrapper {
    private static final MimeTypeMap sMimeTypeMap = MimeTypeMap.getSingleton();
    private static final Map<String, String> sMimeTypeToExtensionMap = ImmutableMap.of(MimeTypes.IMAGE_HEIF, "heif", "image/heic", "heic");
    private static final Map<String, String> sExtensionToMimeTypeMap = ImmutableMap.of("heif", MimeTypes.IMAGE_HEIF, "heic", "image/heic");

    @Nullable
    public static String getExtensionFromMimeType(String str) {
        String str2 = sMimeTypeToExtensionMap.get(str);
        return str2 != null ? str2 : sMimeTypeMap.getExtensionFromMimeType(str);
    }

    @Nullable
    public static String getMimeTypeFromExtension(String str) {
        String str2 = sExtensionToMimeTypeMap.get(str);
        return str2 != null ? str2 : sMimeTypeMap.getMimeTypeFromExtension(str);
    }

    public static boolean hasExtension(String str) {
        return sExtensionToMimeTypeMap.containsKey(str) || sMimeTypeMap.hasExtension(str);
    }

    public static boolean hasMimeType(String str) {
        return sMimeTypeToExtensionMap.containsKey(str) || sMimeTypeMap.hasMimeType(str);
    }
}
