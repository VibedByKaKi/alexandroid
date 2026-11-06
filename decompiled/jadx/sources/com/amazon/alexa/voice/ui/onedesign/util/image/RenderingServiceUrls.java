package com.amazon.alexa.voice.ui.onedesign.util.image;

import com.amazon.alexa.voice.ui.onedesign.util.Logger;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RenderingServiceUrls {
    private static final List<String> RENDERING_SERVICE_HOST_HINTS = Arrays.asList("images-amazon.com", "media-amazon.com");
    private static final List<String> imageTypeValues = Collections.unmodifiableList(Arrays.asList(ImageType.JPG, ImageType.PNG, ImageType.UNSUPPORTED));

    private RenderingServiceUrls() {
        throw new IllegalStateException("No instances, bud!");
    }

    private static String fromUrl(String str) {
        if (str == null) {
            return null;
        }
        String substring = str.substring(str.lastIndexOf(".") + 1);
        for (String str2 : imageTypeValues) {
            if (str2.equals(substring)) {
                return str2;
            }
        }
        return ImageType.UNSUPPORTED;
    }

    private static boolean isRenderingServiceUrl(String str) {
        Iterator<String> it2 = RENDERING_SERVICE_HOST_HINTS.iterator();
        while (it2.hasNext()) {
            if (str.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static String scaleToHeight(String str, int i) {
        if (isRenderingServiceUrl(str)) {
            String fromUrl = fromUrl(str);
            if (!ImageType.UNSUPPORTED.equals(fromUrl)) {
                String replaceAll = str.replaceAll(CredentialConfig$$ExternalSyntheticOutline0.m(fromUrl, "$", new StringBuilder(ArcusConfig.PATH_SEPARATOR)), String.format(Locale.getDefault(), "\\._SY%d_\\.%s", Integer.valueOf(i), fromUrl.toString()));
                Locale.getDefault();
                Logger.verbose("Client applied conditions to Rendering Service url: " + replaceAll);
                return replaceAll;
            }
        }
        return str;
    }
}
