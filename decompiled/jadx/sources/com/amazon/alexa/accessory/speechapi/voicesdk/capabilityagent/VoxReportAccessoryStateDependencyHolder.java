package com.amazon.alexa.accessory.speechapi.voicesdk.capabilityagent;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.speechapi.events.AccessoryEventSender;
import com.amazon.alexa.accessory.speechapi.events.AccessoryStateReportGenerator;
import com.amazon.alexa.accessory.utils.feature.FeatureChecker;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/capabilityagent/VoxReportAccessoryStateDependencyHolder;", "", "<init>", "()V", Constants.LOG_TAG, "", "accessoryStateReportGenerator", "Lcom/amazon/alexa/accessory/speechapi/events/AccessoryStateReportGenerator;", "accessoryEventSender", "Lcom/amazon/alexa/accessory/speechapi/events/AccessoryEventSender;", "accessoryFeatureChecker", "Lcom/amazon/alexa/accessory/utils/feature/FeatureChecker;", "initialized", "", "init", "", "reportGenerator", "eventSender", "featureChecker", "reset", "hasAccessoryStateReportGenerator", "hasAccessoryEventSender", "hasFeatureChecker", "getAccessoryStateReportGenerator", "getAccessoryEventSender", "getFeatureChecker", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVoxReportAccessoryStateDependencyHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoxReportAccessoryStateDependencyHolder.kt\ncom/amazon/alexa/accessory/speechapi/voicesdk/capabilityagent/VoxReportAccessoryStateDependencyHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
/* loaded from: classes16.dex */
public final class VoxReportAccessoryStateDependencyHolder {

    @NotNull
    public static final VoxReportAccessoryStateDependencyHolder INSTANCE = new VoxReportAccessoryStateDependencyHolder();

    @NotNull
    private static final String TAG = "VoxReportAccessoryStateDependencyHolder:";

    @Nullable
    private static AccessoryEventSender accessoryEventSender;

    @Nullable
    private static FeatureChecker accessoryFeatureChecker;

    @Nullable
    private static AccessoryStateReportGenerator accessoryStateReportGenerator;
    private static boolean initialized;

    private VoxReportAccessoryStateDependencyHolder() {
    }

    @NotNull
    public final AccessoryEventSender getAccessoryEventSender() {
        Logger.d("VoxReportAccessoryStateDependencyHolder: getAccessoryEventSender");
        AccessoryEventSender accessoryEventSender2 = accessoryEventSender;
        if (accessoryEventSender2 != null) {
            accessoryEventSender2.getClass();
            return accessoryEventSender2;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("AccessoryEventSender instance is unavailable!");
        return null;
    }

    @NotNull
    public final AccessoryStateReportGenerator getAccessoryStateReportGenerator() {
        Logger.d("VoxReportAccessoryStateDependencyHolder: getAccessoryStateReportGenerator");
        AccessoryStateReportGenerator accessoryStateReportGenerator2 = accessoryStateReportGenerator;
        if (accessoryStateReportGenerator2 != null) {
            accessoryStateReportGenerator2.getClass();
            return accessoryStateReportGenerator2;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("AccessoryStateReportGenerator instance is unavailable!");
        return null;
    }

    @NotNull
    public final FeatureChecker getFeatureChecker() {
        Logger.d("VoxReportAccessoryStateDependencyHolder: getFeatureChecker");
        FeatureChecker featureChecker = accessoryFeatureChecker;
        if (featureChecker != null) {
            featureChecker.getClass();
            return featureChecker;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("FeatureChecker instance is unavailable!");
        return null;
    }

    public final boolean hasAccessoryEventSender() {
        Logger.d("VoxReportAccessoryStateDependencyHolder: hasAccessoryEventSender");
        return accessoryEventSender != null;
    }

    public final boolean hasAccessoryStateReportGenerator() {
        Logger.d("VoxReportAccessoryStateDependencyHolder: hasAccessoryStateReportGenerator");
        return accessoryStateReportGenerator != null;
    }

    public final boolean hasFeatureChecker() {
        Logger.d("VoxReportAccessoryStateDependencyHolder: hasFeatureChecker");
        return accessoryFeatureChecker != null;
    }

    public final void init(@NotNull AccessoryStateReportGenerator reportGenerator, @NotNull AccessoryEventSender eventSender, @NotNull FeatureChecker featureChecker) {
        reportGenerator.getClass();
        eventSender.getClass();
        featureChecker.getClass();
        Preconditions.notNull(reportGenerator, "reportGenerator");
        Preconditions.notNull(eventSender, "eventSender");
        Preconditions.notNull(featureChecker, "featureChecker");
        if (initialized) {
            Single$$ExternalSyntheticBUOutline0.m$2("VoxReportAccessoryStateDependencyHolder: is already initialized!");
            return;
        }
        Logger.d("VoxReportAccessoryStateDependencyHolder: init");
        accessoryStateReportGenerator = reportGenerator;
        accessoryEventSender = eventSender;
        accessoryFeatureChecker = featureChecker;
        initialized = true;
    }

    public final void reset() {
        accessoryStateReportGenerator = null;
        accessoryEventSender = null;
        accessoryFeatureChecker = null;
        initialized = false;
    }
}
