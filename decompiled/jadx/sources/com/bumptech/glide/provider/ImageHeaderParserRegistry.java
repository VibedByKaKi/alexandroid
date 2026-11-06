package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class ImageHeaderParserRegistry {
    private final List<ImageHeaderParser> parsers = new ArrayList();

    public synchronized void add(@NonNull ImageHeaderParser imageHeaderParser) {
        this.parsers.add(imageHeaderParser);
    }

    @NonNull
    public synchronized List<ImageHeaderParser> getParsers() {
        return this.parsers;
    }
}
