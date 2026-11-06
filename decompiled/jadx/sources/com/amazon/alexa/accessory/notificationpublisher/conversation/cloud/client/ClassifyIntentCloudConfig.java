package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentCloudConfig;", "", "endpointUrl", "", "<init>", "(Ljava/lang/String;)V", "getEndpointUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ClassifyIntentCloudConfig {

    @NotNull
    private final String endpointUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ClassifyIntentCloudConfig BETA = new ClassifyIntentCloudConfig("wss://translate.ws.us-west-2-beta.21ldqqw2h4i2e62.create-burner.amazon.dev/v1/classifyIntent");

    public ClassifyIntentCloudConfig(@NotNull String str) {
        str.getClass();
        this.endpointUrl = str;
    }

    public static /* synthetic */ ClassifyIntentCloudConfig copy$default(ClassifyIntentCloudConfig classifyIntentCloudConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classifyIntentCloudConfig.endpointUrl;
        }
        return classifyIntentCloudConfig.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEndpointUrl() {
        return this.endpointUrl;
    }

    @NotNull
    public final ClassifyIntentCloudConfig copy(@NotNull String endpointUrl) {
        endpointUrl.getClass();
        return new ClassifyIntentCloudConfig(endpointUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClassifyIntentCloudConfig) && Intrinsics.areEqual(this.endpointUrl, ((ClassifyIntentCloudConfig) other).endpointUrl);
    }

    @NotNull
    public final String getEndpointUrl() {
        return this.endpointUrl;
    }

    public int hashCode() {
        return this.endpointUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ClassifyIntentCloudConfig(endpointUrl=", this.endpointUrl, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentCloudConfig$Companion;", "", "<init>", "()V", "BETA", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentCloudConfig;", "getBETA", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentCloudConfig;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ClassifyIntentCloudConfig getBETA() {
            return ClassifyIntentCloudConfig.BETA;
        }

        private Companion() {
        }
    }
}
