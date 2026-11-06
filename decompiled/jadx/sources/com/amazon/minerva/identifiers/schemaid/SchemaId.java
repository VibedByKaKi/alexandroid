package com.amazon.minerva.identifiers.schemaid;

import com.amazon.minerva.identifiers.schemaid.attribute.attributes.VersionedAttributes;
import com.amazon.minerva.identifiers.schemaid.attribute.parser.Version2AttributesParser;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SchemaId {
    private static final int FORMAT_VERSION_2 = 2;
    private static final String METRIC_SCHEMA_ID_DELIMITER = "/";
    private Integer formatVersion;
    private String identifier;
    private VersionedAttributes versionedAttributes;

    public SchemaId(String str) {
        Objects.requireNonNull(str, "Metric Schema ID cannot be empty.");
        String[] splitMetricSchemaId = splitMetricSchemaId(str);
        String str2 = splitMetricSchemaId[0];
        int parseInt = Integer.parseInt(splitMetricSchemaId[1]);
        initialize(str2, parseInt, parseControlBits(parseInt, splitMetricSchemaId[2]));
    }

    public static String getControlBits(int i, VersionedAttributes versionedAttributes) {
        if (i == 2) {
            return Version2AttributesParser.getAttributesHexString(versionedAttributes);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("Format version is not supported.");
        return null;
    }

    private static String getMetricSchemaId(String str, int i, VersionedAttributes versionedAttributes) {
        return str + "/" + i + "/" + getControlBits(i, versionedAttributes);
    }

    private void initialize(String str, int i, VersionedAttributes versionedAttributes) {
        this.identifier = str;
        this.formatVersion = Integer.valueOf(i);
        this.versionedAttributes = versionedAttributes;
    }

    public static VersionedAttributes parseControlBits(int i, String str) {
        Objects.requireNonNull(str, "ControlBits can not be null");
        if (i == 2) {
            return Version2AttributesParser.parseAttributes(str);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("Format version is not supported.");
        return null;
    }

    private static String[] splitMetricSchemaId(String str) {
        Objects.requireNonNull(str, "Metric Schema ID cannot be empty.");
        String[] split = str.split("/");
        if (split.length == 3) {
            return split;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("SchemaId string should have a format of luid/version/controlBits.");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SchemaId schemaId = (SchemaId) obj;
            if (Objects.equals(this.identifier, schemaId.identifier) && Objects.equals(this.formatVersion, schemaId.formatVersion) && Objects.equals(getControlBits(), schemaId.getControlBits())) {
                return true;
            }
        }
        return false;
    }

    public Integer getFormatVersion() {
        return this.formatVersion;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public VersionedAttributes getVersionedAttributes() {
        return this.versionedAttributes;
    }

    public int hashCode() {
        return Objects.hash(this.identifier, this.formatVersion, getControlBits());
    }

    public String toString() {
        return getMetricSchemaId(this.identifier, this.formatVersion.intValue(), this.versionedAttributes);
    }

    public String getControlBits() {
        return getControlBits(this.formatVersion.intValue(), this.versionedAttributes);
    }

    public SchemaId(String str, int i, VersionedAttributes versionedAttributes) {
        initialize(str, i, versionedAttributes);
    }
}
