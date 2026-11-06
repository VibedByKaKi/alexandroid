package com.amazon.alexa.accessory.frames.metrics.media;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum LceRetoucherError {
    MODEL_NOT_FOUND("model_not_found"),
    MODEL_INVALID("model_invalid"),
    INFERENCE_FAILED("inference_failed"),
    GPU_NOT_SUPPORTED("gpu_not_supported"),
    GPU_INIT_FAILED("gpu_init_failed"),
    GPU_PROCESSING_FAILED("gpu_processing_failed"),
    GPU_OUT_OF_MEMORY("gpu_out_of_memory"),
    GPU_CONTEXT_LOST("gpu_context_lost"),
    PARAMETER_GUARDRAILS_FAILED("parameter_guardrails_failed"),
    PIPELINE_TIMEOUT("pipeline_timeout"),
    INSUFFICIENT_MEMORY("insufficient_memory"),
    OUTPUT_SANITY_CHECK_FAILED("output_sanity_check_failed"),
    GL_ERROR("gl_error"),
    UNEXPECTED_ERROR("unexpected_error");

    private final String value;

    LceRetoucherError(String str) {
        this.value = str;
    }

    public String getErrorMetric() {
        return "MediaImport_lce_enhancement_" + this.value;
    }

    public String getValue() {
        return this.value;
    }
}
