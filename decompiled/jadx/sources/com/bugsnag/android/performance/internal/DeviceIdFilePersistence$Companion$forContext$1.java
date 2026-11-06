package com.bugsnag.android.performance.internal;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class DeviceIdFilePersistence$Companion$forContext$1 extends FunctionReferenceImpl implements Function0<UUID> {
    public static final DeviceIdFilePersistence$Companion$forContext$1 INSTANCE = new DeviceIdFilePersistence$Companion$forContext$1();

    public DeviceIdFilePersistence$Companion$forContext$1() {
        super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
