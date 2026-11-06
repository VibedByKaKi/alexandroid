package com.amazon.comms.calling.data.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/data/util/RealTimeTextConstants;", "", "<init>", "()V", "RTT_SETTINGS_KEY", "", "BACKSPACE_DATA", "", "COLON_SPACE", "KEYBOARD_DISPLAY_DELAY_MS", "", "HIDE_EMPTY_TEXT_DELAY_MS", "EPHEMERAL_TEXT_TIMEOUT_MS", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RealTimeTextConstants {
    public static final byte BACKSPACE_DATA = 8;

    @NotNull
    public static final String COLON_SPACE = ": ";
    public static final long EPHEMERAL_TEXT_TIMEOUT_MS = 8000;
    public static final long HIDE_EMPTY_TEXT_DELAY_MS = 2000;

    @NotNull
    public static final RealTimeTextConstants INSTANCE = new RealTimeTextConstants();
    public static final long KEYBOARD_DISPLAY_DELAY_MS = 500;

    @NotNull
    public static final String RTT_SETTINGS_KEY = "real_time_text_enabled";

    private RealTimeTextConstants() {
    }
}
