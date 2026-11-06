package com.amazon.alexa.client.alexaservice.base.metrics;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ClientVisualRenderingBreadcrumbEvent extends ClientVisualRenderingBreadcrumbEvent {
    private final String breadcrumbName;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final Map<String, String> metadata;

    public AutoValue_ClientVisualRenderingBreadcrumbEvent(String str, DialogRequestIdentifier dialogRequestIdentifier, Map<String, String> map) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null breadcrumbName");
            throw null;
        }
        this.breadcrumbName = str;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (map != null) {
            this.metadata = map;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null metadata");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientVisualRenderingBreadcrumbEvent) {
            ClientVisualRenderingBreadcrumbEvent clientVisualRenderingBreadcrumbEvent = (ClientVisualRenderingBreadcrumbEvent) obj;
            if (this.breadcrumbName.equals(clientVisualRenderingBreadcrumbEvent.getBreadcrumbName()) && this.dialogRequestIdentifier.equals(clientVisualRenderingBreadcrumbEvent.getDialogRequestIdentifier()) && this.metadata.equals(clientVisualRenderingBreadcrumbEvent.getMetadata())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.ClientVisualRenderingBreadcrumbEvent
    @NonNull
    public String getBreadcrumbName() {
        return this.breadcrumbName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.ClientVisualRenderingBreadcrumbEvent
    @NonNull
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.ClientVisualRenderingBreadcrumbEvent
    @NonNull
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() ^ ((((this.breadcrumbName.hashCode() ^ 1000003) * 1000003) ^ this.dialogRequestIdentifier.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientVisualRenderingBreadcrumbEvent{breadcrumbName=");
        sb.append(this.breadcrumbName);
        sb.append(", dialogRequestIdentifier=");
        sb.append(this.dialogRequestIdentifier);
        sb.append(", metadata=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.metadata, StringSubstitutor.DEFAULT_VAR_END);
    }
}
