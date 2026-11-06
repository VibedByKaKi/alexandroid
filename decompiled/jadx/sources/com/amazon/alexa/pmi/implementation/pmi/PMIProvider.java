package com.amazon.alexa.pmi.implementation.pmi;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.alexa.pmi.PMI;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/pmi/PMIProvider;", "", "<init>", "()V", AlexaEventBundleKeys.INSTANCE, "Lcom/amazon/alexa/pmi/PMI;", "getInstance$annotations", "getInstance", "()Lcom/amazon/alexa/pmi/PMI;", "setInstance", "(Lcom/amazon/alexa/pmi/PMI;)V", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PMIProvider {

    @NotNull
    public static final PMIProvider INSTANCE = new PMIProvider();

    @Nullable
    private static volatile PMI instance;

    private PMIProvider() {
    }

    @Nullable
    public static final PMI getInstance() {
        return instance;
    }

    public static final void setInstance(@Nullable PMI pmi) {
        instance = pmi;
    }

    @JvmStatic
    public static /* synthetic */ void getInstance$annotations() {
    }
}
