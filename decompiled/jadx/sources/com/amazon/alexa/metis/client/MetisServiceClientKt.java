package com.amazon.alexa.metis.client;

import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"ERROR_CODE_CHATS_API", "", "ERROR_CODE_CHAT_TURNS_API", "EXTRA_METIS_ACTION", "", "EXTRA_METIS_CHAT_TURN_ID", "GET_CHATS", "GET_CHAT_TURNS", "METIS_CHATS_RESPONSE", MetisServiceClientKt.METIS_ERROR, Constants.LOG_TAG, "AlexaMobileAndroidSimbaClient_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MetisServiceClientKt {
    private static final int ERROR_CODE_CHATS_API = 1001;
    private static final int ERROR_CODE_CHAT_TURNS_API = 1000;

    @NotNull
    private static final String EXTRA_METIS_ACTION = "metis_action";

    @NotNull
    private static final String EXTRA_METIS_CHAT_TURN_ID = "metis_chat_turn_id";
    private static final int GET_CHATS = 2;
    private static final int GET_CHAT_TURNS = 1;

    @NotNull
    private static final String METIS_CHATS_RESPONSE = "chatsMetisResponse";

    @NotNull
    private static final String METIS_ERROR = "METIS_ERROR";

    @NotNull
    private static final String TAG = "MetisClient";
}
