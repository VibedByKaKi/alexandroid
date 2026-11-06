package com.amazon.alexa.accessory.repositories.ambient;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AmbientContextSubscriptionResult {
    private final AmbientContextCategory category;
    private final AmbientContextSubscriptionStatus status;

    public AmbientContextSubscriptionResult(AmbientContextCategory ambientContextCategory, AmbientContextSubscriptionStatus ambientContextSubscriptionStatus) {
        Preconditions.notNull(ambientContextCategory, "category");
        Preconditions.notNull(ambientContextSubscriptionStatus, "status");
        this.category = ambientContextCategory;
        this.status = ambientContextSubscriptionStatus;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AmbientContextSubscriptionResult ambientContextSubscriptionResult = (AmbientContextSubscriptionResult) obj;
            if (this.category == ambientContextSubscriptionResult.category && this.status == ambientContextSubscriptionResult.status) {
                return true;
            }
        }
        return false;
    }

    public AmbientContextCategory getCategory() {
        return this.category;
    }

    public AmbientContextSubscriptionStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Objects.hash(this.category, this.status);
    }

    public String toString() {
        return "AmbientContextSubscriptionResult{category=" + this.category + ", status=" + this.status + AbstractJsonLexerKt.END_OBJ;
    }
}
