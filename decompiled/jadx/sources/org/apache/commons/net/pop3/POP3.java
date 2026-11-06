package org.apache.commons.net.pop3;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.commons.net.util.NetConstants;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class POP3 extends SocketClient {
    public static final int AUTHORIZATION_STATE = 0;
    static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
    public static final int DEFAULT_PORT = 110;
    public static final int DISCONNECTED_STATE = -1;
    static final String ERROR = "-ERR";
    static final String OK = "+OK";
    static final String OK_INT = "+ ";
    public static final int TRANSACTION_STATE = 1;
    public static final int UPDATE_STATE = 2;
    protected ProtocolCommandSupport _commandSupport_;
    String lastReplyLine;
    private int popState;
    BufferedReader reader;
    int replyCode;
    List<String> replyLines;
    BufferedWriter writer;

    public POP3() {
        setDefaultPort(110);
        this.popState = -1;
        this.reader = null;
        this.writer = null;
        this.replyLines = new ArrayList();
        this._commandSupport_ = new ProtocolCommandSupport(this);
    }

    private void getReply() throws IOException {
        this.replyLines.clear();
        String readLine = this.reader.readLine();
        if (readLine == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$3("Connection closed without indication.");
            return;
        }
        if (readLine.startsWith(OK)) {
            this.replyCode = 0;
        } else if (readLine.startsWith(ERROR)) {
            this.replyCode = 1;
        } else {
            if (!readLine.startsWith(OK_INT)) {
                throw new MalformedServerReplyException("Received invalid POP3 protocol response from server.".concat(readLine));
            }
            this.replyCode = 2;
        }
        this.replyLines.add(readLine);
        this.lastReplyLine = readLine;
        fireReplyReceived(this.replyCode, getReplyString());
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() throws IOException {
        super._connectAction_();
        InputStream inputStream = this._input_;
        Charset charset = DEFAULT_ENCODING;
        this.reader = new CRLFLineReader(new InputStreamReader(inputStream, charset));
        this.writer = new BufferedWriter(new OutputStreamWriter(this._output_, charset));
        getReply();
        setState(0);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        super.disconnect();
        this.reader = null;
        this.writer = null;
        this.lastReplyLine = null;
        this.replyLines.clear();
        setState(-1);
    }

    public void getAdditionalReply() throws IOException {
        String readLine = this.reader.readLine();
        while (readLine != null) {
            this.replyLines.add(readLine);
            if (readLine.equals(".")) {
                return;
            } else {
                readLine = this.reader.readLine();
            }
        }
    }

    @Override // org.apache.commons.net.SocketClient
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }

    public String getReplyString() {
        StringBuilder sb = new StringBuilder(256);
        Iterator<String> it2 = this.replyLines.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public String[] getReplyStrings() {
        return (String[]) this.replyLines.toArray(NetConstants.EMPTY_STRING_ARRAY);
    }

    public int getState() {
        return this.popState;
    }

    public void removeProtocolCommandistener(ProtocolCommandListener protocolCommandListener) {
        removeProtocolCommandListener(protocolCommandListener);
    }

    public int sendCommand(String str, String str2) throws IOException {
        if (this.writer == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Socket is not connected");
            return 0;
        }
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        if (str2 != null) {
            m.append(' ');
            m.append(str2);
        }
        m.append("\r\n");
        String sb = m.toString();
        this.writer.write(sb);
        this.writer.flush();
        fireCommandSent(str, sb);
        getReply();
        return this.replyCode;
    }

    public void setState(int i) {
        this.popState = i;
    }

    public int sendCommand(String str) throws IOException {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(int i, String str) throws IOException {
        return sendCommand(POP3Command.commands[i], str);
    }

    public int sendCommand(int i) throws IOException {
        return sendCommand(POP3Command.commands[i], (String) null);
    }
}
