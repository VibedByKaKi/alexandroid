package com.amazon.alexa.assistant.profile;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0082\b¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"runCatchingCancellable", "Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultProfileServiceClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultProfileServiceClient.kt\ncom/amazon/alexa/assistant/profile/DefaultProfileServiceClientKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
/* loaded from: classes15.dex */
public final class DefaultProfileServiceClientKt {
    private static final <T> Object runCatchingCancellable(Function0<? extends T> function0) {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl == null || !(m25297exceptionOrNullimpl instanceof CancellationException)) {
            return m25294constructorimpl;
        }
        throw m25297exceptionOrNullimpl;
    }
}
