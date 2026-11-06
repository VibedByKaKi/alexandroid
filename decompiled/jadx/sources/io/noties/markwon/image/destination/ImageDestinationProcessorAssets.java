package io.noties.markwon.image.destination;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ImageDestinationProcessorAssets extends ImageDestinationProcessor {
    static final String BASE = "file:///android_asset/";
    static final String MOCK = "https://android.asset/";
    private final ImageDestinationProcessorRelativeToAbsolute assetsProcessor;
    private final ImageDestinationProcessor processor;

    public ImageDestinationProcessorAssets(@Nullable ImageDestinationProcessor imageDestinationProcessor) {
        this.assetsProcessor = new ImageDestinationProcessorRelativeToAbsolute(MOCK);
        this.processor = imageDestinationProcessor;
    }

    @NonNull
    public static ImageDestinationProcessorAssets create(@Nullable ImageDestinationProcessor imageDestinationProcessor) {
        return new ImageDestinationProcessorAssets(imageDestinationProcessor);
    }

    @Override // io.noties.markwon.image.destination.ImageDestinationProcessor
    @NonNull
    public String process(@NonNull String str) {
        if (TextUtils.isEmpty(Uri.parse(str).getScheme())) {
            return this.assetsProcessor.process(str).replace(MOCK, BASE);
        }
        ImageDestinationProcessor imageDestinationProcessor = this.processor;
        return imageDestinationProcessor != null ? imageDestinationProcessor.process(str) : str;
    }

    public ImageDestinationProcessorAssets() {
        this(null);
    }
}
