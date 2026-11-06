package com.amazon.alexa.ra.core.data.utils;

import android.graphics.Bitmap;
import android.net.Uri;
import com.amazon.alexa.ra.core.data.model.Fragments$$ExternalSyntheticLambda28;
import com.amazon.alexa.ra.core.data.model.MediaStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J@\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH¦@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/ImageProcessorApi;", "", "createDefaultImagePreviewBitmap", "Landroid/graphics/Bitmap;", "getSampledBitmapFrom", "mediaStatus", "Lcom/amazon/alexa/ra/core/data/model/MediaStatus;", "uri", "Landroid/net/Uri;", "targetWidth", "", "targetHeight", "onMediaInvalidate", "Lkotlin/Function0;", "", "(Lcom/amazon/alexa/ra/core/data/model/MediaStatus;Landroid/net/Uri;IILkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ImageProcessorApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getSampledBitmapFrom$default(ImageProcessorApi imageProcessorApi, MediaStatus mediaStatus, Uri uri, int i, int i2, Function0 function0, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: getSampledBitmapFrom");
            return null;
        }
        if ((i3 & 16) != 0) {
            function0 = new Fragments$$ExternalSyntheticLambda28(28);
        }
        return imageProcessorApi.getSampledBitmapFrom(mediaStatus, uri, i, i2, function0, continuation);
    }

    @NotNull
    Bitmap createDefaultImagePreviewBitmap();

    @Nullable
    Object getSampledBitmapFrom(@NotNull MediaStatus mediaStatus, @Nullable Uri uri, int i, int i2, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Bitmap> continuation);
}
