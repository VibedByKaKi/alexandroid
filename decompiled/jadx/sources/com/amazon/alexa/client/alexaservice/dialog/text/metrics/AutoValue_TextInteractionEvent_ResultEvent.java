package com.amazon.alexa.client.alexaservice.dialog.text.metrics;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import com.amazon.alexa.client.alexaservice.dialog.text.metrics.TextInteractionEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_TextInteractionEvent_ResultEvent extends TextInteractionEvent.ResultEvent {
    private final String aggregateName;
    private final DialogRequestIdentifier dialogRequestId;
    private final Map<String, String> failureInformation;
    private final String invocationType;
    private final String name;
    private final DialogInteractionResult.Reason resultReason;
    private final DialogInteractionResult.Type resultType;
    private final long time;

    public AutoValue_TextInteractionEvent_ResultEvent(String str, @Nullable String str2, DialogRequestIdentifier dialogRequestIdentifier, @Nullable Map<String, String> map, long j, String str3, DialogInteractionResult.Type type, @Nullable DialogInteractionResult.Reason reason) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str;
        this.invocationType = str2;
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestId");
            throw null;
        }
        this.dialogRequestId = dialogRequestIdentifier;
        this.failureInformation = map;
        this.time = j;
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null aggregateName");
            throw null;
        }
        this.aggregateName = str3;
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null resultType");
            throw null;
        }
        this.resultType = type;
        this.resultReason = reason;
    }

    public boolean equals(Object obj) {
        String str;
        Map<String, String> map;
        DialogInteractionResult.Reason reason;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TextInteractionEvent.ResultEvent) {
            TextInteractionEvent.ResultEvent resultEvent = (TextInteractionEvent.ResultEvent) obj;
            if (this.name.equals(resultEvent.getName()) && ((str = this.invocationType) != null ? str.equals(resultEvent.getInvocationType()) : resultEvent.getInvocationType() == null) && this.dialogRequestId.equals(resultEvent.getDialogRequestId()) && ((map = this.failureInformation) != null ? map.equals(resultEvent.getFailureInformation()) : resultEvent.getFailureInformation() == null) && this.time == resultEvent.getTime() && this.aggregateName.equals(resultEvent.getAggregateName()) && this.resultType.equals(resultEvent.getResultType()) && ((reason = this.resultReason) != null ? reason.equals(resultEvent.getResultReason()) : resultEvent.getResultReason() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.TextInteractionEvent.ResultEvent
    public String getAggregateName() {
        return this.aggregateName;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    public DialogRequestIdentifier getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.TextInteractionEvent.ResultEvent
    @Nullable
    public Map<String, String> getFailureInformation() {
        return this.failureInformation;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.eventing.events.InteractionEvent
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.TextInteractionEvent.ResultEvent
    @Nullable
    public DialogInteractionResult.Reason getResultReason() {
        return this.resultReason;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.TextInteractionEvent.ResultEvent
    public DialogInteractionResult.Type getResultType() {
        return this.resultType;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.text.metrics.TextInteractionEvent.ResultEvent
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() ^ 1000003) * 1000003;
        String str = this.invocationType;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.dialogRequestId.hashCode()) * 1000003;
        Map<String, String> map = this.failureInformation;
        int hashCode3 = map == null ? 0 : map.hashCode();
        long j = this.time;
        int hashCode4 = (((((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.aggregateName.hashCode()) * 1000003) ^ this.resultType.hashCode()) * 1000003;
        DialogInteractionResult.Reason reason = this.resultReason;
        return hashCode4 ^ (reason != null ? reason.hashCode() : 0);
    }

    public String toString() {
        return "ResultEvent{name=" + this.name + ", invocationType=" + this.invocationType + ", dialogRequestId=" + this.dialogRequestId + ", failureInformation=" + this.failureInformation + ", time=" + this.time + ", aggregateName=" + this.aggregateName + ", resultType=" + this.resultType + ", resultReason=" + this.resultReason + StringSubstitutor.DEFAULT_VAR_END;
    }
}
