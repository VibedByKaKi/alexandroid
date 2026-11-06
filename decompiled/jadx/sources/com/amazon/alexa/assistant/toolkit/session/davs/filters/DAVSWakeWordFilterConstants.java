package com.amazon.alexa.assistant.toolkit.session.davs.filters;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/filters/DAVSWakeWordFilterConstants;", "", "<init>", "()V", "ARTIFACT_TYPE", "", "ARTIFACT_KEY", "FILTER_VERSION", "ENGINE_COMPATIBILITY_ID_LIST", "LOCALE", "USER_GROUP", "", "getUSER_GROUP", "()Ljava/util/List;", "USER_CASE", "getUSER_CASE", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DAVSWakeWordFilterConstants {

    @NotNull
    public static final String ARTIFACT_KEY = "alexa";

    @NotNull
    public static final String ARTIFACT_TYPE = "lowpower-wakeword";

    @NotNull
    public static final String ENGINE_COMPATIBILITY_ID_LIST = "16";

    @NotNull
    public static final String FILTER_VERSION = "3";

    @NotNull
    public static final String LOCALE = "en-US";

    @NotNull
    public static final DAVSWakeWordFilterConstants INSTANCE = new DAVSWakeWordFilterConstants();

    @NotNull
    private static final List<String> USER_GROUP = CollectionsKt.listOf("production");

    @NotNull
    private static final List<String> USER_CASE = CollectionsKt.listOf("D-far-field-standalone-arm");

    private DAVSWakeWordFilterConstants() {
    }

    @NotNull
    public final List<String> getUSER_CASE() {
        return USER_CASE;
    }

    @NotNull
    public final List<String> getUSER_GROUP() {
        return USER_GROUP;
    }
}
