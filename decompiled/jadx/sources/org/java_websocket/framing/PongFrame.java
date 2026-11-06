package org.java_websocket.framing;

import org.java_websocket.enums.Opcode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class PongFrame extends ControlFrame {
    public PongFrame(PingFrame pingFrame) {
        super(Opcode.PONG);
        setPayload(pingFrame.getPayloadData());
    }

    public PongFrame() {
        super(Opcode.PONG);
    }
}
