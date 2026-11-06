package com.bugsnag.android;

import android.util.JsonReader;
import androidx.exifinterface.media.ExifInterface;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.JsonStream.Streamable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/JsonReadable;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bugsnag/android/JsonStream$Streamable;", "", "fromReader", "reader", "Landroid/util/JsonReader;", "(Landroid/util/JsonReader;)Lcom/bugsnag/android/JsonStream$Streamable;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public interface JsonReadable<T extends JsonStream.Streamable> {
    @NotNull
    T fromReader(@NotNull JsonReader reader);
}
