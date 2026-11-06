package com.amazon.alexa.client.metrics.mobilytics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MobilyticsUserImpl implements MobilyticsUser {
    private final String directedId;
    private final boolean isChildProfile;
    private final String marketplaceId;

    private MobilyticsUserImpl(Builder builder) {
        this.directedId = builder.directedId;
        this.marketplaceId = builder.marketplaceId;
        this.isChildProfile = builder.isChildProfile;
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUser
    @Nullable
    public String attribute(MobilyticsUser.Attribute attribute) {
        return "Unknown";
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUser
    @NonNull
    public String directedId() {
        String str = this.directedId;
        return (str == null || TextUtils.isEmpty(str)) ? "Unknown" : this.directedId;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUser
    public boolean hasFeature(@NonNull String str) {
        return false;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUser
    public boolean isChildProfile() {
        return this.isChildProfile;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUser
    @NonNull
    public String marketplaceId() {
        String str = this.marketplaceId;
        return (str == null || TextUtils.isEmpty(str)) ? "Unknown" : this.marketplaceId;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsUser
    @NonNull
    public String personId() {
        return "Unknown";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String directedId;
        private boolean isChildProfile;
        private String marketplaceId;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public MobilyticsUserImpl build() {
            return new MobilyticsUserImpl(this, 0);
        }

        public Builder withDirectedId(String str) {
            this.directedId = str;
            return this;
        }

        public Builder withIsChildProfile(boolean z) {
            this.isChildProfile = z;
            return this;
        }

        public Builder withMarketplaceId(String str) {
            this.marketplaceId = str;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ MobilyticsUserImpl(Builder builder, int i) {
        this(builder);
    }
}
