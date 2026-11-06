package com.amazonaws.services.s3.model;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.internal.crypto.CryptoRuntime;
import java.io.Serializable;
import java.security.Provider;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class CryptoConfiguration implements Cloneable, Serializable {
    private static final long serialVersionUID = -8646831898339939580L;
    private transient com.amazonaws.regions.Region awskmsRegion;
    private CryptoMode cryptoMode;
    private Provider cryptoProvider;
    private boolean ignoreMissingInstructionFile;
    private CryptoStorageMode storageMode;

    public CryptoConfiguration(CryptoMode cryptoMode) {
        this.ignoreMissingInstructionFile = true;
        this.storageMode = CryptoStorageMode.ObjectMetadata;
        this.cryptoProvider = null;
        this.cryptoMode = cryptoMode;
    }

    private void check(CryptoMode cryptoMode) {
        if (cryptoMode == CryptoMode.AuthenticatedEncryption || cryptoMode == CryptoMode.StrictAuthenticatedEncryption) {
            if (this.cryptoProvider == null && !CryptoRuntime.isBouncyCastleAvailable()) {
                CryptoRuntime.enableBouncyCastle();
                if (!CryptoRuntime.isBouncyCastleAvailable()) {
                    Buffer$$ExternalSyntheticBUOutline0.m$1("The Bouncy castle library jar is required on the classpath to enable authenticated encryption");
                    return;
                }
            }
            if (CryptoRuntime.isAesGcmAvailable(this.cryptoProvider)) {
                return;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$1("More recent version of the Bouncy castle library is required to enable authenticated encryption");
        }
    }

    private CryptoConfiguration copyTo(CryptoConfiguration cryptoConfiguration) {
        cryptoConfiguration.cryptoMode = this.cryptoMode;
        cryptoConfiguration.storageMode = this.storageMode;
        cryptoConfiguration.cryptoProvider = this.cryptoProvider;
        cryptoConfiguration.ignoreMissingInstructionFile = this.ignoreMissingInstructionFile;
        cryptoConfiguration.awskmsRegion = this.awskmsRegion;
        return cryptoConfiguration;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CryptoConfiguration mo23767clone() {
        return copyTo(new CryptoConfiguration());
    }

    public com.amazonaws.regions.Region getAwsKmsRegion() {
        return this.awskmsRegion;
    }

    public CryptoMode getCryptoMode() {
        return this.cryptoMode;
    }

    public Provider getCryptoProvider() {
        return this.cryptoProvider;
    }

    @Deprecated
    public Regions getKmsRegion() {
        com.amazonaws.regions.Region region = this.awskmsRegion;
        if (region == null) {
            return null;
        }
        return Regions.fromName(region.getName());
    }

    public CryptoStorageMode getStorageMode() {
        return this.storageMode;
    }

    public boolean isIgnoreMissingInstructionFile() {
        return this.ignoreMissingInstructionFile;
    }

    public boolean isReadOnly() {
        return false;
    }

    public CryptoConfiguration readOnly() {
        return isReadOnly() ? this : copyTo(new ReadOnly());
    }

    public void setAwsKmsRegion(com.amazonaws.regions.Region region) {
        this.awskmsRegion = region;
    }

    public void setCryptoMode(CryptoMode cryptoMode) throws UnsupportedOperationException {
        this.cryptoMode = cryptoMode;
    }

    public void setCryptoProvider(Provider provider) {
        this.cryptoProvider = provider;
        check(this.cryptoMode);
    }

    public void setIgnoreMissingInstructionFile(boolean z) {
        this.ignoreMissingInstructionFile = z;
    }

    @Deprecated
    public void setKmsRegion(Regions regions) {
        if (regions != null) {
            setAwsKmsRegion(com.amazonaws.regions.Region.getRegion(regions));
        } else {
            setAwsKmsRegion(null);
        }
    }

    public void setStorageMode(CryptoStorageMode cryptoStorageMode) {
        this.storageMode = cryptoStorageMode;
    }

    public CryptoConfiguration withAwsKmsRegion(com.amazonaws.regions.Region region) {
        this.awskmsRegion = region;
        return this;
    }

    public CryptoConfiguration withCryptoMode(CryptoMode cryptoMode) {
        this.cryptoMode = cryptoMode;
        return this;
    }

    public CryptoConfiguration withCryptoProvider(Provider provider) {
        this.cryptoProvider = provider;
        check(this.cryptoMode);
        return this;
    }

    public CryptoConfiguration withIgnoreMissingInstructionFile(boolean z) {
        this.ignoreMissingInstructionFile = z;
        return this;
    }

    @Deprecated
    public CryptoConfiguration withKmsRegion(Regions regions) {
        setKmsRegion(regions);
        return this;
    }

    public CryptoConfiguration withStorageMode(CryptoStorageMode cryptoStorageMode) {
        this.storageMode = cryptoStorageMode;
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ReadOnly extends CryptoConfiguration {
        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo23767clone() throws CloneNotSupportedException {
            return super.mo23767clone();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public boolean isReadOnly() {
            return true;
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public void setCryptoMode(CryptoMode cryptoMode) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public void setCryptoProvider(Provider provider) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public void setIgnoreMissingInstructionFile(boolean z) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public void setKmsRegion(Regions regions) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public void setStorageMode(CryptoStorageMode cryptoStorageMode) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public CryptoConfiguration withCryptoMode(CryptoMode cryptoMode) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public CryptoConfiguration withCryptoProvider(Provider provider) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public CryptoConfiguration withIgnoreMissingInstructionFile(boolean z) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public CryptoConfiguration withKmsRegion(Regions regions) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazonaws.services.s3.model.CryptoConfiguration
        public CryptoConfiguration withStorageMode(CryptoStorageMode cryptoStorageMode) {
            throw new UnsupportedOperationException();
        }

        private ReadOnly() {
        }
    }

    public CryptoConfiguration() {
        this(CryptoMode.EncryptionOnly);
    }
}
