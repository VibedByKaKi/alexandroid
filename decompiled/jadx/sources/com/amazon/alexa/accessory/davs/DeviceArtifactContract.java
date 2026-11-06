package com.amazon.alexa.accessory.davs;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface DeviceArtifactContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ArtifactPackage {
        private final ArtifactPackageIdentifier artifactPackageIdentifier;
        private final DavsArtifactSignature davsArtifactSignature;
        private final File file;

        private ArtifactPackage(File file, ArtifactPackageIdentifier artifactPackageIdentifier, DavsArtifactSignature davsArtifactSignature) {
            this.file = file;
            this.artifactPackageIdentifier = artifactPackageIdentifier;
            this.davsArtifactSignature = davsArtifactSignature;
        }

        public static ArtifactPackage create(File file, ArtifactPackageIdentifier artifactPackageIdentifier, DavsArtifactSignature davsArtifactSignature) {
            String artifactIdentifier = artifactPackageIdentifier.getArtifactIdentifier();
            Preconditions.validFileName(artifactIdentifier, "artifactIdentifier");
            return new ArtifactPackage(new File(file, artifactIdentifier), artifactPackageIdentifier, davsArtifactSignature);
        }

        public static ArtifactPackage createFromExistingFile(File file, ArtifactPackageIdentifier artifactPackageIdentifier, DavsArtifactSignature davsArtifactSignature) {
            return new ArtifactPackage(file, artifactPackageIdentifier, davsArtifactSignature);
        }

        public String getArtifactName() {
            return this.artifactPackageIdentifier.getArtifactName();
        }

        public ArtifactPackageIdentifier getArtifactPackageIdentifier() {
            return this.artifactPackageIdentifier;
        }

        public DavsArtifactSignature getDavsArtifactSignature() {
            return this.davsArtifactSignature;
        }

        public File getFile() {
            return this.file;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ArtifactPackageIdentifier {
        private final String artifactIdentifier;
        private final String artifactName;

        private ArtifactPackageIdentifier(Builder builder) {
            this.artifactName = builder.artifactName;
            this.artifactIdentifier = builder.artifactIdentifier;
        }

        public String getArtifactIdentifier() {
            return this.artifactIdentifier;
        }

        public String getArtifactName() {
            return this.artifactName;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            private String artifactIdentifier;
            private String artifactName;

            public Builder artifactIdentifier(ArtifactIdentifier artifactIdentifier) {
                this.artifactIdentifier = artifactIdentifier.toIdentifierString();
                return this;
            }

            public Builder artifactName(String str) {
                this.artifactName = str;
                return this;
            }

            public ArtifactPackageIdentifier build() {
                Preconditions.notEmpty(this.artifactName, "artifactName");
                Preconditions.notNull(this.artifactIdentifier, "artifactIdentifier");
                return new ArtifactPackageIdentifier(this, 0);
            }

            public Builder artifactIdentifier(String str) {
                this.artifactIdentifier = str;
                return this;
            }
        }

        public /* synthetic */ ArtifactPackageIdentifier(Builder builder, int i) {
            this(builder);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ArtifactIdentifier {
        private static final String EXTENSION = ".bin";
        private static final String SEPARATOR = "_";
        private final String artifactIdentifier;
        private final String artifactKey;
        private final String artifactType;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            private String artifactIdentifier;
            private String artifactKey;
            private String artifactType;

            public Builder artifactIdentifier(String str) {
                this.artifactIdentifier = str;
                return this;
            }

            public Builder artifactKey(String str) {
                this.artifactKey = str;
                return this;
            }

            public Builder artifactType(String str) {
                this.artifactType = str;
                return this;
            }

            public ArtifactIdentifier build() {
                Preconditions.notEmpty(this.artifactType, "artifactType");
                Preconditions.notEmpty(this.artifactKey, "artifactKey");
                Preconditions.notEmpty(this.artifactIdentifier, "artifactIdentifier");
                return new ArtifactIdentifier(this, 0);
            }
        }

        private ArtifactIdentifier(Builder builder) {
            this.artifactType = builder.artifactType;
            this.artifactKey = builder.artifactKey;
            this.artifactIdentifier = builder.artifactIdentifier;
        }

        public String toIdentifierString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.artifactType);
            sb.append("_");
            sb.append(this.artifactKey);
            sb.append("_");
            return a$$ExternalSyntheticOutline0.m(sb, this.artifactIdentifier, EXTENSION);
        }

        public /* synthetic */ ArtifactIdentifier(Builder builder, int i) {
            this(builder);
        }
    }
}
