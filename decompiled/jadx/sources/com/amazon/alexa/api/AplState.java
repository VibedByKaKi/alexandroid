package com.amazon.alexa.api;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AplState {
    private static final String FIELD_COMPONENTS_VISIBLE_ON_SCREEN = "componentsVisibleOnScreen";
    private static final String FIELD_DATA_SOURCES = "dataSources";
    private static final String FIELD_PRESENTATION_SESSION = "presentationSession";
    private static final String FIELD_SHOULD_CLEAR_STATE_PROVIDER_DATA = "shouldClearStateProviderData";
    private static final String FIELD_TOKEN = "token";
    private static final String FIELD_VERSION = "version";
    private final String componentsVisibleOnScreen;
    private final String dataSources;
    private final String presentationSession;
    private final String presentationToken;
    private final boolean shouldClearStateProviderData;
    private final String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter implements BundleAdapter<AplState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public AplState createFromBundle(Bundle bundle) {
            return AplState.builder().setShouldClearStateProviderData(bundle.getBoolean("shouldClearStateProviderData")).setPresentationSession(bundle.getString("presentationSession")).setComponentsVisibleOnScreen(bundle.getString("componentsVisibleOnScreen")).setDataSources(bundle.getString("dataSources")).setVersion(bundle.getString("version")).setPresentationToken(bundle.getString("token")).build();
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(AplState aplState) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("shouldClearStateProviderData", aplState.shouldClearStateProviderData);
            bundle.putString("presentationSession", aplState.presentationSession);
            bundle.putString("componentsVisibleOnScreen", aplState.componentsVisibleOnScreen);
            bundle.putString("dataSources", aplState.dataSources);
            bundle.putString("version", aplState.version);
            bundle.putString("token", aplState.presentationToken);
            return bundle;
        }
    }

    private AplState(Builder builder) {
        this.shouldClearStateProviderData = builder.shouldClearStateProviderData;
        this.presentationSession = builder.presentationSession;
        this.componentsVisibleOnScreen = builder.componentsVisibleOnScreen;
        this.dataSources = builder.dataSources;
        this.version = builder.version;
        this.presentationToken = builder.presentationToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getComponentsVisibleOnScreen() {
        return this.componentsVisibleOnScreen;
    }

    public String getDataSources() {
        return this.dataSources;
    }

    public String getPresentationSession() {
        return this.presentationSession;
    }

    public String getPresentationToken() {
        return this.presentationToken;
    }

    public boolean getShouldClearStateProviderData() {
        return this.shouldClearStateProviderData;
    }

    public String getVersion() {
        return this.version;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String componentsVisibleOnScreen;
        private String dataSources;
        private String presentationSession;
        private String presentationToken;
        private boolean shouldClearStateProviderData;
        private String version;

        public AplState build() {
            return new AplState(this);
        }

        public Builder setComponentsVisibleOnScreen(String str) {
            this.componentsVisibleOnScreen = str;
            return this;
        }

        public Builder setDataSources(String str) {
            this.dataSources = str;
            return this;
        }

        public Builder setPresentationSession(String str) {
            this.presentationSession = str;
            return this;
        }

        public Builder setPresentationToken(String str) {
            this.presentationToken = str;
            return this;
        }

        public Builder setShouldClearStateProviderData(boolean z) {
            this.shouldClearStateProviderData = z;
            return this;
        }

        public Builder setVersion(String str) {
            this.version = str;
            return this;
        }

        private Builder() {
        }
    }
}
