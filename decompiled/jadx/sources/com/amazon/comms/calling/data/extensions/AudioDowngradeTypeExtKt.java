package com.amazon.comms.calling.data.extensions;

import com.amazon.comms.calling.domain.model.AudioDowngradeType;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"isDowngraded", "", "Lcom/amazon/comms/calling/domain/model/AudioDowngradeType;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AudioDowngradeTypeExtKt {
    public static final boolean isDowngraded(@Nullable AudioDowngradeType audioDowngradeType) {
        return audioDowngradeType == AudioDowngradeType.DOWNGRADE_FROM_CALLER || audioDowngradeType == AudioDowngradeType.DOWNGRADE_FROM_CALLEE;
    }
}
