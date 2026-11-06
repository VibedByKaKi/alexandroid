package com.amazon.alexa.mobilytics.event.metadata;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.mobilytics.protobuf.EventDetailsProto;
import com.amazon.comms.ringservice.MetricsSession;
import com.amazon.minerva.client.common.api.Predefined;
import com.fasterxml.jackson.annotation.JsonInclude;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@MinervaMobilyticsAttributes(attributes = {MinervaMobilyticsAttribute.SUB_COMPONENT, MinervaMobilyticsAttribute.APPLICATION_FOREGROUNDED})
@MinervaPredefined(predefinedFields = {Predefined.SOFTWARE_VERSION, Predefined.DEVICE_TYPE})
/* loaded from: classes18.dex */
public class A4ASdkMetadata implements DefaultEventMetadata {
    private String action;
    private String addFragmentState;
    private String avsEndpoint;
    private String contextSource;
    private String dialogRequestId;
    private String dialogStatus;
    private String errorCode;
    private String errorType;
    private String failureCategory;
    private String failureReason;
    private String fileExtension;
    private Long fileSize;
    private String initiator;
    private String interactionLabel;
    private String interactionModelState;
    private String interactionSource;
    private String invocationIdentifier;
    private String invocationNamespace;
    private String invocationType;
    private final String metadataType = EventMetadataType.A4ASDK;
    private String nddIsEnabled;
    private String renderFailureCategory;
    private String responseType;
    private String visualTheme;

    @Nullable
    @MinervaAttributeName("Action")
    public String getAction() {
        return this.action;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.ADD_FRAGMENT_STATE)
    public String getAddFragmentState() {
        return this.addFragmentState;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.AVS_ENDPOINT)
    public String getAvsEndpoint() {
        return this.avsEndpoint;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.CONTEXT_SOURCE)
    public String getContextSource() {
        return this.contextSource;
    }

    @Nullable
    @DCMAttributeName("dialogId")
    @MinervaAttributeName("dialogId")
    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.DIALOG_STATUS)
    public String getDialogStatus() {
        return this.dialogStatus;
    }

    @Nullable
    @MinervaAttributeName(MetricsSession.ERROR_CODE_PIVOT)
    public String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    @MinervaAttributeName("errorType")
    public String getErrorType() {
        return this.errorType;
    }

    @Nullable
    @MinervaAttributeName("FailureCategory")
    public String getFailureCategory() {
        return this.failureCategory;
    }

    @Nullable
    @MinervaAttributeName("FailureReason")
    public String getFailureReason() {
        return this.failureReason;
    }

    @Nullable
    @MinervaAttributeName("FILE_EXTENSION")
    public String getFileExtension() {
        return this.fileExtension;
    }

    @Nullable
    @MinervaAttributeName("FILE_SIZE")
    public Long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.INITIATOR)
    public String getInitiator() {
        return this.initiator;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.INTERACTION_LABEL)
    public String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.INTERACTION_MODEL_STATE)
    public String getInteractionModelState() {
        return this.interactionModelState;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.INTERACTION_SOURCE)
    public String getInteractionSource() {
        return this.interactionSource;
    }

    @Nullable
    public String getInvocationIdentifier() {
        return this.invocationIdentifier;
    }

    @Nullable
    public String getInvocationNamespace() {
        return this.invocationNamespace;
    }

    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.mobilytics.event.metadata.EventMetadata
    public String getMetadataType() {
        return EventMetadataType.A4ASDK;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.NDD_IS_ENABLED)
    public String getNddIsEnabled() {
        return this.nddIsEnabled;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.RENDER_FAILURE_CATEGORY)
    public String getRenderFailureCategory() {
        return this.renderFailureCategory;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.RESPONSE_TYPE)
    public String getResponseType() {
        return this.responseType;
    }

    @Nullable
    @MinervaAttributeName(AlexaMetricsConstants.MetricDimensions.VISUAL_THEME)
    public String getVisualTheme() {
        return this.visualTheme;
    }

    @Override // com.amazon.alexa.mobilytics.event.metadata.DefaultEventMetadata
    @NonNull
    public EventDetailsProto.Metadata serialize() {
        EventDetailsProto.Metadata.Builder newBuilder = EventDetailsProto.Metadata.newBuilder();
        EventDetailsProto.Metadata.A4aSdk.Builder newBuilder2 = EventDetailsProto.Metadata.A4aSdk.newBuilder();
        String str = this.dialogRequestId;
        if (str != null) {
            newBuilder2.setDialogRequestId(str);
        }
        String str2 = this.invocationNamespace;
        if (str2 != null) {
            newBuilder2.setInvocationNamespace(str2);
        }
        String str3 = this.invocationIdentifier;
        if (str3 != null) {
            newBuilder2.setInvocationIdentifier(str3);
        }
        String str4 = this.invocationType;
        if (str4 != null) {
            newBuilder2.setInvocationType(str4);
        }
        String str5 = this.fileExtension;
        if (str5 != null) {
            newBuilder2.setFileExtension(str5);
        }
        Long l = this.fileSize;
        if (l != null) {
            newBuilder2.setFileSize(l.longValue());
        }
        String str6 = this.interactionLabel;
        if (str6 != null) {
            newBuilder2.setInteractionLabel(str6);
        }
        String str7 = this.initiator;
        if (str7 != null) {
            newBuilder2.setInitiator(str7);
        }
        String str8 = this.action;
        if (str8 != null) {
            newBuilder2.setAction(str8);
        }
        String str9 = this.avsEndpoint;
        if (str9 != null) {
            newBuilder2.setAvsEndpoint(str9);
        }
        String str10 = this.responseType;
        if (str10 != null) {
            newBuilder2.setResponseType(str10);
        }
        String str11 = this.dialogStatus;
        if (str11 != null) {
            newBuilder2.setDialogStatus(str11);
        }
        String str12 = this.renderFailureCategory;
        if (str12 != null) {
            newBuilder2.setRenderFailureCategory(str12);
        }
        String str13 = this.interactionSource;
        if (str13 != null) {
            newBuilder2.setInteractionSource(str13);
        }
        String str14 = this.addFragmentState;
        if (str14 != null) {
            newBuilder2.setAddFragmentState(str14);
        }
        String str15 = this.interactionModelState;
        if (str15 != null) {
            newBuilder2.setInteractionModelState(str15);
        }
        String str16 = this.nddIsEnabled;
        if (str16 != null) {
            newBuilder2.setNddIsEnabled(str16);
        }
        String str17 = this.visualTheme;
        if (str17 != null) {
            newBuilder2.setVisualTheme(str17);
        }
        String str18 = this.contextSource;
        if (str18 != null) {
            newBuilder2.setContextSource(str18);
        }
        String str19 = this.failureReason;
        if (str19 != null) {
            newBuilder2.setFailureReason(str19);
        }
        String str20 = this.failureCategory;
        if (str20 != null) {
            newBuilder2.setFailureCategory(str20);
        }
        String str21 = this.errorCode;
        if (str21 != null) {
            newBuilder2.setErrorCode(str21);
        }
        String str22 = this.errorType;
        if (str22 != null) {
            newBuilder2.setErrorType(str22);
        }
        newBuilder.setA4ASdk(newBuilder2);
        return newBuilder.build();
    }

    public A4ASdkMetadata withAction(@Nullable String str) {
        this.action = str;
        return this;
    }

    public A4ASdkMetadata withAddFragmentState(@Nullable String str) {
        this.addFragmentState = str;
        return this;
    }

    public A4ASdkMetadata withAvsEndpoint(@Nullable String str) {
        this.avsEndpoint = str;
        return this;
    }

    public A4ASdkMetadata withContextSource(@Nullable String str) {
        this.contextSource = str;
        return this;
    }

    public A4ASdkMetadata withDialogRequestId(@Nullable String str) {
        this.dialogRequestId = str;
        return this;
    }

    public A4ASdkMetadata withDialogStatus(@Nullable String str) {
        this.dialogStatus = str;
        return this;
    }

    public A4ASdkMetadata withErrorCode(@Nullable String str) {
        this.errorCode = str;
        return this;
    }

    public A4ASdkMetadata withErrorType(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this.errorType = str;
        return this;
    }

    public A4ASdkMetadata withFailureCategory(@Nullable String str) {
        this.failureCategory = str;
        return this;
    }

    public A4ASdkMetadata withFailureReason(@Nullable String str) {
        this.failureReason = str;
        return this;
    }

    public A4ASdkMetadata withFileExtension(@Nullable String str) {
        this.fileExtension = str;
        return this;
    }

    public A4ASdkMetadata withFileSize(@Nullable Long l) {
        this.fileSize = l;
        return this;
    }

    public A4ASdkMetadata withInitiator(@Nullable String str) {
        this.initiator = str;
        return this;
    }

    public A4ASdkMetadata withInteractionLabel(@Nullable String str) {
        this.interactionLabel = str;
        return this;
    }

    public A4ASdkMetadata withInteractionModelState(@Nullable String str) {
        this.interactionModelState = str;
        return this;
    }

    public A4ASdkMetadata withInteractionSource(@Nullable String str) {
        this.interactionSource = str;
        return this;
    }

    public A4ASdkMetadata withInvocationIdentifier(@Nullable String str) {
        this.invocationIdentifier = str;
        return this;
    }

    public A4ASdkMetadata withInvocationNamespace(@Nullable String str) {
        this.invocationNamespace = str;
        return this;
    }

    public A4ASdkMetadata withInvocationType(@Nullable String str) {
        this.invocationType = str;
        return this;
    }

    public A4ASdkMetadata withNddIsEnabled(@Nullable String str) {
        this.nddIsEnabled = str;
        return this;
    }

    public A4ASdkMetadata withRenderFailureCategory(@Nullable String str) {
        this.renderFailureCategory = str;
        return this;
    }

    public A4ASdkMetadata withResponseType(@Nullable String str) {
        this.responseType = str;
        return this;
    }

    public A4ASdkMetadata withVisualTheme(@Nullable String str) {
        this.visualTheme = str;
        return this;
    }
}
