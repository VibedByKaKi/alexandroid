package com.amazon.scxml;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\b\u001a\u00020\u0003H&JF\u0010\t\u001a\u00020\u00032<\u0010\n\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\u000bH&J\u0012\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014H&J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0016"}, d2 = {"Lcom/amazon/scxml/SCXMLStateMachine;", "", "initialize", "", "sendEvent", "eventName", "", "eventData", "start", "insertBlock", "completion", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "activeStates", "", "isValid", "waitUntilProcessed", "timeoutMilliseconds", "", "waitForEvent", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SCXMLStateMachine {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean waitForEvent$default(SCXMLStateMachine sCXMLStateMachine, String str, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: waitForEvent");
                return false;
            }
            if ((i & 2) != 0) {
                j = 1000;
            }
            return sCXMLStateMachine.waitForEvent(str, j);
        }

        public static /* synthetic */ boolean waitUntilProcessed$default(SCXMLStateMachine sCXMLStateMachine, long j, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: waitUntilProcessed");
                return false;
            }
            if ((i & 1) != 0) {
                j = 1000;
            }
            return sCXMLStateMachine.waitUntilProcessed(j);
        }
    }

    void initialize();

    void insertBlock(@NotNull Function2<? super List<String>, ? super Boolean, Unit> completion);

    void sendEvent(@NotNull String eventName, @Nullable Object eventData);

    void start();

    boolean waitForEvent(@NotNull String eventName, long timeoutMilliseconds);

    boolean waitUntilProcessed(long timeoutMilliseconds);
}
