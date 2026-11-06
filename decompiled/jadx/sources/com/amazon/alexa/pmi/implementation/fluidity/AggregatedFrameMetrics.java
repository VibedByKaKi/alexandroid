package com.amazon.alexa.pmi.implementation.fluidity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
class AggregatedFrameMetrics {
    private final FluidityMetricsUseCase useCase;
    private long framesRendered = 0;
    private long slowFrames = 0;
    private long frozenFrames = 0;

    public AggregatedFrameMetrics(FluidityMetricsUseCase fluidityMetricsUseCase) {
        this.useCase = fluidityMetricsUseCase;
    }

    public long frozenFramesBps() {
        return (long) ((getFrozenFrames() / getFramesRendered()) * 10000.0d);
    }

    public long getFramesRendered() {
        return this.framesRendered;
    }

    public long getFrozenFrames() {
        return this.frozenFrames;
    }

    public String getOwnerIdentifier() {
        return this.useCase.ownerIdentifier;
    }

    public long getSlowFrames() {
        return this.slowFrames;
    }

    public String getUseCaseName() {
        return this.useCase.name;
    }

    public boolean hasSlowFrames() {
        return getSlowFrames() > 0;
    }

    public void incrementFramesRendered() {
        this.framesRendered++;
    }

    public void incrementFrozenFrames() {
        this.frozenFrames++;
    }

    public void incrementSlowFrames() {
        this.slowFrames++;
    }

    public void setFramesRendered(long j) {
        this.framesRendered = j;
    }

    public void setFrozenFrames(long j) {
        this.frozenFrames = j;
    }

    public void setSlowFrames(long j) {
        this.slowFrames = j;
    }

    public long slowFramesBps() {
        return (long) ((getSlowFrames() / getFramesRendered()) * 10000.0d);
    }
}
