package com.amazon.alexa.aamb.transport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class TransportBase implements Transport {
    protected String address;
    private final TransportStatistics transportStatistics = new TransportStatistics();
    private int transportType;

    @Override // com.amazon.alexa.aamb.transport.Transport
    public String getAddress() {
        return this.address;
    }

    @Override // com.amazon.alexa.aamb.transport.Transport
    public TransportStatistics getTransportStatistics() {
        return this.transportStatistics;
    }

    @Override // com.amazon.alexa.aamb.transport.Transport
    public int getTransportType() {
        return this.transportType;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setTransportType(int i) {
        this.transportType = i;
    }
}
