package org.apache.commons.net.smtp;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SMTP extends SocketClient {
    private static final String DEFAULT_ENCODING = "ISO-8859-1";
    public static final int DEFAULT_PORT = 25;
    protected ProtocolCommandSupport _commandSupport_;
    protected final String encoding;
    private boolean newReplyString;
    BufferedReader reader;
    private int replyCode;
    private final ArrayList<String> replyLines;
    private String replyString;
    BufferedWriter writer;

    public SMTP(String str) {
        setDefaultPort(25);
        this.replyLines = new ArrayList<>();
        this.newReplyString = false;
        this.replyString = null;
        this._commandSupport_ = new ProtocolCommandSupport(this);
        this.encoding = str;
    }

    private int sendCommand(String str, String str2, boolean z) throws IOException {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        if (str2 != null) {
            if (z) {
                m.append(' ');
            }
            m.append(str2);
        }
        m.append("\r\n");
        String sb = m.toString();
        this.writer.write(sb);
        this.writer.flush();
        fireCommandSent(str, sb);
        return getReply();
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() throws IOException {
        super._connectAction_();
        this.reader = new CRLFLineReader(new InputStreamReader(this._input_, this.encoding));
        this.writer = new BufferedWriter(new OutputStreamWriter(this._output_, this.encoding));
        getReply();
    }

    public int data() throws IOException {
        return sendCommand(3);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        super.disconnect();
        this.reader = null;
        this.writer = null;
        this.replyString = null;
        this.replyLines.clear();
        this.newReplyString = false;
    }

    public int expn(String str) throws IOException {
        return sendCommand(9, str);
    }

    @Override // org.apache.commons.net.SocketClient
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }

    public int getReply() throws IOException {
        this.newReplyString = true;
        this.replyLines.clear();
        String readLine = this.reader.readLine();
        if (readLine == null) {
            throw new SMTPConnectionClosedException("Connection closed without indication.");
        }
        int length = readLine.length();
        if (length < 3) {
            throw new MalformedServerReplyException("Truncated server reply: ".concat(readLine));
        }
        try {
            this.replyCode = Integer.parseInt(readLine.substring(0, 3));
            this.replyLines.add(readLine);
            if (length > 3 && readLine.charAt(3) == '-') {
                while (true) {
                    String readLine2 = this.reader.readLine();
                    if (readLine2 == null) {
                        throw new SMTPConnectionClosedException("Connection closed without indication.");
                    }
                    this.replyLines.add(readLine2);
                    if (readLine2.length() >= 4 && readLine2.charAt(3) != '-' && Character.isDigit(readLine2.charAt(0))) {
                        break;
                    }
                }
            }
            fireReplyReceived(this.replyCode, getReplyString());
            int i = this.replyCode;
            if (i != 421) {
                return i;
            }
            throw new SMTPConnectionClosedException("SMTP response 421 received.  Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: ".concat(readLine));
        }
    }

    public int getReplyCode() {
        return this.replyCode;
    }

    public String getReplyString() {
        if (!this.newReplyString) {
            return this.replyString;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = this.replyLines.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append("\r\n");
        }
        this.newReplyString = false;
        String sb2 = sb.toString();
        this.replyString = sb2;
        return sb2;
    }

    public String[] getReplyStrings() {
        return (String[]) this.replyLines.toArray(NetConstants.EMPTY_STRING_ARRAY);
    }

    public int helo(String str) throws IOException {
        return sendCommand(0, str);
    }

    public int help() throws IOException {
        return sendCommand(10);
    }

    public int mail(String str) throws IOException {
        return sendCommand(1, str, false);
    }

    public int noop() throws IOException {
        return sendCommand(11);
    }

    public int quit() throws IOException {
        return sendCommand(13);
    }

    public int rcpt(String str) throws IOException {
        return sendCommand(2, str, false);
    }

    public void removeProtocolCommandistener(ProtocolCommandListener protocolCommandListener) {
        removeProtocolCommandListener(protocolCommandListener);
    }

    public int rset() throws IOException {
        return sendCommand(7);
    }

    public int saml(String str) throws IOException {
        return sendCommand(6, str);
    }

    public int send(String str) throws IOException {
        return sendCommand(4, str);
    }

    public int soml(String str) throws IOException {
        return sendCommand(5, str);
    }

    public int turn() throws IOException {
        return sendCommand(12);
    }

    public int vrfy(String str) throws IOException {
        return sendCommand(8, str);
    }

    public int help(String str) throws IOException {
        return sendCommand(10, str);
    }

    public SMTP() {
        this("ISO-8859-1");
    }

    private int sendCommand(int i, String str, boolean z) throws IOException {
        return sendCommand(SMTPCommand.getCommand(i), str, z);
    }

    public int sendCommand(String str, String str2) throws IOException {
        return sendCommand(str, str2, true);
    }

    public int sendCommand(int i, String str) throws IOException {
        return sendCommand(SMTPCommand.getCommand(i), str);
    }

    public int sendCommand(String str) throws IOException {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(int i) throws IOException {
        return sendCommand(i, (String) null);
    }
}
