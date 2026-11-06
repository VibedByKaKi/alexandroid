package com.amazon.alexa.ra.sdk;

import com.amazon.alexa.api.compat.model.AlexaFragmentsChunkMetadata;
import com.amazon.alexa.ra.core.data.fragments.FragmentDataOperation;
import com.amazon.alexa.ra.core.data.fragments.FragmentsMetadata;
import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import java.util.List;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH&JF\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH&J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/sdk/FragmentsListener;", "", "onSingleChunkFragmentsReceived", "", "metadata", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentsMetadata;", "fragments", "", "", "token", "alexaFragmentsChunkMetadata", "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsChunkMetadata;", "previousToken", "displayHint", "onMultiChunkFragmentsReceived", "onUpdateFragmentData", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "operations", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentDataOperation;", "onFragmentRenderingPaused", "dialogRequestId", "onFragmentRenderingResumed", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface FragmentsListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onFragmentRenderingPaused(@NotNull FragmentsListener fragmentsListener, @NotNull String str) {
            str.getClass();
        }

        public static void onFragmentRenderingResumed(@NotNull FragmentsListener fragmentsListener, @NotNull String str) {
            str.getClass();
        }

        public static /* synthetic */ void onMultiChunkFragmentsReceived$default(FragmentsListener fragmentsListener, FragmentsMetadata fragmentsMetadata, List list, String str, AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onMultiChunkFragmentsReceived");
                return;
            }
            if ((i & 16) != 0) {
                str2 = null;
            }
            if ((i & 32) != 0) {
                str3 = null;
            }
            fragmentsListener.onMultiChunkFragmentsReceived(fragmentsMetadata, list, str, alexaFragmentsChunkMetadata, str2, str3);
        }

        public static /* synthetic */ void onSingleChunkFragmentsReceived$default(FragmentsListener fragmentsListener, FragmentsMetadata fragmentsMetadata, List list, String str, AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onSingleChunkFragmentsReceived");
                return;
            }
            if ((i & 16) != 0) {
                str2 = null;
            }
            if ((i & 32) != 0) {
                str3 = null;
            }
            fragmentsListener.onSingleChunkFragmentsReceived(fragmentsMetadata, list, str, alexaFragmentsChunkMetadata, str2, str3);
        }

        public static void onUpdateFragmentData(@NotNull FragmentsListener fragmentsListener, @NotNull String str, @NotNull List<FragmentDataOperation> list) {
            str.getClass();
            list.getClass();
        }
    }

    void onFragmentRenderingPaused(@NotNull String dialogRequestId);

    void onFragmentRenderingResumed(@NotNull String dialogRequestId);

    void onMultiChunkFragmentsReceived(@NotNull FragmentsMetadata metadata, @NotNull List<String> fragments, @NotNull String token, @NotNull AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata, @Nullable String previousToken, @Nullable String displayHint);

    void onSingleChunkFragmentsReceived(@NotNull FragmentsMetadata metadata, @NotNull List<String> fragments, @NotNull String token, @NotNull AlexaFragmentsChunkMetadata alexaFragmentsChunkMetadata, @Nullable String previousToken, @Nullable String displayHint);

    void onUpdateFragmentData(@NotNull String fragmentUri, @NotNull List<FragmentDataOperation> operations);
}
