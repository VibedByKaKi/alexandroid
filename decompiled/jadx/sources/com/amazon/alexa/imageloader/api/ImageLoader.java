package com.amazon.alexa.imageloader.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import java.net.URI;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface ImageLoader {
    Bitmap fetchForRichNotification(Context context, String str);

    void loadInto(String str, ImageView imageView);

    void loadInto(URI uri, ImageView imageView);

    void loadInto(URI uri, ImageView imageView, RequestOptions requestOptions);
}
