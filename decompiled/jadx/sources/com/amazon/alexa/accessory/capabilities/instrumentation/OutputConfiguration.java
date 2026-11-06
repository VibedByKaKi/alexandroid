package com.amazon.alexa.accessory.capabilities.instrumentation;

import com.amazon.dee.app.util.Observables$$ExternalSyntheticLambda3;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum OutputConfiguration {
    UTF_8(0),
    HEXADECIMAL_TABLE(1);

    private final int offset;

    OutputConfiguration(int i) {
        this.offset = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$parse$0(int i, OutputConfiguration outputConfiguration) throws Throwable {
        return ((i >> outputConfiguration.offset) & 1) == 1;
    }

    public static List<OutputConfiguration> parse(int i) {
        return (List) Observable.fromArray(values()).filter(new Observables$$ExternalSyntheticLambda3(i, 1)).toList().blockingGet();
    }
}
