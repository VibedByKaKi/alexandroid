package com.amazon.alexa.handsfree.protocols.uservoicerecognition.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class UserInfo {
    public static final UserInfo DEFAULT_USER = new UserInfo(Constants.FEEDBACK_TYPE_DISLIKE);
    private final String mUserId;

    public UserInfo(@NonNull String str) {
        Objects.requireNonNull(str, "User ID must not be null.");
        this.mUserId = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != UserInfo.class) {
            return false;
        }
        return Objects.equals(this.mUserId, ((UserInfo) obj).mUserId);
    }

    @NonNull
    public String getUserId() {
        return this.mUserId;
    }

    public int hashCode() {
        return Objects.hash(this.mUserId);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("[userId = ", this.mUserId, MarkdownConstants.RIGHT_BRACKET);
    }
}
