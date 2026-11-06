package chip.devicecontroller;

import java.util.Optional;
import javax.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ControllerParams {
    private final long adminSubject;
    private final boolean attemptNetworkScanThread;
    private final boolean attemptNetworkScanWiFi;
    private final int caseFailsafeTimerSeconds;
    private final int controllerVendorId;
    private final Optional<String> countryCode;
    private final boolean enableServerInteractions;
    private final long fabricId;
    private final int failsafeTimerSeconds;

    @Nullable
    private final byte[] intermediateCertificate;

    @Nullable
    private final byte[] ipk;

    @Nullable
    private final KeypairDelegate keypairDelegate;

    @Nullable
    private final byte[] operationalCertificate;
    private final Optional<Integer> regulatoryLocationType;

    @Nullable
    private final byte[] rootCertificate;
    private final boolean skipAttestationCertificateValidation;
    private final boolean skipCommissioningComplete;
    private final int udpListenPort;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private long adminSubject;
        private boolean attemptNetworkScanThread;
        private boolean attemptNetworkScanWiFi;
        private int caseFailsafeTimerSeconds;
        private int controllerVendorId;
        private Optional<String> countryCode;
        private boolean enableServerInteractions;
        private long fabricId;
        private int failsafeTimerSeconds;

        @Nullable
        private byte[] intermediateCertificate;

        @Nullable
        private byte[] ipk;

        @Nullable
        private KeypairDelegate keypairDelegate;

        @Nullable
        private byte[] operationalCertificate;
        private Optional<Integer> regulatoryLocationType;

        @Nullable
        private byte[] rootCertificate;
        private boolean skipAttestationCertificateValidation;
        private boolean skipCommissioningComplete;
        private int udpListenPort;

        private Builder() {
            this.fabricId = 1L;
            this.udpListenPort = 0;
            this.controllerVendorId = 65535;
            this.failsafeTimerSeconds = 30;
            this.caseFailsafeTimerSeconds = 0;
            this.attemptNetworkScanWiFi = false;
            this.attemptNetworkScanThread = false;
            this.skipCommissioningComplete = false;
            this.skipAttestationCertificateValidation = false;
            this.countryCode = Optional.empty();
            this.regulatoryLocationType = Optional.empty();
            this.keypairDelegate = null;
            this.rootCertificate = null;
            this.intermediateCertificate = null;
            this.operationalCertificate = null;
            this.ipk = null;
            this.adminSubject = 0L;
            this.enableServerInteractions = false;
        }

        public ControllerParams build() {
            return new ControllerParams(this);
        }

        public Builder setAdminSubject(long j) {
            this.adminSubject = j;
            return this;
        }

        public Builder setAttemptNetworkScanThread(boolean z) {
            this.attemptNetworkScanThread = z;
            return this;
        }

        public Builder setAttemptNetworkScanWiFi(boolean z) {
            this.attemptNetworkScanWiFi = z;
            return this;
        }

        public Builder setCASEFailsafeTimerSeconds(int i) {
            if (i <= 0 || i > 900) {
                Single$$ExternalSyntheticBUOutline0.m$3("failsafeTimerSeconds must be between 0 and 900");
                return null;
            }
            this.caseFailsafeTimerSeconds = i;
            return this;
        }

        public Builder setControllerVendorId(int i) {
            this.controllerVendorId = i;
            return this;
        }

        public Builder setCountryCode(String str) {
            if (str == null || str.length() != 2) {
                Single$$ExternalSyntheticBUOutline0.m$3("countryCode must be 2 characters");
                return null;
            }
            this.countryCode = Optional.of(str);
            return this;
        }

        public Builder setEnableServerInteractions(boolean z) {
            this.enableServerInteractions = z;
            return this;
        }

        public Builder setFabricId(long j) {
            this.fabricId = j;
            return this;
        }

        public Builder setFailsafeTimerSeconds(int i) {
            if (i <= 0 || i > 900) {
                Single$$ExternalSyntheticBUOutline0.m$3("failsafeTimerSeconds must be between 0 and 900");
                return null;
            }
            this.failsafeTimerSeconds = i;
            return this;
        }

        public Builder setIntermediateCertificate(byte[] bArr) {
            this.intermediateCertificate = bArr;
            return this;
        }

        public Builder setIpk(byte[] bArr) {
            this.ipk = bArr;
            return this;
        }

        public Builder setKeypairDelegate(KeypairDelegate keypairDelegate) {
            this.keypairDelegate = keypairDelegate;
            return this;
        }

        public Builder setOperationalCertificate(byte[] bArr) {
            this.operationalCertificate = bArr;
            return this;
        }

        public Builder setRegulatoryLocation(int i) {
            if (i < 0 || i > 2) {
                Single$$ExternalSyntheticBUOutline0.m$3("regulatoryLocation value must be between RegulatoryLocationTypeEnum::kIndoor and RegulatoryLocationTypeEnum::kIndoorOutdoor");
                return null;
            }
            this.regulatoryLocationType = Optional.of(Integer.valueOf(i));
            return this;
        }

        public Builder setRootCertificate(byte[] bArr) {
            this.rootCertificate = bArr;
            return this;
        }

        public Builder setSkipAttestationCertificateValidation(boolean z) {
            this.skipAttestationCertificateValidation = z;
            return this;
        }

        public Builder setSkipCommissioningComplete(boolean z) {
            this.skipCommissioningComplete = z;
            return this;
        }

        public Builder setUdpListenPort(int i) {
            if (i >= 0) {
                this.udpListenPort = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("udpListenPort must be >= 0");
            return null;
        }
    }

    private ControllerParams(Builder builder) {
        this.fabricId = builder.fabricId;
        this.udpListenPort = builder.udpListenPort;
        this.controllerVendorId = builder.controllerVendorId;
        this.failsafeTimerSeconds = builder.failsafeTimerSeconds;
        this.caseFailsafeTimerSeconds = builder.caseFailsafeTimerSeconds;
        this.attemptNetworkScanWiFi = builder.attemptNetworkScanWiFi;
        this.attemptNetworkScanThread = builder.attemptNetworkScanThread;
        this.skipCommissioningComplete = builder.skipCommissioningComplete;
        this.skipAttestationCertificateValidation = builder.skipAttestationCertificateValidation;
        this.countryCode = builder.countryCode;
        this.regulatoryLocationType = builder.regulatoryLocationType;
        this.keypairDelegate = builder.keypairDelegate;
        this.rootCertificate = builder.rootCertificate;
        this.intermediateCertificate = builder.intermediateCertificate;
        this.operationalCertificate = builder.operationalCertificate;
        this.ipk = builder.ipk;
        this.adminSubject = builder.adminSubject;
        this.enableServerInteractions = builder.enableServerInteractions;
    }

    public static Builder newBuilder(OperationalKeyConfig operationalKeyConfig) {
        return newBuilder().setKeypairDelegate(operationalKeyConfig.getKeypairDelegate()).setRootCertificate(operationalKeyConfig.getTrustedRootCertificate()).setIntermediateCertificate(operationalKeyConfig.getIntermediateCertificate()).setOperationalCertificate(operationalKeyConfig.getNodeOperationalCertificate()).setIpk(operationalKeyConfig.getIpkEpochKey());
    }

    public final long getAdminSubject() {
        return this.adminSubject;
    }

    public final boolean getAttemptNetworkScanThread() {
        return this.attemptNetworkScanThread;
    }

    public final boolean getAttemptNetworkScanWiFi() {
        return this.attemptNetworkScanWiFi;
    }

    public final int getCASEFailsafeTimerSeconds() {
        return this.caseFailsafeTimerSeconds;
    }

    public final int getControllerVendorId() {
        return this.controllerVendorId;
    }

    public final Optional<String> getCountryCode() {
        return this.countryCode;
    }

    public final boolean getEnableServerInteractions() {
        return this.enableServerInteractions;
    }

    public final long getFabricId() {
        return this.fabricId;
    }

    public final int getFailsafeTimerSeconds() {
        return this.failsafeTimerSeconds;
    }

    public final byte[] getIntermediateCertificate() {
        return this.intermediateCertificate;
    }

    public final byte[] getIpk() {
        return this.ipk;
    }

    public final KeypairDelegate getKeypairDelegate() {
        return this.keypairDelegate;
    }

    public final byte[] getOperationalCertificate() {
        return this.operationalCertificate;
    }

    public final Optional<Integer> getRegulatoryLocation() {
        return this.regulatoryLocationType;
    }

    public final byte[] getRootCertificate() {
        return this.rootCertificate;
    }

    public final boolean getSkipAttestationCertificateValidation() {
        return this.skipAttestationCertificateValidation;
    }

    public final boolean getSkipCommissioningComplete() {
        return this.skipCommissioningComplete;
    }

    public final int getUdpListenPort() {
        return this.udpListenPort;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
