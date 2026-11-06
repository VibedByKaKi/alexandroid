package com.amazon.alexa.capabilityagent.deviceproximity.accessory.message;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Deviceproximity;
import com.amazon.alexa.accessoryclient.client.accessories.AccessorySession;
import com.amazon.alexa.capabilityagent.deviceproximity.common.Constants;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fJ*\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u0010JR\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000b2(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0082@¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/accessory/message/AccessoryMessageSender;", "", "<init>", "()V", "sendPolicyConfiguration", "", "targetSession", "Lcom/amazon/alexa/accessoryclient/client/accessories/AccessorySession;", "policyConfiguration", "Lcom/amazon/alexa/accessory/protocol/Deviceproximity$DeviceProximityPolicyConfiguration;", "latencyTimer", "Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsTimer;", "(Lcom/amazon/alexa/accessoryclient/client/accessories/AccessorySession;Lcom/amazon/alexa/accessory/protocol/Deviceproximity$DeviceProximityPolicyConfiguration;Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsTimer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSecurityMaterial", "securityMaterial", "Lcom/amazon/alexa/accessory/protocol/Deviceproximity$DeviceProximitySecurityMaterial;", "(Lcom/amazon/alexa/accessoryclient/client/accessories/AccessorySession;Lcom/amazon/alexa/accessory/protocol/Deviceproximity$DeviceProximitySecurityMaterial;Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsTimer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendToAccessory", "dataSource", "", "sendOperation", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lio/reactivex/rxjava3/core/Single;", "Lcom/amazon/alexa/accessory/protocol/Common$ErrorCode;", "(Lcom/amazon/alexa/accessoryclient/client/accessories/AccessorySession;Ljava/lang/String;Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsTimer;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AccessoryMessageSender {

    @NotNull
    public static final String MESSAGE_SEND_FAILED_METRIC_NAME = "MessageSendingFailed";

    @NotNull
    public static final String MESSAGE_SEND_SUCCEEDED_METRIC_NAME = "MessageSent";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Common.ErrorCode.values().length];
            try {
                iArr[Common.ErrorCode.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public AccessoryMessageSender() {
    }

    public static /* synthetic */ Object sendPolicyConfiguration$default(AccessoryMessageSender accessoryMessageSender, AccessorySession accessorySession, Deviceproximity.DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration, MobilyticsMetricsTimer mobilyticsMetricsTimer, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            mobilyticsMetricsTimer = null;
        }
        return accessoryMessageSender.sendPolicyConfiguration(accessorySession, deviceProximityPolicyConfiguration, mobilyticsMetricsTimer, continuation);
    }

    public static /* synthetic */ Object sendSecurityMaterial$default(AccessoryMessageSender accessoryMessageSender, AccessorySession accessorySession, Deviceproximity.DeviceProximitySecurityMaterial deviceProximitySecurityMaterial, MobilyticsMetricsTimer mobilyticsMetricsTimer, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            mobilyticsMetricsTimer = null;
        }
        return accessoryMessageSender.sendSecurityMaterial(accessorySession, deviceProximitySecurityMaterial, mobilyticsMetricsTimer, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendToAccessory(com.amazon.alexa.accessoryclient.client.accessories.AccessorySession r14, java.lang.String r15, com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer r16, kotlin.jvm.functions.Function2<? super com.amazon.alexa.accessoryclient.client.accessories.AccessorySession, ? super kotlin.coroutines.Continuation<? super io.reactivex.rxjava3.core.Single<com.amazon.alexa.accessory.protocol.Common.ErrorCode>>, ? extends java.lang.Object> r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender$sendToAccessory$1
            if (r1 == 0) goto L15
            r1 = r0
            com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender$sendToAccessory$1 r1 = (com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender$sendToAccessory$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender$sendToAccessory$1 r1 = new com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender$sendToAccessory$1
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L3b
            if (r3 != r5) goto L35
            java.lang.Object r2 = r1.L$1
            com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer r2 = (com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer) r2
            java.lang.Object r1 = r1.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r8 = r1
            goto L60
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r0)
            return r4
        L3b:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.INSTANCE
            r0 = 60
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.SECONDS
            long r6 = kotlin.time.DurationKt.toDuration(r0, r3)
            com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender$sendToAccessory$result$1 r0 = new com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender$sendToAccessory$result$1
            r8 = r17
            r0.<init>(r8, r14, r4)
            r1.L$0 = r15
            r8 = r16
            r1.L$1 = r8
            r1.label = r5
            java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.m26811withTimeoutKLykuaI(r6, r0, r1)
            if (r0 != r2) goto L5e
            return r2
        L5e:
            r2 = r8
            r8 = r15
        L60:
            r0.getClass()
            com.amazon.alexa.accessory.protocol.Common$ErrorCode r0 = (com.amazon.alexa.accessory.protocol.Common.ErrorCode) r0
            int[] r1 = com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender.WhenMappings.$EnumSwitchMapping$0
            int r3 = r0.ordinal()
            r1 = r1[r3]
            if (r1 != r5) goto L98
            com.amazon.alexa.capabilityagent.deviceproximity.common.util.Logger r6 = com.amazon.alexa.capabilityagent.deviceproximity.common.util.Logger.INSTANCE
            java.lang.String r0 = "Sent message with data from "
            java.lang.String r1 = " to accessory"
            java.lang.String r0 = defpackage.a$$ExternalSyntheticOutline0.m(r0, r8, r1)
            r1 = 4
            r3 = 0
            r4 = 4
            r5 = 0
            r15 = r0
            r17 = r1
            r18 = r3
            r14 = r4
            r16 = r5
            r13 = r6
            com.amazon.alexa.capabilityagent.deviceproximity.common.util.Logger.log$default(r13, r14, r15, r16, r17, r18)
            r11 = 4
            r12 = 0
            java.lang.String r7 = "MessageSent"
            r9 = 0
            com.amazon.alexa.capabilityagent.deviceproximity.common.util.Logger.logCountMetric$default(r6, r7, r8, r9, r11, r12)
            r6.logTimeMetric(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L98:
            com.amazon.alexa.capabilityagent.deviceproximity.common.util.Logger r6 = com.amazon.alexa.capabilityagent.deviceproximity.common.util.Logger.INSTANCE
            r11 = 4
            r12 = 0
            java.lang.String r7 = "MessageSendingFailed"
            r9 = 0
            com.amazon.alexa.capabilityagent.deviceproximity.common.util.Logger.logCountMetric$default(r6, r7, r8, r9, r11, r12)
            com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.SendToAccessoryException r1 = new com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.SendToAccessoryException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to send message with data from "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r3 = " to accessory with error code: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 2
            r1.<init>(r0, r4, r2, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.capabilityagent.deviceproximity.accessory.message.AccessoryMessageSender.sendToAccessory(com.amazon.alexa.accessoryclient.client.accessories.AccessorySession, java.lang.String, com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object sendPolicyConfiguration(@NotNull AccessorySession accessorySession, @NotNull Deviceproximity.DeviceProximityPolicyConfiguration deviceProximityPolicyConfiguration, @Nullable MobilyticsMetricsTimer mobilyticsMetricsTimer, @NotNull Continuation<? super Unit> continuation) {
        Object sendToAccessory = sendToAccessory(accessorySession, Constants.SET_POLICY_CONFIGURATION_DIRECTIVE_NAME, mobilyticsMetricsTimer, new AccessoryMessageSender$sendPolicyConfiguration$2(deviceProximityPolicyConfiguration, null), continuation);
        return sendToAccessory == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendToAccessory : Unit.INSTANCE;
    }

    @Nullable
    public final Object sendSecurityMaterial(@NotNull AccessorySession accessorySession, @NotNull Deviceproximity.DeviceProximitySecurityMaterial deviceProximitySecurityMaterial, @Nullable MobilyticsMetricsTimer mobilyticsMetricsTimer, @NotNull Continuation<? super Unit> continuation) {
        Object sendToAccessory = sendToAccessory(accessorySession, Constants.SET_SECURITY_MATERIAL_DIRECTIVE_NAME, mobilyticsMetricsTimer, new AccessoryMessageSender$sendSecurityMaterial$2(deviceProximitySecurityMaterial, null), continuation);
        return sendToAccessory == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendToAccessory : Unit.INSTANCE;
    }
}
