package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class TextResponse {
    private static final String EMPTY_STRING = "";
    private final String description;
    private final String dialogRequestId;
    private final TextResponseMetadata metadata;
    private final String title;
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter implements BundleAdapter<TextResponse> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum TextResponseKeys implements Bundles.Key {
            TITLE,
            DESCRIPTION,
            URL,
            METADATA,
            DIALOG_REQUEST_ID
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public TextResponse createFromBundle(Bundle bundle) {
            String string = bundle.getString(TextResponseKeys.TITLE.name());
            String string2 = bundle.getString(TextResponseKeys.DESCRIPTION.name(), "");
            String string3 = bundle.getString(TextResponseKeys.URL.name(), "");
            return TextResponse.builder().setTitle(string).setDescription(string2).setUrl(string3).setMetadata((TextResponseMetadata) BundleTransformer.getDefaultInstance().getFromBundle(bundle.getBundle(TextResponseKeys.METADATA.name()), TextResponseMetadata.class)).setDialogRequestId(bundle.getString(TextResponseKeys.DIALOG_REQUEST_ID.name(), "")).build();
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(TextResponse textResponse) {
            Bundle bundle = new Bundle();
            bundle.putString(TextResponseKeys.TITLE.name(), textResponse.title);
            bundle.putString(TextResponseKeys.DESCRIPTION.name(), textResponse.description);
            bundle.putString(TextResponseKeys.URL.name(), textResponse.url);
            bundle.putString(TextResponseKeys.DIALOG_REQUEST_ID.name(), textResponse.dialogRequestId);
            if (textResponse.metadata != null) {
                bundle.putBundle(TextResponseKeys.METADATA.name(), BundleTransformer.getDefaultInstance().toBundle(textResponse.metadata));
            }
            return bundle;
        }
    }

    private TextResponse(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.url = builder.url;
        this.metadata = builder.metadata;
        this.dialogRequestId = builder.dialogRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public TextResponseMetadata getMetadata() {
        return this.metadata;
    }

    public String getTitle() {
        return this.title;
    }

    @Nullable
    public String getUrl() {
        return this.url;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String description;
        private String dialogRequestId;
        private TextResponseMetadata metadata;
        private String title;
        private String url;

        public TextResponse build() {
            return new TextResponse(this);
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setDialogRequestId(String str) {
            this.dialogRequestId = str;
            return this;
        }

        public Builder setMetadata(TextResponseMetadata textResponseMetadata) {
            this.metadata = textResponseMetadata;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        private Builder() {
        }
    }
}
