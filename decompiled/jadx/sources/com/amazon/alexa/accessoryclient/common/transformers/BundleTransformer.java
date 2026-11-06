package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", ExifInterface.GPS_DIRECTION_TRUE, "", "fromBundle", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Ljava/lang/Object;", "toBundle", "t", "(Ljava/lang/Object;)Landroid/os/Bundle;", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface BundleTransformer<T> {
    T fromBundle(@NotNull Bundle bundle);

    @NotNull
    Bundle toBundle(T t);
}
