package com.amazon.blueshift.bluefront.android.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeechRequestParameters<PARAMS, CONTEXT> {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final Optional<String> mSerializedContext;
    private final String mSerializedParameters;

    public SpeechRequestParameters(PARAMS params, Optional<CONTEXT> optional) throws JsonProcessingException {
        Preconditions.checkNotNull(params, "params cannot be null for a speech request");
        ObjectMapper objectMapper = MAPPER;
        this.mSerializedParameters = objectMapper.writeValueAsString(params);
        if (optional.isPresent()) {
            this.mSerializedContext = Optional.of(objectMapper.writeValueAsString(optional.get()));
        } else {
            this.mSerializedContext = Optional.absent();
        }
    }

    public Optional<String> getSerializedContext() {
        return this.mSerializedContext;
    }

    public String getSerializedParameters() {
        return this.mSerializedParameters;
    }
}
