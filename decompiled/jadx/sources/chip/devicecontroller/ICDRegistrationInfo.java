package chip.devicecontroller;

import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ICDRegistrationInfo {

    @Nullable
    private final Long checkInNodeId;

    @Nullable
    private final Integer clientType;

    @Nullable
    private final Long monitoredSubject;

    @Nullable
    private final Long stayActiveDurationMsec;

    @Nullable
    private final byte[] symmetricKey;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {

        @Nullable
        private Long checkInNodeId;

        @Nullable
        private Integer clientType;

        @Nullable
        private Long monitoredSubject;

        @Nullable
        private Long stayActiveDurationMsec;

        @Nullable
        private byte[] symmetricKey;

        private Builder() {
            this.checkInNodeId = null;
            this.monitoredSubject = null;
            this.symmetricKey = null;
            this.clientType = null;
            this.stayActiveDurationMsec = null;
        }

        public ICDRegistrationInfo build() {
            return new ICDRegistrationInfo(this);
        }

        public Builder setCheckInNodeId(long j) {
            this.checkInNodeId = Long.valueOf(j);
            return this;
        }

        public Builder setClientType(Integer num) {
            this.clientType = num;
            return this;
        }

        public Builder setICDStayActiveDurationMsec(Long l) {
            this.stayActiveDurationMsec = l;
            return this;
        }

        public Builder setMonitoredSubject(long j) {
            this.monitoredSubject = Long.valueOf(j);
            return this;
        }

        public Builder setSymmetricKey(byte[] bArr) {
            this.symmetricKey = bArr;
            return this;
        }
    }

    private ICDRegistrationInfo(Builder builder) {
        this.checkInNodeId = builder.checkInNodeId;
        this.monitoredSubject = builder.monitoredSubject;
        this.symmetricKey = builder.symmetricKey;
        this.clientType = builder.clientType;
        this.stayActiveDurationMsec = builder.stayActiveDurationMsec;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Long getCheckInNodeId() {
        return this.checkInNodeId;
    }

    public Integer getClientType() {
        return this.clientType;
    }

    public Long getICDStayActiveDurationMsec() {
        return this.stayActiveDurationMsec;
    }

    public Long getMonitoredSubject() {
        return this.monitoredSubject;
    }

    public byte[] getSymmetricKey() {
        return this.symmetricKey;
    }
}
