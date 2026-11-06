package com.amazon.alexa.client.alexaservice.localfragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class LocalFragmentResult {
    public static final String DEFAULT_DISPLAY_HINT = "SHOW";
    public static final String DEFAULT_PURPOSE = "AGENT";
    private static final String FIELD_DIALOG_REQUEST_ID = "dialogRequestId";
    private static final String FIELD_DISPLAY_HINT = "displayHint";
    private static final String FIELD_FRAGMENT_JSON = "fragmentJson";
    private static final String FIELD_PURPOSE = "purpose";
    private static final String FIELD_TOKEN = "token";

    @NonNull
    private final String dialogRequestId;

    @NonNull
    private final String displayHint;

    @NonNull
    private final JsonObject fragmentJson;

    @Nullable
    private final String previousToken;

    @NonNull
    private final String purpose;

    @NonNull
    private final String token;

    private LocalFragmentResult(@NonNull JsonObject jsonObject, @NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5) {
        this.fragmentJson = jsonObject.deepCopy();
        this.token = str;
        this.previousToken = str2;
        this.dialogRequestId = str3;
        this.purpose = str4;
        this.displayHint = str5;
    }

    @NonNull
    public static Builder builder() {
        return new Builder(0);
    }

    @NonNull
    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NonNull
    public String getDisplayHint() {
        return this.displayHint;
    }

    @NonNull
    public JsonObject getFragmentJson() {
        return this.fragmentJson;
    }

    @Nullable
    public String getPreviousToken() {
        return this.previousToken;
    }

    @NonNull
    public String getPurpose() {
        return this.purpose;
    }

    @NonNull
    public String getToken() {
        return this.token;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private String dialogRequestId;

        @NonNull
        private String displayHint;

        @Nullable
        private JsonObject fragmentJson;

        @Nullable
        private String previousToken;

        @NonNull
        private String purpose;

        @Nullable
        private String token;

        private Builder() {
            this.purpose = LocalFragmentResult.DEFAULT_PURPOSE;
            this.displayHint = "SHOW";
        }

        @NonNull
        public LocalFragmentResult build() {
            JsonObject jsonObject = this.fragmentJson;
            Objects.requireNonNull(jsonObject, LocalFragmentResult.FIELD_FRAGMENT_JSON);
            String str = this.token;
            Objects.requireNonNull(str, "token");
            String str2 = this.previousToken;
            String str3 = this.dialogRequestId;
            Objects.requireNonNull(str3, "dialogRequestId");
            String str4 = this.purpose;
            Objects.requireNonNull(str4, "purpose");
            String str5 = this.displayHint;
            Objects.requireNonNull(str5, "displayHint");
            return new LocalFragmentResult(jsonObject, str, str2, str3, str4, str5, 0);
        }

        @NonNull
        public Builder setDialogRequestId(@NonNull String str) {
            this.dialogRequestId = str;
            return this;
        }

        @NonNull
        public Builder setDisplayHint(@NonNull String str) {
            this.displayHint = str;
            return this;
        }

        @NonNull
        public Builder setFragmentJson(@NonNull JsonObject jsonObject) {
            this.fragmentJson = jsonObject;
            return this;
        }

        @NonNull
        public Builder setPreviousToken(@Nullable String str) {
            this.previousToken = str;
            return this;
        }

        @NonNull
        public Builder setPurpose(@NonNull String str) {
            this.purpose = str;
            return this;
        }

        @NonNull
        public Builder setToken(@NonNull String str) {
            this.token = str;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public /* synthetic */ LocalFragmentResult(JsonObject jsonObject, String str, String str2, String str3, String str4, String str5, int i) {
        this(jsonObject, str, str2, str3, str4, str5);
    }
}
