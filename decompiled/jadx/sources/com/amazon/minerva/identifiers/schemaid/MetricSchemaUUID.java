package com.amazon.minerva.identifiers.schemaid;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import java.util.regex.Pattern;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MetricSchemaUUID {
    private static final String METRIC_COMPOSITE_ID_DELIMITER = "|";
    private static final Pattern PATTERN_METRIC_GROUP_ID = Pattern.compile("[0-9a-z]{8}");
    private static final Pattern PATTERN_SCHEMA_ID = Pattern.compile("[0-9a-z]{4}/\\d+/[0-9a-f]{8}");
    private final String metricGroupId;
    private final SchemaId schemaId;

    public MetricSchemaUUID(String str, String str2) {
        if (!validateMetricGroupId(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid argument for metricGroupId, validation failed.");
            throw null;
        }
        if (!validateSchemaId(str2)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid argument for schemaId, validation failed.");
            throw null;
        }
        this.metricGroupId = str;
        this.schemaId = new SchemaId(str2);
    }

    public static String getMetricCompositeId(String str, String str2) {
        return a$$ExternalSyntheticOutline0.m$1(str, "|", str2);
    }

    public static boolean validateMetricGroupId(String str) {
        Objects.requireNonNull(str, "metricGroupId cannot be null.");
        return PATTERN_METRIC_GROUP_ID.matcher(str).matches();
    }

    public static boolean validateSchemaId(String str) {
        Objects.requireNonNull(str, "schemaId cannot be null.");
        return PATTERN_SCHEMA_ID.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MetricSchemaUUID.class == obj.getClass()) {
            MetricSchemaUUID metricSchemaUUID = (MetricSchemaUUID) obj;
            if (Objects.equals(this.metricGroupId, metricSchemaUUID.metricGroupId) && Objects.equals(this.schemaId, metricSchemaUUID.schemaId)) {
                return true;
            }
        }
        return false;
    }

    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    public SchemaId getSchemaId() {
        return this.schemaId;
    }

    public int hashCode() {
        return Objects.hash(this.metricGroupId, this.schemaId);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m$1(this.metricGroupId, "/", this.schemaId.toString());
    }
}
