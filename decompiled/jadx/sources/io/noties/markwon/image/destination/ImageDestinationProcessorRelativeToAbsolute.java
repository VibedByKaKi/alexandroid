package io.noties.markwon.image.destination;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ImageDestinationProcessorRelativeToAbsolute extends ImageDestinationProcessor {
    private final URL base;

    public ImageDestinationProcessorRelativeToAbsolute(@NonNull String str) {
        this.base = obtain(str);
    }

    @NonNull
    public static ImageDestinationProcessorRelativeToAbsolute create(@NonNull String str) {
        return new ImageDestinationProcessorRelativeToAbsolute(str);
    }

    @Nullable
    private static URL obtain(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // io.noties.markwon.image.destination.ImageDestinationProcessor
    @NonNull
    public String process(@NonNull String str) {
        if (this.base != null) {
            try {
                return new URL(this.base, str).toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static ImageDestinationProcessorRelativeToAbsolute create(@NonNull URL url) {
        return new ImageDestinationProcessorRelativeToAbsolute(url);
    }

    public ImageDestinationProcessorRelativeToAbsolute(@NonNull URL url) {
        this.base = url;
    }
}
