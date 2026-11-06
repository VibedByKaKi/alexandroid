package com.amazon.alexa.assistant.conversation;

import java.time.Instant;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0005"}, d2 = {"isValidRFC3339", "", "", "parseRFC3339ToInstant", "Ljava/time/Instant;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationServiceRequestKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValidRFC3339(String str) {
        try {
            OffsetDateTime.parse(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Nullable
    public static final Instant parseRFC3339ToInstant(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return OffsetDateTime.parse(str).toInstant();
        } catch (Exception unused) {
            return null;
        }
    }
}
