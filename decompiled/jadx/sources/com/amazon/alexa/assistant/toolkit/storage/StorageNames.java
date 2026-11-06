package com.amazon.alexa.assistant.toolkit.storage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/storage/StorageNames;", "", "<init>", "()V", "SYSTEM_STORAGE", "", "GATEWAY_STORAGE", "EXTERNAL_MEDIA_PLAYER_STORAGE", "FTUX_STORAGE", "ALEXA_SETTINGS_STORAGE", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StorageNames {

    @NotNull
    public static final String ALEXA_SETTINGS_STORAGE = "alexa_settings_storage";

    @NotNull
    public static final String EXTERNAL_MEDIA_PLAYER_STORAGE = "external_media_player_storage";

    @NotNull
    public static final String FTUX_STORAGE = "ftux_storage";

    @NotNull
    public static final String GATEWAY_STORAGE = "gateway_storage";

    @NotNull
    public static final StorageNames INSTANCE = new StorageNames();

    @NotNull
    public static final String SYSTEM_STORAGE = "system_settings";

    private StorageNames() {
    }
}
