package com.amazon.dee.app.services.metrics.kinesis.event;

import chip.platform.ConfigurationManager;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.dee.app.util.KinesisContextIdUtil;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/event/KinesisInternalEvent;", "Lcom/amazon/dee/app/services/metrics/kinesis/event/KinesisEvent;", "eventTimestamp", "", "getEventTimestamp", "()Ljava/lang/Long;", ConfigurationManager.kConfigKey_UniqueId, "Lcom/amazon/dee/app/util/KinesisContextIdUtil;", "getUniqueId", "()Lcom/amazon/dee/app/util/KinesisContextIdUtil;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "getSessionId", "()Ljava/lang/String;", "sessionStart", "getSessionStart", "()J", "sessionStop", "getSessionStop", "sessionDuration", "getSessionDuration", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface KinesisInternalEvent extends KinesisEvent {
    @Nullable
    Long getEventTimestamp();

    @Nullable
    Long getSessionDuration();

    @Nullable
    String getSessionId();

    long getSessionStart();

    @Nullable
    Long getSessionStop();

    @NotNull
    KinesisContextIdUtil getUniqueId();
}
