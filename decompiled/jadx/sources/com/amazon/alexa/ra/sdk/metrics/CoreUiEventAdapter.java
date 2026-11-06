package com.amazon.alexa.ra.sdk.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaMetadataBundleKey;
import com.amazon.alexa.api.compat.model.UiEventName;
import com.amazon.alexa.ra.common.metrics.CoreUiEventMetadataKey;
import com.amazon.alexa.ra.common.metrics.CoreUiEventName;
import com.amazon.alexa.voice.ui.widget.AnimationMetrics;
import com.facebook.imageutils.JfifUtil;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjdk.tools.javac.jvm.ByteCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/sdk/metrics/CoreUiEventAdapter;", "", "<init>", "()V", "toUiEventName", "Lcom/amazon/alexa/api/compat/model/UiEventName;", "coreEvent", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "toAlexaMetadataBundleKey", "Lcom/amazon/alexa/api/compat/model/AlexaMetadataBundleKey;", "coreKey", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventMetadataKey;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CoreUiEventAdapter {
    public static final int $stable = 0;

    @NotNull
    public static final CoreUiEventAdapter INSTANCE = new CoreUiEventAdapter();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CoreUiEventName.values().length];
            try {
                iArr[CoreUiEventName.ADD_FRAGMENTS_IPC_PAYLOAD_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoreUiEventName.ADD_FRAGMENTS_PARSING_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_PARSED_FROM_HTTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_HTTP_RESPONSE_PARSE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_DISPATCHED_TO_CAPABILITY_AGENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PENDING_DIRECTIVES_CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_DROPPED_RESPONSE_ALREADY_RESERVED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_SENT_VIA_BINDER_IPC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_BINDER_IPC_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CoreUiEventName.UPDATEFRAGMENTDATA_PAYLOAD_DESERIALIZED_IN_UI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CoreUiEventName.UPDATEFRAGMENTDATA_PAYLOAD_DESERIALIZATION_FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CoreUiEventName.UPDATEFRAGMENTDATA_PAYLOAD_INVALID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CoreUiEventName.UPDATEFRAGMENTDATA_BROADCAST_NO_RECEIVER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_PAYLOAD_DESERIALIZED_IN_UI.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_PAYLOAD_DESERIALIZATION_FAILED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_BROADCAST_DELIVERED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_BROADCAST_NO_RECEIVER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_EXTRACTED_FROM_INTENT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_BROADCAST_MISSING_REQUIRED_FIELD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_DROPPED_WRONG_CONVERSATION.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_CONVERSATION_CHANGED_FRAGMENTS_CLEARED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_PARSING_STARTED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_FRAGMENTS_IDENTIFIED_IN_DIRECTIVE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_ADDED_TO_TREE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_UPDATED_HIGHER_REVISION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_SKIPPED_EXPIRED.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_FRAGMENT_TREE_EMITTED_VIA_SHAREDFLOW.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_FRAGMENT_TREE_UNCHANGED_NO_EMISSION.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_VIEWMODEL_COLLECTED_FRAGMENT_TREE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_COMPOSE_STATE_UPDATED_RECOMPOSITION_TRIGGERED.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_FILTERED_BEFORE_RENDER.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_TEXT_DISPATCHED_TO_LAZYCOLUMN.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_TEXT_ENTERED_RESPONSE_COMPOSABLE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_COMPOSING.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_AGENT_TEXT_DISPOSED_WHILE_STREAMING.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_PAYLOAD_DESERIALIZED_IN_UI.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_BROADCAST_DELIVERED.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_BROADCAST_NO_RECEIVER.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_EXTRACTED_FROM_INTENT.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_DROPPED_WRONG_CONVERSATION.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_CONVERSATION_CHANGED_FRAGMENTS_CLEARED.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_PARSING_STARTED.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_ADDED_TO_TREE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_UPDATED_HIGHER_REVISION.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_SKIPPED_EXPIRED.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_FILTERED_BEFORE_RENDER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_TEXT_DISPATCHED_TO_LAZYCOLUMN.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_TEXT_ENTERED_RESPONSE_COMPOSABLE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_TEXT_MARKDOWN_COMPOSING.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_PREAMBLE_TEXT_MARKDOWN_ANIMATION_COMPLETE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_PAYLOAD_DESERIALIZED_IN_UI.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_BROADCAST_DELIVERED.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_BROADCAST_NO_RECEIVER.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_EXTRACTED_FROM_INTENT.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_DROPPED_WRONG_CONVERSATION.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_CONVERSATION_CHANGED_FRAGMENTS_CLEARED.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_FRAGMENT_PARSING_STARTED.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_FRAGMENT_ADDED_TO_TREE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_FRAGMENT_UPDATED_HIGHER_REVISION.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[CoreUiEventName.ADDFRAGMENTS_USER_FRAGMENT_SKIPPED_EXPIRED.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[CoreUiEventName.GET_FRAGMENTS_SUCCESS_RATE.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[CoreUiEventName.TARGET_FRAGMENT_FETCHED_SUCCESS_RATE.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[CoreUiEventName.USER_REQUEST_RENDERED.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[CoreUiEventName.USER_NAVIGATED_AWAY.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_AGENT_FRAGMENT_PARSED.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[CoreUiEventName.SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[CoreUiEventName.SUGGESTION_CONTAINER_FRAGMENT_RECEIVED.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[CoreUiEventName.CAM_SHARE_SHEET_FILE_INGRESS.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[CoreUiEventName.CAM_CAMERA_BROWSING_INGRESS_TAP.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[CoreUiEventName.CAM_PHOTOS_BROWSING_INGRESS_TAP.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[CoreUiEventName.CAM_FILE_BROWSING_INGRESS_TAP.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[CoreUiEventName.CAM_CAMERA_PERMISSION_PRIMER.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[CoreUiEventName.CAM_DOWNLOAD_FAILED.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[CoreUiEventName.CAM_DOWNLOAD_SUCCESS.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[CoreUiEventName.CAM_DOWNLOAD_TAPPED_IMAGE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[CoreUiEventName.CAM_DOWNLOAD_TAPPED_DOCUMENT.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[CoreUiEventName.CAM_LIGHTBOX_EXPAND_SUCCESS.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[CoreUiEventName.CAM_USER_CANCELLED_RESPONSE.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[CoreUiEventName.CAM_PLUS_BUTTON_TAP.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[CoreUiEventName.CAM_EXPAND_CLICK.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[CoreUiEventName.CAM_FILE_SEND_WITHOUT_UTTERANCE.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[CoreUiEventName.CAM_FILE_SEND_WITH_UTTERANCE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[CoreUiEventName.CAM_FILE_UPLOAD_STOPPED_WAKEWORD.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[CoreUiEventName.CAM_FILE_UPLOAD_STOPPED_BUTTON_TAP.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[CoreUiEventName.CAM_FILE_UPLOAD_STOPPED_NEGLECT_NAVIGATE_AWAY.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[CoreUiEventName.CAM_FILE_DELETED_BEFORE_SEND.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[CoreUiEventName.CAM_RESOURCE_ATTACHED_TO_SEND_TAP_LATENCY.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[CoreUiEventName.CAM_SUCCESSFUL_RESPONSE.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[CoreUiEventName.CAM_TTA.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[CoreUiEventName.CAM_FILE_ATTACH_FILE_TO_UPLOAD_ACTION_TTA.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[CoreUiEventName.CAM_UPL.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[CoreUiEventName.CAM_SUCCESS_EVENT.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[CoreUiEventName.CAM_UPLOAD_API_FAILED.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[CoreUiEventName.CAM_STATUS_API_FAILED.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[CoreUiEventName.CAM_UPLOAD_API_LATENCY.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[CoreUiEventName.CAM_STATUS_API_POLL_LATENCY.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[CoreUiEventName.CAM_MULTI_FILE_UPLOAD_INITIATED.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[CoreUiEventName.CAM_MULTI_FILE_REMOVED_FROM_CAROUSEL.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[CoreUiEventName.CAM_BATCH_COMMIT_INITIATED.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[CoreUiEventName.CAM_BATCH_COMMIT_SUCCESS.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[CoreUiEventName.CAM_BATCH_COMMIT_FAILED.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[CoreUiEventName.CAM_BATCH_COMMIT_TIMEOUT.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[CoreUiEventName.CAM_BATCH_COMMIT_LATENCY.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[CoreUiEventName.CAM_MULTI_FILE_TOTAL_UPLOAD_LATENCY.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[CoreUiEventName.CAM_MULTI_FILE_UPL.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[CoreUiEventName.CAM_BATCH_POLL_TOTAL_LATENCY.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[CoreUiEventName.CAM_BATCH_POLL_CYCLE_COUNT.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[CoreUiEventName.CAM_MULTI_FILE_RETRY_ALL_INITIATED.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[CoreUiEventName.CAM_MULTI_FILE_MAX_FILES_EXCEEDED.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[CoreUiEventName.CAM_MULTI_FILE_TTA.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_MIC_BUTTON_TAP_COUNT.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_PILL_TAP_COUNT.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_TAP_COUNT_ATTEMPT.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_TAP_COUNT_SUCCESS.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_TAP_COUNT_FAILURE.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_TAP_COUNT_CANCEL.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_NAVIGATION_COUNT_ATTEMPT.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_NAVIGATION_COUNT_SUCCESS.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_NAVIGATION_COUNT_FAILURE.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_INGRESS_TAPPED.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_SESSION_REQUESTED.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_START_LATENCY.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_SESSION_DURATION.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_ERROR.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_SIGN_URL_LATENCY.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_SIGN_URL_FAILURE.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_SOCKET_CONNECT_LATENCY.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_SOCKET_FAILURE.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[CoreUiEventName.DICTATION_SERVICE_EXCEPTION.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_SUGGESTION_DISPLAYED.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_SUGGESTION_TAPPED.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_PERSONALITY_LATENCY.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_PERSONALITY_RENDERED.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_SEND_BUTTON_TAP_COUNT.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_INGRESS_TO_UI_TTA.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_MICROPHONE_CHROME_LISTENING_SHOWN.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_MICROPHONE_TO_CHROME_LATENCY.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_WAKE_WORD_CHROME_LISTENING_SHOWN.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_WAKE_WORD_TO_CHROME_LATENCY.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_RESPONSE.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_STATE_ERROR.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_REQUEST.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_FILTER_SELECTED_COUNT.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_INGRESS_COUNT.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_TTS.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_TTA.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_EGRESS_COUNT_UI_BACK_BUTTON.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_ENTER_SELECTED_CONVERSATION_COUNT.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[CoreUiEventName.CDCC_TIMELINE_VIEW_DISPLAYED.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[CoreUiEventName.DYNAMIC_CONVERSATION_STARTERS_TAPPED.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[CoreUiEventName.DYNAMIC_CONVERSATION_STARTERS_DISPLAYED.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[CoreUiEventName.DYNAMIC_CONVERSATION_STARTERS_LATENCY.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[CoreUiEventName.STATIC_CONVERSATION_STARTERS_TAPPED.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[CoreUiEventName.STATIC_CONVERSATION_STARTERS_DISPLAYED.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[CoreUiEventName.STATIC_CONVERSATION_STARTERS_LATENCY.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[CoreUiEventName.RECENT_CHATS_STARTER_PILL_TAPPED.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[CoreUiEventName.TABLET_ALEXA_SHARE_MY_SCREEN_BTN_TAPPED.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[CoreUiEventName.TABLET_SMART_ACTIONS_STARTER_PILL_DISPLAYED.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[CoreUiEventName.TABLET_SMART_ACTIONS_STARTER_PILL_LATENCY.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[CoreUiEventName.TABLET_SMART_ACTIONS_STARTER_PILL_TAPPED.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[CoreUiEventName.TABLET_SMART_ACTIONS_FEEDBACK_SUBMITTED.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_REGENERATE_RESPONSE_TAPPED.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_SHOWN_USER_REQUEST.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_SHOWN_AGENT_RESPONSE.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_COPY_TAPPED.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_SHAREOUT_TAPPED.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_LIKE_TAPPED.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[CoreUiEventName.QUICKACTION_DISLIKE_TAPPED.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[CoreUiEventName.FEEDBACK_API_FAILED.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr[CoreUiEventName.LOCAL_VISUAL_ERROR_RENDERED.ordinal()] = 181;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr[CoreUiEventName.LOCAL_VISUAL_RESPONSE_RENDERED.ordinal()] = 182;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr[CoreUiEventName.RA_NEW_CHAT_ICON_TAPPED.ordinal()] = 183;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr[CoreUiEventName.TEXT_SELECTION_STARTED.ordinal()] = 184;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr[CoreUiEventName.TEXT_SELECTION_COPY.ordinal()] = 185;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr[CoreUiEventName.RA_TEXTFIELD_FOCUS_FAILURE.ordinal()] = 186;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_RENDERED_EVENT.ordinal()] = 187;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_ASSET_FAILURE_CHECKSUM_VALIDATION_ERROR.ordinal()] = 188;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_ASSET_FAILURE_CHECKSUM_VALIDATION_FAILED.ordinal()] = 189;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_ASSET_FAILURE_EMPTY_DATA.ordinal()] = 190;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_ASSET_FAILURE_NETWORK_ERROR.ordinal()] = 191;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_ASSET_SUCCESS.ordinal()] = 192;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_CACHE_HIT_DISK.ordinal()] = 193;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_CACHE_HIT_URLCACHE.ordinal()] = 194;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_CACHE_MISS.ordinal()] = 195;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr[CoreUiEventName.PERSONALITY_NETWORK_LATENCY.ordinal()] = 196;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_RESPONSE_RENDERED.ordinal()] = 197;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr[CoreUiEventName.ALEXA_UI_SHOWN.ordinal()] = 198;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr[CoreUiEventName.USER_PERCEIVED_LATENCY_VISUAL_TEXT.ordinal()] = 199;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr[CoreUiEventName.USER_PERCEIVED_LATENCY_VISUAL_TAP.ordinal()] = 200;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_RENDERED.ordinal()] = 201;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION.ordinal()] = 202;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_RENDER_STARTED.ordinal()] = 203;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION.ordinal()] = 204;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDERED.ordinal()] = 205;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION.ordinal()] = 206;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDER_STARTED.ordinal()] = 207;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION.ordinal()] = 208;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RENDERED_POST_IDLE.ordinal()] = 209;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING.ordinal()] = 210;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr[CoreUiEventName.REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE.ordinal()] = 211;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr[CoreUiEventName.SOUND_POOL_PLAYER_LOAD_TRACK_SUCCESS.ordinal()] = 212;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr[CoreUiEventName.SOUND_POOL_PLAYER_PLAY_TRACK_SUCCESS.ordinal()] = 213;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr[CoreUiEventName.UNSAFE_DOMAIN_URL_DETECTED.ordinal()] = 214;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_PERSONALITY_DISPLAY_RECEIVED.ordinal()] = 215;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_PERSONALITY_UNKNOWN_NAME.ordinal()] = 216;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_PERSONALITY_IGNORED.ordinal()] = 217;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_INGRESS_TAPPED.ordinal()] = 218;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_EGRESS_TAPPED.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_ONBOARDING_CONTINUE.ordinal()] = 220;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_ONBOARDING_LEARN_MORE.ordinal()] = 221;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_PRESENTED.ordinal()] = 222;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_PERMISSION_GRANTED_POST_FTUE.ordinal()] = 223;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_PERMISSION_DENIED_POST_FTUE.ordinal()] = 224;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_PERMISSION_ALREADY_DENIED.ordinal()] = 225;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_DISMISSED.ordinal()] = 226;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_LEARN_MORE_PRESENTED.ordinal()] = 227;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_SETTINGS_LINK_TAPPED.ordinal()] = 228;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_REPRESENTED_FROM_SETTINGS.ordinal()] = 229;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_FTUE_DEEPLINK_ERROR.ordinal()] = 230;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_MUTE_TAPPED.ordinal()] = 231;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_USER_UNMUTED.ordinal()] = 232;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_AUTO_MUTE_TRIGGERED.ordinal()] = 233;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_APP_BACKGROUNDED.ordinal()] = 234;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_BACKGROUND_CONVERSATIONS_DISABLED.ordinal()] = 235;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr[CoreUiEventName.LIVE_MODE_BACKGROUND_CONVERSATIONS_ENABLED.ordinal()] = 236;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_START_TAPPED.ordinal()] = 237;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_STARTED.ordinal()] = 238;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_START_FAILED.ordinal()] = 239;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_STOPPED.ordinal()] = 240;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_SESSION_DURATION.ordinal()] = 241;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_CAMERA_FLIPPED.ordinal()] = 242;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_SWAP.ordinal()] = 243;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_CONSENT_PROMPT_SHOWN.ordinal()] = 244;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_CONSENT_GRANTED.ordinal()] = 245;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_CONSENT_DENIED.ordinal()] = 246;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_FRAME_CAPTURED.ordinal()] = 247;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_FRAME_CAPTURE_FAILED.ordinal()] = 248;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_FRAME_UPLOAD_LATENCY.ordinal()] = 249;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_FRAME_UPLOAD_FAILED.ordinal()] = 250;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_FRAME_DROPPED.ordinal()] = 251;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_UPL.ordinal()] = 252;
            } catch (NoSuchFieldError unused252) {
            }
            try {
                iArr[CoreUiEventName.VISUAL_SHARE_ERROR.ordinal()] = 253;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr[CoreUiEventName.OVERFLOW_SETTINGS_TAPPED.ordinal()] = 254;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr[CoreUiEventName.OVERFLOW_PRIVACY_TAPPED.ordinal()] = 255;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr[CoreUiEventName.OVERFLOW_PRIVACY_DASHBOARD_OPENED_WEBVIEW.ordinal()] = 256;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr[CoreUiEventName.OVERFLOW_PRIVACY_DASHBOARD_OPENED_BROWSER.ordinal()] = 257;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr[CoreUiEventName.OVERFLOW_PRIVACY_DASHBOARD_COOKIE_FETCH_FAILED.ordinal()] = 258;
            } catch (NoSuchFieldError unused258) {
            }
            try {
                iArr[CoreUiEventName.DYNAMIC_CONVERSATION_STARTER_PILL_DISPLAYED.ordinal()] = 259;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr[CoreUiEventName.FOR_YOU_CONVERSATION_STARTER_PILL_DISPLAYED.ordinal()] = 260;
            } catch (NoSuchFieldError unused260) {
            }
            try {
                iArr[CoreUiEventName.INLINE_CITATION_PILL_TAPPED.ordinal()] = 261;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr[CoreUiEventName.GLOBAL_SOURCES_BUTTON_TAPPED.ordinal()] = 262;
            } catch (NoSuchFieldError unused262) {
            }
            try {
                iArr[CoreUiEventName.CITATION_SOURCE_TAPPED.ordinal()] = 263;
            } catch (NoSuchFieldError unused263) {
            }
            try {
                iArr[CoreUiEventName.ALEXA_PLUS_UPSELL_BANNER_SHOWN.ordinal()] = 264;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr[CoreUiEventName.ALEXA_PLUS_UPSELL_BANNER_TAPPED.ordinal()] = 265;
            } catch (NoSuchFieldError unused265) {
            }
            try {
                iArr[CoreUiEventName.ALEXA_PLUS_UPSELL_BANNER_DISMISSED.ordinal()] = 266;
            } catch (NoSuchFieldError unused266) {
            }
            try {
                iArr[CoreUiEventName.SMART_FRAGMENT_DISPLAYED.ordinal()] = 267;
            } catch (NoSuchFieldError unused267) {
            }
            try {
                iArr[CoreUiEventName.SF_PAYLOAD_RECEIVED.ordinal()] = 268;
            } catch (NoSuchFieldError unused268) {
            }
            try {
                iArr[CoreUiEventName.SF_FRAGMENT_PRESSED.ordinal()] = 269;
            } catch (NoSuchFieldError unused269) {
            }
            try {
                iArr[CoreUiEventName.FRAGMENT_OPEN_URL_EVENT.ordinal()] = 270;
            } catch (NoSuchFieldError unused270) {
            }
            try {
                iArr[CoreUiEventName.SF_EXPAND_EVENT.ordinal()] = 271;
            } catch (NoSuchFieldError unused271) {
            }
            try {
                iArr[CoreUiEventName.SF_CHANGE_DISPLAY_EVENT.ordinal()] = 272;
            } catch (NoSuchFieldError unused272) {
            }
            try {
                iArr[CoreUiEventName.SF_INVOKE_OPERATION_EVENT.ordinal()] = 273;
            } catch (NoSuchFieldError unused273) {
            }
            try {
                iArr[CoreUiEventName.SF_TEXT_MESSAGE_EVENT.ordinal()] = 274;
            } catch (NoSuchFieldError unused274) {
            }
            try {
                iArr[CoreUiEventName.SF_SEND_EVENT.ordinal()] = 275;
            } catch (NoSuchFieldError unused275) {
            }
            try {
                iArr[CoreUiEventName.SF_EXPANDED_VIEW_RENDERED.ordinal()] = 276;
            } catch (NoSuchFieldError unused276) {
            }
            try {
                iArr[CoreUiEventName.SF_EXPANDED_VIEW_DISMISSED.ordinal()] = 277;
            } catch (NoSuchFieldError unused277) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTENT_PILL_TAPPED.ordinal()] = 278;
            } catch (NoSuchFieldError unused278) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTENT_QUERY_SUCCESS.ordinal()] = 279;
            } catch (NoSuchFieldError unused279) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTENT_QUERY_EMPTY.ordinal()] = 280;
            } catch (NoSuchFieldError unused280) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTENT_QUERY_FAILED.ordinal()] = 281;
            } catch (NoSuchFieldError unused281) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTENT_FALLBACK_TO_SCREENSHOT.ordinal()] = 282;
            } catch (NoSuchFieldError unused282) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTEXT_ATTACHED.ordinal()] = 283;
            } catch (NoSuchFieldError unused283) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTEXT_STAGED_HIT.ordinal()] = 284;
            } catch (NoSuchFieldError unused284) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTEXT_SEND_TIME_UPLOAD.ordinal()] = 285;
            } catch (NoSuchFieldError unused285) {
            }
            try {
                iArr[CoreUiEventName.SILK_PAGE_CONTEXT_SEND_LATENCY.ordinal()] = 286;
            } catch (NoSuchFieldError unused286) {
            }
            try {
                iArr[CoreUiEventName.LOAD_CONVERSATION_FROM_ROUTE_WITH_TOPIC.ordinal()] = 287;
            } catch (NoSuchFieldError unused287) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_TOPIC_OPEN_LOAD_SUCCEEDED.ordinal()] = 288;
            } catch (NoSuchFieldError unused288) {
            }
            try {
                iArr[CoreUiEventName.LOAD_CONVERSATION_FROM_ROUTE_WITH_TOPIC_FAILURE.ordinal()] = 289;
            } catch (NoSuchFieldError unused289) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_TOPIC_OPEN_SUPERSEDED.ordinal()] = 290;
            } catch (NoSuchFieldError unused290) {
            }
            try {
                iArr[CoreUiEventName.CONVERSATION_TOPIC_OPEN_LOAD_LATENCY.ordinal()] = 291;
            } catch (NoSuchFieldError unused291) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CoreUiEventMetadataKey.values().length];
            try {
                iArr2[CoreUiEventMetadataKey.ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused292) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.ATTRIBUTION_TAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused293) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.CONTENT_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused294) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.DIALOG_REQUEST_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused295) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.EVENT_REALTIME_MS.ordinal()] = 5;
            } catch (NoSuchFieldError unused296) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.EVENT_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused297) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.FILE_EXTENSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused298) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.FILE_SIZE.ordinal()] = 8;
            } catch (NoSuchFieldError unused299) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.INITIATOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused300) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.INTERACTION_LABEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused301) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.LATENCY_REALTIME_MS.ordinal()] = 11;
            } catch (NoSuchFieldError unused302) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.RESPONSE_TYPE.ordinal()] = 12;
            } catch (NoSuchFieldError unused303) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.SOURCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused304) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.FRAGMENT_URI.ordinal()] = 14;
            } catch (NoSuchFieldError unused305) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.MESSAGE_ID.ordinal()] = 15;
            } catch (NoSuchFieldError unused306) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.URL_DOMAIN.ordinal()] = 16;
            } catch (NoSuchFieldError unused307) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.FRAGMENT_REVISION.ordinal()] = 17;
            } catch (NoSuchFieldError unused308) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.FRAGMENT_PENDING_UPDATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused309) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.UPLOAD_MODE.ordinal()] = 19;
            } catch (NoSuchFieldError unused310) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.FILE_COUNT.ordinal()] = 20;
            } catch (NoSuchFieldError unused311) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.NODE_COUNT.ordinal()] = 21;
            } catch (NoSuchFieldError unused312) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.RETRY_FILE_COUNT.ordinal()] = 22;
            } catch (NoSuchFieldError unused313) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.ERROR_REASON.ordinal()] = 23;
            } catch (NoSuchFieldError unused314) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.POLL_CYCLE_COUNT.ordinal()] = 24;
            } catch (NoSuchFieldError unused315) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.MUTE_ACTIVE.ordinal()] = 25;
            } catch (NoSuchFieldError unused316) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.CONTEXT_SOURCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused317) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.ERROR_TYPE.ordinal()] = 27;
            } catch (NoSuchFieldError unused318) {
            }
            try {
                iArr2[CoreUiEventMetadataKey.SOURCE_CONTEXT.ordinal()] = 28;
            } catch (NoSuchFieldError unused319) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private CoreUiEventAdapter() {
    }

    @NotNull
    public final AlexaMetadataBundleKey toAlexaMetadataBundleKey(@NotNull CoreUiEventMetadataKey coreKey) {
        coreKey.getClass();
        switch (WhenMappings.$EnumSwitchMapping$1[coreKey.ordinal()]) {
            case 1:
                return AlexaMetadataBundleKey.ACTION;
            case 2:
                return AlexaMetadataBundleKey.ATTRIBUTION_TAG;
            case 3:
                return AlexaMetadataBundleKey.CONTENT_ID;
            case 4:
                return AlexaMetadataBundleKey.DIALOG_REQUEST_ID;
            case 5:
                return AlexaMetadataBundleKey.EVENT_REALTIME_MS;
            case 6:
                return AlexaMetadataBundleKey.EVENT_VALUE;
            case 7:
                return AlexaMetadataBundleKey.FILE_EXTENSION;
            case 8:
                return AlexaMetadataBundleKey.FILE_SIZE;
            case 9:
                return AlexaMetadataBundleKey.INITIATOR;
            case 10:
                return AlexaMetadataBundleKey.INTERACTION_LABEL;
            case 11:
                return AlexaMetadataBundleKey.LATENCY_REALTIME_MS;
            case 12:
                return AlexaMetadataBundleKey.RESPONSE_TYPE;
            case 13:
                return AlexaMetadataBundleKey.SOURCE;
            case 14:
                return AlexaMetadataBundleKey.FRAGMENT_URI;
            case 15:
                return AlexaMetadataBundleKey.MESSAGE_ID;
            case 16:
                return AlexaMetadataBundleKey.URL_DOMAIN;
            case 17:
                return AlexaMetadataBundleKey.EVENT_VALUE;
            case 18:
                return AlexaMetadataBundleKey.EVENT_VALUE;
            case 19:
                return AlexaMetadataBundleKey.UPLOAD_MODE;
            case 20:
                return AlexaMetadataBundleKey.FILE_COUNT;
            case 21:
                return AlexaMetadataBundleKey.NODE_COUNT;
            case 22:
                return AlexaMetadataBundleKey.RETRY_FILE_COUNT;
            case 23:
                return AlexaMetadataBundleKey.ERROR_REASON;
            case 24:
                return AlexaMetadataBundleKey.POLL_CYCLE_COUNT;
            case 25:
                return AlexaMetadataBundleKey.EVENT_VALUE;
            case 26:
                return AlexaMetadataBundleKey.CONTEXT_SOURCE;
            case 27:
                return AlexaMetadataBundleKey.ERROR_TYPE;
            case 28:
                return AlexaMetadataBundleKey.SOURCE_CONTEXT;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }

    @Nullable
    public final UiEventName toUiEventName(@NotNull CoreUiEventName coreEvent) {
        coreEvent.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[coreEvent.ordinal()]) {
            case 1:
                return UiEventName.ADD_FRAGMENTS_IPC_PAYLOAD_RECEIVED;
            case 2:
                return UiEventName.ADD_FRAGMENTS_PARSING_FAILED;
            case 3:
                return UiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_PARSED_FROM_HTTP;
            case 4:
                return UiEventName.ADDFRAGMENTS_HTTP_RESPONSE_PARSE_FAILED;
            case 5:
                return UiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_DISPATCHED_TO_CAPABILITY_AGENT;
            case 6:
                return UiEventName.ADDFRAGMENTS_PENDING_DIRECTIVES_CANCELLED;
            case 7:
                return UiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_DROPPED_RESPONSE_ALREADY_RESERVED;
            case 8:
                return UiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_SENT_VIA_BINDER_IPC;
            case 9:
                return UiEventName.ADDFRAGMENTS_AGENT_DIRECTIVE_BINDER_IPC_FAILED;
            case 10:
                return UiEventName.UPDATEFRAGMENTDATA_PAYLOAD_DESERIALIZED_IN_UI;
            case 11:
                return UiEventName.UPDATEFRAGMENTDATA_PAYLOAD_DESERIALIZATION_FAILED;
            case 12:
                return UiEventName.UPDATEFRAGMENTDATA_PAYLOAD_INVALID;
            case 13:
                return UiEventName.UPDATEFRAGMENTDATA_BROADCAST_NO_RECEIVER;
            case 14:
                return UiEventName.ADDFRAGMENTS_AGENT_PAYLOAD_DESERIALIZED_IN_UI;
            case 15:
                return UiEventName.ADDFRAGMENTS_AGENT_PAYLOAD_DESERIALIZATION_FAILED;
            case 16:
                return UiEventName.ADDFRAGMENTS_AGENT_BROADCAST_DELIVERED;
            case 17:
                return UiEventName.ADDFRAGMENTS_AGENT_BROADCAST_NO_RECEIVER;
            case 18:
                return UiEventName.ADDFRAGMENTS_AGENT_EXTRACTED_FROM_INTENT;
            case 19:
                return UiEventName.ADDFRAGMENTS_BROADCAST_MISSING_REQUIRED_FIELD;
            case 20:
                return UiEventName.ADDFRAGMENTS_AGENT_DROPPED_WRONG_CONVERSATION;
            case 21:
                return UiEventName.ADDFRAGMENTS_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC;
            case 22:
                return UiEventName.ADDFRAGMENTS_CONVERSATION_CHANGED_FRAGMENTS_CLEARED;
            case 23:
                return UiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_PARSING_STARTED;
            case 24:
                return UiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA;
            case 25:
                return UiEventName.ADDFRAGMENTS_AGENT_FRAGMENTS_IDENTIFIED_IN_DIRECTIVE;
            case 26:
                return UiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_ADDED_TO_TREE;
            case 27:
                return UiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_UPDATED_HIGHER_REVISION;
            case 28:
                return UiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION;
            case 29:
                return UiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_SKIPPED_EXPIRED;
            case 30:
                return UiEventName.ADDFRAGMENTS_FRAGMENT_TREE_EMITTED_VIA_SHAREDFLOW;
            case 31:
                return UiEventName.ADDFRAGMENTS_FRAGMENT_TREE_UNCHANGED_NO_EMISSION;
            case 32:
                return UiEventName.ADDFRAGMENTS_VIEWMODEL_COLLECTED_FRAGMENT_TREE;
            case 33:
                return UiEventName.ADDFRAGMENTS_COMPOSE_STATE_UPDATED_RECOMPOSITION_TRIGGERED;
            case 34:
                return UiEventName.ADDFRAGMENTS_AGENT_FRAGMENT_FILTERED_BEFORE_RENDER;
            case 35:
                return UiEventName.ADDFRAGMENTS_AGENT_TEXT_DISPATCHED_TO_LAZYCOLUMN;
            case 36:
                return UiEventName.ADDFRAGMENTS_AGENT_TEXT_ENTERED_RESPONSE_COMPOSABLE;
            case 37:
                return UiEventName.ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_COMPOSING;
            case 38:
                return UiEventName.ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE;
            case 39:
                return UiEventName.ADDFRAGMENTS_AGENT_TEXT_DISPOSED_WHILE_STREAMING;
            case 40:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_PAYLOAD_DESERIALIZED_IN_UI;
            case 41:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_BROADCAST_DELIVERED;
            case 42:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_BROADCAST_NO_RECEIVER;
            case 43:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_EXTRACTED_FROM_INTENT;
            case 44:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_DROPPED_WRONG_CONVERSATION;
            case 45:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC;
            case 46:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_CONVERSATION_CHANGED_FRAGMENTS_CLEARED;
            case 47:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_PARSING_STARTED;
            case 48:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA;
            case 49:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_ADDED_TO_TREE;
            case 50:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_UPDATED_HIGHER_REVISION;
            case 51:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION;
            case 52:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_SKIPPED_EXPIRED;
            case 53:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_FRAGMENT_FILTERED_BEFORE_RENDER;
            case 54:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_TEXT_DISPATCHED_TO_LAZYCOLUMN;
            case 55:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_TEXT_ENTERED_RESPONSE_COMPOSABLE;
            case 56:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_TEXT_MARKDOWN_COMPOSING;
            case 57:
                return UiEventName.ADDFRAGMENTS_PREAMBLE_TEXT_MARKDOWN_ANIMATION_COMPLETE;
            case 58:
                return UiEventName.ADDFRAGMENTS_USER_PAYLOAD_DESERIALIZED_IN_UI;
            case 59:
                return UiEventName.ADDFRAGMENTS_USER_BROADCAST_DELIVERED;
            case 60:
                return UiEventName.ADDFRAGMENTS_USER_BROADCAST_NO_RECEIVER;
            case 61:
                return UiEventName.ADDFRAGMENTS_USER_EXTRACTED_FROM_INTENT;
            case 62:
                return UiEventName.ADDFRAGMENTS_USER_DROPPED_WRONG_CONVERSATION;
            case 63:
                return UiEventName.ADDFRAGMENTS_USER_TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC;
            case 64:
                return UiEventName.ADDFRAGMENTS_USER_CONVERSATION_CHANGED_FRAGMENTS_CLEARED;
            case 65:
                return UiEventName.ADDFRAGMENTS_USER_FRAGMENT_PARSING_STARTED;
            case 66:
                return UiEventName.ADDFRAGMENTS_USER_FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA;
            case 67:
                return UiEventName.ADDFRAGMENTS_USER_FRAGMENT_ADDED_TO_TREE;
            case 68:
                return UiEventName.ADDFRAGMENTS_USER_FRAGMENT_UPDATED_HIGHER_REVISION;
            case 69:
                return UiEventName.ADDFRAGMENTS_USER_FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION;
            case 70:
                return UiEventName.ADDFRAGMENTS_USER_FRAGMENT_SKIPPED_EXPIRED;
            case 71:
                return UiEventName.GET_FRAGMENTS_SUCCESS_RATE;
            case 72:
                return UiEventName.TARGET_FRAGMENT_FETCHED_SUCCESS_RATE;
            case 73:
                return UiEventName.USER_REQUEST_RENDERED;
            case 74:
                return UiEventName.USER_NAVIGATED_AWAY;
            case 75:
                return UiEventName.REMOTE_VISUAL_AGENT_FRAGMENT_PARSED;
            case 76:
                return UiEventName.REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED;
            case ByteCodes.astore_2 /* 77 */:
                return UiEventName.SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED;
            case 78:
                return UiEventName.SUGGESTION_CONTAINER_FRAGMENT_RECEIVED;
            case 79:
                return UiEventName.CAM_SHARE_SHEET_FILE_INGRESS;
            case 80:
                return UiEventName.CAM_CAMERA_BROWSING_INGRESS_TAP;
            case 81:
                return UiEventName.CAM_PHOTOS_BROWSING_INGRESS_TAP;
            case 82:
                return UiEventName.CAM_FILE_BROWSING_INGRESS_TAP;
            case 83:
                return UiEventName.CAM_CAMERA_PERMISSION_PRIMER;
            case 84:
                return UiEventName.CAM_DOWNLOAD_FAILED;
            case 85:
                return UiEventName.CAM_DOWNLOAD_SUCCESS;
            case 86:
                return UiEventName.CAM_DOWNLOAD_TAPPED_IMAGE;
            case 87:
                return UiEventName.CAM_DOWNLOAD_TAPPED_DOCUMENT;
            case 88:
                return UiEventName.CAM_LIGHTBOX_EXPAND_SUCCESS;
            case 89:
                return UiEventName.CAM_USER_CANCELLED_RESPONSE;
            case 90:
                return UiEventName.CAM_PLUS_BUTTON_TAP;
            case 91:
                return UiEventName.CAM_EXPAND_CLICK;
            case 92:
                return UiEventName.CAM_FILE_SEND_WITHOUT_UTTERANCE;
            case 93:
                return UiEventName.CAM_FILE_SEND_WITH_UTTERANCE;
            case 94:
                return UiEventName.CAM_FILE_UPLOAD_STOPPED_WAKEWORD;
            case 95:
                return UiEventName.CAM_FILE_UPLOAD_STOPPED_BUTTON_TAP;
            case 96:
                return UiEventName.CAM_FILE_UPLOAD_STOPPED_NEGLECT_NAVIGATE_AWAY;
            case 97:
                return UiEventName.CAM_FILE_DELETED_BEFORE_SEND;
            case 98:
                return UiEventName.CAM_RESOURCE_ATTACHED_TO_SEND_TAP_LATENCY;
            case 99:
                return UiEventName.CAM_SUCCESSFUL_RESPONSE;
            case 100:
                return UiEventName.CAM_TTA;
            case 101:
                return UiEventName.CAM_FILE_ATTACH_FILE_TO_UPLOAD_ACTION_TTA;
            case 102:
                return UiEventName.CAM_UPL;
            case 103:
                return UiEventName.CAM_SUCCESS_EVENT;
            case 104:
                return UiEventName.CAM_UPLOAD_API_FAILED;
            case 105:
                return UiEventName.CAM_STATUS_API_FAILED;
            case 106:
                return UiEventName.CAM_UPLOAD_API_LATENCY;
            case 107:
                return UiEventName.CAM_STATUS_API_POLL_LATENCY;
            case 108:
                return UiEventName.CAM_MULTI_FILE_UPLOAD_INITIATED;
            case 109:
                return UiEventName.CAM_MULTI_FILE_REMOVED_FROM_CAROUSEL;
            case 110:
                return UiEventName.CAM_BATCH_COMMIT_INITIATED;
            case 111:
                return UiEventName.CAM_BATCH_COMMIT_SUCCESS;
            case 112:
                return UiEventName.CAM_BATCH_COMMIT_FAILED;
            case 113:
                return UiEventName.CAM_BATCH_COMMIT_TIMEOUT;
            case 114:
                return UiEventName.CAM_BATCH_COMMIT_LATENCY;
            case 115:
                return UiEventName.CAM_MULTI_FILE_TOTAL_UPLOAD_LATENCY;
            case 116:
                return UiEventName.CAM_MULTI_FILE_UPL;
            case 117:
                return UiEventName.CAM_BATCH_POLL_TOTAL_LATENCY;
            case 118:
                return UiEventName.CAM_BATCH_POLL_CYCLE_COUNT;
            case 119:
                return UiEventName.CAM_MULTI_FILE_RETRY_ALL_INITIATED;
            case 120:
                return UiEventName.CAM_MULTI_FILE_MAX_FILES_EXCEEDED;
            case 121:
                return UiEventName.CAM_MULTI_FILE_TTA;
            case 122:
                return UiEventName.CONVERSATION_MIC_BUTTON_TAP_COUNT;
            case 123:
                return UiEventName.CONVERSATION_PILL_TAP_COUNT;
            case 124:
                return UiEventName.CONVERSATION_TAP_COUNT_ATTEMPT;
            case 125:
                return UiEventName.CONVERSATION_TAP_COUNT_SUCCESS;
            case 126:
                return UiEventName.CONVERSATION_TAP_COUNT_FAILURE;
            case 127:
                return UiEventName.CONVERSATION_TAP_COUNT_CANCEL;
            case 128:
            case 129:
            case 130:
                return null;
            case 131:
                return UiEventName.DICTATION_INGRESS_TAPPED;
            case 132:
                return UiEventName.DICTATION_SESSION_REQUESTED;
            case 133:
                return UiEventName.DICTATION_START_LATENCY;
            case 134:
                return UiEventName.DICTATION_SESSION_DURATION;
            case 135:
                return UiEventName.DICTATION_ERROR;
            case 136:
                return UiEventName.DICTATION_SIGN_URL_LATENCY;
            case 137:
                return UiEventName.DICTATION_SIGN_URL_FAILURE;
            case 138:
                return UiEventName.DICTATION_SOCKET_CONNECT_LATENCY;
            case 139:
                return UiEventName.DICTATION_SOCKET_FAILURE;
            case 140:
                return UiEventName.DICTATION_SERVICE_EXCEPTION;
            case 141:
                return UiEventName.CONVERSATION_SUGGESTION_DISPLAYED;
            case 142:
                return UiEventName.CONVERSATION_SUGGESTION_TAPPED;
            case 143:
                return UiEventName.CONVERSATION_PERSONALITY_LATENCY;
            case 144:
                return UiEventName.CONVERSATION_PERSONALITY_RENDERED;
            case 145:
                return UiEventName.CONVERSATION_SEND_BUTTON_TAP_COUNT;
            case 146:
                return UiEventName.CONVERSATION_INGRESS_TO_UI_TTA;
            case 147:
                return UiEventName.CONVERSATION_MICROPHONE_CHROME_LISTENING_SHOWN;
            case 148:
                return UiEventName.CONVERSATION_MICROPHONE_TO_CHROME_LATENCY;
            case 149:
                return UiEventName.CONVERSATION_WAKE_WORD_CHROME_LISTENING_SHOWN;
            case 150:
                return UiEventName.CONVERSATION_WAKE_WORD_TO_CHROME_LATENCY;
            case 151:
                return UiEventName.CDCC_TIMELINE_VIEW_RESPONSE;
            case 152:
                return UiEventName.CDCC_TIMELINE_VIEW_STATE_ERROR;
            case 153:
                return UiEventName.CDCC_TIMELINE_VIEW_REQUEST;
            case 154:
                return UiEventName.CDCC_TIMELINE_VIEW_FILTER_SELECTED_COUNT;
            case 155:
                return UiEventName.CDCC_TIMELINE_VIEW_INGRESS_COUNT;
            case 156:
                return UiEventName.CDCC_TIMELINE_VIEW_TTS;
            case 157:
                return UiEventName.CDCC_TIMELINE_VIEW_TTA;
            case 158:
                return UiEventName.CDCC_TIMELINE_VIEW_EGRESS_COUNT_UI_BACK_BUTTON;
            case 159:
                return UiEventName.CDCC_TIMELINE_VIEW_ENTER_SELECTED_CONVERSATION_COUNT;
            case 160:
                return UiEventName.CDCC_TIMELINE_VIEW_DISPLAYED;
            case 161:
                return UiEventName.DYNAMIC_CONVERSATION_STARTERS_TAPPED;
            case 162:
                return UiEventName.DYNAMIC_CONVERSATION_STARTERS_DISPLAYED;
            case 163:
                return UiEventName.DYNAMIC_CONVERSATION_STARTERS_LATENCY;
            case 164:
                return UiEventName.STATIC_CONVERSATION_STARTERS_TAPPED;
            case 165:
                return UiEventName.STATIC_CONVERSATION_STARTERS_DISPLAYED;
            case 166:
                return UiEventName.STATIC_CONVERSATION_STARTERS_LATENCY;
            case 167:
                return UiEventName.RECENT_CHATS_STARTER_PILL_TAPPED;
            case 168:
                return UiEventName.TABLET_ALEXA_SHARE_MY_SCREEN_BTN_TAPPED;
            case 169:
                return UiEventName.TABLET_SMART_ACTIONS_STARTER_PILL_DISPLAYED;
            case 170:
                return UiEventName.TABLET_SMART_ACTIONS_STARTER_PILL_LATENCY;
            case 171:
                return UiEventName.TABLET_SMART_ACTIONS_STARTER_PILL_TAPPED;
            case 172:
                return UiEventName.TABLET_SMART_ACTIONS_FEEDBACK_SUBMITTED;
            case 173:
                return UiEventName.QUICKACTION_REGENERATE_RESPONSE_TAPPED;
            case 174:
                return UiEventName.QUICKACTION_SHOWN_USER_REQUEST;
            case 175:
                return UiEventName.QUICKACTION_SHOWN_AGENT_RESPONSE;
            case 176:
                return UiEventName.QUICKACTION_COPY_TAPPED;
            case 177:
                return UiEventName.QUICKACTION_SHAREOUT_TAPPED;
            case 178:
                return UiEventName.QUICKACTION_LIKE_TAPPED;
            case 179:
                return UiEventName.QUICKACTION_DISLIKE_TAPPED;
            case 180:
                return UiEventName.FEEDBACK_API_FAILED;
            case 181:
                return UiEventName.LOCAL_VISUAL_ERROR_RENDERED;
            case 182:
                return UiEventName.LOCAL_VISUAL_RESPONSE_RENDERED;
            case 183:
                return UiEventName.RA_NEW_CHAT_ICON_TAPPED;
            case 184:
                return UiEventName.TEXT_SELECTION_STARTED;
            case 185:
                return UiEventName.TEXT_SELECTION_COPY;
            case 186:
                return UiEventName.RA_TEXTFIELD_FOCUS_FAILURE;
            case 187:
                return UiEventName.PERSONALITY_RENDERED_EVENT;
            case 188:
                return UiEventName.PERSONALITY_ASSET_FAILURE_CHECKSUM_VALIDATION_ERROR;
            case 189:
                return UiEventName.PERSONALITY_ASSET_FAILURE_CHECKSUM_VALIDATION_FAILED;
            case 190:
                return UiEventName.PERSONALITY_ASSET_FAILURE_EMPTY_DATA;
            case 191:
                return UiEventName.PERSONALITY_ASSET_FAILURE_NETWORK_ERROR;
            case 192:
                return UiEventName.PERSONALITY_ASSET_SUCCESS;
            case 193:
                return UiEventName.PERSONALITY_CACHE_HIT_DISK;
            case 194:
                return UiEventName.PERSONALITY_CACHE_HIT_URLCACHE;
            case 195:
                return UiEventName.PERSONALITY_CACHE_MISS;
            case ByteCodes.wide /* 196 */:
                return UiEventName.PERSONALITY_NETWORK_LATENCY;
            case 197:
                return UiEventName.VISUAL_RESPONSE_RENDERED;
            case 198:
                return UiEventName.ALEXA_UI_SHOWN;
            case 199:
                return UiEventName.USER_PERCEIVED_LATENCY_VISUAL_TEXT;
            case 200:
                return UiEventName.USER_PERCEIVED_LATENCY_VISUAL_TAP;
            case 201:
                return UiEventName.REMOTE_VISUAL_PREAMBLE_RENDERED;
            case 202:
                return UiEventName.REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION;
            case 203:
                return UiEventName.REMOTE_VISUAL_PREAMBLE_RENDER_STARTED;
            case 204:
                return UiEventName.REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION;
            case 205:
                return UiEventName.REMOTE_VISUAL_RESPONSE_RENDERED;
            case 206:
                return UiEventName.REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION;
            case 207:
                return UiEventName.REMOTE_VISUAL_RESPONSE_RENDER_STARTED;
            case JfifUtil.MARKER_RST0 /* 208 */:
                return UiEventName.REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION;
            case 209:
                return UiEventName.REMOTE_VISUAL_RESPONSE_RENDERED_POST_IDLE;
            case 210:
                return UiEventName.REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING;
            case 211:
                return UiEventName.REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE;
            case FTPReply.DIRECTORY_STATUS /* 212 */:
                return UiEventName.SOUND_POOL_PLAYER_LOAD_TRACK_SUCCESS;
            case FTPReply.FILE_STATUS /* 213 */:
                return UiEventName.SOUND_POOL_PLAYER_PLAY_TRACK_SUCCESS;
            case 214:
                return UiEventName.UNSAFE_DOMAIN_URL_DETECTED;
            case 215:
                return UiEventName.CONVERSATION_PERSONALITY_DISPLAY_RECEIVED;
            case JfifUtil.MARKER_SOI /* 216 */:
                return UiEventName.CONVERSATION_PERSONALITY_UNKNOWN_NAME;
            case JfifUtil.MARKER_EOI /* 217 */:
                return UiEventName.CONVERSATION_PERSONALITY_IGNORED;
            case JfifUtil.MARKER_SOS /* 218 */:
                return UiEventName.LIVE_MODE_INGRESS_TAPPED;
            case 219:
                return UiEventName.LIVE_MODE_EGRESS_TAPPED;
            case 220:
                return UiEventName.LIVE_MODE_ONBOARDING_CONTINUE;
            case 221:
                return UiEventName.LIVE_MODE_ONBOARDING_LEARN_MORE;
            case NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS /* 222 */:
                return UiEventName.LIVE_MODE_FTUE_PRESENTED;
            case NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY /* 223 */:
                return UiEventName.LIVE_MODE_FTUE_PERMISSION_GRANTED_POST_FTUE;
            case 224:
                return UiEventName.LIVE_MODE_FTUE_PERMISSION_DENIED_POST_FTUE;
            case 225:
                return UiEventName.LIVE_MODE_FTUE_PERMISSION_ALREADY_DENIED;
            case FTPReply.CLOSING_DATA_CONNECTION /* 226 */:
                return UiEventName.LIVE_MODE_FTUE_DISMISSED;
            case FTPReply.ENTERING_PASSIVE_MODE /* 227 */:
                return UiEventName.LIVE_MODE_FTUE_LEARN_MORE_PRESENTED;
            case 228:
                return UiEventName.LIVE_MODE_FTUE_SETTINGS_LINK_TAPPED;
            case FTPReply.ENTERING_EPSV_MODE /* 229 */:
                return UiEventName.LIVE_MODE_FTUE_REPRESENTED_FROM_SETTINGS;
            case 230:
                return UiEventName.LIVE_MODE_FTUE_DEEPLINK_ERROR;
            case 231:
                return UiEventName.LIVE_MODE_MUTE_TAPPED;
            case 232:
                return UiEventName.LIVE_MODE_USER_UNMUTED;
            case 233:
                return UiEventName.LIVE_MODE_AUTO_MUTE_TRIGGERED;
            case FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE /* 234 */:
                return UiEventName.LIVE_MODE_APP_BACKGROUNDED;
            case 235:
                return UiEventName.LIVE_MODE_BACKGROUND_CONVERSATIONS_DISABLED;
            case TelnetCommand.EOF /* 236 */:
                return UiEventName.LIVE_MODE_BACKGROUND_CONVERSATIONS_ENABLED;
            case TelnetCommand.SUSP /* 237 */:
                return UiEventName.VISUAL_SHARE_START_TAPPED;
            case TelnetCommand.ABORT /* 238 */:
                return UiEventName.VISUAL_SHARE_STARTED;
            case TelnetCommand.EOR /* 239 */:
                return UiEventName.VISUAL_SHARE_START_FAILED;
            case 240:
                return UiEventName.VISUAL_SHARE_STOPPED;
            case TelnetCommand.NOP /* 241 */:
                return UiEventName.VISUAL_SHARE_SESSION_DURATION;
            case 242:
                return UiEventName.VISUAL_SHARE_CAMERA_FLIPPED;
            case TelnetCommand.BREAK /* 243 */:
                return UiEventName.VISUAL_SHARE_SWAP;
            case TelnetCommand.IP /* 244 */:
                return UiEventName.VISUAL_SHARE_CONSENT_PROMPT_SHOWN;
            case TelnetCommand.AO /* 245 */:
                return UiEventName.VISUAL_SHARE_CONSENT_GRANTED;
            case TelnetCommand.AYT /* 246 */:
                return UiEventName.VISUAL_SHARE_CONSENT_DENIED;
            case TelnetCommand.EC /* 247 */:
                return UiEventName.VISUAL_SHARE_FRAME_CAPTURED;
            case TelnetCommand.EL /* 248 */:
                return UiEventName.VISUAL_SHARE_FRAME_CAPTURE_FAILED;
            case TelnetCommand.GA /* 249 */:
                return UiEventName.VISUAL_SHARE_FRAME_UPLOAD_LATENCY;
            case 250:
                return UiEventName.VISUAL_SHARE_FRAME_UPLOAD_FAILED;
            case 251:
                return UiEventName.VISUAL_SHARE_FRAME_DROPPED;
            case TelnetCommand.WONT /* 252 */:
                return UiEventName.VISUAL_SHARE_UPL;
            case TelnetCommand.DO /* 253 */:
                return UiEventName.VISUAL_SHARE_ERROR;
            case TelnetCommand.DONT /* 254 */:
                return UiEventName.OVERFLOW_SETTINGS_TAPPED;
            case 255:
                return UiEventName.OVERFLOW_PRIVACY_TAPPED;
            case 256:
                return UiEventName.OVERFLOW_PRIVACY_DASHBOARD_OPENED_WEBVIEW;
            case 257:
                return UiEventName.OVERFLOW_PRIVACY_DASHBOARD_OPENED_BROWSER;
            case ByteCodes.bool_and /* 258 */:
                return UiEventName.OVERFLOW_PRIVACY_DASHBOARD_COOKIE_FETCH_FAILED;
            case ByteCodes.bool_or /* 259 */:
            case 260:
                return null;
            case 261:
                return UiEventName.INLINE_CITATION_PILL_TAPPED;
            case 262:
                return UiEventName.GLOBAL_SOURCES_BUTTON_TAPPED;
            case 263:
                return UiEventName.CITATION_SOURCE_TAPPED;
            case 264:
                return UiEventName.ALEXA_PLUS_UPSELL_BANNER_SHOWN;
            case 265:
                return UiEventName.ALEXA_PLUS_UPSELL_BANNER_TAPPED;
            case AnimationMetrics.ThinkingState.SECOND_OPACITY_ANIMATOR_DURATION /* 266 */:
                return UiEventName.ALEXA_PLUS_UPSELL_BANNER_DISMISSED;
            case 267:
                return UiEventName.SMART_FRAGMENT_DISPLAYED;
            case 268:
                return UiEventName.SF_PAYLOAD_RECEIVED;
            case 269:
                return UiEventName.SF_FRAGMENT_PRESSED;
            case 270:
                return UiEventName.FRAGMENT_OPEN_URL_EVENT;
            case ByteCodes.lshll /* 271 */:
                return UiEventName.SF_EXPAND_EVENT;
            case ByteCodes.ishrl /* 272 */:
                return UiEventName.SF_CHANGE_DISPLAY_EVENT;
            case ByteCodes.lshrl /* 273 */:
                return UiEventName.SF_INVOKE_OPERATION_EVENT;
            case 274:
                return UiEventName.SF_TEXT_MESSAGE_EVENT;
            case ByteCodes.lushrl /* 275 */:
                return UiEventName.SF_SEND_EVENT;
            case ByteCodes.nullchk /* 276 */:
                return UiEventName.SF_EXPANDED_VIEW_RENDERED;
            case ByteCodes.error /* 277 */:
                return UiEventName.SF_EXPANDED_VIEW_DISMISSED;
            case 278:
                return UiEventName.SILK_PAGE_CONTENT_PILL_TAPPED;
            case 279:
                return UiEventName.SILK_PAGE_CONTENT_QUERY_SUCCESS;
            case 280:
                return UiEventName.SILK_PAGE_CONTENT_QUERY_EMPTY;
            case NNTPReply.AUTHENTICATION_ACCEPTED /* 281 */:
                return UiEventName.SILK_PAGE_CONTENT_QUERY_FAILED;
            case 282:
                return UiEventName.SILK_PAGE_CONTENT_FALLBACK_TO_SCREENSHOT;
            case 283:
                return UiEventName.SILK_PAGE_CONTEXT_ATTACHED;
            case 284:
                return UiEventName.SILK_PAGE_CONTEXT_STAGED_HIT;
            case 285:
                return UiEventName.SILK_PAGE_CONTEXT_SEND_TIME_UPLOAD;
            case 286:
                return UiEventName.SILK_PAGE_CONTEXT_SEND_LATENCY;
            case 287:
                return UiEventName.LOAD_CONVERSATION_FROM_ROUTE_WITH_TOPIC;
            case 288:
                return UiEventName.CONVERSATION_TOPIC_OPEN_LOAD_SUCCEEDED;
            case 289:
                return UiEventName.LOAD_CONVERSATION_FROM_ROUTE_WITH_TOPIC_FAILURE;
            case 290:
                return UiEventName.CONVERSATION_TOPIC_OPEN_SUPERSEDED;
            case 291:
                return UiEventName.CONVERSATION_TOPIC_OPEN_LOAD_LATENCY;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }
}
