package com.amazon.comms.calling.data.repo.sepia;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/data/repo/sepia/EffectError;", "", "<init>", "()V", "EffectFailError", "None", "Lcom/amazon/comms/calling/data/repo/sepia/EffectError$EffectFailError;", "Lcom/amazon/comms/calling/data/repo/sepia/EffectError$None;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class EffectError {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/data/repo/sepia/EffectError$EffectFailError;", "Lcom/amazon/comms/calling/data/repo/sepia/EffectError;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EffectFailError extends EffectError {

        @NotNull
        public static final EffectFailError INSTANCE = new EffectFailError();

        private EffectFailError() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/data/repo/sepia/EffectError$None;", "Lcom/amazon/comms/calling/data/repo/sepia/EffectError;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None extends EffectError {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public /* synthetic */ EffectError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EffectError() {
    }
}
