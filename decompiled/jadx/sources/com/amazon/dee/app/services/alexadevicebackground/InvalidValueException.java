package com.amazon.dee.app.services.alexadevicebackground;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/dee/app/services/alexadevicebackground/InvalidValueException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", CmcdData.Factory.STREAMING_FORMAT_SS, "", "<init>", "(Ljava/lang/String;)V", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InvalidValueException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidValueException(@NotNull String str) {
        super(str);
        str.getClass();
    }
}
