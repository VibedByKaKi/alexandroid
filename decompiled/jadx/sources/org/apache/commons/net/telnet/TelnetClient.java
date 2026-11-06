package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TelnetClient extends Telnet {
    private static final int DEFAULT_MAX_SUBNEGOTIATION_LENGTH = 512;
    private InputStream input;
    private TelnetInputListener inputListener;
    final int maxSubnegotiationLength;
    private OutputStream output;
    protected boolean readerThread;

    public TelnetClient(String str, int i) {
        super(str);
        this.readerThread = true;
        this.input = null;
        this.output = null;
        this.maxSubnegotiationLength = i;
    }

    @Override // org.apache.commons.net.telnet.Telnet, org.apache.commons.net.SocketClient
    public void _connectAction_() throws IOException {
        super._connectAction_();
        TelnetInputStream telnetInputStream = new TelnetInputStream(this._input_, this, this.readerThread);
        if (this.readerThread) {
            telnetInputStream.start();
        }
        this.input = new BufferedInputStream(telnetInputStream);
        this.output = new TelnetOutputStream(this);
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void addOptionHandler(TelnetOptionHandler telnetOptionHandler) throws InvalidTelnetOptionException, IOException {
        super.addOptionHandler(telnetOptionHandler);
    }

    public void closeOutputStream() throws IOException {
        OutputStream outputStream = this._output_;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } finally {
            this._output_ = null;
        }
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void deleteOptionHandler(int i) throws InvalidTelnetOptionException, IOException {
        super.deleteOptionHandler(i);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        try {
            InputStream inputStream = this.input;
            if (inputStream != null) {
                inputStream.close();
            }
            OutputStream outputStream = this.output;
            if (outputStream != null) {
                outputStream.close();
            }
            this.output = null;
            this.input = null;
            super.disconnect();
        } catch (Throwable th) {
            this.output = null;
            this.input = null;
            super.disconnect();
            throw th;
        }
    }

    public void flushOutputStream() throws IOException {
        OutputStream outputStream = this._output_;
        if (outputStream != null) {
            outputStream.flush();
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Stream closed");
        }
    }

    public InputStream getInputStream() {
        return this.input;
    }

    public boolean getLocalOptionState(int i) {
        return stateIsWill(i) && requestedWill(i);
    }

    public OutputStream getOutputStream() {
        return this.output;
    }

    public boolean getReaderThread() {
        return this.readerThread;
    }

    public boolean getRemoteOptionState(int i) {
        return stateIsDo(i) && requestedDo(i);
    }

    public void notifyInputListener() {
        TelnetInputListener telnetInputListener;
        synchronized (this) {
            telnetInputListener = this.inputListener;
        }
        if (telnetInputListener != null) {
            telnetInputListener.telnetInputAvailable();
        }
    }

    public synchronized void registerInputListener(TelnetInputListener telnetInputListener) {
        this.inputListener = telnetInputListener;
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void registerNotifHandler(TelnetNotificationHandler telnetNotificationHandler) {
        super.registerNotifHandler(telnetNotificationHandler);
    }

    public void registerSpyStream(OutputStream outputStream) {
        super._registerSpyStream(outputStream);
    }

    public boolean sendAYT(long j) throws IOException, IllegalArgumentException, InterruptedException {
        return _sendAYT(j);
    }

    public void sendCommand(byte b) throws IOException, IllegalArgumentException {
        _sendCommand(b);
    }

    public void sendSubnegotiation(int[] iArr) throws IOException, IllegalArgumentException {
        if (iArr.length >= 1) {
            _sendSubnegotiation(iArr);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("zero length message");
        }
    }

    public void setReaderThread(boolean z) {
        this.readerThread = z;
    }

    public void stopSpyStream() {
        super._stopSpyStream();
    }

    public synchronized void unregisterInputListener() {
        this.inputListener = null;
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void unregisterNotifHandler() {
        super.unregisterNotifHandler();
    }

    public TelnetClient(String str) {
        this(str, 512);
    }

    public TelnetClient(int i) {
        this("VT100", i);
    }

    public TelnetClient() {
        this("VT100", 512);
    }
}
