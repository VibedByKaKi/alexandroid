package com.amazon.comms.calling.data.util;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"nullOnEmptyConverterFactory", "Lretrofit2/Converter$Factory;", "getNullOnEmptyConverterFactory", "()Lretrofit2/Converter$Factory;", "nullOnEmptyConverterFactory$delegate", "Lkotlin/Lazy;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RetrofitUtilKt {

    @NotNull
    private static final Lazy nullOnEmptyConverterFactory$delegate = LazyKt.lazy(new RetrofitUtilKt$$ExternalSyntheticLambda0(0));

    @NotNull
    public static final Converter.Factory getNullOnEmptyConverterFactory() {
        return (Converter.Factory) nullOnEmptyConverterFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetrofitUtilKt$nullOnEmptyConverterFactory$2$1 nullOnEmptyConverterFactory_delegate$lambda$0() {
        return new RetrofitUtilKt$nullOnEmptyConverterFactory$2$1();
    }
}
