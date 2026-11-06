package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StorageClassAnalysis implements Serializable {
    private StorageClassAnalysisDataExport dataExport;

    public StorageClassAnalysisDataExport getDataExport() {
        return this.dataExport;
    }

    public void setDataExport(StorageClassAnalysisDataExport storageClassAnalysisDataExport) {
        this.dataExport = storageClassAnalysisDataExport;
    }

    public StorageClassAnalysis withDataExport(StorageClassAnalysisDataExport storageClassAnalysisDataExport) {
        setDataExport(storageClassAnalysisDataExport);
        return this;
    }
}
