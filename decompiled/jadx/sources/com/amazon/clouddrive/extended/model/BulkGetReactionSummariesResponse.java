package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkGetReactionSummariesResponse extends ReactionSummaries {
    @Override // com.amazon.clouddrive.extended.model.ReactionSummaries
    public boolean canEqual(Object obj) {
        return obj instanceof BulkGetReactionSummariesResponse;
    }

    @Override // com.amazon.clouddrive.extended.model.ReactionSummaries
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BulkGetReactionSummariesResponse) && ((BulkGetReactionSummariesResponse) obj).canEqual(this) && super.equals(obj);
    }

    @Override // com.amazon.clouddrive.extended.model.ReactionSummaries
    public int hashCode() {
        return 59 + super.hashCode();
    }

    @Override // com.amazon.clouddrive.extended.model.ReactionSummaries
    public String toString() {
        return "BulkGetReactionSummariesResponse()";
    }
}
