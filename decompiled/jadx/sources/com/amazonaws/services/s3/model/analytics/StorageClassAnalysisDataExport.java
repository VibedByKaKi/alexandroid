package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StorageClassAnalysisDataExport implements Serializable {
    private AnalyticsExportDestination destination;
    private String outputSchemaVersion;

    public AnalyticsExportDestination getDestination() {
        return this.destination;
    }

    public String getOutputSchemaVersion() {
        return this.outputSchemaVersion;
    }

    public void setDestination(AnalyticsExportDestination analyticsExportDestination) {
        this.destination = analyticsExportDestination;
    }

    public void setOutputSchemaVersion(StorageClassAnalysisSchemaVersion storageClassAnalysisSchemaVersion) {
        if (storageClassAnalysisSchemaVersion == null) {
            setOutputSchemaVersion((String) null);
        } else {
            setOutputSchemaVersion(storageClassAnalysisSchemaVersion.toString());
        }
    }

    public StorageClassAnalysisDataExport withDestination(AnalyticsExportDestination analyticsExportDestination) {
        setDestination(analyticsExportDestination);
        return this;
    }

    public StorageClassAnalysisDataExport withOutputSchemaVersion(StorageClassAnalysisSchemaVersion storageClassAnalysisSchemaVersion) {
        setOutputSchemaVersion(storageClassAnalysisSchemaVersion);
        return this;
    }

    public StorageClassAnalysisDataExport withOutputSchemaVersion(String str) {
        setOutputSchemaVersion(str);
        return this;
    }

    public void setOutputSchemaVersion(String str) {
        this.outputSchemaVersion = str;
    }
}
