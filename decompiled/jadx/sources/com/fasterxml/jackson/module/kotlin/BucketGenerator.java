package com.fasterxml.jackson.module.kotlin;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KParameter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/BucketGenerator;", "", "paramSize", "", "instanceParameter", "Lkotlin/reflect/KParameter;", AlexaEventBundleKeys.INSTANCE, "(ILkotlin/reflect/KParameter;Ljava/lang/Object;)V", "initialCount", "originalArguments", "", "[Ljava/lang/Object;", "originalParameters", "[Lkotlin/reflect/KParameter;", "generate", "Lcom/fasterxml/jackson/module/kotlin/ArgumentBucket;", "Companion", "jackson-module-kotlin"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BucketGenerator {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int initialCount;

    @NotNull
    private final Object[] originalArguments;

    @NotNull
    private final KParameter[] originalParameters;

    private BucketGenerator(int i, KParameter kParameter, Object obj) {
        KParameter[] kParameterArr = new KParameter[i];
        this.originalParameters = kParameterArr;
        Object[] objArr = new Object[i];
        this.originalArguments = objArr;
        if (obj == null) {
            this.initialCount = 0;
            return;
        }
        kParameterArr[0] = kParameter;
        objArr[0] = obj;
        this.initialCount = 1;
    }

    @NotNull
    public final ArgumentBucket generate() {
        return new ArgumentBucket((KParameter[]) this.originalParameters.clone(), (Object[]) this.originalArguments.clone(), this.initialCount);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001¨\u0006\u000b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/BucketGenerator$Companion;", "", "()V", "forConstructor", "Lcom/fasterxml/jackson/module/kotlin/BucketGenerator;", "paramSize", "", "forMethod", "instanceParameter", "Lkotlin/reflect/KParameter;", AlexaEventBundleKeys.INSTANCE, "jackson-module-kotlin"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final BucketGenerator forConstructor(int paramSize) {
            return new BucketGenerator(paramSize, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        @NotNull
        public final BucketGenerator forMethod(int paramSize, @NotNull KParameter instanceParameter, @NotNull Object instance) {
            instanceParameter.getClass();
            instance.getClass();
            return new BucketGenerator(paramSize, instanceParameter, instance, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BucketGenerator(int i, KParameter kParameter, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, kParameter, obj);
    }
}
