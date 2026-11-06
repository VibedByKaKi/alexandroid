package com.amazon.alexa.accessory.kota;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PackageCandidateIdentifier {
    public final String componentId;
    public final Integer currentVersion;
    public final String deviceSerialNumber;
    public final String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String componentId;
        private Integer currentVersion;
        private String deviceSerialNumber;
        private String deviceType;

        public PackageCandidateIdentifier build() {
            return new PackageCandidateIdentifier(this, 0);
        }

        public Builder componentId(String str) {
            this.componentId = str;
            return this;
        }

        public Builder currentVersion(Integer num) {
            this.currentVersion = num;
            return this;
        }

        public Builder deviceSerialNumber(String str) {
            this.deviceSerialNumber = str;
            return this;
        }

        public Builder deviceType(String str) {
            this.deviceType = str;
            return this;
        }
    }

    private PackageCandidateIdentifier(Builder builder) {
        String str = builder.deviceType;
        this.deviceType = str;
        String str2 = builder.deviceSerialNumber;
        this.deviceSerialNumber = str2;
        String str3 = builder.componentId;
        this.componentId = str3;
        Integer num = builder.currentVersion;
        this.currentVersion = num;
        boolean z = false;
        Preconditions.precondition((str == null || str.isEmpty()) ? false : true, "deviceType is empty!");
        Preconditions.precondition((str2 == null || str2.isEmpty()) ? false : true, "deviceSerialNumber is empty!");
        if (str3 != null && !str3.isEmpty()) {
            z = true;
        }
        Preconditions.precondition(z, "componentId is empty!");
        Preconditions.notNull(num, "currentVersion");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PackageCandidateIdentifier.class == obj.getClass()) {
            PackageCandidateIdentifier packageCandidateIdentifier = (PackageCandidateIdentifier) obj;
            if (Objects.equals(this.deviceType, packageCandidateIdentifier.deviceType) && Objects.equals(this.deviceSerialNumber, packageCandidateIdentifier.deviceSerialNumber) && Objects.equals(this.componentId, packageCandidateIdentifier.componentId) && Objects.equals(this.currentVersion, packageCandidateIdentifier.currentVersion)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.deviceType, this.deviceSerialNumber, this.componentId, this.currentVersion);
    }

    public /* synthetic */ PackageCandidateIdentifier(Builder builder, int i) {
        this(builder);
    }
}
