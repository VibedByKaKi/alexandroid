package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/list/FragmentTestTags;", "", "<init>", "()V", "REQUEST", "", "RESPONSE", "ROOT_SLOT", "BLOCK", "CONTEXTUAL_MENU", MissingTokenPull.TRIGGER_REQUEST, "uri", "response", "rootSlot", "block", "index", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class FragmentTestTags {
    public static final int $stable = 0;

    @NotNull
    public static final String BLOCK = "fragment_block";

    @NotNull
    public static final String CONTEXTUAL_MENU = "fragment_contextual_menu";

    @NotNull
    public static final FragmentTestTags INSTANCE = new FragmentTestTags();

    @NotNull
    public static final String REQUEST = "alexa_request_fragment";

    @NotNull
    public static final String RESPONSE = "alexa_response_fragment";

    @NotNull
    public static final String ROOT_SLOT = "fragment_root_slot";

    private FragmentTestTags() {
    }

    @NotNull
    public final String block(int index, @NotNull String uri) {
        uri.getClass();
        return "fragment_block_" + index + "_" + uri;
    }

    @NotNull
    public final String request(@NotNull String uri) {
        return ChatData$$ExternalSyntheticOutline0.m(uri, "alexa_request_fragment_", uri);
    }

    @NotNull
    public final String response(@NotNull String uri) {
        return ChatData$$ExternalSyntheticOutline0.m(uri, "alexa_response_fragment_", uri);
    }

    @NotNull
    public final String rootSlot(@NotNull String uri) {
        return ChatData$$ExternalSyntheticOutline0.m(uri, "fragment_root_slot_", uri);
    }
}
