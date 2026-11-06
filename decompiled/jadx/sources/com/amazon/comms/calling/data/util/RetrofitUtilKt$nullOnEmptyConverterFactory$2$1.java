package com.amazon.comms.calling.data.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002\u0000\u0005\b\n\u0018\u00002\u00020\u0001J\u000b\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"com/amazon/comms/calling/data/util/RetrofitUtilKt$nullOnEmptyConverterFactory$2$1", "Lretrofit2/Converter$Factory;", "converterFactory", "()Lcom/amazon/comms/calling/data/util/RetrofitUtilKt$nullOnEmptyConverterFactory$2$1;", "responseBodyConverter", "com/amazon/comms/calling/data/util/RetrofitUtilKt$nullOnEmptyConverterFactory$2$1$responseBodyConverter$1", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lcom/amazon/comms/calling/data/util/RetrofitUtilKt$nullOnEmptyConverterFactory$2$1$responseBodyConverter$1;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RetrofitUtilKt$nullOnEmptyConverterFactory$2$1 extends Converter.Factory {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.comms.calling.data.util.RetrofitUtilKt$nullOnEmptyConverterFactory$2$1$responseBodyConverter$1] */
    @Override // retrofit2.Converter.Factory
    public RetrofitUtilKt$nullOnEmptyConverterFactory$2$1$responseBodyConverter$1 responseBodyConverter(final Type type, final Annotation[] annotations, final Retrofit retrofit) {
        type.getClass();
        annotations.getClass();
        retrofit.getClass();
        return new Converter<ResponseBody, Object>(retrofit, this, type, annotations) { // from class: com.amazon.comms.calling.data.util.RetrofitUtilKt$nullOnEmptyConverterFactory$2$1$responseBodyConverter$1
            private final Converter<ResponseBody, Object> nextResponseBodyConverter;

            {
                this.nextResponseBodyConverter = retrofit.nextResponseBodyConverter(this.converterFactory(), type, annotations);
            }

            @Override // retrofit2.Converter
            public Object convert(ResponseBody value) {
                value.getClass();
                if (value.contentLength() != 0) {
                    return this.nextResponseBodyConverter.convert(value);
                }
                return null;
            }

            public final Converter<ResponseBody, Object> getNextResponseBodyConverter() {
                return this.nextResponseBodyConverter;
            }
        };
    }

    public final RetrofitUtilKt$nullOnEmptyConverterFactory$2$1 converterFactory() {
        return this;
    }
}
