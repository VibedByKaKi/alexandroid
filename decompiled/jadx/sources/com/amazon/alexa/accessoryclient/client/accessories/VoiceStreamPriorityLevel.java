package com.amazon.alexa.accessoryclient.client.accessories;

import com.amazon.devicesetupservice.scap.v1.BleConnectionPriority;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessoryclient/client/accessories/VoiceStreamPriorityLevel;", "", "()V", BleConnectionPriority.HIGH, "", "Lcom/amazon/alexa/accessoryclient/client/accessories/VoiceStreamPriority;", BleConnectionPriority.LOW, "MEDIUM", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoiceStreamPriorityLevel {
    public static final int HIGH = 5;

    @NotNull
    public static final VoiceStreamPriorityLevel INSTANCE = new VoiceStreamPriorityLevel();
    public static final int LOW = 1;
    public static final int MEDIUM = 3;

    private VoiceStreamPriorityLevel() {
    }
}
