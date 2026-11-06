package com.google.auto.value.processor;

import com.google.auto.value.extension.AutoValueExtension;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AutoValueProcessor$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AutoValueProcessor f$0;

    public /* synthetic */ AutoValueProcessor$$ExternalSyntheticLambda0(AutoValueProcessor autoValueProcessor, int i) {
        this.$r8$classId = i;
        this.f$0 = autoValueProcessor;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        AutoValueExtension.IncrementalExtensionType lambda$getSupportedOptions$1;
        String extensionName;
        int i = this.$r8$classId;
        AutoValueProcessor autoValueProcessor = this.f$0;
        AutoValueExtension autoValueExtension = (AutoValueExtension) obj;
        switch (i) {
            case 0:
                lambda$getSupportedOptions$1 = autoValueProcessor.lambda$getSupportedOptions$1(autoValueExtension);
                return lambda$getSupportedOptions$1;
            default:
                extensionName = autoValueProcessor.extensionName(autoValueExtension);
                return extensionName;
        }
    }
}
