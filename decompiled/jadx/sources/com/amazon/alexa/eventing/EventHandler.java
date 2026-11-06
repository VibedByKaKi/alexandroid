package com.amazon.alexa.eventing;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/eventing/EventHandler;", ExifInterface.GPS_DIRECTION_TRUE, "", "onEvent", "", "eventArgs", "Lcom/amazon/alexa/eventing/EventArgs;", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface EventHandler<T> {
    void onEvent(@NonNull @NotNull EventArgs<T> eventArgs);
}
