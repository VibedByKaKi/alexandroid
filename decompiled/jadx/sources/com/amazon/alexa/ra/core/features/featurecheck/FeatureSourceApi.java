package com.amazon.alexa.ra.core.features.featurecheck;

import com.amazon.alexa.ra.core.features.featurecheck.FeatureState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010q\u001a\u00020rH&J\b\u0010s\u001a\u00020rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0006R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0006R\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0006R\u0018\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0006R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002050\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0006R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0006R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0006R\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0006R\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0006R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0006R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0006R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0006R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0006R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0006R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0006R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0006R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0006R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0006R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0006R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u0002050\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0006R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0006R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0006R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0006R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u0006R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u0006R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u0006R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u0006R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u0006R\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0006R\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0006R\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u0006¨\u0006tÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/featurecheck/FeatureSourceApi;", "", "backgroundVoiceModeEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "", "getBackgroundVoiceModeEnabled", "()Lkotlinx/coroutines/flow/StateFlow;", "backgroundVoiceModeFireOSEnabled", "getBackgroundVoiceModeFireOSEnabled", "backgroundVoiceModeKHEnabled", "getBackgroundVoiceModeKHEnabled", "liveModeOnlyIngressEnabled", "getLiveModeOnlyIngressEnabled", "liveModeI18nEnabled", "getLiveModeI18nEnabled", "audioTunesDisabled", "getAudioTunesDisabled", "inAppWebViewEnabled", "getInAppWebViewEnabled", "textStreamingEnabled", "getTextStreamingEnabled", "headerSwipeDownEnabled", "getHeaderSwipeDownEnabled", "openUrlValidationEnabled", "getOpenUrlValidationEnabled", "shareMyScreenButtonEnabled", "getShareMyScreenButtonEnabled", "bgCamUploadEnabled", "getBgCamUploadEnabled", "windowResizeToggleEnabled", "getWindowResizeToggleEnabled", "peekModeEnabled", "getPeekModeEnabled", "agentForwardRedesignEnabled", "getAgentForwardRedesignEnabled", "newChatIconEnabled", "getNewChatIconEnabled", "recencyBannerEnabled", "getRecencyBannerEnabled", "smoothScrollEnabled", "getSmoothScrollEnabled", "preambleLatencyMaskingEnabled", "getPreambleLatencyMaskingEnabled", "httpsUpgradeEnabled", "getHttpsUpgradeEnabled", "largeScreenOptimizationEnabled", "getLargeScreenOptimizationEnabled", "isSmartFragmentEnabled", "newDesignSystemEnabled", "getNewDesignSystemEnabled", "visualRenderingFaultBreadcrumbsEnabled", "getVisualRenderingFaultBreadcrumbsEnabled", "visualRenderingFaultBreadcrumbsState", "Lcom/amazon/alexa/ra/core/features/featurecheck/FeatureState;", "getVisualRenderingFaultBreadcrumbsState", "deepLinkAutoSendEnabled", "getDeepLinkAutoSendEnabled", "deepLinkAutoSendState", "getDeepLinkAutoSendState", "vrrUserNavigatedAwayClassificationEnabled", "getVrrUserNavigatedAwayClassificationEnabled", "scrollDisposeFaultFixEnabled", "getScrollDisposeFaultFixEnabled", "multiFileUploadEnabled", "getMultiFileUploadEnabled", "longTextAutoConvertEnabled", "getLongTextAutoConvertEnabled", "camArtifactsHorizontalFragmentsEnabled", "getCamArtifactsHorizontalFragmentsEnabled", "deepThinkingUiEnabled", "getDeepThinkingUiEnabled", "dictationModeEnabled", "getDictationModeEnabled", "preambleTextConsolidationEnabled", "getPreambleTextConsolidationEnabled", "deepThinkingBodyTextEnabled", "getDeepThinkingBodyTextEnabled", "conversationPrimeUpsellEnabled", "getConversationPrimeUpsellEnabled", "syncDridInheritanceEnabled", "getSyncDridInheritanceEnabled", "speechCaptionFallbackEnabled", "getSpeechCaptionFallbackEnabled", "rtviShareMobileEnabled", "getRtviShareMobileEnabled", "rtviShareFosNonKhEnabled", "getRtviShareFosNonKhEnabled", "rtviShareFosKhEnabled", "getRtviShareFosKhEnabled", "rtviWarmFrameResolutionState", "getRtviWarmFrameResolutionState", "personalityStylesEnabled", "getPersonalityStylesEnabled", "agentHubEnabled", "getAgentHubEnabled", "coreEntitled", "getCoreEntitled", "extendedFileTypesEnabled", "getExtendedFileTypesEnabled", "extendedUploadLimitsEnabled", "getExtendedUploadLimitsEnabled", "csvFileEnabled", "getCsvFileEnabled", "officeFileTypesEnabled", "getOfficeFileTypesEnabled", "agentSpacePhaseOneRedesignEnabled", "getAgentSpacePhaseOneRedesignEnabled", "newDesignSoundsEnabled", "getNewDesignSoundsEnabled", "liveModeEngagementOptimizationEnabled", "getLiveModeEngagementOptimizationEnabled", "fullScreenBottomSheetRedesignEnabled", "getFullScreenBottomSheetRedesignEnabled", "start", "", "stop", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface FeatureSourceApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getAgentHubEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getAgentHubEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getAgentSpacePhaseOneRedesignEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getAgentSpacePhaseOneRedesignEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getAudioTunesDisabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getAudioTunesDisabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getBackgroundVoiceModeKHEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getBackgroundVoiceModeKHEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getBgCamUploadEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getBgCamUploadEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getCamArtifactsHorizontalFragmentsEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getCamArtifactsHorizontalFragmentsEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getConversationPrimeUpsellEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getConversationPrimeUpsellEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getCoreEntitled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getCoreEntitled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getCsvFileEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getCsvFileEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getDeepLinkAutoSendEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getDeepLinkAutoSendEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<FeatureState> getDeepLinkAutoSendState(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getDeepLinkAutoSendState();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getDeepThinkingBodyTextEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getDeepThinkingBodyTextEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getDeepThinkingUiEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getDeepThinkingUiEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getDictationModeEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getDictationModeEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getExtendedFileTypesEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getExtendedFileTypesEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getExtendedUploadLimitsEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getExtendedUploadLimitsEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getFullScreenBottomSheetRedesignEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getFullScreenBottomSheetRedesignEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getLiveModeEngagementOptimizationEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getLiveModeEngagementOptimizationEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getLiveModeI18nEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getLiveModeI18nEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getLiveModeOnlyIngressEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getLiveModeOnlyIngressEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getNewDesignSoundsEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getNewDesignSoundsEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getNewDesignSystemEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getNewDesignSystemEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getOfficeFileTypesEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getOfficeFileTypesEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getPersonalityStylesEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getPersonalityStylesEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getPreambleTextConsolidationEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getPreambleTextConsolidationEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getRecencyBannerEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getRecencyBannerEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getRtviShareFosKhEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getRtviShareFosKhEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getRtviShareFosNonKhEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getRtviShareFosNonKhEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getRtviShareMobileEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getRtviShareMobileEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<FeatureState> getRtviWarmFrameResolutionState(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getRtviWarmFrameResolutionState();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getScrollDisposeFaultFixEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getScrollDisposeFaultFixEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getSpeechCaptionFallbackEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getSpeechCaptionFallbackEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getSyncDridInheritanceEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getSyncDridInheritanceEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> getVrrUserNavigatedAwayClassificationEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.getVrrUserNavigatedAwayClassificationEnabled();
        }

        @Deprecated
        @NotNull
        public static StateFlow<Boolean> isSmartFragmentEnabled(@NotNull FeatureSourceApi featureSourceApi) {
            return FeatureSourceApi.super.isSmartFragmentEnabled();
        }
    }

    @NotNull
    StateFlow<Boolean> getAgentForwardRedesignEnabled();

    @NotNull
    default StateFlow<Boolean> getAgentHubEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getAgentSpacePhaseOneRedesignEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getAudioTunesDisabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    StateFlow<Boolean> getBackgroundVoiceModeEnabled();

    @NotNull
    StateFlow<Boolean> getBackgroundVoiceModeFireOSEnabled();

    @NotNull
    default StateFlow<Boolean> getBackgroundVoiceModeKHEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getBgCamUploadEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getCamArtifactsHorizontalFragmentsEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getConversationPrimeUpsellEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getCoreEntitled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getCsvFileEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getDeepLinkAutoSendEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<FeatureState> getDeepLinkAutoSendState() {
        return StateFlowKt.MutableStateFlow(FeatureState.Disabled.INSTANCE);
    }

    @NotNull
    default StateFlow<Boolean> getDeepThinkingBodyTextEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.TRUE);
    }

    @NotNull
    default StateFlow<Boolean> getDeepThinkingUiEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getDictationModeEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getExtendedFileTypesEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getExtendedUploadLimitsEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getFullScreenBottomSheetRedesignEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    StateFlow<Boolean> getHeaderSwipeDownEnabled();

    @NotNull
    StateFlow<Boolean> getHttpsUpgradeEnabled();

    @NotNull
    StateFlow<Boolean> getInAppWebViewEnabled();

    @NotNull
    StateFlow<Boolean> getLargeScreenOptimizationEnabled();

    @NotNull
    default StateFlow<Boolean> getLiveModeEngagementOptimizationEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getLiveModeI18nEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getLiveModeOnlyIngressEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    StateFlow<Boolean> getLongTextAutoConvertEnabled();

    @NotNull
    StateFlow<Boolean> getMultiFileUploadEnabled();

    @NotNull
    StateFlow<Boolean> getNewChatIconEnabled();

    @NotNull
    default StateFlow<Boolean> getNewDesignSoundsEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getNewDesignSystemEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getOfficeFileTypesEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    StateFlow<Boolean> getOpenUrlValidationEnabled();

    @NotNull
    StateFlow<Boolean> getPeekModeEnabled();

    @NotNull
    default StateFlow<Boolean> getPersonalityStylesEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    StateFlow<Boolean> getPreambleLatencyMaskingEnabled();

    @NotNull
    default StateFlow<Boolean> getPreambleTextConsolidationEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getRecencyBannerEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getRtviShareFosKhEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getRtviShareFosNonKhEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getRtviShareMobileEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<FeatureState> getRtviWarmFrameResolutionState() {
        return StateFlowKt.MutableStateFlow(FeatureState.Disabled.INSTANCE);
    }

    @NotNull
    default StateFlow<Boolean> getScrollDisposeFaultFixEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    StateFlow<Boolean> getShareMyScreenButtonEnabled();

    @NotNull
    StateFlow<Boolean> getSmoothScrollEnabled();

    @NotNull
    default StateFlow<Boolean> getSpeechCaptionFallbackEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    default StateFlow<Boolean> getSyncDridInheritanceEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    StateFlow<Boolean> getTextStreamingEnabled();

    @NotNull
    StateFlow<Boolean> getVisualRenderingFaultBreadcrumbsEnabled();

    @NotNull
    StateFlow<FeatureState> getVisualRenderingFaultBreadcrumbsState();

    @NotNull
    default StateFlow<Boolean> getVrrUserNavigatedAwayClassificationEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    @NotNull
    StateFlow<Boolean> getWindowResizeToggleEnabled();

    @NotNull
    default StateFlow<Boolean> isSmartFragmentEnabled() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    void start();

    void stop();
}
