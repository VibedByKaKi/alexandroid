package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum MetricType {
    FETCH_FALCO_REMOTE_CONFIG_JOB_STARTED("FetchFalcoRemoteJob:Started"),
    FETCH_FALCO_REMOTE_CONFIG_JOB_DESERIALIZATION_FAILURE("FetchFalcoRemoteJob:Finished:Failure:Deserialization"),
    FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED("FetchFalcoRemoteJob:Finished"),
    FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED_SUCCESS("FetchFalcoRemoteJob:Finished:Success"),
    FETCH_FALCO_REMOTE_CONFIG_JOB_FINISHED_FAILURE("FetchFalcoRemoteJob:Finished:Failure");

    private String mValue;

    MetricType(String str) {
        this.mValue = str;
    }

    public String getValue() {
        return this.mValue;
    }
}
